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
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.rs;
import org.telegram.messenger.xs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.fj0;
import org.telegram.ui.Components.kk0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.wy;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public abstract class a5 extends FrameLayout implements org.telegram.ui.ActionBar.c6, fs {
    public h5 E;
    public z4 F;
    public z4 G;
    public k6 H;
    public int I;
    public boolean J;
    public final fj0 K;
    public final f9 L;
    public final l4 M;
    public final m4 N;
    public final ai.g0 O;
    public final m4 P;
    public final q4 Q;
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
    public p4 f;
    public final TextView h;
    public int n;
    public final h4 r;
    public final b s;
    public final int w;
    public final w4 x;
    public final wy y;

    public a5(f9 f9Var, Context context, m4 m4Var, ai.g0 g0Var) {
        super(context);
        this.e = 96;
        this.P = new m4();
        this.N = m4Var;
        this.O = g0Var;
        b bVar = f9Var.E;
        this.s = bVar;
        this.L = f9Var;
        this.w = f9Var.h;
        TextView textView = new TextView(context);
        this.h = textView;
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.j5, bVar);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(8.0f));
        q4 q4Var = new q4(this, getContext());
        this.Q = q4Var;
        h4 h4Var = new h4(this, context, bVar);
        this.r = h4Var;
        h4Var.setClipToPadding(false);
        this.K = new fj0(h4Var, true);
        wy wyVar = new wy(0, h4Var);
        this.y = wyVar;
        h4Var.setLayoutManager(wyVar);
        h4Var.setNestedScrollingEnabled(true);
        w4 w4Var = new w4(this);
        this.x = w4Var;
        h4Var.setAdapter(w4Var);
        new SparseArray();
        new HashMap();
        addView(h4Var);
        this.d = new xa(h4Var);
        h4Var.setOnScrollListener(new bi.q1(this, 13));
        h4Var.setOnItemClickListener(new g4(0, this, f9Var));
        h4Var.setOnItemLongClickListener(new k4(this, f9Var));
        w4Var.E();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.c = frameLayout;
        View view = new View(getContext());
        this.a = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i7 = org.telegram.ui.ActionBar.n6.h5;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, bVar);
        this.b0 = w02;
        view.setBackground(new GradientDrawable(orientation, new int[]{w02, 0}));
        frameLayout.addView(view, ma.d(-1, 8.0f, 0, 0.0f, this.e - 8, 0.0f, 0.0f));
        View view2 = new View(getContext());
        this.b = view2;
        org.telegram.ui.ActionBar.u6.h(i7, view2, bVar);
        frameLayout.addView(view2, ma.d(-1, 10.0f, 0, 0.0f, this.e - 17, 0.0f, 0.0f));
        frameLayout.addView(q4Var);
        frameLayout.addView(textView);
        l4 l4Var = new l4(this, getContext(), bVar);
        this.M = l4Var;
        l4Var.setHint(gd.M0(2131745641, null));
        frameLayout.addView(l4Var, ma.d(-1, -1.0f, 51, 0.0f, 36.0f, 0.0f, 0.0f));
        addView(frameLayout);
    }

    public static void a(a5 a5Var) {
        new ug.z0(a5Var.L.f, 14, false).show();
    }

    public static void b(a5 a5Var) {
        z4 z4Var = a5Var.F;
        if (z4Var != null) {
            z4Var.r.remove(a5Var);
        }
        z4 z4Var2 = a5Var.G;
        a5Var.F = z4Var2;
        if (z4Var2 == null) {
            return;
        }
        ArrayList arrayList = z4Var2.r;
        if (!arrayList.contains(a5Var)) {
            arrayList.add(a5Var);
        }
        a5Var.F.e(a5Var.P, a5Var.U, a5Var.T);
        a5Var.x.E();
        a5Var.y.h1(0, (int) (a5Var.getTopOffset() - a5Var.r.getPaddingTop()));
    }

    public static void f(int i7, long j3, TL_stories.StoryItem storyItem) {
        if (storyItem == null) {
            return;
        }
        SparseArray sparseArray = (SparseArray) mp.u1(i7).i0.x.f(storyItem.dialogId);
        z4 z4Var = sparseArray == null ? null : (z4) sparseArray.get(storyItem.id);
        TL_stories.StoryViews storyViews = storyItem.views;
        int i10 = storyViews == null ? 0 : storyViews.views_count;
        if (z4Var == null || z4Var.a != i10) {
            if (z4Var != null) {
                z4Var.d();
            }
            z4 z4Var2 = new z4(i7, j3, storyItem);
            z4Var2.c();
            if (sparseArray == null) {
                a0.h hVar = mp.u1(i7).i0.x;
                long j10 = storyItem.dialogId;
                sparseArray = new SparseArray();
                hVar.k(sparseArray, j10);
            }
            sparseArray.put(storyItem.id, z4Var2);
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
        if (mp.u1(i7).R1().N(storyView) || mp.u1(i7).H0.indexOfKey(storyView.user_id) >= 0) {
            return false;
        }
        TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(storyView.user_id));
        h5 h5Var = this.E;
        if (h5Var == null) {
            return true;
        }
        TL_stories.StoryItem storyItem = h5Var.a;
        if (storyItem != null) {
            if (storyItem.parsedPrivacy == null) {
                storyItem.parsedPrivacy = new hi.o8(i7, storyItem.privacy);
            }
            return this.E.a.parsedPrivacy.b(c22);
        }
        o6 o6Var = h5Var.b;
        if (o6Var == null || (d7Var = o6Var.c) == null || (o8Var = d7Var.E0) == null) {
            return true;
        }
        return o8Var.b(c22);
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int R;
        int i11 = 0;
        if (i7 == ks.x5) {
            if (this.E.b != null) {
                int i12 = this.w;
                TL_stories.PeerStories y10 = mp.u1(i12).i0.y(j10.i(i12).n);
                if (y10 != null) {
                    while (i11 < y10.stories.size()) {
                        TL_stories.StoryItem storyItem = y10.stories.get(i11);
                        String str = storyItem.attachPath;
                        if (str != null && str.equals(this.E.b.e)) {
                            h5 h5Var = this.E;
                            h5Var.b = null;
                            h5Var.a = storyItem;
                            g(this.a0, h5Var);
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
        if (i7 != ks.c3) {
            return;
        }
        while (true) {
            h4 h4Var = this.r;
            if (i11 >= h4Var.getChildCount()) {
                return;
            }
            View childAt = h4Var.getChildAt(i11);
            if ((childAt instanceof org.telegram.ui.Cells.m6) && (R = RecyclerView.R(childAt)) >= 0) {
                w4 w4Var = this.x;
                if (R < w4Var.c.size()) {
                    ((org.telegram.ui.Cells.m6) childAt).a(true, d(((r4) w4Var.c.get(R)).b) ? 1.0f : 0.5f);
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
            e5 e5Var = (e5) this;
            int intValue = ((Integer) e5Var.getTag()).intValue();
            i5 i5Var = e5Var.c0.e;
            b5 b5Var = i5Var.h;
            if (intValue == i5Var.F.getCurrentItem()) {
                b5Var.setAlpha(Utilities.i(f10 / i5Var.d, 1.0f, 0.0f));
                b5Var.setTranslationY((-(i5Var.d - f10)) / 2.0f);
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

    public final void e(z4 z4Var) {
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        w4 w4Var = this.x;
        int size = w4Var.c.size();
        m4 m4Var = this.P;
        if (TextUtils.isEmpty(m4Var.c) && !m4Var.b) {
            i();
        }
        w4Var.E();
        this.K.b(size - 1);
        c();
        if (this.H != null) {
            ArrayList arrayList = z4Var.i;
            if (z4Var != this.F || arrayList == null || this.I >= arrayList.size()) {
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

    public final void g(long j3, h5 h5Var) {
        this.a0 = j3;
        this.E = h5Var;
        i();
        h(false);
        if (h5Var == null || h5Var.a == null) {
            return;
        }
        xs t6 = xs.t(this.w);
        int i7 = h5Var.a.id;
        if (j3 != t6.getUserConfig().e()) {
            return;
        }
        xs.l0.c(new rs(t6, i7, 5));
    }

    public float getTopOffset() {
        return this.c.getTranslationY();
    }

    public final void h(boolean z10) {
        int i7;
        m4 m4Var = this.P;
        boolean z11 = m4Var.b;
        q4 q4Var = this.Q;
        if (z11 != q4Var.s || !z10) {
            ValueAnimator valueAnimator = q4Var.x;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                q4Var.x.cancel();
            }
            q4Var.s = z11 ? 1 : 0;
            if (z10) {
                q4Var.e.set(q4Var.n);
                q4Var.f = q4Var.c.getAlpha();
                q4Var.h = q4Var.d.getAlpha();
                q4Var.r = 0.0f;
                q4Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                q4Var.x = ofFloat;
                ofFloat.addUpdateListener(new ah.g(q4Var, 21));
                q4Var.x.addListener(new ai.j0(q4Var, 15));
                q4Var.x.setDuration(250L);
                q4Var.x.setInterpolator(lr.f);
                q4Var.x.start();
            } else {
                q4Var.r = 1.0f;
                q4Var.invalidate();
            }
        }
        boolean z12 = m4Var.a;
        kk0 kk0Var = q4Var.w;
        if (z12) {
            z4 z4Var = this.F;
            i7 = (z4Var == null || !z4Var.f) ? R.drawable.menu_views_reactions3 : R.drawable.menu_views_reposts3;
        } else {
            i7 = R.drawable.menu_views_recent3;
        }
        kk0Var.a(i7, z10);
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
        l4 l4Var = this.M;
        q4 q4Var = this.Q;
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
            SparseArray sparseArray = (SparseArray) mp.u1(i11).i0.x.f(storyItem.dialogId);
            z4 z4Var = sparseArray != null ? (z4) sparseArray.get(storyItem.id) : null;
            this.G = z4Var;
            TL_stories.StoryViews storyViews2 = storyItem.views;
            int i12 = storyViews2 == null ? 0 : storyViews2.views_count;
            m4 m4Var = this.P;
            if (z4Var == null || !(z4Var.f || z4Var.a == i12)) {
                if (z4Var != null) {
                    z4Var.d();
                }
                z4 z4Var2 = new z4(i11, this.a0, storyItem);
                this.G = z4Var2;
                z4Var2.e(m4Var, this.U, this.T);
                this.G.c();
                if (sparseArray != null) {
                    sparseArray.put(storyItem.id, this.G);
                } else {
                    SparseArray sparseArray2 = new SparseArray();
                    sparseArray2.put(storyItem.id, this.G);
                    mp.u1(i11).i0.x.k(sparseArray2, storyItem.dialogId);
                }
            } else {
                z4Var.e(m4Var, this.U, this.T);
            }
            z4 z4Var3 = this.F;
            if (z4Var3 != null) {
                z4Var3.r.remove(this);
            }
            z4 z4Var4 = this.G;
            this.F = z4Var4;
            if (z4Var4 != null && this.J) {
                ArrayList arrayList = z4Var4.r;
                if (!arrayList.contains(this)) {
                    arrayList.add(this);
                }
            }
            z4 z4Var5 = this.F;
            if (z4Var5 == null || !z4Var5.j || j10.i(i11).q()) {
                z4 z4Var6 = this.F;
                if (z4Var6.e || z4Var6.m || !z4Var6.g.isEmpty() || !this.F.i.isEmpty() || !TextUtils.isEmpty(this.F.s.c)) {
                    TL_stories.StoryViews storyViews3 = storyItem.views;
                    if (storyViews3 == null || storyViews3.views_count == 0) {
                        this.S = false;
                        this.T = false;
                        this.U = false;
                        textView.setText(gd.M0(this.F.f ? 2131746192 : 2131743300, null));
                        l4Var.setVisibility(8);
                        q4Var.setVisibility(8);
                        this.e = 46;
                    } else {
                        q4Var.setVisibility(0);
                        z4 z4Var7 = this.F;
                        if (z4Var7.k) {
                            textView.setText(gd.M0(z4Var7.f ? 2131746192 : 2131743300, null));
                            this.S = false;
                            this.T = false;
                            this.U = false;
                        } else {
                            if (z4Var7.b() < 20 && this.F.b() < storyItem.views.views_count) {
                                z4 z4Var8 = this.F;
                                if (!z4Var8.e && !z4Var8.m) {
                                    this.S = false;
                                    this.T = false;
                                    this.U = false;
                                    textView.setText(gd.M0(this.F.f ? 2131746192 : 2131743300, null));
                                }
                            }
                            this.S = !this.F.f && storyItem.views.views_count >= 15;
                            TL_stories.StoryViews storyViews4 = storyItem.views;
                            int i13 = storyViews4.reactions_count;
                            boolean z11 = org.telegram.messenger.s2.a;
                            this.T = i13 >= 5;
                            this.U = (storyItem.dialogId < j3 || storyViews4.views_count < 20 || storyItem.contacts || storyItem.close_friends || storyItem.selected_contacts) ? false : true;
                            textView.setText(gd.M0(this.F.f ? 2131746192 : 2131743300, null));
                        }
                        l4Var.setVisibility(this.S ? 0 : 8);
                        this.e = this.S ? 96 : 46;
                    }
                }
            }
            this.S = false;
            this.T = false;
            this.U = false;
            textView.setText(gd.M0(this.F.f ? 2131746192 : 2131743300, null));
            l4Var.setVisibility(8);
            q4Var.setVisibility(8);
            this.e = 46;
        } else {
            this.e = 46;
            textView.setText(gd.M0(2131743563, null));
            l4Var.setVisibility(8);
            q4Var.setVisibility(8);
        }
        q4Var.a.setVisibility(this.T ? 0 : 8);
        q4Var.c.setVisibility(this.U ? 0 : 8);
        q4Var.d.setVisibility(this.U ? 0 : 8);
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
        z4 z4Var = this.F;
        if (z4Var != null) {
            ArrayList arrayList = z4Var.r;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            this.F.p.clear();
        }
        this.x.E();
        int i7 = this.w;
        ks.f(i7).c(this, ks.x5);
        ks.f(i7).c(this, ks.c3);
        setTag(R.id.bulletin_delegate_tag, new bi.e1(this, 3));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J = false;
        z4 z4Var = this.F;
        if (z4Var != null) {
            z4Var.r.remove(this);
        }
        int i7 = this.w;
        ks.f(i7).n(this, ks.x5);
        ks.f(i7).n(this, ks.c3);
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

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, this.s);
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

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
