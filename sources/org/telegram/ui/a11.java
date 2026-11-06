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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class a11 extends View {
    public boolean D;
    public Drawable E;
    public Rect F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public z01 J;
    public org.telegram.messenger.e6 K;
    public boolean L;
    public boolean M;
    public float N;
    public float O;
    public int P;
    public boolean Q;
    public float R;
    public float S;
    public float T;
    public final o30 U;
    public final /* synthetic */ q11 V;
    public boolean a;
    public boolean b;
    public int c;
    public TLRPC.Document d;
    public org.telegram.ui.Components.r5 e;
    public final org.telegram.messenger.ic[] f;
    public ImageReceiver h;
    public final ImageReceiver n;
    public ImageReceiver r;
    public boolean s;
    public TL_stars.TL_starGiftUnique w;
    public Integer x;
    public ch.o0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a11(q11 q11Var, Context context) {
        super(context);
        this.V = q11Var;
        this.a = false;
        this.b = false;
        this.f = new org.telegram.messenger.ic[2];
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.n = imageReceiver;
        this.T = 1.0f;
        this.U = new o30(this, 1);
        imageReceiver.y = true;
        setFocusable(true);
    }

    public final void a(View view) {
        if (this.h == null) {
            ImageReceiver imageReceiver = new ImageReceiver(view);
            this.h = imageReceiver;
            imageReceiver.E0(7);
            if (this.H) {
                this.h.P();
            }
            this.h.R0 = true;
        }
    }

    public final void b() {
        Paint paint;
        z01 z01Var = this.J;
        if (z01Var != null) {
            z01Var.h = false;
            z01Var.n = -1;
            if (z01Var.a != 2 || (paint = z01Var.y) == null) {
                return;
            }
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a7, false));
            return;
        }
        Context context = getContext();
        int i7 = ug.z0.L;
        this.J = new z01(this, context);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(16.66f), TLObject.FLAG_30);
        this.J.measure(makeMeasureSpec, makeMeasureSpec);
        z01 z01Var2 = this.J;
        z01Var2.layout(0, 0, z01Var2.getMeasuredWidth(), this.J.getMeasuredHeight());
    }

    public final void c(TLRPC.Document document, t01 t01Var) {
        this.d = document;
        a(t01Var);
        org.telegram.messenger.rz f10 = org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.k6.m6, 0.2f, null);
        if (this.V.W == 6) {
            this.h.r0(org.telegram.messenger.hc.b(document), !org.telegram.messenger.rc.e(16388) ? "34_34_firstframe" : "34_34", null, null, f10, document.size, null, document, 0);
        } else {
            this.h.r0(org.telegram.messenger.hc.b(document), "100_100_firstframe", null, null, f10, 0L, "tgs", document, 0);
        }
        this.Q = true;
        this.e = null;
    }

    public final void d(boolean z9, boolean z10) {
        if (this.L != z9) {
            this.L = z9;
            if (z10) {
                return;
            }
            this.R = z9 ? 1.0f : 0.0f;
            this.S = z9 ? 1.0f : 0.0f;
        }
    }

    public final void e(boolean z9, boolean z10) {
        if (this.L || !z9 || !z10 || this.V.W == 14) {
            this.M = false;
            d(z9, z10);
            return;
        }
        this.M = true;
        this.S = 1.0f;
        this.R = 1.0f;
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.I.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.N, 1.6f, 0.7f);
        this.I = ofFloat;
        ofFloat.addUpdateListener(new x01(this, 2));
        this.I.addListener(new y01(this, 2));
        this.I.setInterpolator(new LinearInterpolator());
        this.I.setDuration(200L);
        this.I.start();
    }

    public final void f() {
        if (!this.L || this.V.W == 14) {
            return;
        }
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.I.cancel();
        }
        this.N = 1.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.I = ofFloat;
        ofFloat.addUpdateListener(new x01(this, 1));
        this.I.addListener(new y01(this, 1));
        org.telegram.messenger.camera.q.i(5.0f, this.I);
        this.I.setDuration(350L);
        this.I.start();
        d(false, true);
    }

    public float getAnimatedScale() {
        return this.T;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (ch.e0.b || getParent() == null) {
            return;
        }
        ((View) getParent()).invalidate();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.H) {
            return;
        }
        this.H = true;
        Drawable drawable = this.E;
        if (drawable instanceof org.telegram.ui.Components.i5) {
            ((org.telegram.ui.Components.i5) drawable).b(this.U);
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
        if (this.H) {
            this.H = false;
            Drawable drawable = this.E;
            if (drawable instanceof org.telegram.ui.Components.i5) {
                ((org.telegram.ui.Components.i5) drawable).o(this.U);
                di.z2 z2Var = ((org.telegram.ui.Components.i5) this.E).k;
                if (z2Var != null) {
                    z2Var.g0(false);
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
        org.telegram.ui.Components.r5 r5Var;
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String str2 = null;
        if (this.a) {
            str2 = org.telegram.messenger.hd.M0(2131746287, null);
        } else {
            ch.o0 o0Var = this.y;
            if (o0Var == null || (str = o0Var.f) == null) {
                TLRPC.Document document = this.d;
                if (document == null && (r5Var = this.e) != null && (document = r5Var.document) == null) {
                    document = org.telegram.ui.Components.i5.e(this.V.V, r5Var.getDocumentId());
                }
                if (document != null) {
                    str2 = org.telegram.messenger.ij.V(document, null, null);
                }
            } else {
                str2 = str;
            }
        }
        if (str2 != null) {
            accessibilityNodeInfo.setContentDescription(str2);
        }
        accessibilityNodeInfo.setSelected(this.L);
        accessibilityNodeInfo.setClickable(true);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30));
    }

    public void setAnimatedScale(float f10) {
        this.T = f10;
    }

    public void setDrawable(Drawable drawable) {
        Drawable drawable2 = this.E;
        if (drawable2 != drawable) {
            boolean z9 = this.H;
            o30 o30Var = this.U;
            if (z9 && drawable2 != null && (drawable2 instanceof org.telegram.ui.Components.i5)) {
                ((org.telegram.ui.Components.i5) drawable2).o(o30Var);
            }
            this.E = drawable;
            if (this.H && (drawable instanceof org.telegram.ui.Components.i5)) {
                ((org.telegram.ui.Components.i5) drawable).b(o30Var);
            }
        }
    }

    public void setEmojicon(String str) {
        if (TextUtils.isEmpty(str)) {
            this.K = null;
        } else {
            this.K = org.telegram.messenger.i6.g(str);
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z9) {
        ValueAnimator valueAnimator;
        if (isPressed() != z9) {
            super.setPressed(z9);
            invalidate();
            if (z9 && (valueAnimator = this.I) != null) {
                valueAnimator.removeAllListeners();
                this.I.cancel();
            }
            if (z9) {
                return;
            }
            float f10 = this.N;
            if (f10 == 0.0f || this.V.W == 14) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
            this.I = ofFloat;
            ofFloat.addUpdateListener(new x01(this, 0));
            this.I.addListener(new y01(this, 0));
            org.telegram.messenger.camera.q.i(5.0f, this.I);
            this.I.setDuration(350L);
            this.I.start();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i7, int i10, int i11, int i12) {
        if (ch.e0.b) {
            return;
        }
        super.invalidate(i7, i10, i11, i12);
    }
}
