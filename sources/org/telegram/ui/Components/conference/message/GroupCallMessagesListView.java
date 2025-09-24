package org.telegram.ui.Components.conference.message;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RenderNode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.conference.message.GroupCallMessageCell;

/* loaded from: classes5.dex */
public class GroupCallMessagesListView extends RecyclerView {
    private final GroupCallMessagesAdapter adapter;
    private View blurRoot;
    private Delegate delegate;
    private RenderNode renderNode;
    private float renderNodeScale;

    public interface Delegate {
        void showReaction(GroupCallMessageCell groupCallMessageCell, ReactionsLayoutInBubble.VisibleReaction visibleReaction);
    }

    public GroupCallMessagesListView(Context context) {
        super(context);
        setLayoutManager(new LinearLayoutManager(context, 1, 1 == true ? 1 : 0) { // from class: org.telegram.ui.Components.conference.message.GroupCallMessagesListView.1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        addItemDecoration(new RecyclerView.ItemDecoration() { // from class: org.telegram.ui.Components.conference.message.GroupCallMessagesListView.2
            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                rect.top = AndroidUtilities.dp(6.0f);
            }
        });
        GroupCallMessagesAdapter groupCallMessagesAdapter = new GroupCallMessagesAdapter() { // from class: org.telegram.ui.Components.conference.message.GroupCallMessagesListView.3
            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public GroupCallMessageCell.VH onCreateViewHolder(ViewGroup viewGroup, int i) {
                GroupCallMessageCell.VH onCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
                onCreateViewHolder.cell.setRenderNode(GroupCallMessagesListView.this.blurRoot, GroupCallMessagesListView.this.renderNode, GroupCallMessagesListView.this.renderNodeScale);
                return onCreateViewHolder;
            }
        };
        this.adapter = groupCallMessagesAdapter;
        setAdapter(groupCallMessagesAdapter);
        setItemAnimator(createItemAnimator());
    }

    private DefaultItemAnimator createItemAnimator() {
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() { // from class: org.telegram.ui.Components.conference.message.GroupCallMessagesListView.4
            @Override // androidx.recyclerview.widget.DefaultItemAnimator
            protected float animateByScale(View view) {
                return 0.6f;
            }

            @Override // androidx.recyclerview.widget.SimpleItemAnimator
            public void onAddFinished(RecyclerView.ViewHolder viewHolder) {
                super.onAddFinished(viewHolder);
                GroupCallMessage message = GroupCallMessagesListView.this.adapter.getMessage(viewHolder.getAdapterPosition());
                if (message == null || message.visibleReaction == null || !(viewHolder.itemView instanceof GroupCallMessageCell) || GroupCallMessagesListView.this.delegate == null) {
                    return;
                }
                GroupCallMessagesListView.this.delegate.showReaction((GroupCallMessageCell) viewHolder.itemView, message.visibleReaction);
            }
        };
        defaultItemAnimator.setSupportsChangeAnimations(false);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDurations(320L);
        return defaultItemAnimator;
    }

    public void setRenderNode(RenderNode renderNode, float f) {
        this.renderNode = renderNode;
        this.renderNodeScale = f;
    }

    public void setBlurRoot(View view) {
        this.blurRoot = view;
    }

    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        invalidate();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof GroupCallMessageCell) {
                    GroupCallMessageCell groupCallMessageCell = (GroupCallMessageCell) childAt;
                    if (groupCallMessageCell.getVisibility() == 0 && groupCallMessageCell.isInsideBubble(x - childAt.getX(), y - childAt.getY())) {
                    }
                }
            }
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setGroupCall(int i, TLRPC.InputGroupCall inputGroupCall) {
        this.adapter.setGroupCall(i, inputGroupCall);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.adapter.attach();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.adapter.detach();
    }
}
