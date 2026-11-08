package di;

import a8.wa;
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
import c8.ha;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.dt;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.xs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.my;
import org.telegram.ui.Components.si0;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public abstract class k5 extends FrameLayout implements org.telegram.ui.ActionBar.a6, ls {
    public r5 D;
    public j5 E;
    public j5 F;
    public t6 G;
    public int H;
    public boolean I;
    public final si0 J;
    public final p9 K;
    public final v4 L;
    public final w4 M;
    public final ai.i N;
    public final w4 O;
    public final a5 P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public Drawable U;
    public boolean V;
    public long W;
    public final View a;
    public int a0;
    public final View b;
    public final FrameLayout c;
    public final wa d;
    public int e;
    public z4 f;
    public final TextView h;
    public int n;
    public final r4 r;
    public final b s;
    public final int w;
    public final g5 x;
    public final my y;

    public k5(p9 p9Var, Context context, w4 w4Var, ai.i iVar) {
        super(context);
        this.e = 96;
        this.O = new w4();
        this.M = w4Var;
        this.N = iVar;
        b bVar = p9Var.D;
        this.s = bVar;
        this.K = p9Var;
        this.w = p9Var.h;
        TextView textView = new TextView(context);
        this.h = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, bVar);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(8.0f));
        a5 a5Var = new a5(this, getContext());
        this.P = a5Var;
        r4 r4Var = new r4(this, context, bVar);
        this.r = r4Var;
        r4Var.setClipToPadding(false);
        this.J = new si0(r4Var, true);
        my myVar = new my(0, r4Var);
        this.y = myVar;
        r4Var.setLayoutManager(myVar);
        r4Var.setNestedScrollingEnabled(true);
        g5 g5Var = new g5(this);
        this.x = g5Var;
        r4Var.setAdapter(g5Var);
        new SparseArray();
        new HashMap();
        addView(r4Var);
        this.d = new wa(r4Var);
        r4Var.setOnScrollListener(new ai.b(this, 9));
        r4Var.setOnItemClickListener(new p4(0, this, p9Var));
        r4Var.setOnItemLongClickListener(new u4(this, p9Var));
        g5Var.E();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.c = frameLayout;
        View view = new View(getContext());
        this.a = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i7 = org.telegram.ui.ActionBar.k6.h5;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i7, bVar);
        this.a0 = w02;
        view.setBackground(new GradientDrawable(orientation, new int[]{w02, 0}));
        frameLayout.addView(view, ha.d(-1, 8.0f, 0, 0.0f, this.e - 8, 0.0f, 0.0f));
        View view2 = new View(getContext());
        this.b = view2;
        org.telegram.ui.ActionBar.r6.i(i7, view2, bVar);
        frameLayout.addView(view2, ha.d(-1, 10.0f, 0, 0.0f, this.e - 17, 0.0f, 0.0f));
        frameLayout.addView(a5Var);
        frameLayout.addView(textView);
        v4 v4Var = new v4(this, getContext(), bVar);
        this.L = v4Var;
        v4Var.setHint(id.M0(2131745839, null));
        frameLayout.addView(v4Var, ha.d(-1, -1.0f, 51, 0.0f, 36.0f, 0.0f, 0.0f));
        addView(frameLayout);
    }

    public static void a(k5 k5Var) {
        new ug.w0(k5Var.K.f, 14, false).show();
    }

    public static void b(k5 k5Var) {
        j5 j5Var = k5Var.E;
        if (j5Var != null) {
            j5Var.r.remove(k5Var);
        }
        j5 j5Var2 = k5Var.F;
        k5Var.E = j5Var2;
        if (j5Var2 == null) {
            return;
        }
        ArrayList arrayList = j5Var2.r;
        if (!arrayList.contains(k5Var)) {
            arrayList.add(k5Var);
        }
        k5Var.E.e(k5Var.O, k5Var.T, k5Var.S);
        k5Var.x.E();
        k5Var.y.h1(0, (int) (k5Var.getTopOffset() - k5Var.r.getPaddingTop()));
    }

    public static void f(int i7, long j3, TL_stories.StoryItem storyItem) {
        if (storyItem == null) {
            return;
        }
        SparseArray sparseArray = (SparseArray) qp.s1(i7).h0.x.f(storyItem.dialogId);
        j5 j5Var = sparseArray == null ? null : (j5) sparseArray.get(storyItem.id);
        TL_stories.StoryViews storyViews = storyItem.views;
        int i10 = storyViews == null ? 0 : storyViews.views_count;
        if (j5Var == null || j5Var.a != i10) {
            if (j5Var != null) {
                j5Var.d();
            }
            j5 j5Var2 = new j5(i7, j3, storyItem);
            j5Var2.c();
            if (sparseArray == null) {
                a0.h hVar = qp.s1(i7).h0.x;
                long j10 = storyItem.dialogId;
                sparseArray = new SparseArray();
                hVar.k(sparseArray, j10);
            }
            sparseArray.put(storyItem.id, j5Var2);
        }
    }

    public final void c() {
        if (this.E == null || this.y.N0() <= this.x.c.size() - 10) {
            return;
        }
        this.E.c();
    }

    public final boolean d(TL_stories.StoryView storyView) {
        fi.e7 e7Var;
        fi.q8 q8Var;
        if (storyView == null) {
            return true;
        }
        int i7 = this.w;
        if (qp.s1(i7).P1().N(storyView) || qp.s1(i7).G0.indexOfKey(storyView.user_id) >= 0) {
            return false;
        }
        TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(storyView.user_id));
        r5 r5Var = this.D;
        if (r5Var == null) {
            return true;
        }
        TL_stories.StoryItem storyItem = r5Var.a;
        if (storyItem != null) {
            if (storyItem.parsedPrivacy == null) {
                storyItem.parsedPrivacy = new fi.q8(i7, storyItem.privacy);
            }
            return this.D.a.parsedPrivacy.b(a22);
        }
        x6 x6Var = r5Var.b;
        if (x6Var == null || (e7Var = x6Var.c) == null || (q8Var = e7Var.E0) == null) {
            return true;
        }
        return q8Var.b(a22);
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int R;
        int i11 = 0;
        if (i7 == qs.v5) {
            if (this.D.b != null) {
                int i12 = this.w;
                TL_stories.PeerStories y10 = qp.s1(i12).h0.y(p10.i(i12).n);
                if (y10 != null) {
                    while (i11 < y10.stories.size()) {
                        TL_stories.StoryItem storyItem = y10.stories.get(i11);
                        String str = storyItem.attachPath;
                        if (str != null && str.equals(this.D.b.e)) {
                            r5 r5Var = this.D;
                            r5Var.b = null;
                            r5Var.a = storyItem;
                            g(this.W, r5Var);
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
        if (i7 != qs.a3) {
            return;
        }
        while (true) {
            r4 r4Var = this.r;
            if (i11 >= r4Var.getChildCount()) {
                return;
            }
            View childAt = r4Var.getChildAt(i11);
            if ((childAt instanceof org.telegram.ui.Cells.m6) && (R = RecyclerView.R(childAt)) >= 0) {
                g5 g5Var = this.x;
                if (R < g5Var.c.size()) {
                    ((org.telegram.ui.Cells.m6) childAt).a(true, d(((b5) g5Var.c.get(R)).b) ? 1.0f : 0.5f);
                }
            }
            i11++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        r4 r4Var;
        View view = null;
        int i7 = -1;
        int i10 = 0;
        while (true) {
            r4Var = this.r;
            if (i10 >= r4Var.getChildCount()) {
                break;
            }
            View childAt = r4Var.getChildAt(i10);
            int S = RecyclerView.S(childAt);
            if (S < i7 || i7 == -1) {
                view = childAt;
                i7 = S;
            }
            i10++;
        }
        int max = i7 == 0 ? (int) Math.max(0.0f, view.getY()) : i7 > 0 ? 0 : r4Var.getPaddingTop();
        FrameLayout frameLayout = this.c;
        float f10 = max;
        if (frameLayout.getTranslationY() != f10) {
            frameLayout.setTranslationY(f10);
            o5 o5Var = (o5) this;
            int intValue = ((Integer) o5Var.getTag()).intValue();
            s5 s5Var = o5Var.b0.e;
            l5 l5Var = s5Var.h;
            if (intValue == s5Var.E.getCurrentItem()) {
                l5Var.setAlpha(Utilities.i(f10 / s5Var.d, 1.0f, 0.0f));
                l5Var.setTranslationY((-(s5Var.d - f10)) / 2.0f);
            }
        }
        this.U.setBounds(-org.telegram.messenger.g0.L(6.0f), max, org.telegram.messenger.g0.L(6.0f) + getMeasuredWidth(), getMeasuredHeight());
        this.U.draw(canvas);
        if (this.V) {
            this.V = false;
            if (frameLayout.getTranslationY() != 0.0f && frameLayout.getTranslationY() != r4Var.getPaddingTop()) {
                float translationY = frameLayout.getTranslationY();
                float paddingTop = r4Var.getPaddingTop() / 2.0f;
                wa waVar = this.d;
                if (translationY > paddingTop) {
                    waVar.x((int) (-(r4Var.getPaddingTop() - frameLayout.getTranslationY())));
                } else {
                    waVar.x((int) frameLayout.getTranslationY());
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

    public final void e(j5 j5Var) {
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        g5 g5Var = this.x;
        int size = g5Var.c.size();
        w4 w4Var = this.O;
        if (TextUtils.isEmpty(w4Var.c) && !w4Var.b) {
            i();
        }
        g5Var.E();
        this.J.b(size - 1);
        c();
        if (this.G != null) {
            ArrayList arrayList = j5Var.i;
            if (j5Var != this.E || arrayList == null || this.H >= arrayList.size()) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i7 = this.H; i7 < arrayList.size(); i7++) {
                TL_stories.StoryReaction storyReaction = (TL_stories.StoryReaction) arrayList.get(i7);
                if ((storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) && (storyItem = (tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction).story) != null) {
                    storyItem.dialogId = org.telegram.messenger.m5.o(tL_storyReactionPublicRepost.peer_id);
                    arrayList2.add(storyItem);
                }
            }
            this.H = arrayList.size();
            if (arrayList2.isEmpty()) {
                return;
            }
            this.G.F(arrayList2);
        }
    }

    public final void g(long j3, r5 r5Var) {
        this.W = j3;
        this.D = r5Var;
        i();
        h(false);
        if (r5Var == null || r5Var.a == null) {
            return;
        }
        dt t6 = dt.t(this.w);
        int i7 = r5Var.a.id;
        if (j3 != t6.getUserConfig().e()) {
            return;
        }
        dt.k0.c(new xs(t6, i7, 5));
    }

    public float getTopOffset() {
        return this.c.getTranslationY();
    }

    public final void h(boolean z9) {
        int i7;
        w4 w4Var = this.O;
        boolean z10 = w4Var.b;
        a5 a5Var = this.P;
        if (z10 != a5Var.s || !z9) {
            ValueAnimator valueAnimator = a5Var.x;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                a5Var.x.cancel();
            }
            a5Var.s = z10 ? 1 : 0;
            if (z9) {
                a5Var.e.set(a5Var.n);
                a5Var.f = a5Var.c.getAlpha();
                a5Var.h = a5Var.d.getAlpha();
                a5Var.r = 0.0f;
                a5Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                a5Var.x = ofFloat;
                ofFloat.addUpdateListener(new ah.h(a5Var, 20));
                a5Var.x.addListener(new bi.t5(a5Var, 13));
                a5Var.x.setDuration(250L);
                a5Var.x.setInterpolator(xq.f);
                a5Var.x.start();
            } else {
                a5Var.r = 1.0f;
                a5Var.invalidate();
            }
        }
        boolean z11 = w4Var.a;
        xj0 xj0Var = a5Var.w;
        if (z11) {
            j5 j5Var = this.E;
            i7 = (j5Var == null || !j5Var.f) ? R.drawable.menu_views_reactions3 : R.drawable.menu_views_reposts3;
        } else {
            i7 = R.drawable.menu_views_recent3;
        }
        xj0Var.a(i7, z9);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        long j3;
        this.R = false;
        this.T = false;
        this.S = false;
        TL_stories.StoryItem storyItem = this.D.a;
        v4 v4Var = this.L;
        a5 a5Var = this.P;
        TextView textView = this.h;
        if (storyItem != null) {
            TL_stories.StoryViews storyViews = storyItem.views;
            if (storyViews != null) {
                int i7 = storyViews.views_count;
                j3 = 0;
                this.R = i7 >= 15;
                int i10 = storyViews.reactions_count;
                boolean z9 = org.telegram.messenger.r2.a;
                this.S = i10 >= 10;
                this.T = (storyItem.dialogId < 0 || i7 < 20 || storyItem.contacts || storyItem.close_friends || storyItem.selected_contacts) ? false : true;
            } else {
                j3 = 0;
            }
            int i11 = this.w;
            SparseArray sparseArray = (SparseArray) qp.s1(i11).h0.x.f(storyItem.dialogId);
            j5 j5Var = sparseArray != null ? (j5) sparseArray.get(storyItem.id) : null;
            this.F = j5Var;
            TL_stories.StoryViews storyViews2 = storyItem.views;
            int i12 = storyViews2 == null ? 0 : storyViews2.views_count;
            w4 w4Var = this.O;
            if (j5Var == null || !(j5Var.f || j5Var.a == i12)) {
                if (j5Var != null) {
                    j5Var.d();
                }
                j5 j5Var2 = new j5(i11, this.W, storyItem);
                this.F = j5Var2;
                j5Var2.e(w4Var, this.T, this.S);
                this.F.c();
                if (sparseArray != null) {
                    sparseArray.put(storyItem.id, this.F);
                } else {
                    SparseArray sparseArray2 = new SparseArray();
                    sparseArray2.put(storyItem.id, this.F);
                    qp.s1(i11).h0.x.k(sparseArray2, storyItem.dialogId);
                }
            } else {
                j5Var.e(w4Var, this.T, this.S);
            }
            j5 j5Var3 = this.E;
            if (j5Var3 != null) {
                j5Var3.r.remove(this);
            }
            j5 j5Var4 = this.F;
            this.E = j5Var4;
            if (j5Var4 != null && this.I) {
                ArrayList arrayList = j5Var4.r;
                if (!arrayList.contains(this)) {
                    arrayList.add(this);
                }
            }
            j5 j5Var5 = this.E;
            if (j5Var5 == null || !j5Var5.j || p10.i(i11).q()) {
                j5 j5Var6 = this.E;
                if (j5Var6.e || j5Var6.m || !j5Var6.g.isEmpty() || !this.E.i.isEmpty() || !TextUtils.isEmpty(this.E.s.c)) {
                    TL_stories.StoryViews storyViews3 = storyItem.views;
                    if (storyViews3 == null || storyViews3.views_count == 0) {
                        this.R = false;
                        this.S = false;
                        this.T = false;
                        textView.setText(id.M0(this.E.f ? 2131746388 : 2131743540, null));
                        v4Var.setVisibility(8);
                        a5Var.setVisibility(8);
                        this.e = 46;
                    } else {
                        a5Var.setVisibility(0);
                        j5 j5Var7 = this.E;
                        if (j5Var7.k) {
                            textView.setText(id.M0(j5Var7.f ? 2131746388 : 2131743540, null));
                            this.R = false;
                            this.S = false;
                            this.T = false;
                        } else {
                            if (j5Var7.b() < 20 && this.E.b() < storyItem.views.views_count) {
                                j5 j5Var8 = this.E;
                                if (!j5Var8.e && !j5Var8.m) {
                                    this.R = false;
                                    this.S = false;
                                    this.T = false;
                                    textView.setText(id.M0(this.E.f ? 2131746388 : 2131743540, null));
                                }
                            }
                            this.R = !this.E.f && storyItem.views.views_count >= 15;
                            TL_stories.StoryViews storyViews4 = storyItem.views;
                            int i13 = storyViews4.reactions_count;
                            boolean z10 = org.telegram.messenger.r2.a;
                            this.S = i13 >= 5;
                            this.T = (storyItem.dialogId < j3 || storyViews4.views_count < 20 || storyItem.contacts || storyItem.close_friends || storyItem.selected_contacts) ? false : true;
                            textView.setText(id.M0(this.E.f ? 2131746388 : 2131743540, null));
                        }
                        v4Var.setVisibility(this.R ? 0 : 8);
                        this.e = this.R ? 96 : 46;
                    }
                }
            }
            this.R = false;
            this.S = false;
            this.T = false;
            textView.setText(id.M0(this.E.f ? 2131746388 : 2131743540, null));
            v4Var.setVisibility(8);
            a5Var.setVisibility(8);
            this.e = 46;
        } else {
            this.e = 46;
            textView.setText(id.M0(2131743803, null));
            v4Var.setVisibility(8);
            a5Var.setVisibility(8);
        }
        a5Var.a.setVisibility(this.S ? 0 : 8);
        a5Var.c.setVisibility(this.T ? 0 : 8);
        a5Var.d.setVisibility(this.T ? 0 : 8);
        if (this.T) {
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
        this.I = true;
        j5 j5Var = this.E;
        if (j5Var != null) {
            ArrayList arrayList = j5Var.r;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            this.E.p.clear();
        }
        this.x.E();
        int i7 = this.w;
        qs.f(i7).c(this, qs.v5);
        qs.f(i7).c(this, qs.a3);
        setTag(R.id.bulletin_delegate_tag, new ch.v(this, 2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I = false;
        j5 j5Var = this.E;
        if (j5Var != null) {
            j5Var.r.remove(this);
        }
        int i7 = this.w;
        qs.f(i7).n(this, qs.v5);
        qs.f(i7).n(this, qs.a3);
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
        r4 r4Var = this.r;
        if (f10 != r4Var.getPaddingBottom()) {
            r4Var.setPadding(0, (int) f10, 0, 0);
            r4Var.requestLayout();
        }
    }

    public void setShadowDrawable(Drawable drawable) {
        this.U = drawable;
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, this.s);
            View view = this.a;
            if (view == null || w02 == this.a0) {
                return;
            }
            this.a0 = w02;
            view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{w02, 0}));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
