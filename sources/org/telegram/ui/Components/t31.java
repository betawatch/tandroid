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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class t31 extends FrameLayout implements org.telegram.messenger.ls {
    public v4.s0 D;
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public long K;
    public ValueAnimator L;
    public boolean M;
    public boolean N;
    public final TLRPC.StickerSetCovered O;
    public final org.telegram.ui.ActionBar.f6 P;
    public float Q;
    public final Paint R;
    public final int a;
    public final p31 b;
    public final TLRPC.StickerSetCovered[] c;
    public final LongSparseArray d;
    public final LongSparseArray e;
    public final View f;
    public final h31 h;
    public final i31 n;
    public final j31 r;
    public final s31 s;
    public final jg.d2 w;
    public final FrameLayout x;
    public org.telegram.ui.ActionBar.f2 y;

    public t31(Context context, final p31 p31Var, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, TLRPC.StickerSetCovered stickerSetCovered, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i7 = org.telegram.messenger.p10.s0;
        this.a = i7;
        this.Q = 1.0f;
        this.R = new Paint();
        this.b = p31Var;
        this.c = stickerSetCoveredArr;
        this.d = longSparseArray;
        this.e = longSparseArray2;
        this.O = stickerSetCovered;
        this.P = f6Var;
        s31 s31Var = new s31(this, context);
        this.s = s31Var;
        this.w = new jg.d2(context, new g31(this, p31Var), stickerSetCoveredArr, longSparseArray, longSparseArray2, f6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.x = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, frameLayout, f6Var);
        h31 h31Var = new h31(this, context, f6Var);
        this.h = h31Var;
        h31Var.setHint(org.telegram.messenger.hd.M0(2131745706, null));
        frameLayout.addView(h31Var, c8.ha.e(-1, -1, 48));
        i31 i31Var = new i31(this, context, p31Var);
        this.n = i31Var;
        final k kVar = new k(this, 20);
        i31Var.setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Components.f31
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                k kVar2 = kVar;
                return p31Var.e(t31.this.n, kVar2, motionEvent);
            }
        });
        i31Var.setOverScrollMode(2);
        i31Var.setClipToPadding(false);
        i31Var.setItemAnimator(null);
        i31Var.setLayoutAnimation(null);
        j31 j31Var = new j31(this, org.telegram.messenger.g0.L(58.0f), i31Var);
        this.r = j31Var;
        i31Var.setLayoutManager(j31Var);
        j31Var.O = new k31(this);
        i31Var.setOnScrollListener(new l31(this));
        i31Var.setAdapter(s31Var);
        i31Var.setOnItemClickListener(kVar);
        addView(i31Var, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f = view;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.V5, view, f6Var);
        view.setAlpha(0.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1());
        layoutParams.topMargin = org.telegram.messenger.g0.L(58.0f);
        addView(view, layoutParams);
        addView(frameLayout, c8.ha.e(-1, 58, 51));
        d();
        org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(i7);
        f10.c(this, org.telegram.messenger.qs.x0);
        f10.c(this, org.telegram.messenger.qs.z0);
    }

    private void setShadowVisible(boolean z9) {
        if (this.G != z9) {
            this.G = z9;
            org.telegram.messenger.camera.q.k(this.f.animate(), z9 ? 1.0f : 0.0f, 200L);
        }
    }

    public final void a(boolean z9) {
        this.M = z9;
        if (!z9) {
            ValueAnimator valueAnimator = this.L;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.L.cancel();
                this.L = null;
                return;
            }
            return;
        }
        if (getContentTopOffset() <= 0 || this.L != null) {
            return;
        }
        int contentTopOffset = getContentTopOffset();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.L = ofFloat;
        ofFloat.addUpdateListener(new o31(this, contentTopOffset));
        this.L.addListener(new f11(this, 2));
        this.L.setDuration(250L);
        this.L.setInterpolator(org.telegram.ui.ActionBar.i1.w);
        this.L.start();
    }

    public final void b(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet) {
        if (stickerSet != null) {
            inputStickerSet = new TLRPC.TL_inputStickerSetID();
            inputStickerSet.access_hash = stickerSet.access_hash;
            inputStickerSet.id = stickerSet.id;
        }
        TLRPC.InputStickerSet inputStickerSet2 = inputStickerSet;
        if (inputStickerSet2 != null) {
            p31 p31Var = this.b;
            p31Var.getClass();
            yv0 yv0Var = new yv0(getContext(), this.y, inputStickerSet2, null, p31Var instanceof aw ? new m31(this) : null, this.P);
            yv0Var.a2 = false;
            yv0Var.T1 = new n31(this, inputStickerSet2);
            this.y.showDialog(yv0Var);
        }
    }

    public final boolean c() {
        i31 i31Var = this.n;
        int childCount = i31Var.getChildCount();
        View view = this.f;
        FrameLayout frameLayout = this.x;
        if (childCount <= 0) {
            int paddingTop = i31Var.getPaddingTop();
            this.E = paddingTop;
            i31Var.setTopGlowOffset(paddingTop);
            frameLayout.setTranslationY(this.E);
            view.setTranslationY(this.E);
            setShadowVisible(false);
            return true;
        }
        View childAt = i31Var.getChildAt(0);
        for (int i7 = 1; i7 < i31Var.getChildCount(); i7++) {
            View childAt2 = i31Var.getChildAt(i7);
            if (childAt2.getTop() < childAt.getTop()) {
                childAt = childAt2;
            }
        }
        xi0 xi0Var = (xi0) i31Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(58.0f);
        int i10 = (top <= 0 || xi0Var == null || xi0Var.b() != 0) ? 0 : top;
        setShadowVisible(top < 0);
        if (this.E == i10) {
            return false;
        }
        this.E = i10;
        i31Var.setTopGlowOffset(org.telegram.messenger.g0.L(58.0f) + i10);
        frameLayout.setTranslationY(this.E);
        view.setTranslationY(this.E);
        return true;
    }

    public final void d() {
        i31 i31Var = this.n;
        v4.g0 adapter = i31Var.getAdapter();
        s31 s31Var = this.s;
        if (adapter == s31Var) {
            s31Var.getClass();
            return;
        }
        this.w.getClass();
        int childCount = i31Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = i31Var.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.j8) {
                org.telegram.ui.Cells.j8 j8Var = (org.telegram.ui.Cells.j8) childAt;
                j8Var.d();
                j8Var.e();
            }
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.qs.x0;
        i31 i31Var = this.n;
        s31 s31Var = this.s;
        if (i7 == i11) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (!this.J) {
                    s31Var.G();
                    return;
                }
                v4.g0 adapter = i31Var.getAdapter();
                if (adapter != null) {
                    adapter.n(0, adapter.b(), 0);
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.z0) {
            if (this.K != org.telegram.messenger.ui.b0(this.a).X()) {
                this.J = false;
            }
            if (!this.J) {
                s31Var.G();
                return;
            }
            v4.g0 adapter2 = i31Var.getAdapter();
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
        float f10 = this.Q;
        if (f10 != 0.0f && (stickerSetCovered = this.O) != null) {
            float f11 = f10 - 0.0053333333f;
            this.Q = f11;
            if (f11 < 0.0f) {
                this.Q = 0.0f;
            } else {
                invalidate();
            }
            Integer num = (Integer) this.s.h.get(stickerSetCovered);
            if (num != null) {
                int intValue = num.intValue();
                j31 j31Var = this.r;
                View m10 = j31Var.m(intValue);
                if (m10 != null) {
                    i7 = (int) m10.getY();
                    i10 = m10.getMeasuredHeight() + ((int) m10.getY());
                } else {
                    i7 = -1;
                    i10 = -1;
                }
                View m11 = j31Var.m(num.intValue() + 1);
                if (m11 != null) {
                    if (m10 == null) {
                        i7 = (int) m11.getY();
                    }
                    i10 = m11.getMeasuredHeight() + ((int) m11.getY());
                }
                if (m10 != null || m11 != null) {
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false);
                    Paint paint = this.R;
                    paint.setColor(x02);
                    float f12 = this.Q;
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
        this.F = false;
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (!this.F) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            this.n.dispatchTouchEvent(obtain);
            obtain.recycle();
        }
        return dispatchTouchEvent;
    }

    public int getContentTopOffset() {
        return this.E;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.n.getAdapter().g(r2.b() - 1);
        this.I = false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        Integer num;
        super.onLayout(z9, i7, i10, i11, i12);
        if (this.I) {
            return;
        }
        this.I = true;
        s31 s31Var = this.s;
        s31Var.G();
        TLRPC.StickerSetCovered stickerSetCovered = this.O;
        if (stickerSetCovered == null || (num = (Integer) s31Var.h.get(stickerSetCovered)) == null) {
            return;
        }
        this.r.h1(num.intValue(), org.telegram.messenger.g0.L(58.0f) + (-this.n.getPaddingTop()));
    }

    public void setContentViewPaddingTop(int i7) {
        int L = org.telegram.messenger.g0.L(58.0f) + i7;
        i31 i31Var = this.n;
        if (i31Var.getPaddingTop() != L) {
            this.H = true;
            i31Var.setPadding(0, L, 0, 0);
            this.H = false;
        }
    }

    public void setOnScrollListener(v4.s0 s0Var) {
        this.D = s0Var;
    }

    public void setParentFragment(org.telegram.ui.ActionBar.f2 f2Var) {
        this.y = f2Var;
    }
}
