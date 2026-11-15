package fi;

import a8.xa;
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
import c8.ja;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.at;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.us;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public abstract class c5 extends FrameLayout implements org.telegram.ui.ActionBar.z5, is {
    public j5 E;
    public b5 F;
    public b5 G;
    public n6 H;
    public int I;
    public boolean J;
    public final xi0 K;
    public final i9 L;
    public final n4 M;
    public final o4 N;
    public final ai.f0 O;
    public final o4 P;
    public final s4 Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public Drawable V;
    public boolean W;
    public final View a;
    public long a0;
    public final View b;
    public int b0;
    public final FrameLayout c;
    public final xa d;
    public int e;
    public r4 f;
    public final TextView h;
    public int n;
    public final j4 r;
    public final b s;
    public final int w;
    public final y4 x;
    public final qy y;

    public c5(i9 i9Var, Context context, o4 o4Var, ai.f0 f0Var) {
        super(context);
        this.e = 96;
        this.P = new o4();
        this.N = o4Var;
        this.O = f0Var;
        b bVar = i9Var.E;
        this.s = bVar;
        this.L = i9Var;
        this.w = i9Var.h;
        TextView textView = new TextView(context);
        this.h = textView;
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.j5, bVar);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(8.0f));
        s4 s4Var = new s4(this, getContext());
        this.Q = s4Var;
        j4 j4Var = new j4(this, context, bVar);
        this.r = j4Var;
        j4Var.setClipToPadding(false);
        this.K = new xi0(j4Var, true);
        qy qyVar = new qy(0, j4Var);
        this.y = qyVar;
        j4Var.setLayoutManager(qyVar);
        j4Var.setNestedScrollingEnabled(true);
        y4 y4Var = new y4(this);
        this.x = y4Var;
        j4Var.setAdapter(y4Var);
        new SparseArray();
        new HashMap();
        addView(j4Var);
        this.d = new xa(j4Var);
        j4Var.setOnScrollListener(new bi.z4(this, 12));
        j4Var.setOnItemClickListener(new i4(0, this, i9Var));
        j4Var.setOnItemLongClickListener(new m4(this, i9Var));
        y4Var.E();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.c = frameLayout;
        View view = new View(getContext());
        this.a = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i7 = org.telegram.ui.ActionBar.j6.h5;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i7, bVar);
        this.b0 = w02;
        view.setBackground(new GradientDrawable(orientation, new int[]{w02, 0}));
        frameLayout.addView(view, ja.d(-1, 8.0f, 0, 0.0f, this.e - 8, 0.0f, 0.0f));
        View view2 = new View(getContext());
        this.b = view2;
        org.telegram.ui.ActionBar.q6.h(i7, view2, bVar);
        frameLayout.addView(view2, ja.d(-1, 10.0f, 0, 0.0f, this.e - 17, 0.0f, 0.0f));
        frameLayout.addView(s4Var);
        frameLayout.addView(textView);
        n4 n4Var = new n4(this, getContext(), bVar);
        this.M = n4Var;
        n4Var.setHint(hd.M0(2131745836, null));
        frameLayout.addView(n4Var, ja.d(-1, -1.0f, 51, 0.0f, 36.0f, 0.0f, 0.0f));
        addView(frameLayout);
    }

    public static void a(c5 c5Var) {
        new ug.x0(c5Var.L.f, 14, false).show();
    }

    public static void b(c5 c5Var) {
        b5 b5Var = c5Var.F;
        if (b5Var != null) {
            b5Var.r.remove(c5Var);
        }
        b5 b5Var2 = c5Var.G;
        c5Var.F = b5Var2;
        if (b5Var2 == null) {
            return;
        }
        ArrayList arrayList = b5Var2.r;
        if (!arrayList.contains(c5Var)) {
            arrayList.add(c5Var);
        }
        c5Var.F.e(c5Var.P, c5Var.U, c5Var.T);
        c5Var.x.E();
        c5Var.y.h1(0, (int) (c5Var.getTopOffset() - c5Var.r.getPaddingTop()));
    }

    public static void f(int i7, long j3, TL_stories.StoryItem storyItem) {
        if (storyItem == null) {
            return;
        }
        SparseArray sparseArray = (SparseArray) np.s1(i7).i0.x.f(storyItem.dialogId);
        b5 b5Var = sparseArray == null ? null : (b5) sparseArray.get(storyItem.id);
        TL_stories.StoryViews storyViews = storyItem.views;
        int i10 = storyViews == null ? 0 : storyViews.views_count;
        if (b5Var == null || b5Var.a != i10) {
            if (b5Var != null) {
                b5Var.d();
            }
            b5 b5Var2 = new b5(i7, j3, storyItem);
            b5Var2.c();
            if (sparseArray == null) {
                a0.h hVar = np.s1(i7).i0.x;
                long j10 = storyItem.dialogId;
                sparseArray = new SparseArray();
                hVar.k(sparseArray, j10);
            }
            sparseArray.put(storyItem.id, b5Var2);
        }
    }

    public final void c() {
        if (this.F == null || this.y.N0() <= this.x.c.size() - 10) {
            return;
        }
        this.F.c();
    }

    public final boolean d(TL_stories.StoryView storyView) {
        hi.d7 d7Var;
        hi.o8 o8Var;
        if (storyView == null) {
            return true;
        }
        int i7 = this.w;
        if (np.s1(i7).P1().N(storyView) || np.s1(i7).H0.indexOfKey(storyView.user_id) >= 0) {
            return false;
        }
        TLRPC.User a22 = np.s1(i7).a2(Long.valueOf(storyView.user_id));
        j5 j5Var = this.E;
        if (j5Var == null) {
            return true;
        }
        TL_stories.StoryItem storyItem = j5Var.a;
        if (storyItem != null) {
            if (storyItem.parsedPrivacy == null) {
                storyItem.parsedPrivacy = new hi.o8(i7, storyItem.privacy);
            }
            return this.E.a.parsedPrivacy.b(a22);
        }
        r6 r6Var = j5Var.b;
        if (r6Var == null || (d7Var = r6Var.c) == null || (o8Var = d7Var.E0) == null) {
            return true;
        }
        return o8Var.b(a22);
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int R;
        int i11 = 0;
        if (i7 == ns.v5) {
            if (this.E.b != null) {
                int i12 = this.w;
                TL_stories.PeerStories y10 = np.s1(i12).i0.y(m10.i(i12).n);
                if (y10 != null) {
                    while (i11 < y10.stories.size()) {
                        TL_stories.StoryItem storyItem = y10.stories.get(i11);
                        String str = storyItem.attachPath;
                        if (str != null && str.equals(this.E.b.e)) {
                            j5 j5Var = this.E;
                            j5Var.b = null;
                            j5Var.a = storyItem;
                            g(this.a0, j5Var);
                            return;
                        }
                        i11++;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i7 != ns.a3) {
            return;
        }
        while (true) {
            j4 j4Var = this.r;
            if (i11 >= j4Var.getChildCount()) {
                return;
            }
            View childAt = j4Var.getChildAt(i11);
            if ((childAt instanceof org.telegram.ui.Cells.l6) && (R = RecyclerView.R(childAt)) >= 0) {
                y4 y4Var = this.x;
                if (R < y4Var.c.size()) {
                    ((org.telegram.ui.Cells.l6) childAt).a(true, d(((t4) y4Var.c.get(R)).b) ? 1.0f : 0.5f);
                }
            }
            i11++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        j4 j4Var;
        View view = null;
        int i7 = -1;
        int i10 = 0;
        while (true) {
            j4Var = this.r;
            if (i10 >= j4Var.getChildCount()) {
                break;
            }
            View childAt = j4Var.getChildAt(i10);
            int S = RecyclerView.S(childAt);
            if (S < i7 || i7 == -1) {
                view = childAt;
                i7 = S;
            }
            i10++;
        }
        int max = i7 == 0 ? (int) Math.max(0.0f, view.getY()) : i7 > 0 ? 0 : j4Var.getPaddingTop();
        FrameLayout frameLayout = this.c;
        float f10 = max;
        if (frameLayout.getTranslationY() != f10) {
            frameLayout.setTranslationY(f10);
            g5 g5Var = (g5) this;
            int intValue = ((Integer) g5Var.getTag()).intValue();
            k5 k5Var = g5Var.c0.e;
            d5 d5Var = k5Var.h;
            if (intValue == k5Var.F.getCurrentItem()) {
                d5Var.setAlpha(Utilities.i(f10 / k5Var.d, 1.0f, 0.0f));
                d5Var.setTranslationY((-(k5Var.d - f10)) / 2.0f);
            }
        }
        this.V.setBounds(-org.telegram.messenger.g0.L(6.0f), max, org.telegram.messenger.g0.L(6.0f) + getMeasuredWidth(), getMeasuredHeight());
        this.V.draw(canvas);
        if (this.W) {
            this.W = false;
            if (frameLayout.getTranslationY() != 0.0f && frameLayout.getTranslationY() != j4Var.getPaddingTop()) {
                float translationY = frameLayout.getTranslationY();
                float paddingTop = j4Var.getPaddingTop() / 2.0f;
                xa xaVar = this.d;
                if (translationY > paddingTop) {
                    xaVar.w((int) (-(j4Var.getPaddingTop() - frameLayout.getTranslationY())));
                } else {
                    xaVar.w((int) frameLayout.getTranslationY());
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.r) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        canvas.clipRect(0, org.telegram.messenger.g0.L(this.e), getMeasuredWidth(), getMeasuredHeight());
        super.drawChild(canvas, view, j3);
        canvas.restore();
        return true;
    }

    public final void e(b5 b5Var) {
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        y4 y4Var = this.x;
        int size = y4Var.c.size();
        o4 o4Var = this.P;
        if (TextUtils.isEmpty(o4Var.c) && !o4Var.b) {
            i();
        }
        y4Var.E();
        this.K.b(size - 1);
        c();
        if (this.H != null) {
            ArrayList arrayList = b5Var.i;
            if (b5Var != this.F || arrayList == null || this.I >= arrayList.size()) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i7 = this.I; i7 < arrayList.size(); i7++) {
                TL_stories.StoryReaction storyReaction = (TL_stories.StoryReaction) arrayList.get(i7);
                if ((storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) && (storyItem = (tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction).story) != null) {
                    storyItem.dialogId = org.telegram.messenger.m5.o(tL_storyReactionPublicRepost.peer_id);
                    arrayList2.add(storyItem);
                }
            }
            this.I = arrayList.size();
            if (arrayList2.isEmpty()) {
                return;
            }
            this.H.F(arrayList2);
        }
    }

    public final void g(long j3, j5 j5Var) {
        this.a0 = j3;
        this.E = j5Var;
        i();
        h(false);
        if (j5Var == null || j5Var.a == null) {
            return;
        }
        at t6 = at.t(this.w);
        int i7 = j5Var.a.id;
        if (j3 != t6.getUserConfig().e()) {
            return;
        }
        at.l0.c(new us(t6, i7, 5));
    }

    public float getTopOffset() {
        return this.c.getTranslationY();
    }

    public final void h(boolean z10) {
        int i7;
        o4 o4Var = this.P;
        boolean z11 = o4Var.b;
        s4 s4Var = this.Q;
        if (z11 != s4Var.s || !z10) {
            ValueAnimator valueAnimator = s4Var.x;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                s4Var.x.cancel();
            }
            s4Var.s = z11 ? 1 : 0;
            if (z10) {
                s4Var.e.set(s4Var.n);
                s4Var.f = s4Var.c.getAlpha();
                s4Var.h = s4Var.d.getAlpha();
                s4Var.r = 0.0f;
                s4Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                s4Var.x = ofFloat;
                ofFloat.addUpdateListener(new ah.h(s4Var, 21));
                s4Var.x.addListener(new ai.i0(s4Var, 15));
                s4Var.x.setDuration(250L);
                s4Var.x.setInterpolator(er.f);
                s4Var.x.start();
            } else {
                s4Var.r = 1.0f;
                s4Var.invalidate();
            }
        }
        boolean z12 = o4Var.a;
        ck0 ck0Var = s4Var.w;
        if (z12) {
            b5 b5Var = this.F;
            i7 = (b5Var == null || !b5Var.f) ? R.drawable.menu_views_reactions3 : R.drawable.menu_views_reposts3;
        } else {
            i7 = R.drawable.menu_views_recent3;
        }
        ck0Var.a(i7, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        long j3;
        this.S = false;
        this.U = false;
        this.T = false;
        TL_stories.StoryItem storyItem = this.E.a;
        n4 n4Var = this.M;
        s4 s4Var = this.Q;
        TextView textView = this.h;
        if (storyItem != null) {
            TL_stories.StoryViews storyViews = storyItem.views;
            if (storyViews != null) {
                int i7 = storyViews.views_count;
                j3 = 0;
                this.S = i7 >= 15;
                int i10 = storyViews.reactions_count;
                boolean z10 = org.telegram.messenger.r2.a;
                this.T = i10 >= 10;
                this.U = (storyItem.dialogId < 0 || i7 < 20 || storyItem.contacts || storyItem.close_friends || storyItem.selected_contacts) ? false : true;
            } else {
                j3 = 0;
            }
            int i11 = this.w;
            SparseArray sparseArray = (SparseArray) np.s1(i11).i0.x.f(storyItem.dialogId);
            b5 b5Var = sparseArray != null ? (b5) sparseArray.get(storyItem.id) : null;
            this.G = b5Var;
            TL_stories.StoryViews storyViews2 = storyItem.views;
            int i12 = storyViews2 == null ? 0 : storyViews2.views_count;
            o4 o4Var = this.P;
            if (b5Var == null || !(b5Var.f || b5Var.a == i12)) {
                if (b5Var != null) {
                    b5Var.d();
                }
                b5 b5Var2 = new b5(i11, this.a0, storyItem);
                this.G = b5Var2;
                b5Var2.e(o4Var, this.U, this.T);
                this.G.c();
                if (sparseArray != null) {
                    sparseArray.put(storyItem.id, this.G);
                } else {
                    SparseArray sparseArray2 = new SparseArray();
                    sparseArray2.put(storyItem.id, this.G);
                    np.s1(i11).i0.x.k(sparseArray2, storyItem.dialogId);
                }
            } else {
                b5Var.e(o4Var, this.U, this.T);
            }
            b5 b5Var3 = this.F;
            if (b5Var3 != null) {
                b5Var3.r.remove(this);
            }
            b5 b5Var4 = this.G;
            this.F = b5Var4;
            if (b5Var4 != null && this.J) {
                ArrayList arrayList = b5Var4.r;
                if (!arrayList.contains(this)) {
                    arrayList.add(this);
                }
            }
            b5 b5Var5 = this.F;
            if (b5Var5 == null || !b5Var5.j || m10.i(i11).q()) {
                b5 b5Var6 = this.F;
                if (b5Var6.e || b5Var6.m || !b5Var6.g.isEmpty() || !this.F.i.isEmpty() || !TextUtils.isEmpty(this.F.s.c)) {
                    TL_stories.StoryViews storyViews3 = storyItem.views;
                    if (storyViews3 == null || storyViews3.views_count == 0) {
                        this.S = false;
                        this.T = false;
                        this.U = false;
                        textView.setText(hd.M0(this.F.f ? 2131746387 : 2131743537, null));
                        n4Var.setVisibility(8);
                        s4Var.setVisibility(8);
                        this.e = 46;
                    } else {
                        s4Var.setVisibility(0);
                        b5 b5Var7 = this.F;
                        if (b5Var7.k) {
                            textView.setText(hd.M0(b5Var7.f ? 2131746387 : 2131743537, null));
                            this.S = false;
                            this.T = false;
                            this.U = false;
                        } else {
                            if (b5Var7.b() < 20 && this.F.b() < storyItem.views.views_count) {
                                b5 b5Var8 = this.F;
                                if (!b5Var8.e && !b5Var8.m) {
                                    this.S = false;
                                    this.T = false;
                                    this.U = false;
                                    textView.setText(hd.M0(this.F.f ? 2131746387 : 2131743537, null));
                                }
                            }
                            this.S = !this.F.f && storyItem.views.views_count >= 15;
                            TL_stories.StoryViews storyViews4 = storyItem.views;
                            int i13 = storyViews4.reactions_count;
                            boolean z11 = org.telegram.messenger.r2.a;
                            this.T = i13 >= 5;
                            this.U = (storyItem.dialogId < j3 || storyViews4.views_count < 20 || storyItem.contacts || storyItem.close_friends || storyItem.selected_contacts) ? false : true;
                            textView.setText(hd.M0(this.F.f ? 2131746387 : 2131743537, null));
                        }
                        n4Var.setVisibility(this.S ? 0 : 8);
                        this.e = this.S ? 96 : 46;
                    }
                }
            }
            this.S = false;
            this.T = false;
            this.U = false;
            textView.setText(hd.M0(this.F.f ? 2131746387 : 2131743537, null));
            n4Var.setVisibility(8);
            s4Var.setVisibility(8);
            this.e = 46;
        } else {
            this.e = 46;
            textView.setText(hd.M0(2131743800, null));
            n4Var.setVisibility(8);
            s4Var.setVisibility(8);
        }
        s4Var.a.setVisibility(this.T ? 0 : 8);
        s4Var.c.setVisibility(this.U ? 0 : 8);
        s4Var.d.setVisibility(this.U ? 0 : 8);
        if (this.U) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(this.e - 8);
        ((ViewGroup.MarginLayoutParams) this.b.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(this.e - 17);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        b5 b5Var = this.F;
        if (b5Var != null) {
            ArrayList arrayList = b5Var.r;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            this.F.p.clear();
        }
        this.x.E();
        int i7 = this.w;
        ns.f(i7).c(this, ns.v5);
        ns.f(i7).c(this, ns.a3);
        setTag(R.id.bulletin_delegate_tag, new bi.e1(this, 3));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J = false;
        b5 b5Var = this.F;
        if (b5Var != null) {
            b5Var.r.remove(this);
        }
        int i7 = this.w;
        ns.f(i7).n(this, ns.v5);
        ns.f(i7).n(this, ns.a3);
        setTag(R.id.bulletin_delegate_tag, null);
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
        this.V = drawable;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, this.s);
            View view = this.a;
            if (view == null || w02 == this.b0) {
                return;
            }
            this.b0 = w02;
            view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{w02, 0}));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
