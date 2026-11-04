package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q01 extends View {
    public boolean E;
    public Drawable F;
    public Rect G;
    public float H;
    public boolean I;
    public ValueAnimator J;
    public p01 K;
    public org.telegram.messenger.e6 L;
    public boolean M;
    public boolean N;
    public float O;
    public float P;
    public int Q;
    public boolean R;
    public float S;
    public float T;
    public float U;
    public final j30 V;
    public final /* synthetic */ g11 W;
    public boolean a;
    public boolean b;
    public int c;
    public TLRPC.Document d;
    public org.telegram.ui.Components.p5 e;
    public final org.telegram.messenger.bc[] f;
    public ImageReceiver h;
    public final ImageReceiver n;
    public ImageReceiver r;
    public boolean s;
    public TL_stars.TL_starGiftUnique w;
    public Integer x;
    public dh.n0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q01(g11 g11Var, Context context) {
        super(context);
        this.W = g11Var;
        this.a = false;
        this.b = false;
        this.f = new org.telegram.messenger.bc[2];
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.n = imageReceiver;
        this.U = 1.0f;
        this.V = new j30(this, 1);
        imageReceiver.y = true;
        setFocusable(true);
    }

    public final void a(View view) {
        if (this.h == null) {
            ImageReceiver imageReceiver = new ImageReceiver(view);
            this.h = imageReceiver;
            imageReceiver.E0(7);
            if (this.I) {
                this.h.P();
            }
            this.h.S0 = true;
        }
    }

    public final void b() {
        Paint paint;
        p01 p01Var = this.K;
        if (p01Var != null) {
            p01Var.h = false;
            p01Var.n = -1;
            if (p01Var.a != 2 || (paint = p01Var.y) == null) {
                return;
            }
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a7, false));
            return;
        }
        Context context = getContext();
        int i3 = vg.y0.M;
        this.K = new p01(this, context);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(16.66f), TLObject.FLAG_30);
        this.K.measure(makeMeasureSpec, makeMeasureSpec);
        p01 p01Var2 = this.K;
        p01Var2.layout(0, 0, p01Var2.getMeasuredWidth(), this.K.getMeasuredHeight());
    }

    public final void c(TLRPC.Document document, j01 j01Var) {
        this.d = document;
        a(j01Var);
        org.telegram.messenger.jz f10 = org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.k6.m6, 0.2f, null);
        if (this.W.a0 == 6) {
            this.h.r0(org.telegram.messenger.ac.b(document), !org.telegram.messenger.lc.e(16388) ? "34_34_firstframe" : "34_34", null, null, f10, document.size, null, document, 0);
        } else {
            this.h.r0(org.telegram.messenger.ac.b(document), "100_100_firstframe", null, null, f10, 0L, "tgs", document, 0);
        }
        this.R = true;
        this.e = null;
    }

    public final void d(boolean z10, boolean z11) {
        if (this.M != z10) {
            this.M = z10;
            if (z11) {
                return;
            }
            this.S = z10 ? 1.0f : 0.0f;
            this.T = z10 ? 1.0f : 0.0f;
        }
    }

    public final void e(boolean z10, boolean z11) {
        if (this.M || !z10 || !z11 || this.W.a0 == 14) {
            this.N = false;
            d(z10, z11);
            return;
        }
        this.N = true;
        this.T = 1.0f;
        this.S = 1.0f;
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.J.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.O, 1.6f, 0.7f);
        this.J = ofFloat;
        ofFloat.addUpdateListener(new n01(this, 2));
        this.J.addListener(new o01(this, 2));
        this.J.setInterpolator(new LinearInterpolator());
        this.J.setDuration(200L);
        this.J.start();
    }

    public final void f() {
        if (!this.M || this.W.a0 == 14) {
            return;
        }
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.J.cancel();
        }
        this.O = 1.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.J = ofFloat;
        ofFloat.addUpdateListener(new n01(this, 1));
        this.J.addListener(new o01(this, 1));
        org.telegram.messenger.camera.q.i(5.0f, this.J);
        this.J.setDuration(350L);
        this.J.start();
        d(false, true);
    }

    public float getAnimatedScale() {
        return this.U;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (dh.d0.b || getParent() == null) {
            return;
        }
        ((View) getParent()).invalidate();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.I) {
            return;
        }
        this.I = true;
        Drawable drawable = this.F;
        if (drawable instanceof org.telegram.ui.Components.g5) {
            ((org.telegram.ui.Components.g5) drawable).b(this.V);
        }
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null) {
            imageReceiver.H0((View) getParent());
            this.h.P();
        }
        this.n.P();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.I) {
            this.I = false;
            Drawable drawable = this.F;
            if (drawable instanceof org.telegram.ui.Components.g5) {
                ((org.telegram.ui.Components.g5) drawable).o(this.V);
                ei.c3 c3Var = ((org.telegram.ui.Components.g5) this.F).k;
                if (c3Var != null) {
                    c3Var.g0(false);
                }
            }
            ImageReceiver imageReceiver = this.h;
            if (imageReceiver != null) {
                imageReceiver.R();
                this.h.g0(false);
            }
            this.n.R();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        org.telegram.ui.Components.p5 p5Var;
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String str2 = null;
        if (this.a) {
            str2 = org.telegram.messenger.bd.M0(2131746296, null);
        } else {
            dh.n0 n0Var = this.y;
            if (n0Var == null || (str = n0Var.f) == null) {
                TLRPC.Document document = this.d;
                if (document == null && (p5Var = this.e) != null && (document = p5Var.document) == null) {
                    document = org.telegram.ui.Components.g5.e(this.W.W, p5Var.getDocumentId());
                }
                if (document != null) {
                    str2 = org.telegram.messenger.zi.V(document, null, null);
                }
            } else {
                str2 = str;
            }
        }
        if (str2 != null) {
            accessibilityNodeInfo.setContentDescription(str2);
        }
        accessibilityNodeInfo.setSelected(this.M);
        accessibilityNodeInfo.setClickable(true);
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30));
    }

    public void setAnimatedScale(float f10) {
        this.U = f10;
    }

    public void setDrawable(Drawable drawable) {
        Drawable drawable2 = this.F;
        if (drawable2 != drawable) {
            boolean z10 = this.I;
            j30 j30Var = this.V;
            if (z10 && drawable2 != null && (drawable2 instanceof org.telegram.ui.Components.g5)) {
                ((org.telegram.ui.Components.g5) drawable2).o(j30Var);
            }
            this.F = drawable;
            if (this.I && (drawable instanceof org.telegram.ui.Components.g5)) {
                ((org.telegram.ui.Components.g5) drawable).b(j30Var);
            }
        }
    }

    public void setEmojicon(String str) {
        if (TextUtils.isEmpty(str)) {
            this.L = null;
        } else {
            this.L = org.telegram.messenger.i6.g(str);
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        if (isPressed() != z10) {
            super.setPressed(z10);
            invalidate();
            if (z10 && (valueAnimator = this.J) != null) {
                valueAnimator.removeAllListeners();
                this.J.cancel();
            }
            if (z10) {
                return;
            }
            float f10 = this.O;
            if (f10 == 0.0f || this.W.a0 == 14) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new n01(this, 0));
            this.J.addListener(new o01(this, 0));
            org.telegram.messenger.camera.q.i(5.0f, this.J);
            this.J.setDuration(350L);
            this.J.start();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i3, int i10, int i11, int i12) {
        if (dh.d0.b) {
            return;
        }
        super.invalidate(i3, i10, i11, i12);
    }
}
