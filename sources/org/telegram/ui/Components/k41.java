package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class k41 extends FrameLayout implements org.telegram.messenger.gs {
    public v4.u0 E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public long L;
    public ValueAnimator M;
    public boolean N;
    public boolean O;
    public final TLRPC.StickerSetCovered P;
    public final org.telegram.ui.ActionBar.h6 Q;
    public float R;
    public final Paint S;
    public final int a;
    public final h41 b;
    public final TLRPC.StickerSetCovered[] c;
    public final LongSparseArray d;
    public final LongSparseArray e;
    public final View f;
    public final z31 h;
    public final a41 n;
    public final b41 r;
    public final j41 s;
    public final jg.c2 w;
    public final FrameLayout x;
    public org.telegram.ui.ActionBar.g2 y;

    public k41(Context context, final h41 h41Var, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, TLRPC.StickerSetCovered stickerSetCovered, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        int i7 = org.telegram.messenger.k10.t0;
        this.a = i7;
        this.R = 1.0f;
        this.S = new Paint();
        this.b = h41Var;
        this.c = stickerSetCoveredArr;
        this.d = longSparseArray;
        this.e = longSparseArray2;
        this.P = stickerSetCovered;
        this.Q = h6Var;
        j41 j41Var = new j41(this, context);
        this.s = j41Var;
        this.w = new jg.c2(context, new y31(this, h41Var), stickerSetCoveredArr, longSparseArray, longSparseArray2, h6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.x = frameLayout;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.h5, frameLayout, h6Var);
        z31 z31Var = new z31(this, context, h6Var);
        this.h = z31Var;
        z31Var.setHint(org.telegram.messenger.hd.N0(2131745509, null));
        frameLayout.addView(z31Var, c8.ma.e(-1, -1, 48));
        a41 a41Var = new a41(this, context, h41Var);
        this.n = a41Var;
        final o oVar = new o(this, 20);
        a41Var.setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Components.x31
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                o oVar2 = oVar;
                return h41Var.e(k41.this.n, oVar2, motionEvent);
            }
        });
        a41Var.setOverScrollMode(2);
        a41Var.setClipToPadding(false);
        a41Var.setItemAnimator(null);
        a41Var.setLayoutAnimation(null);
        b41 b41Var = new b41(this, org.telegram.messenger.g0.L(58.0f), a41Var);
        this.r = b41Var;
        a41Var.setLayoutManager(b41Var);
        b41Var.O = new c41(this);
        a41Var.setOnScrollListener(new d41(this));
        a41Var.setAdapter(j41Var);
        a41Var.setOnItemClickListener(oVar);
        addView(a41Var, c8.ma.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f = view;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.V5, view, h6Var);
        view.setAlpha(0.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1());
        layoutParams.topMargin = org.telegram.messenger.g0.L(58.0f);
        addView(view, layoutParams);
        addView(frameLayout, c8.ma.e(-1, 58, 51));
        d();
        org.telegram.messenger.ls f10 = org.telegram.messenger.ls.f(i7);
        f10.c(this, org.telegram.messenger.ls.x0);
        f10.c(this, org.telegram.messenger.ls.z0);
    }

    private void setShadowVisible(boolean z10) {
        if (this.H != z10) {
            this.H = z10;
            org.telegram.messenger.o10.n(this.f.animate(), z10 ? 1.0f : 0.0f, 200L);
        }
    }

    public final void a(boolean z10) {
        this.N = z10;
        if (!z10) {
            ValueAnimator valueAnimator = this.M;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.M.cancel();
                this.M = null;
                return;
            }
            return;
        }
        if (getContentTopOffset() <= 0 || this.M != null) {
            return;
        }
        int contentTopOffset = getContentTopOffset();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.M = ofFloat;
        ofFloat.addUpdateListener(new g41(this, contentTopOffset));
        this.M.addListener(new t11(this, 2));
        this.M.setDuration(250L);
        this.M.setInterpolator(org.telegram.ui.ActionBar.i1.w);
        this.M.start();
    }

    public final void b(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet) {
        if (stickerSet != null) {
            inputStickerSet = new TLRPC.TL_inputStickerSetID();
            inputStickerSet.access_hash = stickerSet.access_hash;
            inputStickerSet.id = stickerSet.id;
        }
        TLRPC.InputStickerSet inputStickerSet2 = inputStickerSet;
        if (inputStickerSet2 != null) {
            h41 h41Var = this.b;
            h41Var.getClass();
            kw0 kw0Var = new kw0(getContext(), this.y, inputStickerSet2, null, h41Var instanceof ow ? new e41(this) : null, this.Q);
            kw0Var.e2 = false;
            kw0Var.X1 = new f41(this, inputStickerSet2);
            this.y.showDialog(kw0Var);
        }
    }

    public final boolean c() {
        a41 a41Var = this.n;
        int childCount = a41Var.getChildCount();
        View view = this.f;
        FrameLayout frameLayout = this.x;
        if (childCount <= 0) {
            int paddingTop = a41Var.getPaddingTop();
            this.F = paddingTop;
            a41Var.setTopGlowOffset(paddingTop);
            frameLayout.setTranslationY(this.F);
            view.setTranslationY(this.F);
            setShadowVisible(false);
            return true;
        }
        View childAt = a41Var.getChildAt(0);
        for (int i7 = 1; i7 < a41Var.getChildCount(); i7++) {
            View childAt2 = a41Var.getChildAt(i7);
            if (childAt2.getTop() < childAt.getTop()) {
                childAt = childAt2;
            }
        }
        mj0 mj0Var = (mj0) a41Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(58.0f);
        int i10 = (top <= 0 || mj0Var == null || mj0Var.b() != 0) ? 0 : top;
        setShadowVisible(top < 0);
        if (this.F == i10) {
            return false;
        }
        this.F = i10;
        a41Var.setTopGlowOffset(org.telegram.messenger.g0.L(58.0f) + i10);
        frameLayout.setTranslationY(this.F);
        view.setTranslationY(this.F);
        return true;
    }

    public final void d() {
        a41 a41Var = this.n;
        v4.i0 adapter = a41Var.getAdapter();
        j41 j41Var = this.s;
        if (adapter == j41Var) {
            j41Var.getClass();
            return;
        }
        this.w.getClass();
        int childCount = a41Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = a41Var.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.k8) {
                org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) childAt;
                k8Var.d();
                k8Var.e();
            }
        }
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ls.x0;
        a41 a41Var = this.n;
        j41 j41Var = this.s;
        if (i7 == i11) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (!this.K) {
                    j41Var.G();
                    return;
                }
                v4.i0 adapter = a41Var.getAdapter();
                if (adapter != null) {
                    adapter.n(0, adapter.b(), 0);
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ls.z0) {
            if (this.L != org.telegram.messenger.si.d0(this.a).Z()) {
                this.K = false;
            }
            if (!this.K) {
                j41Var.G();
                return;
            }
            v4.i0 adapter2 = a41Var.getAdapter();
            if (adapter2 != null) {
                adapter2.n(0, adapter2.b(), 0);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        TLRPC.StickerSetCovered stickerSetCovered;
        int i7;
        int i10;
        float f10 = this.R;
        if (f10 != 0.0f && (stickerSetCovered = this.P) != null) {
            float f11 = f10 - 0.0053333333f;
            this.R = f11;
            if (f11 < 0.0f) {
                this.R = 0.0f;
            } else {
                invalidate();
            }
            Integer num = (Integer) this.s.h.get(stickerSetCovered);
            if (num != null) {
                int intValue = num.intValue();
                b41 b41Var = this.r;
                View m10 = b41Var.m(intValue);
                if (m10 != null) {
                    i7 = (int) m10.getY();
                    i10 = m10.getMeasuredHeight() + ((int) m10.getY());
                } else {
                    i7 = -1;
                    i10 = -1;
                }
                View m11 = b41Var.m(num.intValue() + 1);
                if (m11 != null) {
                    if (m10 == null) {
                        i7 = (int) m11.getY();
                    }
                    i10 = m11.getMeasuredHeight() + ((int) m11.getY());
                }
                if (m10 != null || m11 != null) {
                    int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Fi, false);
                    Paint paint = this.S;
                    paint.setColor(x02);
                    float f12 = this.R;
                    paint.setAlpha((int) ((f12 < 0.06f ? f12 / 0.06f : 1.0f) * 25.5f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, i7, getMeasuredWidth(), i10, paint);
                    super.dispatchDraw(canvas2);
                }
            }
        }
        canvas2 = canvas;
        super.dispatchDraw(canvas2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.G = false;
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (!this.G) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            this.n.dispatchTouchEvent(obtain);
            obtain.recycle();
        }
        return dispatchTouchEvent;
    }

    public int getContentTopOffset() {
        return this.F;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.n.getAdapter().g(r2.b() - 1);
        this.J = false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        Integer num;
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.J) {
            return;
        }
        this.J = true;
        j41 j41Var = this.s;
        j41Var.G();
        TLRPC.StickerSetCovered stickerSetCovered = this.P;
        if (stickerSetCovered == null || (num = (Integer) j41Var.h.get(stickerSetCovered)) == null) {
            return;
        }
        this.r.h1(num.intValue(), org.telegram.messenger.g0.L(58.0f) + (-this.n.getPaddingTop()));
    }

    public void setContentViewPaddingTop(int i7) {
        int L = org.telegram.messenger.g0.L(58.0f) + i7;
        a41 a41Var = this.n;
        if (a41Var.getPaddingTop() != L) {
            this.I = true;
            a41Var.setPadding(0, L, 0, 0);
            this.I = false;
        }
    }

    public void setOnScrollListener(v4.u0 u0Var) {
        this.E = u0Var;
    }

    public void setParentFragment(org.telegram.ui.ActionBar.g2 g2Var) {
        this.y = g2Var;
    }
}
