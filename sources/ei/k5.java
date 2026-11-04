package ei;

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
import b8.kg;
import b8.mf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.os;
import org.telegram.messenger.us;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.wi0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class k5 extends FrameLayout implements org.telegram.ui.ActionBar.z5, cs {
    public r5 E;
    public j5 F;
    public j5 G;
    public u6 H;
    public int I;
    public boolean J;
    public final wi0 K;
    public final r9 L;
    public final v4 M;
    public final w4 N;
    public final ai.v2 O;
    public final w4 P;
    public final a5 Q;
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
    public final kg d;
    public int e;
    public z4 f;
    public final TextView h;
    public int n;
    public final r4 r;
    public final b s;
    public final int w;
    public final g5 x;
    public final jy y;

    public k5(r9 r9Var, Context context, w4 w4Var, ai.v2 v2Var) {
        super(context);
        this.e = 96;
        this.P = new w4();
        this.N = w4Var;
        this.O = v2Var;
        b bVar = r9Var.E;
        this.s = bVar;
        this.L = r9Var;
        this.w = r9Var.h;
        TextView textView = new TextView(context);
        this.h = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, bVar);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(8.0f));
        a5 a5Var = new a5(this, getContext());
        this.Q = a5Var;
        r4 r4Var = new r4(this, context, bVar);
        this.r = r4Var;
        r4Var.setClipToPadding(false);
        this.K = new wi0(r4Var, true);
        jy jyVar = new jy(0, r4Var);
        this.y = jyVar;
        r4Var.setLayoutManager(jyVar);
        r4Var.setNestedScrollingEnabled(true);
        g5 g5Var = new g5(this);
        this.x = g5Var;
        r4Var.setAdapter(g5Var);
        new SparseArray();
        new HashMap();
        addView(r4Var);
        this.d = new kg(r4Var);
        r4Var.setOnScrollListener(new ai.j5(this, 12));
        r4Var.setOnItemClickListener(new q4(0, this, r9Var));
        r4Var.setOnItemLongClickListener(new u4(this, r9Var));
        g5Var.E();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.c = frameLayout;
        View view = new View(getContext());
        this.a = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i3 = org.telegram.ui.ActionBar.k6.h5;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, bVar);
        this.b0 = w02;
        view.setBackground(new GradientDrawable(orientation, new int[]{w02, 0}));
        frameLayout.addView(view, mf.d(-1, 8.0f, 0, 0.0f, this.e - 8, 0.0f, 0.0f));
        View view2 = new View(getContext());
        this.b = view2;
        org.telegram.ui.ActionBar.r6.i(i3, view2, bVar);
        frameLayout.addView(view2, mf.d(-1, 10.0f, 0, 0.0f, this.e - 17, 0.0f, 0.0f));
        frameLayout.addView(a5Var);
        frameLayout.addView(textView);
        v4 v4Var = new v4(this, getContext(), bVar);
        this.M = v4Var;
        v4Var.setHint(bd.M0(2131745846, null));
        frameLayout.addView(v4Var, mf.d(-1, -1.0f, 51, 0.0f, 36.0f, 0.0f, 0.0f));
        addView(frameLayout);
    }

    public static void a(k5 k5Var) {
        new vg.v0(k5Var.L.f, 14, false).show();
    }

    public static void b(k5 k5Var) {
        j5 j5Var = k5Var.F;
        if (j5Var != null) {
            j5Var.r.remove(k5Var);
        }
        j5 j5Var2 = k5Var.G;
        k5Var.F = j5Var2;
        if (j5Var2 == null) {
            return;
        }
        ArrayList arrayList = j5Var2.r;
        if (!arrayList.contains(k5Var)) {
            arrayList.add(k5Var);
        }
        k5Var.F.e(k5Var.P, k5Var.U, k5Var.T);
        k5Var.x.E();
        k5Var.y.h1(0, (int) (k5Var.getTopOffset() - k5Var.r.getPaddingTop()));
    }

    public static void f(int i3, long j10, TL_stories.StoryItem storyItem) {
        if (storyItem == null) {
            return;
        }
        SparseArray sparseArray = (SparseArray) hp.s1(i3).i0.x.f(storyItem.dialogId);
        j5 j5Var = sparseArray == null ? null : (j5) sparseArray.get(storyItem.id);
        TL_stories.StoryViews storyViews = storyItem.views;
        int i10 = storyViews == null ? 0 : storyViews.views_count;
        if (j5Var == null || j5Var.a != i10) {
            if (j5Var != null) {
                j5Var.d();
            }
            j5 j5Var2 = new j5(i3, j10, storyItem);
            j5Var2.c();
            if (sparseArray == null) {
                a0.h hVar = hp.s1(i3).i0.x;
                long j11 = storyItem.dialogId;
                sparseArray = new SparseArray();
                hVar.k(sparseArray, j11);
            }
            sparseArray.put(storyItem.id, j5Var2);
        }
    }

    public final void c() {
        if (this.F == null || this.y.N0() <= this.x.c.size() - 10) {
            return;
        }
        this.F.c();
    }

    public final boolean d(TL_stories.StoryView storyView) {
        gi.f7 f7Var;
        gi.r8 r8Var;
        if (storyView == null) {
            return true;
        }
        int i3 = this.w;
        if (hp.s1(i3).P1().N(storyView) || hp.s1(i3).H0.indexOfKey(storyView.user_id) >= 0) {
            return false;
        }
        TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(storyView.user_id));
        r5 r5Var = this.E;
        if (r5Var == null) {
            return true;
        }
        TL_stories.StoryItem storyItem = r5Var.a;
        if (storyItem != null) {
            if (storyItem.parsedPrivacy == null) {
                storyItem.parsedPrivacy = new gi.r8(i3, storyItem.privacy);
            }
            return this.E.a.parsedPrivacy.b(a22);
        }
        y6 y6Var = r5Var.b;
        if (y6Var == null || (f7Var = y6Var.c) == null || (r8Var = f7Var.E0) == null) {
            return true;
        }
        return r8Var.b(a22);
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int R;
        int i11 = 0;
        if (i3 == hs.v5) {
            if (this.E.b != null) {
                int i12 = this.w;
                TL_stories.PeerStories y9 = hp.s1(i12).i0.y(h10.i(i12).n);
                if (y9 != null) {
                    while (i11 < y9.stories.size()) {
                        TL_stories.StoryItem storyItem = y9.stories.get(i11);
                        String str = storyItem.attachPath;
                        if (str != null && str.equals(this.E.b.e)) {
                            r5 r5Var = this.E;
                            r5Var.b = null;
                            r5Var.a = storyItem;
                            g(this.a0, r5Var);
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
        if (i3 != hs.a3) {
            return;
        }
        while (true) {
            r4 r4Var = this.r;
            if (i11 >= r4Var.getChildCount()) {
                return;
            }
            View childAt = r4Var.getChildAt(i11);
            if ((childAt instanceof org.telegram.ui.Cells.l6) && (R = RecyclerView.R(childAt)) >= 0) {
                g5 g5Var = this.x;
                if (R < g5Var.c.size()) {
                    ((org.telegram.ui.Cells.l6) childAt).a(true, d(((b5) g5Var.c.get(R)).b) ? 1.0f : 0.5f);
                }
            }
            i11++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        r4 r4Var;
        View view = null;
        int i3 = -1;
        int i10 = 0;
        while (true) {
            r4Var = this.r;
            if (i10 >= r4Var.getChildCount()) {
                break;
            }
            View childAt = r4Var.getChildAt(i10);
            int S = RecyclerView.S(childAt);
            if (S < i3 || i3 == -1) {
                view = childAt;
                i3 = S;
            }
            i10++;
        }
        int max = i3 == 0 ? (int) Math.max(0.0f, view.getY()) : i3 > 0 ? 0 : r4Var.getPaddingTop();
        FrameLayout frameLayout = this.c;
        float f10 = max;
        if (frameLayout.getTranslationY() != f10) {
            frameLayout.setTranslationY(f10);
            o5 o5Var = (o5) this;
            int intValue = ((Integer) o5Var.getTag()).intValue();
            s5 s5Var = o5Var.c0.e;
            l5 l5Var = s5Var.h;
            if (intValue == s5Var.F.getCurrentItem()) {
                l5Var.setAlpha(Utilities.i(f10 / s5Var.d, 1.0f, 0.0f));
                l5Var.setTranslationY((-(s5Var.d - f10)) / 2.0f);
            }
        }
        this.V.setBounds(-org.telegram.messenger.g0.L(6.0f), max, org.telegram.messenger.g0.L(6.0f) + getMeasuredWidth(), getMeasuredHeight());
        this.V.draw(canvas);
        if (this.W) {
            this.W = false;
            if (frameLayout.getTranslationY() != 0.0f && frameLayout.getTranslationY() != r4Var.getPaddingTop()) {
                float translationY = frameLayout.getTranslationY();
                float paddingTop = r4Var.getPaddingTop() / 2.0f;
                kg kgVar = this.d;
                if (translationY > paddingTop) {
                    kgVar.y((int) (-(r4Var.getPaddingTop() - frameLayout.getTranslationY())));
                } else {
                    kgVar.y((int) frameLayout.getTranslationY());
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
        canvas.clipRect(0, org.telegram.messenger.g0.L(this.e), getMeasuredWidth(), getMeasuredHeight());
        super.drawChild(canvas, view, j10);
        canvas.restore();
        return true;
    }

    public final void e(j5 j5Var) {
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        g5 g5Var = this.x;
        int size = g5Var.c.size();
        w4 w4Var = this.P;
        if (TextUtils.isEmpty(w4Var.c) && !w4Var.b) {
            i();
        }
        g5Var.E();
        this.K.b(size - 1);
        c();
        if (this.H != null) {
            ArrayList arrayList = j5Var.i;
            if (j5Var != this.F || arrayList == null || this.I >= arrayList.size()) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i3 = this.I; i3 < arrayList.size(); i3++) {
                TL_stories.StoryReaction storyReaction = (TL_stories.StoryReaction) arrayList.get(i3);
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

    public final void g(long j10, r5 r5Var) {
        this.a0 = j10;
        this.E = r5Var;
        i();
        h(false);
        if (r5Var == null || r5Var.a == null) {
            return;
        }
        us t10 = us.t(this.w);
        int i3 = r5Var.a.id;
        if (j10 != t10.getUserConfig().e()) {
            return;
        }
        us.l0.c(new os(t10, i3, 5));
    }

    public float getTopOffset() {
        return this.c.getTranslationY();
    }

    public final void h(boolean z10) {
        int i3;
        w4 w4Var = this.P;
        boolean z11 = w4Var.b;
        a5 a5Var = this.Q;
        if (z11 != a5Var.s || !z10) {
            ValueAnimator valueAnimator = a5Var.x;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                a5Var.x.cancel();
            }
            a5Var.s = z11 ? 1 : 0;
            if (z10) {
                a5Var.e.set(a5Var.n);
                a5Var.f = a5Var.c.getAlpha();
                a5Var.h = a5Var.d.getAlpha();
                a5Var.r = 0.0f;
                a5Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                a5Var.x = ofFloat;
                ofFloat.addUpdateListener(new bh.f(a5Var, 21));
                a5Var.x.addListener(new ai.e1(a5Var, 15));
                a5Var.x.setDuration(250L);
                a5Var.x.setInterpolator(xq.f);
                a5Var.x.start();
            } else {
                a5Var.r = 1.0f;
                a5Var.invalidate();
            }
        }
        boolean z12 = w4Var.a;
        bk0 bk0Var = a5Var.w;
        if (z12) {
            j5 j5Var = this.F;
            i3 = (j5Var == null || !j5Var.f) ? R.drawable.menu_views_reactions3 : R.drawable.menu_views_reposts3;
        } else {
            i3 = R.drawable.menu_views_recent3;
        }
        bk0Var.a(i3, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        long j10;
        this.S = false;
        this.U = false;
        this.T = false;
        TL_stories.StoryItem storyItem = this.E.a;
        v4 v4Var = this.M;
        a5 a5Var = this.Q;
        TextView textView = this.h;
        if (storyItem != null) {
            TL_stories.StoryViews storyViews = storyItem.views;
            if (storyViews != null) {
                int i3 = storyViews.views_count;
                j10 = 0;
                this.S = i3 >= 15;
                int i10 = storyViews.reactions_count;
                boolean z10 = org.telegram.messenger.r2.a;
                this.T = i10 >= 10;
                this.U = (storyItem.dialogId < 0 || i3 < 20 || storyItem.contacts || storyItem.close_friends || storyItem.selected_contacts) ? false : true;
            } else {
                j10 = 0;
            }
            int i11 = this.w;
            SparseArray sparseArray = (SparseArray) hp.s1(i11).i0.x.f(storyItem.dialogId);
            j5 j5Var = sparseArray != null ? (j5) sparseArray.get(storyItem.id) : null;
            this.G = j5Var;
            TL_stories.StoryViews storyViews2 = storyItem.views;
            int i12 = storyViews2 == null ? 0 : storyViews2.views_count;
            w4 w4Var = this.P;
            if (j5Var == null || !(j5Var.f || j5Var.a == i12)) {
                if (j5Var != null) {
                    j5Var.d();
                }
                j5 j5Var2 = new j5(i11, this.a0, storyItem);
                this.G = j5Var2;
                j5Var2.e(w4Var, this.U, this.T);
                this.G.c();
                if (sparseArray != null) {
                    sparseArray.put(storyItem.id, this.G);
                } else {
                    SparseArray sparseArray2 = new SparseArray();
                    sparseArray2.put(storyItem.id, this.G);
                    hp.s1(i11).i0.x.k(sparseArray2, storyItem.dialogId);
                }
            } else {
                j5Var.e(w4Var, this.U, this.T);
            }
            j5 j5Var3 = this.F;
            if (j5Var3 != null) {
                j5Var3.r.remove(this);
            }
            j5 j5Var4 = this.G;
            this.F = j5Var4;
            if (j5Var4 != null && this.J) {
                ArrayList arrayList = j5Var4.r;
                if (!arrayList.contains(this)) {
                    arrayList.add(this);
                }
            }
            j5 j5Var5 = this.F;
            if (j5Var5 == null || !j5Var5.j || h10.i(i11).q()) {
                j5 j5Var6 = this.F;
                if (j5Var6.e || j5Var6.m || !j5Var6.g.isEmpty() || !this.F.i.isEmpty() || !TextUtils.isEmpty(this.F.s.c)) {
                    TL_stories.StoryViews storyViews3 = storyItem.views;
                    if (storyViews3 == null || storyViews3.views_count == 0) {
                        this.S = false;
                        this.T = false;
                        this.U = false;
                        textView.setText(bd.M0(this.F.f ? 2131746395 : 2131743547, null));
                        v4Var.setVisibility(8);
                        a5Var.setVisibility(8);
                        this.e = 46;
                    } else {
                        a5Var.setVisibility(0);
                        j5 j5Var7 = this.F;
                        if (j5Var7.k) {
                            textView.setText(bd.M0(j5Var7.f ? 2131746395 : 2131743547, null));
                            this.S = false;
                            this.T = false;
                            this.U = false;
                        } else {
                            if (j5Var7.b() < 20 && this.F.b() < storyItem.views.views_count) {
                                j5 j5Var8 = this.F;
                                if (!j5Var8.e && !j5Var8.m) {
                                    this.S = false;
                                    this.T = false;
                                    this.U = false;
                                    textView.setText(bd.M0(this.F.f ? 2131746395 : 2131743547, null));
                                }
                            }
                            this.S = !this.F.f && storyItem.views.views_count >= 15;
                            TL_stories.StoryViews storyViews4 = storyItem.views;
                            int i13 = storyViews4.reactions_count;
                            boolean z11 = org.telegram.messenger.r2.a;
                            this.T = i13 >= 5;
                            this.U = (storyItem.dialogId < j10 || storyViews4.views_count < 20 || storyItem.contacts || storyItem.close_friends || storyItem.selected_contacts) ? false : true;
                            textView.setText(bd.M0(this.F.f ? 2131746395 : 2131743547, null));
                        }
                        v4Var.setVisibility(this.S ? 0 : 8);
                        this.e = this.S ? 96 : 46;
                    }
                }
            }
            this.S = false;
            this.T = false;
            this.U = false;
            textView.setText(bd.M0(this.F.f ? 2131746395 : 2131743547, null));
            v4Var.setVisibility(8);
            a5Var.setVisibility(8);
            this.e = 46;
        } else {
            this.e = 46;
            textView.setText(bd.M0(2131743810, null));
            v4Var.setVisibility(8);
            a5Var.setVisibility(8);
        }
        a5Var.a.setVisibility(this.T ? 0 : 8);
        a5Var.c.setVisibility(this.U ? 0 : 8);
        a5Var.d.setVisibility(this.U ? 0 : 8);
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
        j5 j5Var = this.F;
        if (j5Var != null) {
            ArrayList arrayList = j5Var.r;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            this.F.p.clear();
        }
        this.x.E();
        int i3 = this.w;
        hs.f(i3).c(this, hs.v5);
        hs.f(i3).c(this, hs.a3);
        setTag(R.id.bulletin_delegate_tag, new ai.h1(this, 3));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J = false;
        j5 j5Var = this.F;
        if (j5Var != null) {
            j5Var.r.remove(this);
        }
        int i3 = this.w;
        hs.f(i3).n(this, hs.v5);
        hs.f(i3).n(this, hs.a3);
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
        this.V = drawable;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, this.s);
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
