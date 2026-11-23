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
import c8.ma;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.ss;
import org.telegram.messenger.ys;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.mk0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.yy;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public abstract class b5 extends FrameLayout implements org.telegram.ui.ActionBar.b6, gs {
    public i5 E;
    public a5 F;
    public a5 G;
    public k6 H;
    public int I;
    public boolean J;
    public final hj0 K;
    public final f9 L;
    public final m4 M;
    public final n4 N;
    public final ai.h0 O;
    public final n4 P;
    public final r4 Q;
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
    public q4 f;
    public final TextView h;
    public int n;
    public final h4 r;
    public final b s;
    public final int w;
    public final x4 x;
    public final yy y;

    public b5(f9 f9Var, Context context, n4 n4Var, ai.h0 h0Var) {
        super(context);
        this.e = 96;
        this.P = new n4();
        this.N = n4Var;
        this.O = h0Var;
        b bVar = f9Var.E;
        this.s = bVar;
        this.L = f9Var;
        this.w = f9Var.h;
        TextView textView = new TextView(context);
        this.h = textView;
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.j5, bVar);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(8.0f));
        r4 r4Var = new r4(this, getContext());
        this.Q = r4Var;
        h4 h4Var = new h4(this, context, bVar);
        this.r = h4Var;
        h4Var.setClipToPadding(false);
        this.K = new hj0(h4Var, true);
        yy yyVar = new yy(0, h4Var);
        this.y = yyVar;
        h4Var.setLayoutManager(yyVar);
        h4Var.setNestedScrollingEnabled(true);
        x4 x4Var = new x4(this);
        this.x = x4Var;
        h4Var.setAdapter(x4Var);
        new SparseArray();
        new HashMap();
        addView(h4Var);
        this.d = new xa(h4Var);
        h4Var.setOnScrollListener(new bi.u1(this, 13));
        h4Var.setOnItemClickListener(new g4(0, this, f9Var));
        h4Var.setOnItemLongClickListener(new k4(this, f9Var));
        x4Var.E();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.c = frameLayout;
        View view = new View(getContext());
        this.a = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i7 = org.telegram.ui.ActionBar.m6.h5;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, bVar);
        this.b0 = w02;
        view.setBackground(new GradientDrawable(orientation, new int[]{w02, 0}));
        frameLayout.addView(view, ma.d(-1, 8.0f, 0, 0.0f, this.e - 8, 0.0f, 0.0f));
        View view2 = new View(getContext());
        this.b = view2;
        org.telegram.ui.ActionBar.t6.h(i7, view2, bVar);
        frameLayout.addView(view2, ma.d(-1, 10.0f, 0, 0.0f, this.e - 17, 0.0f, 0.0f));
        frameLayout.addView(r4Var);
        frameLayout.addView(textView);
        m4 m4Var = new m4(this, getContext(), bVar);
        this.M = m4Var;
        m4Var.setHint(hd.N0(2131745640, null));
        frameLayout.addView(m4Var, ma.d(-1, -1.0f, 51, 0.0f, 36.0f, 0.0f, 0.0f));
        addView(frameLayout);
    }

    public static void a(b5 b5Var) {
        new ug.y0(b5Var.L.f, 14, false).show();
    }

    public static void b(b5 b5Var) {
        a5 a5Var = b5Var.F;
        if (a5Var != null) {
            a5Var.r.remove(b5Var);
        }
        a5 a5Var2 = b5Var.G;
        b5Var.F = a5Var2;
        if (a5Var2 == null) {
            return;
        }
        ArrayList arrayList = a5Var2.r;
        if (!arrayList.contains(b5Var)) {
            arrayList.add(b5Var);
        }
        b5Var.F.e(b5Var.P, b5Var.U, b5Var.T);
        b5Var.x.E();
        b5Var.y.h1(0, (int) (b5Var.getTopOffset() - b5Var.r.getPaddingTop()));
    }

    public static void f(int i7, long j3, TL_stories.StoryItem storyItem) {
        if (storyItem == null) {
            return;
        }
        SparseArray sparseArray = (SparseArray) np.u1(i7).i0.x.f(storyItem.dialogId);
        a5 a5Var = sparseArray == null ? null : (a5) sparseArray.get(storyItem.id);
        TL_stories.StoryViews storyViews = storyItem.views;
        int i10 = storyViews == null ? 0 : storyViews.views_count;
        if (a5Var == null || a5Var.a != i10) {
            if (a5Var != null) {
                a5Var.d();
            }
            a5 a5Var2 = new a5(i7, j3, storyItem);
            a5Var2.c();
            if (sparseArray == null) {
                a0.h hVar = np.u1(i7).i0.x;
                long j10 = storyItem.dialogId;
                sparseArray = new SparseArray();
                hVar.k(sparseArray, j10);
            }
            sparseArray.put(storyItem.id, a5Var2);
        }
    }

    public final void c() {
        if (this.F == null || this.y.N0() <= this.x.c.size() - 10) {
            return;
        }
        this.F.c();
    }

    public final boolean d(TL_stories.StoryView storyView) {
        hi.c7 c7Var;
        hi.n8 n8Var;
        if (storyView == null) {
            return true;
        }
        int i7 = this.w;
        if (np.u1(i7).R1().N(storyView) || np.u1(i7).H0.indexOfKey(storyView.user_id) >= 0) {
            return false;
        }
        TLRPC.User c22 = np.u1(i7).c2(Long.valueOf(storyView.user_id));
        i5 i5Var = this.E;
        if (i5Var == null) {
            return true;
        }
        TL_stories.StoryItem storyItem = i5Var.a;
        if (storyItem != null) {
            if (storyItem.parsedPrivacy == null) {
                storyItem.parsedPrivacy = new hi.n8(i7, storyItem.privacy);
            }
            return this.E.a.parsedPrivacy.b(c22);
        }
        o6 o6Var = i5Var.b;
        if (o6Var == null || (c7Var = o6Var.c) == null || (n8Var = c7Var.E0) == null) {
            return true;
        }
        return n8Var.b(c22);
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int R;
        int i11 = 0;
        if (i7 == ls.y5) {
            if (this.E.b != null) {
                int i12 = this.w;
                TL_stories.PeerStories y10 = np.u1(i12).i0.y(k10.i(i12).n);
                if (y10 != null) {
                    while (i11 < y10.stories.size()) {
                        TL_stories.StoryItem storyItem = y10.stories.get(i11);
                        String str = storyItem.attachPath;
                        if (str != null && str.equals(this.E.b.e)) {
                            i5 i5Var = this.E;
                            i5Var.b = null;
                            i5Var.a = storyItem;
                            g(this.a0, i5Var);
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
        if (i7 != ls.c3) {
            return;
        }
        while (true) {
            h4 h4Var = this.r;
            if (i11 >= h4Var.getChildCount()) {
                return;
            }
            View childAt = h4Var.getChildAt(i11);
            if ((childAt instanceof org.telegram.ui.Cells.n6) && (R = RecyclerView.R(childAt)) >= 0) {
                x4 x4Var = this.x;
                if (R < x4Var.c.size()) {
                    ((org.telegram.ui.Cells.n6) childAt).a(true, d(((s4) x4Var.c.get(R)).b) ? 1.0f : 0.5f);
                }
            }
            i11++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        h4 h4Var;
        View view = null;
        int i7 = -1;
        int i10 = 0;
        while (true) {
            h4Var = this.r;
            if (i10 >= h4Var.getChildCount()) {
                break;
            }
            View childAt = h4Var.getChildAt(i10);
            int S = RecyclerView.S(childAt);
            if (S < i7 || i7 == -1) {
                view = childAt;
                i7 = S;
            }
            i10++;
        }
        int max = i7 == 0 ? (int) Math.max(0.0f, view.getY()) : i7 > 0 ? 0 : h4Var.getPaddingTop();
        FrameLayout frameLayout = this.c;
        float f10 = max;
        if (frameLayout.getTranslationY() != f10) {
            frameLayout.setTranslationY(f10);
            f5 f5Var = (f5) this;
            int intValue = ((Integer) f5Var.getTag()).intValue();
            j5 j5Var = f5Var.c0.e;
            c5 c5Var = j5Var.h;
            if (intValue == j5Var.F.getCurrentItem()) {
                c5Var.setAlpha(Utilities.i(f10 / j5Var.d, 1.0f, 0.0f));
                c5Var.setTranslationY((-(j5Var.d - f10)) / 2.0f);
            }
        }
        this.V.setBounds(-org.telegram.messenger.g0.L(6.0f), max, org.telegram.messenger.g0.L(6.0f) + getMeasuredWidth(), getMeasuredHeight());
        this.V.draw(canvas);
        if (this.W) {
            this.W = false;
            if (frameLayout.getTranslationY() != 0.0f && frameLayout.getTranslationY() != h4Var.getPaddingTop()) {
                float translationY = frameLayout.getTranslationY();
                float paddingTop = h4Var.getPaddingTop() / 2.0f;
                xa xaVar = this.d;
                if (translationY > paddingTop) {
                    xaVar.y((int) (-(h4Var.getPaddingTop() - frameLayout.getTranslationY())));
                } else {
                    xaVar.y((int) frameLayout.getTranslationY());
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

    public final void e(a5 a5Var) {
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        x4 x4Var = this.x;
        int size = x4Var.c.size();
        n4 n4Var = this.P;
        if (TextUtils.isEmpty(n4Var.c) && !n4Var.b) {
            i();
        }
        x4Var.E();
        this.K.b(size - 1);
        c();
        if (this.H != null) {
            ArrayList arrayList = a5Var.i;
            if (a5Var != this.F || arrayList == null || this.I >= arrayList.size()) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i7 = this.I; i7 < arrayList.size(); i7++) {
                TL_stories.StoryReaction storyReaction = (TL_stories.StoryReaction) arrayList.get(i7);
                if ((storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) && (storyItem = (tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction).story) != null) {
                    storyItem.dialogId = org.telegram.messenger.n5.o(tL_storyReactionPublicRepost.peer_id);
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

    public final void g(long j3, i5 i5Var) {
        this.a0 = j3;
        this.E = i5Var;
        i();
        h(false);
        if (i5Var == null || i5Var.a == null) {
            return;
        }
        ys t6 = ys.t(this.w);
        int i7 = i5Var.a.id;
        if (j3 != t6.getUserConfig().e()) {
            return;
        }
        ys.l0.c(new ss(t6, i7, 5));
    }

    public float getTopOffset() {
        return this.c.getTranslationY();
    }

    public final void h(boolean z10) {
        int i7;
        n4 n4Var = this.P;
        boolean z11 = n4Var.b;
        r4 r4Var = this.Q;
        if (z11 != r4Var.s || !z10) {
            ValueAnimator valueAnimator = r4Var.x;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                r4Var.x.cancel();
            }
            r4Var.s = z11 ? 1 : 0;
            if (z10) {
                r4Var.e.set(r4Var.n);
                r4Var.f = r4Var.c.getAlpha();
                r4Var.h = r4Var.d.getAlpha();
                r4Var.r = 0.0f;
                r4Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                r4Var.x = ofFloat;
                ofFloat.addUpdateListener(new ah.g(r4Var, 21));
                r4Var.x.addListener(new ai.k0(r4Var, 15));
                r4Var.x.setDuration(250L);
                r4Var.x.setInterpolator(nr.f);
                r4Var.x.start();
            } else {
                r4Var.r = 1.0f;
                r4Var.invalidate();
            }
        }
        boolean z12 = n4Var.a;
        mk0 mk0Var = r4Var.w;
        if (z12) {
            a5 a5Var = this.F;
            i7 = (a5Var == null || !a5Var.f) ? R.drawable.menu_views_reactions3 : R.drawable.menu_views_reposts3;
        } else {
            i7 = R.drawable.menu_views_recent3;
        }
        mk0Var.a(i7, z10);
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
        m4 m4Var = this.M;
        r4 r4Var = this.Q;
        TextView textView = this.h;
        if (storyItem != null) {
            TL_stories.StoryViews storyViews = storyItem.views;
            if (storyViews != null) {
                int i7 = storyViews.views_count;
                j3 = 0;
                this.S = i7 >= 15;
                int i10 = storyViews.reactions_count;
                boolean z10 = org.telegram.messenger.s2.a;
                this.T = i10 >= 10;
                this.U = (storyItem.dialogId < 0 || i7 < 20 || storyItem.contacts || storyItem.close_friends || storyItem.selected_contacts) ? false : true;
            } else {
                j3 = 0;
            }
            int i11 = this.w;
            SparseArray sparseArray = (SparseArray) np.u1(i11).i0.x.f(storyItem.dialogId);
            a5 a5Var = sparseArray != null ? (a5) sparseArray.get(storyItem.id) : null;
            this.G = a5Var;
            TL_stories.StoryViews storyViews2 = storyItem.views;
            int i12 = storyViews2 == null ? 0 : storyViews2.views_count;
            n4 n4Var = this.P;
            if (a5Var == null || !(a5Var.f || a5Var.a == i12)) {
                if (a5Var != null) {
                    a5Var.d();
                }
                a5 a5Var2 = new a5(i11, this.a0, storyItem);
                this.G = a5Var2;
                a5Var2.e(n4Var, this.U, this.T);
                this.G.c();
                if (sparseArray != null) {
                    sparseArray.put(storyItem.id, this.G);
                } else {
                    SparseArray sparseArray2 = new SparseArray();
                    sparseArray2.put(storyItem.id, this.G);
                    np.u1(i11).i0.x.k(sparseArray2, storyItem.dialogId);
                }
            } else {
                a5Var.e(n4Var, this.U, this.T);
            }
            a5 a5Var3 = this.F;
            if (a5Var3 != null) {
                a5Var3.r.remove(this);
            }
            a5 a5Var4 = this.G;
            this.F = a5Var4;
            if (a5Var4 != null && this.J) {
                ArrayList arrayList = a5Var4.r;
                if (!arrayList.contains(this)) {
                    arrayList.add(this);
                }
            }
            a5 a5Var5 = this.F;
            if (a5Var5 == null || !a5Var5.j || k10.i(i11).q()) {
                a5 a5Var6 = this.F;
                if (a5Var6.e || a5Var6.m || !a5Var6.g.isEmpty() || !this.F.i.isEmpty() || !TextUtils.isEmpty(this.F.s.c)) {
                    TL_stories.StoryViews storyViews3 = storyItem.views;
                    if (storyViews3 == null || storyViews3.views_count == 0) {
                        this.S = false;
                        this.T = false;
                        this.U = false;
                        textView.setText(hd.N0(this.F.f ? 2131746191 : 2131743292, null));
                        m4Var.setVisibility(8);
                        r4Var.setVisibility(8);
                        this.e = 46;
                    } else {
                        r4Var.setVisibility(0);
                        a5 a5Var7 = this.F;
                        if (a5Var7.k) {
                            textView.setText(hd.N0(a5Var7.f ? 2131746191 : 2131743292, null));
                            this.S = false;
                            this.T = false;
                            this.U = false;
                        } else {
                            if (a5Var7.b() < 20 && this.F.b() < storyItem.views.views_count) {
                                a5 a5Var8 = this.F;
                                if (!a5Var8.e && !a5Var8.m) {
                                    this.S = false;
                                    this.T = false;
                                    this.U = false;
                                    textView.setText(hd.N0(this.F.f ? 2131746191 : 2131743292, null));
                                }
                            }
                            this.S = !this.F.f && storyItem.views.views_count >= 15;
                            TL_stories.StoryViews storyViews4 = storyItem.views;
                            int i13 = storyViews4.reactions_count;
                            boolean z11 = org.telegram.messenger.s2.a;
                            this.T = i13 >= 5;
                            this.U = (storyItem.dialogId < j3 || storyViews4.views_count < 20 || storyItem.contacts || storyItem.close_friends || storyItem.selected_contacts) ? false : true;
                            textView.setText(hd.N0(this.F.f ? 2131746191 : 2131743292, null));
                        }
                        m4Var.setVisibility(this.S ? 0 : 8);
                        this.e = this.S ? 96 : 46;
                    }
                }
            }
            this.S = false;
            this.T = false;
            this.U = false;
            textView.setText(hd.N0(this.F.f ? 2131746191 : 2131743292, null));
            m4Var.setVisibility(8);
            r4Var.setVisibility(8);
            this.e = 46;
        } else {
            this.e = 46;
            textView.setText(hd.N0(2131743555, null));
            m4Var.setVisibility(8);
            r4Var.setVisibility(8);
        }
        r4Var.a.setVisibility(this.T ? 0 : 8);
        r4Var.c.setVisibility(this.U ? 0 : 8);
        r4Var.d.setVisibility(this.U ? 0 : 8);
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
        a5 a5Var = this.F;
        if (a5Var != null) {
            ArrayList arrayList = a5Var.r;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            this.F.p.clear();
        }
        this.x.E();
        int i7 = this.w;
        ls.f(i7).c(this, ls.y5);
        ls.f(i7).c(this, ls.c3);
        setTag(R.id.bulletin_delegate_tag, new bi.i1(this, 3));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J = false;
        a5 a5Var = this.F;
        if (a5Var != null) {
            a5Var.r.remove(this);
        }
        int i7 = this.w;
        ls.f(i7).n(this, ls.y5);
        ls.f(i7).n(this, ls.c3);
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
        h4 h4Var = this.r;
        if (f10 != h4Var.getPaddingBottom()) {
            h4Var.setPadding(0, (int) f10, 0, 0);
            h4Var.requestLayout();
        }
    }

    public void setShadowDrawable(Drawable drawable) {
        this.V = drawable;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, this.s);
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

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
