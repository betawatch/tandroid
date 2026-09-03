package nh;

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
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.Components.yk0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public abstract class d5 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public c5 B;
    public c5 C;
    public o6 D;
    public int E;
    public boolean F;
    public final yk0 G;
    public final i9 H;
    public final o4 I;
    public final p4 J;
    public final mg.i K;
    public final p4 L;
    public final t4 M;
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
    public s4 f;
    public final TextView h;
    public int n;
    public final j4 r;
    public final b s;
    public final int v;
    public final z4 w;
    public final pz x;
    public l5 y;

    public d5(i9 i9Var, Context context, p4 p4Var, mg.i iVar) {
        super(context);
        this.e = 96;
        this.L = new p4();
        this.J = p4Var;
        this.K = iVar;
        b bVar = i9Var.y;
        this.s = bVar;
        this.H = i9Var;
        this.v = i9Var.h;
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, bVar));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        t4 t4Var = new t4(this, getContext());
        this.M = t4Var;
        j4 j4Var = new j4(this, context, bVar);
        this.r = j4Var;
        j4Var.setClipToPadding(false);
        this.G = new yk0(j4Var, true);
        pz pzVar = new pz(j4Var, 0);
        this.x = pzVar;
        j4Var.setLayoutManager(pzVar);
        j4Var.setNestedScrollingEnabled(true);
        z4 z4Var = new z4(this);
        this.w = z4Var;
        j4Var.setAdapter(z4Var);
        new SparseArray();
        new HashMap();
        addView(j4Var);
        this.d = new b4.e0(j4Var);
        j4Var.setOnScrollListener(new eg.f2(this, 12));
        j4Var.setOnItemClickListener(new gg.v0(2, this, i9Var));
        j4Var.setOnItemLongClickListener(new m4(this, i9Var));
        z4Var.E();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.c = frameLayout;
        View view = new View(getContext());
        this.a = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i10 = org.telegram.ui.ActionBar.j6.h5;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.j6.v0(i10, bVar), 0}));
        frameLayout.addView(view, k7.b6.d(-1, 8.0f, 0, 0.0f, this.e - 8, 0.0f, 0.0f));
        View view2 = new View(getContext());
        this.b = view2;
        view2.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i10, bVar));
        frameLayout.addView(view2, k7.b6.d(-1, 10.0f, 0, 0.0f, this.e - 17, 0.0f, 0.0f));
        frameLayout.addView(t4Var);
        frameLayout.addView(textView);
        o4 o4Var = new o4(this, getContext(), bVar);
        this.I = o4Var;
        o4Var.setHint(LocaleController.getString(R.string.Search));
        frameLayout.addView(o4Var, k7.b6.d(-1, -1.0f, 51, 0.0f, 36.0f, 0.0f, 0.0f));
        addView(frameLayout);
    }

    public static void a(d5 d5Var) {
        new eg.o1(d5Var.H.f, 14, false).show();
    }

    public static void b(d5 d5Var) {
        c5 c5Var = d5Var.B;
        if (c5Var != null) {
            c5Var.r.remove(d5Var);
        }
        c5 c5Var2 = d5Var.C;
        d5Var.B = c5Var2;
        if (c5Var2 == null) {
            return;
        }
        ArrayList arrayList = c5Var2.r;
        if (!arrayList.contains(d5Var)) {
            arrayList.add(d5Var);
        }
        d5Var.B.e(d5Var.L, d5Var.Q, d5Var.P);
        d5Var.w.E();
        d5Var.x.h1(0, (int) (d5Var.getTopOffset() - d5Var.r.getPaddingTop()));
    }

    public static void f(int i10, long j10, TL_stories.StoryItem storyItem) {
        if (storyItem == null) {
            return;
        }
        SparseArray sparseArray = (SparseArray) MessagesController.getInstance(i10).storiesController.x.f(storyItem.dialogId);
        c5 c5Var = sparseArray == null ? null : (c5) sparseArray.get(storyItem.id);
        TL_stories.StoryViews storyViews = storyItem.views;
        int i11 = storyViews == null ? 0 : storyViews.views_count;
        if (c5Var == null || c5Var.a != i11) {
            if (c5Var != null) {
                c5Var.d();
            }
            c5 c5Var2 = new c5(i10, j10, storyItem);
            c5Var2.c();
            if (sparseArray == null) {
                a0.h hVar = MessagesController.getInstance(i10).storiesController.x;
                long j11 = storyItem.dialogId;
                sparseArray = new SparseArray();
                hVar.k(sparseArray, j11);
            }
            sparseArray.put(storyItem.id, c5Var2);
        }
    }

    public final void c() {
        if (this.B == null || this.x.N0() <= this.w.c.size() - 10) {
            return;
        }
        this.B.c();
    }

    public final boolean d(TL_stories.StoryView storyView) {
        ph.t6 t6Var;
        ph.c8 c8Var;
        if (storyView == null) {
            return true;
        }
        int i10 = this.v;
        if (MessagesController.getInstance(i10).getStoriesController().L(storyView) || MessagesController.getInstance(i10).blockePeers.indexOfKey(storyView.user_id) >= 0) {
            return false;
        }
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(storyView.user_id));
        l5 l5Var = this.y;
        if (l5Var != null) {
            TL_stories.StoryItem storyItem = l5Var.a;
            if (storyItem != null) {
                if (storyItem.parsedPrivacy == null) {
                    storyItem.parsedPrivacy = new ph.c8(i10, storyItem.privacy);
                }
                return this.y.a.parsedPrivacy.b(user);
            }
            s6 s6Var = l5Var.b;
            if (s6Var != null && (t6Var = s6Var.c) != null && (c8Var = t6Var.E0) != null) {
                return c8Var.b(user);
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
                            l5 l5Var = this.y;
                            l5Var.b = null;
                            l5Var.a = storyItem;
                            g(this.T, l5Var);
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
            j4 j4Var = this.r;
            if (i12 >= j4Var.getChildCount()) {
                return;
            }
            View childAt = j4Var.getChildAt(i12);
            if ((childAt instanceof org.telegram.ui.Cells.m6) && (R = RecyclerView.R(childAt)) >= 0) {
                z4 z4Var = this.w;
                if (R < z4Var.c.size()) {
                    ((org.telegram.ui.Cells.m6) childAt).a(d(((u4) z4Var.c.get(R)).b) ? 1.0f : 0.5f, true);
                }
            }
            i12++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        j4 j4Var;
        View view = null;
        int i10 = 0;
        int i11 = -1;
        while (true) {
            j4Var = this.r;
            if (i10 >= j4Var.getChildCount()) {
                break;
            }
            View childAt = j4Var.getChildAt(i10);
            int S = RecyclerView.S(childAt);
            if (S < i11 || i11 == -1) {
                view = childAt;
                i11 = S;
            }
            i10++;
        }
        int max = i11 == 0 ? (int) Math.max(0.0f, view.getY()) : i11 > 0 ? 0 : j4Var.getPaddingTop();
        FrameLayout frameLayout = this.c;
        float f10 = max;
        if (frameLayout.getTranslationY() != f10) {
            frameLayout.setTranslationY(f10);
            i5 i5Var = (i5) this;
            int intValue = ((Integer) i5Var.getTag()).intValue();
            m5 m5Var = i5Var.U.e;
            f5 f5Var = m5Var.h;
            if (intValue == m5Var.B.getCurrentItem()) {
                f5Var.setAlpha(Utilities.clamp(f10 / m5Var.d, 1.0f, 0.0f));
                f5Var.setTranslationY((-(m5Var.d - f10)) / 2.0f);
            }
        }
        this.R.setBounds(-AndroidUtilities.dp(6.0f), max, AndroidUtilities.dp(6.0f) + getMeasuredWidth(), getMeasuredHeight());
        this.R.draw(canvas);
        if (this.S) {
            this.S = false;
            if (frameLayout.getTranslationY() != 0.0f && frameLayout.getTranslationY() != j4Var.getPaddingTop()) {
                float translationY = frameLayout.getTranslationY();
                float paddingTop = j4Var.getPaddingTop() / 2.0f;
                b4.e0 e0Var = this.d;
                if (translationY > paddingTop) {
                    e0Var.y((int) (-(j4Var.getPaddingTop() - frameLayout.getTranslationY())));
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

    public final void e(c5 c5Var) {
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        z4 z4Var = this.w;
        int size = z4Var.c.size();
        p4 p4Var = this.L;
        if (TextUtils.isEmpty(p4Var.c) && !p4Var.b) {
            i();
        }
        z4Var.E();
        this.G.b(size - 1);
        c();
        if (this.D != null) {
            ArrayList arrayList = c5Var.i;
            if (c5Var != this.B || arrayList == null || this.E >= arrayList.size()) {
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

    public final void g(long j10, l5 l5Var) {
        this.T = j10;
        this.y = l5Var;
        i();
        h(false);
        if (l5Var == null || l5Var.a == null) {
            return;
        }
        NotificationsController.getInstance(this.v).processSeenStoryReactions(j10, l5Var.a.id);
    }

    public float getTopOffset() {
        return this.c.getTranslationY();
    }

    public final void h(boolean z4) {
        int i10;
        p4 p4Var = this.L;
        boolean z10 = p4Var.b;
        t4 t4Var = this.M;
        if (z10 != t4Var.s || !z4) {
            ValueAnimator valueAnimator = t4Var.w;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                t4Var.w.cancel();
            }
            t4Var.s = z10 ? 1 : 0;
            if (z4) {
                t4Var.e.set(t4Var.n);
                t4Var.f = t4Var.c.getAlpha();
                t4Var.h = t4Var.d.getAlpha();
                t4Var.r = 0.0f;
                t4Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                t4Var.w = ofFloat;
                ofFloat.addUpdateListener(new dg.o1(t4Var, 29));
                t4Var.w.addListener(new cg.l0(t4Var, 23));
                t4Var.w.setDuration(250L);
                t4Var.w.setInterpolator(mr.f);
                t4Var.w.start();
            } else {
                t4Var.r = 1.0f;
                t4Var.invalidate();
            }
        }
        boolean z11 = p4Var.a;
        xl0 xl0Var = t4Var.v;
        if (z11) {
            c5 c5Var = this.B;
            i10 = (c5Var == null || !c5Var.f) ? R.drawable.menu_views_reactions3 : R.drawable.menu_views_reposts3;
        } else {
            i10 = R.drawable.menu_views_recent3;
        }
        xl0Var.a(i10, z4);
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
        o4 o4Var = this.I;
        t4 t4Var = this.M;
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
            c5 c5Var = sparseArray != null ? (c5) sparseArray.get(storyItem.id) : null;
            this.C = c5Var;
            TL_stories.StoryViews storyViews2 = storyItem.views;
            int i12 = storyViews2 == null ? 0 : storyViews2.views_count;
            p4 p4Var = this.L;
            if (c5Var == null || !(c5Var.f || c5Var.a == i12)) {
                if (c5Var != null) {
                    c5Var.d();
                }
                c5 c5Var2 = new c5(i11, this.T, storyItem);
                this.C = c5Var2;
                c5Var2.e(p4Var, this.Q, this.P);
                this.C.c();
                if (sparseArray != null) {
                    sparseArray.put(storyItem.id, this.C);
                } else {
                    SparseArray sparseArray2 = new SparseArray();
                    sparseArray2.put(storyItem.id, this.C);
                    MessagesController.getInstance(i11).storiesController.x.k(sparseArray2, storyItem.dialogId);
                }
            } else {
                c5Var.e(p4Var, this.Q, this.P);
            }
            c5 c5Var3 = this.B;
            if (c5Var3 != null) {
                c5Var3.r.remove(this);
            }
            c5 c5Var4 = this.C;
            this.B = c5Var4;
            if (c5Var4 != null && this.F) {
                ArrayList arrayList = c5Var4.r;
                if (!arrayList.contains(this)) {
                    arrayList.add(this);
                }
            }
            c5 c5Var5 = this.B;
            if (c5Var5 == null || !c5Var5.j || UserConfig.getInstance(i11).isPremium()) {
                c5 c5Var6 = this.B;
                if (c5Var6.e || c5Var6.m || !c5Var6.g.isEmpty() || !this.B.i.isEmpty() || !TextUtils.isEmpty(this.B.s.c)) {
                    TL_stories.StoryViews storyViews3 = storyItem.views;
                    if (storyViews3 == null || storyViews3.views_count == 0) {
                        this.O = false;
                        this.P = false;
                        this.Q = false;
                        textView.setText(LocaleController.getString(this.B.f ? R.string.Reactions : R.string.Viewers));
                        o4Var.setVisibility(8);
                        t4Var.setVisibility(8);
                        this.e = 46;
                    } else {
                        t4Var.setVisibility(0);
                        c5 c5Var7 = this.B;
                        if (c5Var7.k) {
                            textView.setText(LocaleController.getString(c5Var7.f ? R.string.Reactions : R.string.Viewers));
                            this.O = false;
                            this.P = false;
                            this.Q = false;
                        } else {
                            if (c5Var7.b() < 20 && this.B.b() < storyItem.views.views_count) {
                                c5 c5Var8 = this.B;
                                if (!c5Var8.e && !c5Var8.m) {
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
                        o4Var.setVisibility(this.O ? 0 : 8);
                        this.e = this.O ? 96 : 46;
                    }
                }
            }
            this.O = false;
            this.P = false;
            this.Q = false;
            textView.setText(LocaleController.getString(this.B.f ? R.string.Reactions : R.string.Viewers));
            o4Var.setVisibility(8);
            t4Var.setVisibility(8);
            this.e = 46;
        } else {
            this.e = 46;
            textView.setText(LocaleController.getString(R.string.UploadingStory));
            o4Var.setVisibility(8);
            t4Var.setVisibility(8);
        }
        t4Var.a.setVisibility(this.P ? 0 : 8);
        t4Var.c.setVisibility(this.Q ? 0 : 8);
        t4Var.d.setVisibility(this.Q ? 0 : 8);
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
        c5 c5Var = this.B;
        if (c5Var != null) {
            ArrayList arrayList = c5Var.r;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            this.B.p.clear();
        }
        this.w.E();
        int i10 = this.v;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesBlocklistUpdate);
        ic.a(this, new kh.t0(this, 3));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.F = false;
        c5 c5Var = this.B;
        if (c5Var != null) {
            c5Var.r.remove(this);
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
        j4 j4Var = this.r;
        if (f10 != j4Var.getPaddingBottom()) {
            j4Var.setPadding(0, (int) f10, 0, 0);
            j4Var.requestLayout();
        }
    }

    public void setShadowDrawable(Drawable drawable) {
        this.R = drawable;
    }
}
