package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.GroupCallActivity;
import org.telegram.ui.GroupCallTabletGridAdapter;

/* loaded from: classes5.dex */
public abstract class GroupCallGridCell extends FrameLayout {
    public boolean attached;
    public GroupCallTabletGridAdapter gridAdapter;
    private final boolean isTabletGrid;
    ChatObject.VideoParticipant participant;
    public int position;
    GroupCallMiniTextureView renderer;
    public int spanCount;

    public GroupCallGridCell(Context context, boolean z) {
        super(context);
        this.isTabletGrid = z;
    }

    public float getItemHeight() {
        return this.gridAdapter != null ? r0.getItemHeight(this.position) : getMeasuredHeight();
    }

    public ChatObject.VideoParticipant getParticipant() {
        return this.participant;
    }

    public GroupCallMiniTextureView getRenderer() {
        return this.renderer;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attached = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attached = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int dp;
        if (this.isTabletGrid) {
            ((View) getParent()).getMeasuredWidth();
            dp = this.gridAdapter.getItemHeight(this.position);
        } else {
            float f = GroupCallActivity.isLandscapeMode ? 3.0f : 2.0f;
            float dp2 = (AndroidUtilities.displaySize.x - (AndroidUtilities.dp(14.0f) * 2)) + (GroupCallActivity.isLandscapeMode ? -AndroidUtilities.dp(90.0f) : 0);
            dp = (int) ((GroupCallActivity.isTabletMode ? dp2 / 2.0f : dp2 / f) + AndroidUtilities.dp(4.0f));
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(dp, TLRPC.FLAG_30));
    }

    public void setData(AccountInstance accountInstance, ChatObject.VideoParticipant videoParticipant, ChatObject.Call call, long j) {
        this.participant = videoParticipant;
    }

    public void setRenderer(GroupCallMiniTextureView groupCallMiniTextureView) {
        this.renderer = groupCallMiniTextureView;
    }
}
