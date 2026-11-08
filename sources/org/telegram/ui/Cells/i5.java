package org.telegram.ui.Cells;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gc;
import org.telegram.messenger.hc;
import org.telegram.messenger.kf;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.s71;
import org.telegram.ui.v71;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class i5 extends org.telegram.ui.Components.l9 implements org.telegram.messenger.x5 {
    public RectF G;
    public RadialProgress2 H;
    public TLRPC.TL_wallPaper I;
    public int J;
    public LinearGradient K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public Paint Q;
    public qa0 R;
    public int S;
    public s71 T;
    public int U;

    @Override // org.telegram.messenger.x5
    public final void C(boolean z9) {
        TLRPC.TL_wallPaper tL_wallPaper = this.T.a.d.X0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.I;
        if (!(tL_wallPaper2 == null && tL_wallPaper == null) && (tL_wallPaper == null || tL_wallPaper2 == null || tL_wallPaper2.id != tL_wallPaper.id)) {
            return;
        }
        if (z9) {
            this.H.setIcon(4, false, true);
        } else {
            v(tL_wallPaper2, true, z9);
        }
    }

    @Override // org.telegram.messenger.x5
    public final void M(String str) {
        this.H.p(true, 1.0f);
        TLRPC.TL_wallPaper tL_wallPaper = this.T.a.d.X0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.I;
        if (!(tL_wallPaper2 == null && tL_wallPaper == null) && (tL_wallPaper == null || tL_wallPaper2 == null || tL_wallPaper2.id != tL_wallPaper.id)) {
            return;
        }
        v(tL_wallPaper2, false, true);
    }

    @Override // org.telegram.messenger.x5
    public int getObserverTag() {
        return this.S;
    }

    @Override // org.telegram.messenger.x5
    public final void i(long j3, long j10) {
        RadialProgress2 radialProgress2 = this.H;
        radialProgress2.p(true, Math.min(1.0f, j3 / j10));
        TLRPC.TL_wallPaper tL_wallPaper = this.T.a.d.X0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.I;
        if ((!(tL_wallPaper2 == null && tL_wallPaper == null) && (tL_wallPaper == null || tL_wallPaper2 == null || tL_wallPaper2.id != tL_wallPaper.id)) || radialProgress2.i.q == 10) {
            return;
        }
        v(tL_wallPaper2, false, true);
    }

    @Override // org.telegram.ui.Components.l9, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        w(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003c  */
    @Override // org.telegram.ui.Components.l9, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int i7;
        int i10;
        v71 v71Var;
        int i11;
        int i12;
        v71 v71Var2;
        int i13;
        int i14;
        v71 v71Var3;
        int i15;
        qa0 qa0Var;
        BlendMode blendMode;
        RadialProgress2 radialProgress2 = this.H;
        RectF rectF = this.G;
        Paint paint = this.Q;
        s71 s71Var = this.T;
        float f10 = s71Var.a.d.m1;
        this.a.Z(null);
        v71 v71Var4 = s71Var.a.d;
        if (v71Var4.b == 2) {
            i7 = v71Var4.a1;
        } else {
            int E0 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Be);
            i7 = (int) v71Var4.w.j;
            if (i7 == 0) {
                i10 = E0;
                v71Var = s71Var.a.d;
                if (v71Var.b != 2) {
                    i11 = v71Var.c1;
                } else {
                    int E02 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Ce);
                    i11 = (int) v71Var.w.k;
                    if (i11 == 0) {
                        i12 = E02;
                        v71Var2 = s71Var.a.d;
                        if (v71Var2.b == 2) {
                            i13 = v71Var2.d1;
                        } else {
                            int E03 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.De);
                            i13 = (int) v71Var2.w.l;
                            if (i13 == 0) {
                                i14 = E03;
                                v71Var3 = s71Var.a.d;
                                if (v71Var3.b != 2) {
                                    i15 = v71Var3.e1;
                                } else {
                                    int E04 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Ee);
                                    i15 = (int) v71Var3.w.m;
                                    if (i15 == 0) {
                                        i15 = E04;
                                    }
                                }
                                v71 v71Var5 = s71Var.a.d;
                                int i16 = v71Var5.b != 2 ? v71Var5.i1 : v71Var5.w.n;
                                int i17 = v71Var5.l1;
                                if (i12 != 0) {
                                    this.K = null;
                                    this.R = null;
                                    this.a.m0(null);
                                } else if (this.K == null || i10 != this.L || i12 != this.M || i14 != this.N || i15 != this.O || i16 != this.P) {
                                    this.L = i10;
                                    this.M = i12;
                                    this.N = i14;
                                    this.O = i15;
                                    this.P = i16;
                                    if (i14 != 0) {
                                        this.K = null;
                                        qa0 qa0Var2 = this.R;
                                        if (qa0Var2 != null) {
                                            qa0Var2.o(i10, i12, i14, i15, 0, false);
                                        } else {
                                            int i18 = i10;
                                            qa0 qa0Var3 = new qa0(true, i18, i12, i14, i15);
                                            i10 = i18;
                                            this.R = qa0Var3;
                                            qa0Var3.v(org.telegram.messenger.g0.L(6.0f));
                                            this.R.q(this);
                                        }
                                        if (f10 < 0.0f) {
                                            this.a.m0(this.R.k);
                                        } else {
                                            this.a.m0(null);
                                            if (Build.VERSION.SDK_INT >= 29) {
                                                ImageReceiver imageReceiver = this.a;
                                                blendMode = BlendMode.SOFT_LIGHT;
                                                imageReceiver.Z(blendMode);
                                            } else {
                                                this.a.o1 = new PorterDuffColorFilter(s71Var.a.d.k1, PorterDuff.Mode.SRC_IN);
                                            }
                                        }
                                    } else {
                                        Rect e10 = org.telegram.ui.Components.k9.e(org.telegram.ui.Components.k9.d(i16), getMeasuredWidth(), getMeasuredHeight());
                                        this.K = new LinearGradient(e10.left, e10.top, e10.right, e10.bottom, new int[]{i10, i12}, (float[]) null, Shader.TileMode.CLAMP);
                                        this.R = null;
                                        this.a.m0(null);
                                    }
                                }
                                qa0Var = this.R;
                                if (qa0Var == null) {
                                    qa0Var.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                                    this.R.draw(canvas);
                                } else {
                                    paint.setShader(this.K);
                                    if (this.K == null) {
                                        paint.setColor(i10);
                                    }
                                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint);
                                }
                                super.onDraw(canvas);
                                if (radialProgress2.i.q == 4) {
                                    radialProgress2.setColors(i17, i17, -1, -1);
                                    radialProgress2.draw(canvas);
                                    return;
                                }
                                return;
                            }
                        }
                        i14 = i13;
                        v71Var3 = s71Var.a.d;
                        if (v71Var3.b != 2) {
                        }
                        v71 v71Var52 = s71Var.a.d;
                        if (v71Var52.b != 2) {
                        }
                        int i172 = v71Var52.l1;
                        if (i12 != 0) {
                        }
                        qa0Var = this.R;
                        if (qa0Var == null) {
                        }
                        super.onDraw(canvas);
                        if (radialProgress2.i.q == 4) {
                        }
                    }
                }
                i12 = i11;
                v71Var2 = s71Var.a.d;
                if (v71Var2.b == 2) {
                }
                i14 = i13;
                v71Var3 = s71Var.a.d;
                if (v71Var3.b != 2) {
                }
                v71 v71Var522 = s71Var.a.d;
                if (v71Var522.b != 2) {
                }
                int i1722 = v71Var522.l1;
                if (i12 != 0) {
                }
                qa0Var = this.R;
                if (qa0Var == null) {
                }
                super.onDraw(canvas);
                if (radialProgress2.i.q == 4) {
                }
            }
        }
        i10 = i7;
        v71Var = s71Var.a.d;
        if (v71Var.b != 2) {
        }
        i12 = i11;
        v71Var2 = s71Var.a.d;
        if (v71Var2.b == 2) {
        }
        i14 = i13;
        v71Var3 = s71Var.a.d;
        if (v71Var3.b != 2) {
        }
        v71 v71Var5222 = s71Var.a.d;
        if (v71Var5222.b != 2) {
        }
        int i17222 = v71Var5222.l1;
        if (i12 != 0) {
        }
        qa0Var = this.R;
        if (qa0Var == null) {
        }
        super.onDraw(canvas);
        if (radialProgress2.i.q == 4) {
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(100.0f), org.telegram.messenger.g0.L(100.0f));
    }

    public void setPattern(TLRPC.TL_wallPaper tL_wallPaper) {
        this.I = tL_wallPaper;
        if (tL_wallPaper != null) {
            g(1, 0L, tL_wallPaper, "100_100", null, "png", hc.c(org.telegram.messenger.w7.w(tL_wallPaper.document.thumbs, org.telegram.messenger.g0.L(100.0f), false, null, false), tL_wallPaper.document), null);
        } else {
            setImageDrawable(null);
        }
        w(false);
    }

    public final void v(Object obj, boolean z9, boolean z10) {
        File A;
        String name;
        int i7 = this.J;
        RadialProgress2 radialProgress2 = this.H;
        boolean z11 = obj instanceof TLRPC.TL_wallPaper;
        if (!z11 && !(obj instanceof kf)) {
            radialProgress2.setIcon(6, z9, z10);
            return;
        }
        if (z11) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            name = org.telegram.messenger.w7.r(null, tL_wallPaper.document);
            if (TextUtils.isEmpty(name)) {
                return;
            }
            org.telegram.messenger.w7.G(i7);
            A = org.telegram.messenger.w7.J(tL_wallPaper.document, null, true, true);
        } else {
            kf kfVar = (kf) obj;
            TLRPC.Photo photo = kfVar.K;
            if (photo != null) {
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, this.U, true, null, false);
                org.telegram.messenger.w7.G(i7);
                File J = org.telegram.messenger.w7.J(w10, null, true, true);
                name = org.telegram.messenger.w7.r(null, w10);
                A = J;
            } else {
                A = gc.A(kfVar.C);
                name = A.getName();
            }
            if (TextUtils.isEmpty(name)) {
                return;
            }
        }
        if (A.exists()) {
            org.telegram.messenger.z5.q(i7).v(this);
            radialProgress2.p(z10, 1.0f);
            radialProgress2.setIcon(6, z9, z10);
            return;
        }
        org.telegram.messenger.z5.q(i7).a(name, null, this);
        org.telegram.messenger.w7.G(i7).S(name);
        Float w11 = gc.D().w(name);
        if (w11 != null) {
            radialProgress2.p(z10, w11.floatValue());
        } else {
            radialProgress2.p(z10, 0.0f);
        }
        radialProgress2.setIcon(10, z9, z10);
    }

    public final void w(boolean z9) {
        TLRPC.TL_wallPaper tL_wallPaper = this.T.a.d.X0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.I;
        if (!(tL_wallPaper2 == null && tL_wallPaper == null) && (tL_wallPaper == null || tL_wallPaper2 == null || tL_wallPaper2.id != tL_wallPaper.id)) {
            this.H.setIcon(4, false, z9);
        } else {
            v(tL_wallPaper, false, z9);
        }
        super.invalidate();
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j3, long j10) {
    }
}
