package oh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public abstract class e5 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public d5 B;
    public d5 C;
    public o6 D;
    public int E;
    public boolean F;
    public final zk0 G;
    public final i9 H;
    public final p4 I;
    public final q4 J;
    public final ng.i K;
    public final q4 L;
    public final u4 M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public Drawable R;
    public boolean S;
    public long T;
    public final View a;
    public final View b;
    public final FrameLayout c;
    public final b4.e0 d;
    public int e;
    public t4 f;
    public final TextView h;
    public int n;
    public final l4 r;
    public final b s;
    public final int v;
    public final a5 w;
    public final rz x;
    public m5 y;

    public e5(i9 i9Var, Context context, q4 q4Var, ng.i iVar) {
        super(context);
        this.e = 96;
        this.L = new q4();
        this.J = q4Var;
        this.K = iVar;
        b bVar = i9Var.y;
        this.s = bVar;
        this.H = i9Var;
        this.v = i9Var.h;
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.j5, bVar));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        u4 u4Var = new u4(this, getContext());
        this.M = u4Var;
        l4 l4Var = new l4(this, context, bVar);
        this.r = l4Var;
        l4Var.setClipToPadding(false);
        this.G = new zk0(l4Var, true);
        rz rzVar = new rz(l4Var, 0);
        this.x = rzVar;
        l4Var.setLayoutManager(rzVar);
        l4Var.setNestedScrollingEnabled(true);
        a5 a5Var = new a5(this);
        this.w = a5Var;
        l4Var.setAdapter(a5Var);
        new SparseArray();
        new HashMap();
        addView(l4Var);
        this.d = new b4.e0(l4Var);
        l4Var.setOnScrollListener(new fg.e2(this, 12));
        l4Var.setOnItemClickListener(new hg.v0(2, this, i9Var));
        l4Var.setOnItemLongClickListener(new o4(this, i9Var));
        a5Var.E();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.c = frameLayout;
        View view = new View(getContext());
        this.a = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i10 = org.telegram.ui.ActionBar.k6.h5;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.k6.v0(i10, bVar), 0}));
        frameLayout.addView(view, k7.c6.d(-1, 8.0f, 0, 0.0f, this.e - 8, 0.0f, 0.0f));
        View view2 = new View(getContext());
        this.b = view2;
        view2.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(i10, bVar));
        frameLayout.addView(view2, k7.c6.d(-1, 10.0f, 0, 0.0f, this.e - 17, 0.0f, 0.0f));
        frameLayout.addView(u4Var);
        frameLayout.addView(textView);
        p4 p4Var = new p4(this, getContext(), bVar);
        this.I = p4Var;
        p4Var.setHint(LocaleController.getString(R.string.Search));
        frameLayout.addView(p4Var, k7.c6.d(-1, -1.0f, 51, 0.0f, 36.0f, 0.0f, 0.0f));
        addView(frameLayout);
    }

    public static void a(e5 e5Var) {
        new fg.n1(e5Var.H.f, 14, false).show();
    }

    public static void b(e5 e5Var) {
        d5 d5Var = e5Var.B;
        if (d5Var != null) {
            d5Var.r.remove(e5Var);
        }
        d5 d5Var2 = e5Var.C;
        e5Var.B = d5Var2;
        if (d5Var2 == null) {
            return;
        }
        ArrayList arrayList = d5Var2.r;
        if (!arrayList.contains(e5Var)) {
            arrayList.add(e5Var);
        }
        e5Var.B.e(e5Var.L, e5Var.Q, e5Var.P);
        e5Var.w.E();
        e5Var.x.h1(0, (int) (e5Var.getTopOffset() - e5Var.r.getPaddingTop()));
    }

    public static void f(int i10, long j10, TL_stories.StoryItem storyItem) {
        if (storyItem == null) {
            return;
        }
        SparseArray sparseArray = (SparseArray) MessagesController.getInstance(i10).storiesController.x.f(storyItem.dialogId);
        d5 d5Var = sparseArray == null ? null : (d5) sparseArray.get(storyItem.id);
        TL_stories.StoryViews storyViews = storyItem.views;
        int i11 = storyViews == null ? 0 : storyViews.views_count;
        if (d5Var == null || d5Var.a != i11) {
            if (d5Var != null) {
                d5Var.d();
            }
            d5 d5Var2 = new d5(i10, j10, storyItem);
            d5Var2.c();
            if (sparseArray == null) {
                a0.h hVar = MessagesController.getInstance(i10).storiesController.x;
                long j11 = storyItem.dialogId;
                sparseArray = new SparseArray();
                hVar.k(sparseArray, j11);
            }
            sparseArray.put(storyItem.id, d5Var2);
        }
    }

    public final void c() {
        if (this.B == null || this.x.N0() <= this.w.c.size() - 10) {
            return;
        }
        this.B.c();
    }

    public final boolean d(TL_stories.StoryView storyView) {
        qh.r6 r6Var;
        qh.a8 a8Var;
        if (storyView == null) {
            return true;
        }
        int i10 = this.v;
        if (MessagesController.getInstance(i10).getStoriesController().L(storyView) || MessagesController.getInstance(i10).blockePeers.indexOfKey(storyView.user_id) >= 0) {
            return false;
        }
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(storyView.user_id));
        m5 m5Var = this.y;
        if (m5Var != null) {
            TL_stories.StoryItem storyItem = m5Var.a;
            if (storyItem != null) {
                if (storyItem.parsedPrivacy == null) {
                    storyItem.parsedPrivacy = new qh.a8(i10, storyItem.privacy);
                }
                return this.y.a.parsedPrivacy.b(user);
            }
            s6 s6Var = m5Var.b;
            if (s6Var != null && (r6Var = s6Var.c) != null && (a8Var = r6Var.E0) != null) {
                return a8Var.b(user);
            }
        }
        return true;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int R;
        int i12 = 0;
        if (i10 == NotificationCenter.storiesUpdated) {
            if (this.y.b != null) {
                int i13 = this.v;
                TL_stories.PeerStories y10 = MessagesController.getInstance(i13).storiesController.y(UserConfig.getInstance(i13).clientUserId);
                if (y10 != null) {
                    while (i12 < y10.stories.size()) {
                        TL_stories.StoryItem storyItem = y10.stories.get(i12);
                        String str = storyItem.attachPath;
                        if (str != null && str.equals(this.y.b.e)) {
                            m5 m5Var = this.y;
                            m5Var.b = null;
                            m5Var.a = storyItem;
                            g(this.T, m5Var);
                            return;
                        }
                        i12++;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.storiesBlocklistUpdate) {
            return;
        }
        while (true) {
            l4 l4Var = this.r;
            if (i12 >= l4Var.getChildCount()) {
                return;
            }
            View childAt = l4Var.getChildAt(i12);
            if ((childAt instanceof org.telegram.ui.Cells.n6) && (R = RecyclerView.R(childAt)) >= 0) {
                a5 a5Var = this.w;
                if (R < a5Var.c.size()) {
                    ((org.telegram.ui.Cells.n6) childAt).a(d(((v4) a5Var.c.get(R)).b) ? 1.0f : 0.5f, true);
                }
            }
            i12++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        l4 l4Var;
        View view = null;
        int i10 = 0;
        int i11 = -1;
        while (true) {
            l4Var = this.r;
            if (i10 >= l4Var.getChildCount()) {
                break;
            }
            View childAt = l4Var.getChildAt(i10);
            int S = RecyclerView.S(childAt);
            if (S < i11 || i11 == -1) {
                view = childAt;
                i11 = S;
            }
            i10++;
        }
        int max = i11 == 0 ? (int) Math.max(0.0f, view.getY()) : i11 > 0 ? 0 : l4Var.getPaddingTop();
        FrameLayout frameLayout = this.c;
        float f10 = max;
        if (frameLayout.getTranslationY() != f10) {
            frameLayout.setTranslationY(f10);
            j5 j5Var = (j5) this;
            int intValue = ((Integer) j5Var.getTag()).intValue();
            n5 n5Var = j5Var.U.e;
            g5 g5Var = n5Var.h;
            if (intValue == n5Var.B.getCurrentItem()) {
                g5Var.setAlpha(Utilities.clamp(f10 / n5Var.d, 1.0f, 0.0f));
                g5Var.setTranslationY((-(n5Var.d - f10)) / 2.0f);
            }
        }
        this.R.setBounds(-AndroidUtilities.dp(6.0f), max, AndroidUtilities.dp(6.0f) + getMeasuredWidth(), getMeasuredHeight());
        this.R.draw(canvas);
        if (this.S) {
            this.S = false;
            if (frameLayout.getTranslationY() != 0.0f && frameLayout.getTranslationY() != l4Var.getPaddingTop()) {
                float translationY = frameLayout.getTranslationY();
                float paddingTop = l4Var.getPaddingTop() / 2.0f;
                b4.e0 e0Var = this.d;
                if (translationY > paddingTop) {
                    e0Var.y((int) (-(l4Var.getPaddingTop() - frameLayout.getTranslationY())));
                } else {
                    e0Var.y((int) frameLayout.getTranslationY());
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.r) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.clipRect(0, AndroidUtilities.dp(this.e), getMeasuredWidth(), getMeasuredHeight());
        super.drawChild(canvas, view, j10);
        canvas.restore();
        return true;
    }

    public final void e(d5 d5Var) {
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        a5 a5Var = this.w;
        int size = a5Var.c.size();
        q4 q4Var = this.L;
        if (TextUtils.isEmpty(q4Var.c) && !q4Var.b) {
            i();
        }
        a5Var.E();
        this.G.b(size - 1);
        c();
        if (this.D != null) {
            ArrayList arrayList = d5Var.i;
            if (d5Var != this.B || arrayList == null || this.E >= arrayList.size()) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = this.E; i10 < arrayList.size(); i10++) {
                TL_stories.StoryReaction storyReaction = (TL_stories.StoryReaction) arrayList.get(i10);
                if ((storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) && (storyItem = (tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction).story) != null) {
                    storyItem.dialogId = DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id);
                    arrayList2.add(storyItem);
                }
            }
            this.E = arrayList.size();
            if (arrayList2.isEmpty()) {
                return;
            }
            this.D.F(arrayList2);
        }
    }

    public final void g(long j10, m5 m5Var) {
        this.T = j10;
        this.y = m5Var;
        i();
        h(false);
        if (m5Var == null || m5Var.a == null) {
            return;
        }
        NotificationsController.getInstance(this.v).processSeenStoryReactions(j10, m5Var.a.id);
    }

    public float getTopOffset() {
        return this.c.getTranslationY();
    }

    public final void h(boolean z4) {
        int i10;
        q4 q4Var = this.L;
        boolean z10 = q4Var.b;
        u4 u4Var = this.M;
        if (z10 != u4Var.s || !z4) {
            ValueAnimator valueAnimator = u4Var.w;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                u4Var.w.cancel();
            }
            u4Var.s = z10 ? 1 : 0;
            if (z4) {
                u4Var.e.set(u4Var.n);
                u4Var.f = u4Var.c.getAlpha();
                u4Var.h = u4Var.d.getAlpha();
                u4Var.r = 0.0f;
                u4Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                u4Var.w = ofFloat;
                ofFloat.addUpdateListener(new eg.m1(u4Var, 29));
                u4Var.w.addListener(new dg.l0(u4Var, 23));
                u4Var.w.setDuration(250L);
                u4Var.w.setInterpolator(pr.f);
                u4Var.w.start();
            } else {
                u4Var.r = 1.0f;
                u4Var.invalidate();
            }
        }
        boolean z11 = q4Var.a;
        yl0 yl0Var = u4Var.v;
        if (z11) {
            d5 d5Var = this.B;
            i10 = (d5Var == null || !d5Var.f) ? R.drawable.menu_views_reactions3 : R.drawable.menu_views_reposts3;
        } else {
            i10 = R.drawable.menu_views_recent3;
        }
        yl0Var.a(i10, z4);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        this.O = false;
        this.Q = false;
        this.P = false;
        TL_stories.StoryItem storyItem = this.y.a;
        p4 p4Var = this.I;
        u4 u4Var = this.M;
        TextView textView = this.h;
        if (storyItem != null) {
            TL_stories.StoryViews storyViews = storyItem.views;
            if (storyViews != null) {
                int i10 = storyViews.views_count;
                this.O = i10 >= 15;
                this.P = storyViews.reactions_count >= (BuildVars.DEBUG_PRIVATE_VERSION ? 5 : 10);
                this.Q = (storyItem.dialogId < 0 || i10 < 20 || storyItem.contacts || storyItem.close_friends || storyItem.selected_contacts) ? false : true;
            }
            int i11 = this.v;
            SparseArray sparseArray = (SparseArray) MessagesController.getInstance(i11).storiesController.x.f(storyItem.dialogId);
            d5 d5Var = sparseArray != null ? (d5) sparseArray.get(storyItem.id) : null;
            this.C = d5Var;
            TL_stories.StoryViews storyViews2 = storyItem.views;
            int i12 = storyViews2 == null ? 0 : storyViews2.views_count;
            q4 q4Var = this.L;
            if (d5Var == null || !(d5Var.f || d5Var.a == i12)) {
                if (d5Var != null) {
                    d5Var.d();
                }
                d5 d5Var2 = new d5(i11, this.T, storyItem);
                this.C = d5Var2;
                d5Var2.e(q4Var, this.Q, this.P);
                this.C.c();
                if (sparseArray != null) {
                    sparseArray.put(storyItem.id, this.C);
                } else {
                    SparseArray sparseArray2 = new SparseArray();
                    sparseArray2.put(storyItem.id, this.C);
                    MessagesController.getInstance(i11).storiesController.x.k(sparseArray2, storyItem.dialogId);
                }
            } else {
                d5Var.e(q4Var, this.Q, this.P);
            }
            d5 d5Var3 = this.B;
            if (d5Var3 != null) {
                d5Var3.r.remove(this);
            }
            d5 d5Var4 = this.C;
            this.B = d5Var4;
            if (d5Var4 != null && this.F) {
                ArrayList arrayList = d5Var4.r;
                if (!arrayList.contains(this)) {
                    arrayList.add(this);
                }
            }
            d5 d5Var5 = this.B;
            if (d5Var5 == null || !d5Var5.j || UserConfig.getInstance(i11).isPremium()) {
                d5 d5Var6 = this.B;
                if (d5Var6.e || d5Var6.m || !d5Var6.g.isEmpty() || !this.B.i.isEmpty() || !TextUtils.isEmpty(this.B.s.c)) {
                    TL_stories.StoryViews storyViews3 = storyItem.views;
                    if (storyViews3 == null || storyViews3.views_count == 0) {
                        this.O = false;
                        this.P = false;
                        this.Q = false;
                        textView.setText(LocaleController.getString(this.B.f ? R.string.Reactions : R.string.Viewers));
                        p4Var.setVisibility(8);
                        u4Var.setVisibility(8);
                        this.e = 46;
                    } else {
                        u4Var.setVisibility(0);
                        d5 d5Var7 = this.B;
                        if (d5Var7.k) {
                            textView.setText(LocaleController.getString(d5Var7.f ? R.string.Reactions : R.string.Viewers));
                            this.O = false;
                            this.P = false;
                            this.Q = false;
                        } else {
                            if (d5Var7.b() < 20 && this.B.b() < storyItem.views.views_count) {
                                d5 d5Var8 = this.B;
                                if (!d5Var8.e && !d5Var8.m) {
                                    this.O = false;
                                    this.P = false;
                                    this.Q = false;
                                    textView.setText(LocaleController.getString(!this.B.f ? R.string.Reactions : R.string.Viewers));
                                }
                            }
                            this.O = !this.B.f && storyItem.views.views_count >= 15;
                            TL_stories.StoryViews storyViews4 = storyItem.views;
                            this.P = storyViews4.reactions_count >= (BuildVars.DEBUG_VERSION ? 5 : 10);
                            this.Q = (storyItem.dialogId < 0 || storyViews4.views_count < 20 || storyItem.contacts || storyItem.close_friends || storyItem.selected_contacts) ? false : true;
                            textView.setText(LocaleController.getString(!this.B.f ? R.string.Reactions : R.string.Viewers));
                        }
                        p4Var.setVisibility(this.O ? 0 : 8);
                        this.e = this.O ? 96 : 46;
                    }
                }
            }
            this.O = false;
            this.P = false;
            this.Q = false;
            textView.setText(LocaleController.getString(this.B.f ? R.string.Reactions : R.string.Viewers));
            p4Var.setVisibility(8);
            u4Var.setVisibility(8);
            this.e = 46;
        } else {
            this.e = 46;
            textView.setText(LocaleController.getString(R.string.UploadingStory));
            p4Var.setVisibility(8);
            u4Var.setVisibility(8);
        }
        u4Var.a.setVisibility(this.P ? 0 : 8);
        u4Var.c.setVisibility(this.Q ? 0 : 8);
        u4Var.d.setVisibility(this.Q ? 0 : 8);
        if (this.Q) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin = AndroidUtilities.dp(this.e - 8);
        ((ViewGroup.MarginLayoutParams) this.b.getLayoutParams()).topMargin = AndroidUtilities.dp(this.e - 17);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F = true;
        d5 d5Var = this.B;
        if (d5Var != null) {
            ArrayList arrayList = d5Var.r;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            this.B.p.clear();
        }
        this.w.E();
        int i10 = this.v;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesBlocklistUpdate);
        ic.a(this, new lh.t0(this, 3));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.F = false;
        d5 d5Var = this.B;
        if (d5Var != null) {
            d5Var.r.remove(this);
        }
        int i10 = this.v;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesBlocklistUpdate);
        ic.h(this);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.c.getTranslationY()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.c.getTranslationY()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListBottomPadding(float f10) {
        l4 l4Var = this.r;
        if (f10 != l4Var.getPaddingBottom()) {
            l4Var.setPadding(0, (int) f10, 0, 0);
            l4Var.requestLayout();
        }
    }

    public void setShadowDrawable(Drawable drawable) {
        this.R = drawable;
    }
}
