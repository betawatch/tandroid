package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class ir0 {
    public float A;
    public float B;
    public ValueAnimator C;
    public org.telegram.messenger.ij D;
    public gr0 E;
    public hr0 F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public boolean L;
    public int M;
    public int N;
    public float O;
    public float P;
    public final float[] Q;
    public boolean R;
    public ColorMatrixColorFilter S;
    public final ViewGroup a;
    public final ViewGroup b;
    public final boolean c;
    public org.telegram.ui.Cells.t5 d;
    public View e;
    public ImageReceiver f;
    public ImageReceiver g;
    public ImageReceiver h;
    public boolean i;
    public final xh.f j;
    public xh.e k;
    public final Path l;
    public final float[] m;
    public boolean n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public float y;
    public float z;

    public ir0(ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.g = new ImageReceiver(null);
        this.h = new ImageReceiver(null);
        this.j = new xh.f();
        this.l = new Path();
        this.m = new float[8];
        this.Q = new float[2];
        this.a = viewGroup;
        this.b = viewGroup2;
        this.c = false;
    }

    public final boolean a(MotionEvent motionEvent, ViewGroup viewGroup, ImageReceiver imageReceiver, org.telegram.messenger.ij ijVar, int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.messenger.hc c10;
        org.telegram.messenger.hc hcVar;
        if (!j(viewGroup, imageReceiver)) {
            return false;
        }
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            if (!this.L && motionEvent.getPointerCount() == 2) {
                this.I = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x10 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                this.s = x10;
                this.G = x10;
                float y10 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                this.t = y10;
                this.H = y10;
                this.O = 1.0f;
                this.M = motionEvent.getPointerId(0);
                this.N = motionEvent.getPointerId(1);
                this.L = true;
            }
        } else if (motionEvent.getActionMasked() == 2 && this.L) {
            int i14 = -1;
            int i15 = -1;
            for (int i16 = 0; i16 < motionEvent.getPointerCount(); i16++) {
                if (this.M == motionEvent.getPointerId(i16)) {
                    i14 = i16;
                }
                if (this.N == motionEvent.getPointerId(i16)) {
                    i15 = i16;
                }
            }
            if (i14 == -1 || i15 == -1) {
                this.L = false;
                viewGroup.getParent().requestDisallowInterceptTouchEvent(false);
                d();
                return false;
            }
            float hypot = ((float) Math.hypot(motionEvent.getX(i15) - motionEvent.getX(i14), motionEvent.getY(i15) - motionEvent.getY(i14))) / this.I;
            this.O = hypot;
            if (hypot <= 1.005f || this.n) {
                i10 = i15;
                i11 = i14;
            } else {
                this.I = (float) Math.hypot(motionEvent.getX(i15) - motionEvent.getX(i14), motionEvent.getY(i15) - motionEvent.getY(i14));
                float x11 = (motionEvent.getX(i15) + motionEvent.getX(i14)) / 2.0f;
                this.s = x11;
                this.G = x11;
                float y11 = (motionEvent.getY(i15) + motionEvent.getY(i14)) / 2.0f;
                this.t = y11;
                this.H = y11;
                this.O = 1.0f;
                this.J = 0.0f;
                this.K = 0.0f;
                viewGroup.getParent().requestDisallowInterceptTouchEvent(true);
                this.e = viewGroup;
                this.D = ijVar;
                org.telegram.ui.Cells.t5 t5Var = this.d;
                ViewGroup viewGroup2 = this.a;
                boolean z9 = this.c;
                if (t5Var != null || z9) {
                    i12 = -1;
                } else {
                    i12 = -1;
                    org.telegram.ui.Cells.t5 t5Var2 = new org.telegram.ui.Cells.t5(this, viewGroup2.getContext());
                    this.d = t5Var2;
                    t5Var2.setFocusable(false);
                    this.d.setFocusableInTouchMode(false);
                    this.d.setEnabled(false);
                }
                if (this.g == null) {
                    ImageReceiver imageReceiver2 = new ImageReceiver(null);
                    this.g = imageReceiver2;
                    imageReceiver2.k1 = (byte) 2;
                    imageReceiver2.A0 = false;
                    imageReceiver2.P();
                    ImageReceiver imageReceiver3 = new ImageReceiver(null);
                    this.h = imageReceiver3;
                    imageReceiver3.k1 = (byte) 2;
                    imageReceiver3.A0 = false;
                    imageReceiver3.P();
                }
                this.n = true;
                this.A = 1.0f;
                this.B = 0.0f;
                if (z9) {
                    i13 = i14;
                    i10 = i15;
                } else {
                    viewGroup2.addView(this.d);
                    boolean z10 = (ijVar == null || !ijVar.t2() || ijVar.M0) ? false : true;
                    this.i = z10;
                    if (z10 && this.k == null) {
                        xh.e e10 = xh.e.e(this.d);
                        this.k = e10;
                        if (e10 != null) {
                            e10.k.put(this.d, Integer.valueOf(i7));
                        }
                    }
                    if (this.h.n() != null) {
                        this.h.n().recycle();
                        this.h.w0(null);
                    }
                    if (imageReceiver.n() == null || imageReceiver.n().isRecycled() || !this.i) {
                        this.h.o1 = null;
                    } else {
                        this.h.v0(Utilities.D(imageReceiver.n(), false));
                        ImageReceiver imageReceiver4 = this.h;
                        if (this.S == null) {
                            ColorMatrix colorMatrix = new ColorMatrix();
                            org.telegram.messenger.g0.n2(colorMatrix, 0.9f);
                            org.telegram.messenger.g0.i(colorMatrix, 0.6f);
                            this.S = new ColorMatrixColorFilter(colorMatrix);
                        }
                        imageReceiver4.o1 = this.S;
                    }
                    if (ijVar != null && org.telegram.messenger.ij.S3(ijVar.k)) {
                        int[] iArr = new int[1];
                        TLRPC.Message message = ijVar.k;
                        if (message instanceof TLRPC.TL_messageService) {
                            if (!(message.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto)) {
                                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(ijVar.n0, org.telegram.messenger.g0.Z0(false), false, null, false);
                                if (w10 != null) {
                                    int i17 = w10.size;
                                    iArr[0] = i17;
                                    if (i17 == 0) {
                                        iArr[0] = i12;
                                    }
                                    c10 = org.telegram.messenger.hc.f(w10, ijVar.l0);
                                    hcVar = c10;
                                } else {
                                    iArr[0] = i12;
                                }
                            }
                            hcVar = null;
                        } else {
                            TLRPC.MessageMedia messageMedia = message.media;
                            if ((!(messageMedia instanceof TLRPC.TL_messageMediaPhoto) || messageMedia.photo == null) && (!(messageMedia instanceof TLRPC.TL_messageMediaWebPage) || messageMedia.webpage == null)) {
                                if (messageMedia instanceof TLRPC.TL_messageMediaInvoice) {
                                    c10 = org.telegram.messenger.hc.p(org.telegram.messenger.m20.c(((TLRPC.TL_messageMediaInvoice) messageMedia).webPhoto));
                                } else {
                                    if (ijVar.F0() != null) {
                                        TLRPC.Document F0 = ijVar.F0();
                                        if (org.telegram.messenger.ij.W2(ijVar.F0())) {
                                            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(F0.thumbs, 90, false, null, false);
                                            int i18 = w11.size;
                                            iArr[0] = i18;
                                            if (i18 == 0) {
                                                iArr[0] = i12;
                                            }
                                            c10 = org.telegram.messenger.hc.c(w11, F0);
                                        }
                                    }
                                    hcVar = null;
                                }
                                hcVar = c10;
                            } else {
                                if (org.telegram.messenger.ij.t3(message)) {
                                    c10 = org.telegram.messenger.hc.b(ijVar.F0());
                                } else {
                                    TLRPC.PhotoSize w12 = org.telegram.messenger.w7.w(ijVar.n0, org.telegram.messenger.g0.Z0(false), false, null, true);
                                    if (w12 != null) {
                                        int i19 = w12.size;
                                        iArr[0] = i19;
                                        if (i19 == 0) {
                                            iArr[0] = i12;
                                        }
                                        c10 = org.telegram.messenger.hc.f(w12, ijVar.l0);
                                    } else {
                                        iArr[0] = i12;
                                        hcVar = null;
                                    }
                                }
                                hcVar = c10;
                            }
                        }
                        if (hcVar != null) {
                            i10 = i15;
                            i13 = i14;
                            this.g.r0(hcVar, null, null, null, null, iArr[0], null, ijVar, ijVar.Z4() ? 1 : 0);
                            this.g.k1 = (byte) 2;
                        } else {
                            i13 = i14;
                            i10 = i15;
                        }
                        i();
                    } else {
                        i13 = i14;
                        i10 = i15;
                    }
                    this.u = imageReceiver.K0;
                    this.v = imageReceiver.L0 + viewGroup.getPaddingTop();
                    this.w = imageReceiver.N0;
                    this.x = imageReceiver.M0;
                    this.y = imageReceiver.o();
                    float q10 = imageReceiver.q();
                    this.z = q10;
                    float f10 = this.y;
                    float f11 = f10 / q10;
                    float f12 = this.w;
                    float f13 = this.x;
                    float f14 = f12 / f13;
                    if (f11 == f14) {
                        this.y = f12;
                        this.z = f13;
                    } else if (f11 < f14) {
                        this.z = (q10 / f10) * f12;
                        this.y = f12;
                    } else {
                        this.y = f11 * f13;
                        this.z = f13;
                    }
                    if (ijVar != null && org.telegram.messenger.ij.L4(ijVar.k) && MediaController.B().I(ijVar)) {
                        this.R = true;
                        MediaController B = MediaController.B();
                        org.telegram.ui.Cells.t5 t5Var3 = this.d;
                        B.p0((TextureView) t5Var3.d, (j4) t5Var3.e, (FrameLayout) t5Var3.c, true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ((FrameLayout) this.d.c).getLayoutParams();
                        ((FrameLayout) this.d.c).setTag(R.id.parent_tag, imageReceiver);
                        if (layoutParams.width != imageReceiver.M0 || layoutParams.height != imageReceiver.N0) {
                            ((j4) this.d.e).setResizeMode(3);
                            layoutParams.width = (int) imageReceiver.M0;
                            layoutParams.height = (int) imageReceiver.N0;
                            ((FrameLayout) this.d.c).setLayoutParams(layoutParams);
                        }
                        ((TextureView) this.d.d).setScaleX(1.0f);
                        ((TextureView) this.d.d).setScaleY(1.0f);
                        gr0 gr0Var = this.E;
                        if (gr0Var != null) {
                            this.d.b.setImageBitmap(gr0Var.l0().getBitmap((int) this.z, (int) this.y));
                            this.d.b.u((int) this.z, (int) this.y);
                            this.d.b.getImageReceiver().L0(imageReceiver.E());
                        }
                        ((FrameLayout) this.d.c).setVisibility(0);
                    } else {
                        this.R = false;
                        ImageReceiver imageReceiver5 = new ImageReceiver(null);
                        this.f = imageReceiver5;
                        imageReceiver5.P();
                        Drawable t6 = imageReceiver.t();
                        this.f.w0(t6);
                        if (t6 instanceof org.telegram.ui.Components.u5) {
                            org.telegram.ui.Components.u5 u5Var = (org.telegram.ui.Components.u5) t6;
                            u5Var.f(this.d);
                            u5Var.R = true;
                        }
                        this.f.y0(this.u, this.v, this.x, this.w);
                        ImageReceiver imageReceiver6 = this.f;
                        imageReceiver6.R0 = imageReceiver.R0;
                        imageReceiver6.L0(imageReceiver.E());
                        this.g.L0(imageReceiver.E());
                        this.g.R0 = imageReceiver.R0;
                        ((FrameLayout) this.d.c).setVisibility(8);
                    }
                }
                gr0 gr0Var2 = this.E;
                if (gr0Var2 != null) {
                    gr0Var2.I0(ijVar);
                }
                this.P = 0.0f;
                i11 = i13;
            }
            int i20 = i10;
            float x12 = (motionEvent.getX(i20) + motionEvent.getX(i11)) / 2.0f;
            float y12 = (motionEvent.getY(i20) + motionEvent.getY(i11)) / 2.0f;
            float f15 = this.G - x12;
            float f16 = this.H - y12;
            float f17 = -f15;
            float f18 = this.O;
            this.J = f17 / f18;
            this.K = (-f16) / f18;
            e();
        } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.M == motionEvent.getPointerId(0) && this.N == motionEvent.getPointerId(1)) || (this.M == motionEvent.getPointerId(1) && this.N == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.L) {
            this.L = false;
            if (viewGroup != null && viewGroup.getParent() != null) {
                viewGroup.getParent().requestDisallowInterceptTouchEvent(false);
            }
            d();
        }
        return f(viewGroup);
    }

    public final void b() {
        if (this.n) {
            gr0 gr0Var = this.E;
            if (gr0Var != null) {
                gr0Var.I(this.D);
            }
            this.n = false;
        }
        org.telegram.ui.Cells.t5 t5Var = this.d;
        if (t5Var != null && t5Var.getParent() != null) {
            this.a.removeView(this.d);
            this.d.b.getImageReceiver().f();
            xh.e eVar = this.k;
            if (eVar != null) {
                eVar.b(this.d);
                this.k = null;
            }
            ImageReceiver imageReceiver = this.f;
            if (imageReceiver != null) {
                Drawable t6 = imageReceiver.t();
                if (t6 instanceof org.telegram.ui.Components.u5) {
                    ((org.telegram.ui.Components.u5) t6).w(this.d);
                }
            }
        }
        View view = this.e;
        if (view != null) {
            view.invalidate();
            this.e = null;
        }
        ImageReceiver imageReceiver2 = this.f;
        if (imageReceiver2 != null) {
            imageReceiver2.R();
            this.f.f();
            this.f = null;
        }
        ImageReceiver imageReceiver3 = this.g;
        if (imageReceiver3 != null) {
            imageReceiver3.R();
            this.g.f();
            this.g = null;
        }
        ImageReceiver imageReceiver4 = this.h;
        if (imageReceiver4 != null) {
            imageReceiver4.R();
            this.h.f();
            this.h = null;
        }
        this.D = null;
    }

    public final void d() {
        if (this.C == null && this.n) {
            if (!this.c && !i()) {
                b();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.C = ofFloat;
            ofFloat.addUpdateListener(new a3(this, 23));
            this.C.addListener(new g30(this, 19));
            this.C.setDuration(220L);
            this.C.setInterpolator(org.telegram.ui.Components.wq.f);
            this.C.start();
        }
    }

    public void e() {
        View view;
        if (this.c && (view = this.e) != null) {
            view.invalidate();
        }
        org.telegram.ui.Cells.t5 t5Var = this.d;
        if (t5Var != null) {
            t5Var.invalidate();
        }
    }

    public final boolean f(View view) {
        return this.n && view == this.e;
    }

    public final boolean g(MotionEvent motionEvent) {
        if (!i() || this.e == null) {
            return false;
        }
        motionEvent.offsetLocation(-this.q, -this.r);
        return this.e.onTouchEvent(motionEvent);
    }

    public final void h(fh fhVar) {
        this.F = fhVar;
    }

    public final boolean i() {
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        for (View view = this.e; view != this.a; view = (View) view.getParent()) {
            if (view == null) {
                return false;
            }
            f11 += view.getLeft();
            f12 += view.getTop();
            if (!(view.getParent() instanceof View)) {
                break;
            }
        }
        float f13 = 0.0f;
        for (View view2 = this.e; view2 != this.b; view2 = (View) view2.getParent()) {
            if (view2 == null) {
                return false;
            }
            f10 += view2.getLeft();
            f13 += view2.getTop();
        }
        this.q = f10;
        this.r = f13;
        this.o = f11;
        this.p = f12;
        return true;
    }

    public boolean j(View view, ImageReceiver imageReceiver) {
        if (this.c) {
            return true;
        }
        if (imageReceiver.t() instanceof org.telegram.ui.Components.u5) {
            AnimatedFileDrawableStream animatedFileDrawableStream = ((org.telegram.ui.Components.u5) imageReceiver.t()).u0;
            return animatedFileDrawableStream == null || !animatedFileDrawableStream.s;
        }
        if (imageReceiver.S != null || imageReceiver.j0 != null) {
            return true;
        }
        Drawable drawable = imageReceiver.m0;
        if (drawable instanceof org.telegram.ui.Components.e51) {
            return true;
        }
        return drawable != null && !(drawable instanceof org.telegram.ui.Components.v8) && imageReceiver.Q == null && imageReceiver.h0 == null;
    }

    public ir0() {
        this.g = new ImageReceiver(null);
        this.h = new ImageReceiver(null);
        this.j = new xh.f();
        this.l = new Path();
        this.m = new float[8];
        this.Q = new float[2];
        this.a = null;
        this.b = null;
        this.c = true;
    }

    public void c(Canvas canvas, float f10, float f11, float f12, float f13, float f14) {
    }
}
