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
import org.telegram.messenger.ic;
import org.telegram.messenger.jc;
import org.telegram.messenger.jf;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.h91;
import org.telegram.ui.k91;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class n5 extends org.telegram.ui.Components.g9 implements org.telegram.messenger.z5 {
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
    public jb0 R;
    public int S;
    public h91 T;
    public int U;

    @Override // org.telegram.messenger.z5
    public final void D(boolean z10) {
        TLRPC.TL_wallPaper tL_wallPaper = this.T.a.d.X0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.I;
        if (!(tL_wallPaper2 == null && tL_wallPaper == null) && (tL_wallPaper == null || tL_wallPaper2 == null || tL_wallPaper2.id != tL_wallPaper.id)) {
            return;
        }
        if (z10) {
            this.H.setIcon(4, false, true);
        } else {
            v(tL_wallPaper2, true, z10);
        }
    }

    @Override // org.telegram.messenger.z5
    public final void N(String str) {
        this.H.p(true, 1.0f);
        TLRPC.TL_wallPaper tL_wallPaper = this.T.a.d.X0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.I;
        if (!(tL_wallPaper2 == null && tL_wallPaper == null) && (tL_wallPaper == null || tL_wallPaper2 == null || tL_wallPaper2.id != tL_wallPaper.id)) {
            return;
        }
        v(tL_wallPaper2, false, true);
    }

    @Override // org.telegram.messenger.z5
    public int getObserverTag() {
        return this.S;
    }

    @Override // org.telegram.messenger.z5
    public final void i(long j10, long j11) {
        RadialProgress2 radialProgress2 = this.H;
        radialProgress2.p(true, Math.min(1.0f, j10 / j11));
        TLRPC.TL_wallPaper tL_wallPaper = this.T.a.d.X0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.I;
        if ((!(tL_wallPaper2 == null && tL_wallPaper == null) && (tL_wallPaper == null || tL_wallPaper2 == null || tL_wallPaper2.id != tL_wallPaper.id)) || radialProgress2.i.q == 10) {
            return;
        }
        v(tL_wallPaper2, false, true);
    }

    @Override // org.telegram.ui.Components.g9, android.view.View
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
    @Override // org.telegram.ui.Components.g9, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        k91 k91Var;
        int i12;
        int i13;
        k91 k91Var2;
        int i14;
        int i15;
        k91 k91Var3;
        int i16;
        jb0 jb0Var;
        BlendMode blendMode;
        RadialProgress2 radialProgress2 = this.H;
        RectF rectF = this.G;
        Paint paint = this.Q;
        h91 h91Var = this.T;
        float f7 = h91Var.a.d.m1;
        this.a.Z(null);
        k91 k91Var4 = h91Var.a.d;
        if (k91Var4.b == 2) {
            i10 = k91Var4.a1;
        } else {
            int E0 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.Be);
            i10 = (int) k91Var4.w.j;
            if (i10 == 0) {
                i11 = E0;
                k91Var = h91Var.a.d;
                if (k91Var.b != 2) {
                    i12 = k91Var.c1;
                } else {
                    int E02 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.Ce);
                    i12 = (int) k91Var.w.k;
                    if (i12 == 0) {
                        i13 = E02;
                        k91Var2 = h91Var.a.d;
                        if (k91Var2.b == 2) {
                            i14 = k91Var2.d1;
                        } else {
                            int E03 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.De);
                            i14 = (int) k91Var2.w.l;
                            if (i14 == 0) {
                                i15 = E03;
                                k91Var3 = h91Var.a.d;
                                if (k91Var3.b != 2) {
                                    i16 = k91Var3.e1;
                                } else {
                                    int E04 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.Ee);
                                    i16 = (int) k91Var3.w.m;
                                    if (i16 == 0) {
                                        i16 = E04;
                                    }
                                }
                                k91 k91Var5 = h91Var.a.d;
                                int i17 = k91Var5.b != 2 ? k91Var5.i1 : k91Var5.w.n;
                                int i18 = k91Var5.l1;
                                if (i13 != 0) {
                                    this.K = null;
                                    this.R = null;
                                    this.a.m0(null);
                                } else if (this.K == null || i11 != this.L || i13 != this.M || i15 != this.N || i16 != this.O || i17 != this.P) {
                                    this.L = i11;
                                    this.M = i13;
                                    this.N = i15;
                                    this.O = i16;
                                    this.P = i17;
                                    if (i15 != 0) {
                                        this.K = null;
                                        jb0 jb0Var2 = this.R;
                                        if (jb0Var2 != null) {
                                            jb0Var2.o(i11, i13, i15, i16, 0, false);
                                        } else {
                                            int i19 = i11;
                                            jb0 jb0Var3 = new jb0(true, i19, i13, i15, i16);
                                            i11 = i19;
                                            this.R = jb0Var3;
                                            jb0Var3.v(org.telegram.messenger.i0.L(6.0f));
                                            this.R.q(this);
                                        }
                                        if (f7 < 0.0f) {
                                            this.a.m0(this.R.k);
                                        } else {
                                            this.a.m0(null);
                                            if (Build.VERSION.SDK_INT >= 29) {
                                                ImageReceiver imageReceiver = this.a;
                                                blendMode = BlendMode.SOFT_LIGHT;
                                                imageReceiver.Z(blendMode);
                                            } else {
                                                this.a.o1 = new PorterDuffColorFilter(h91Var.a.d.k1, PorterDuff.Mode.SRC_IN);
                                            }
                                        }
                                    } else {
                                        Rect e = org.telegram.ui.Components.f9.e(org.telegram.ui.Components.f9.d(i17), getMeasuredWidth(), getMeasuredHeight());
                                        this.K = new LinearGradient(e.left, e.top, e.right, e.bottom, new int[]{i11, i13}, (float[]) null, Shader.TileMode.CLAMP);
                                        this.R = null;
                                        this.a.m0(null);
                                    }
                                }
                                jb0Var = this.R;
                                if (jb0Var == null) {
                                    jb0Var.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                                    this.R.draw(canvas);
                                } else {
                                    paint.setShader(this.K);
                                    if (this.K == null) {
                                        paint.setColor(i11);
                                    }
                                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                                    canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), paint);
                                }
                                super.onDraw(canvas);
                                if (radialProgress2.i.q == 4) {
                                    radialProgress2.setColors(i18, i18, -1, -1);
                                    radialProgress2.draw(canvas);
                                    return;
                                }
                                return;
                            }
                        }
                        i15 = i14;
                        k91Var3 = h91Var.a.d;
                        if (k91Var3.b != 2) {
                        }
                        k91 k91Var52 = h91Var.a.d;
                        if (k91Var52.b != 2) {
                        }
                        int i182 = k91Var52.l1;
                        if (i13 != 0) {
                        }
                        jb0Var = this.R;
                        if (jb0Var == null) {
                        }
                        super.onDraw(canvas);
                        if (radialProgress2.i.q == 4) {
                        }
                    }
                }
                i13 = i12;
                k91Var2 = h91Var.a.d;
                if (k91Var2.b == 2) {
                }
                i15 = i14;
                k91Var3 = h91Var.a.d;
                if (k91Var3.b != 2) {
                }
                k91 k91Var522 = h91Var.a.d;
                if (k91Var522.b != 2) {
                }
                int i1822 = k91Var522.l1;
                if (i13 != 0) {
                }
                jb0Var = this.R;
                if (jb0Var == null) {
                }
                super.onDraw(canvas);
                if (radialProgress2.i.q == 4) {
                }
            }
        }
        i11 = i10;
        k91Var = h91Var.a.d;
        if (k91Var.b != 2) {
        }
        i13 = i12;
        k91Var2 = h91Var.a.d;
        if (k91Var2.b == 2) {
        }
        i15 = i14;
        k91Var3 = h91Var.a.d;
        if (k91Var3.b != 2) {
        }
        k91 k91Var5222 = h91Var.a.d;
        if (k91Var5222.b != 2) {
        }
        int i18222 = k91Var5222.l1;
        if (i13 != 0) {
        }
        jb0Var = this.R;
        if (jb0Var == null) {
        }
        super.onDraw(canvas);
        if (radialProgress2.i.q == 4) {
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(org.telegram.messenger.i0.L(100.0f), org.telegram.messenger.i0.L(100.0f));
    }

    public void setPattern(TLRPC.TL_wallPaper tL_wallPaper) {
        this.I = tL_wallPaper;
        if (tL_wallPaper != null) {
            g(1, 0L, tL_wallPaper, "100_100", null, "png", jc.c(org.telegram.messenger.b8.w(tL_wallPaper.document.thumbs, org.telegram.messenger.i0.L(100.0f), false, null, false), tL_wallPaper.document), null);
        } else {
            setImageDrawable(null);
        }
        w(false);
    }

    public final void v(Object obj, boolean z10, boolean z11) {
        File A;
        String name;
        int i10 = this.J;
        RadialProgress2 radialProgress2 = this.H;
        boolean z12 = obj instanceof TLRPC.TL_wallPaper;
        if (!z12 && !(obj instanceof jf)) {
            radialProgress2.setIcon(6, z10, z11);
            return;
        }
        if (z12) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            name = org.telegram.messenger.b8.r(null, tL_wallPaper.document);
            if (TextUtils.isEmpty(name)) {
                return;
            }
            org.telegram.messenger.b8.G(i10);
            A = org.telegram.messenger.b8.K(tL_wallPaper.document, null, true, true);
        } else {
            jf jfVar = (jf) obj;
            TLRPC.Photo photo = jfVar.K;
            if (photo != null) {
                TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(photo.sizes, this.U, true, null, false);
                org.telegram.messenger.b8.G(i10);
                File K = org.telegram.messenger.b8.K(w9, null, true, true);
                name = org.telegram.messenger.b8.r(null, w9);
                A = K;
            } else {
                A = ic.A(jfVar.C);
                name = A.getName();
            }
            if (TextUtils.isEmpty(name)) {
                return;
            }
        }
        if (A.exists()) {
            org.telegram.messenger.b6.q(i10).v(this);
            radialProgress2.p(z11, 1.0f);
            radialProgress2.setIcon(6, z10, z11);
            return;
        }
        org.telegram.messenger.b6.q(i10).a(name, null, this);
        org.telegram.messenger.b8.G(i10).T(name);
        Float w10 = ic.D().w(name);
        if (w10 != null) {
            radialProgress2.p(z11, w10.floatValue());
        } else {
            radialProgress2.p(z11, 0.0f);
        }
        radialProgress2.setIcon(10, z10, z11);
    }

    public final void w(boolean z10) {
        TLRPC.TL_wallPaper tL_wallPaper = this.T.a.d.X0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.I;
        if (!(tL_wallPaper2 == null && tL_wallPaper == null) && (tL_wallPaper == null || tL_wallPaper2 == null || tL_wallPaper2.id != tL_wallPaper.id)) {
            this.H.setIcon(4, false, z10);
        } else {
            v(tL_wallPaper, false, z10);
        }
        super.invalidate();
    }

    @Override // org.telegram.messenger.z5
    public final void o(long j10, long j11) {
    }
}
