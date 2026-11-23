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
import org.telegram.messenger.fc;
import org.telegram.messenger.gc;
import org.telegram.messenger.jf;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.u71;
import org.telegram.ui.x71;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class k5 extends org.telegram.ui.Components.q9 implements org.telegram.messenger.y5 {
    public RectF H;
    public RadialProgress2 I;
    public TLRPC.TL_wallPaper J;
    public int K;
    public LinearGradient L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public Paint R;
    public cb0 S;
    public int T;
    public u71 U;
    public int V;

    @Override // org.telegram.messenger.y5
    public final void C(boolean z10) {
        TLRPC.TL_wallPaper tL_wallPaper = this.U.a.d.Y0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.J;
        if (!(tL_wallPaper2 == null && tL_wallPaper == null) && (tL_wallPaper == null || tL_wallPaper2 == null || tL_wallPaper2.id != tL_wallPaper.id)) {
            return;
        }
        if (z10) {
            this.I.setIcon(4, false, true);
        } else {
            v(tL_wallPaper2, true, z10);
        }
    }

    @Override // org.telegram.messenger.y5
    public final void N(String str) {
        this.I.p(true, 1.0f);
        TLRPC.TL_wallPaper tL_wallPaper = this.U.a.d.Y0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.J;
        if (!(tL_wallPaper2 == null && tL_wallPaper == null) && (tL_wallPaper == null || tL_wallPaper2 == null || tL_wallPaper2.id != tL_wallPaper.id)) {
            return;
        }
        v(tL_wallPaper2, false, true);
    }

    @Override // org.telegram.messenger.y5
    public int getObserverTag() {
        return this.T;
    }

    @Override // org.telegram.messenger.y5
    public final void i(long j3, long j10) {
        RadialProgress2 radialProgress2 = this.I;
        radialProgress2.p(true, Math.min(1.0f, j3 / j10));
        TLRPC.TL_wallPaper tL_wallPaper = this.U.a.d.Y0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.J;
        if ((!(tL_wallPaper2 == null && tL_wallPaper == null) && (tL_wallPaper == null || tL_wallPaper2 == null || tL_wallPaper2.id != tL_wallPaper.id)) || radialProgress2.i.q == 10) {
            return;
        }
        v(tL_wallPaper2, false, true);
    }

    @Override // org.telegram.ui.Components.q9, android.view.View
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
    @Override // org.telegram.ui.Components.q9, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int i7;
        int i10;
        x71 x71Var;
        int i11;
        int i12;
        x71 x71Var2;
        int i13;
        int i14;
        x71 x71Var3;
        int i15;
        cb0 cb0Var;
        BlendMode blendMode;
        RadialProgress2 radialProgress2 = this.I;
        RectF rectF = this.H;
        Paint paint = this.R;
        u71 u71Var = this.U;
        float f10 = u71Var.a.d.n1;
        this.a.Z(null);
        x71 x71Var4 = u71Var.a.d;
        if (x71Var4.b == 2) {
            i7 = x71Var4.b1;
        } else {
            int E0 = org.telegram.ui.ActionBar.m6.E0(org.telegram.ui.ActionBar.m6.Ee);
            i7 = (int) x71Var4.w.j;
            if (i7 == 0) {
                i10 = E0;
                x71Var = u71Var.a.d;
                if (x71Var.b != 2) {
                    i11 = x71Var.d1;
                } else {
                    int E02 = org.telegram.ui.ActionBar.m6.E0(org.telegram.ui.ActionBar.m6.Fe);
                    i11 = (int) x71Var.w.k;
                    if (i11 == 0) {
                        i12 = E02;
                        x71Var2 = u71Var.a.d;
                        if (x71Var2.b == 2) {
                            i13 = x71Var2.e1;
                        } else {
                            int E03 = org.telegram.ui.ActionBar.m6.E0(org.telegram.ui.ActionBar.m6.Ge);
                            i13 = (int) x71Var2.w.l;
                            if (i13 == 0) {
                                i14 = E03;
                                x71Var3 = u71Var.a.d;
                                if (x71Var3.b != 2) {
                                    i15 = x71Var3.f1;
                                } else {
                                    int E04 = org.telegram.ui.ActionBar.m6.E0(org.telegram.ui.ActionBar.m6.He);
                                    i15 = (int) x71Var3.w.m;
                                    if (i15 == 0) {
                                        i15 = E04;
                                    }
                                }
                                x71 x71Var5 = u71Var.a.d;
                                int i16 = x71Var5.b != 2 ? x71Var5.j1 : x71Var5.w.n;
                                int i17 = x71Var5.m1;
                                if (i12 != 0) {
                                    this.L = null;
                                    this.S = null;
                                    this.a.m0(null);
                                } else if (this.L == null || i10 != this.M || i12 != this.N || i14 != this.O || i15 != this.P || i16 != this.Q) {
                                    this.M = i10;
                                    this.N = i12;
                                    this.O = i14;
                                    this.P = i15;
                                    this.Q = i16;
                                    if (i14 != 0) {
                                        this.L = null;
                                        cb0 cb0Var2 = this.S;
                                        if (cb0Var2 != null) {
                                            cb0Var2.o(i10, i12, i14, i15, 0, false);
                                        } else {
                                            int i18 = i10;
                                            cb0 cb0Var3 = new cb0(true, i18, i12, i14, i15);
                                            i10 = i18;
                                            this.S = cb0Var3;
                                            cb0Var3.v(org.telegram.messenger.g0.L(6.0f));
                                            this.S.q(this);
                                        }
                                        if (f10 < 0.0f) {
                                            this.a.m0(this.S.k);
                                        } else {
                                            this.a.m0(null);
                                            if (Build.VERSION.SDK_INT >= 29) {
                                                ImageReceiver imageReceiver = this.a;
                                                blendMode = BlendMode.SOFT_LIGHT;
                                                imageReceiver.Z(blendMode);
                                            } else {
                                                this.a.p1 = new PorterDuffColorFilter(u71Var.a.d.l1, PorterDuff.Mode.SRC_IN);
                                            }
                                        }
                                    } else {
                                        Rect e10 = org.telegram.ui.Components.p9.e(org.telegram.ui.Components.p9.d(i16), getMeasuredWidth(), getMeasuredHeight());
                                        this.L = new LinearGradient(e10.left, e10.top, e10.right, e10.bottom, new int[]{i10, i12}, (float[]) null, Shader.TileMode.CLAMP);
                                        this.S = null;
                                        this.a.m0(null);
                                    }
                                }
                                cb0Var = this.S;
                                if (cb0Var == null) {
                                    cb0Var.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                                    this.S.draw(canvas);
                                } else {
                                    paint.setShader(this.L);
                                    if (this.L == null) {
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
                        x71Var3 = u71Var.a.d;
                        if (x71Var3.b != 2) {
                        }
                        x71 x71Var52 = u71Var.a.d;
                        if (x71Var52.b != 2) {
                        }
                        int i172 = x71Var52.m1;
                        if (i12 != 0) {
                        }
                        cb0Var = this.S;
                        if (cb0Var == null) {
                        }
                        super.onDraw(canvas);
                        if (radialProgress2.i.q == 4) {
                        }
                    }
                }
                i12 = i11;
                x71Var2 = u71Var.a.d;
                if (x71Var2.b == 2) {
                }
                i14 = i13;
                x71Var3 = u71Var.a.d;
                if (x71Var3.b != 2) {
                }
                x71 x71Var522 = u71Var.a.d;
                if (x71Var522.b != 2) {
                }
                int i1722 = x71Var522.m1;
                if (i12 != 0) {
                }
                cb0Var = this.S;
                if (cb0Var == null) {
                }
                super.onDraw(canvas);
                if (radialProgress2.i.q == 4) {
                }
            }
        }
        i10 = i7;
        x71Var = u71Var.a.d;
        if (x71Var.b != 2) {
        }
        i12 = i11;
        x71Var2 = u71Var.a.d;
        if (x71Var2.b == 2) {
        }
        i14 = i13;
        x71Var3 = u71Var.a.d;
        if (x71Var3.b != 2) {
        }
        x71 x71Var5222 = u71Var.a.d;
        if (x71Var5222.b != 2) {
        }
        int i17222 = x71Var5222.m1;
        if (i12 != 0) {
        }
        cb0Var = this.S;
        if (cb0Var == null) {
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
        this.J = tL_wallPaper;
        if (tL_wallPaper != null) {
            g(1, 0L, tL_wallPaper, "100_100", null, "png", gc.c(org.telegram.messenger.w7.w(tL_wallPaper.document.thumbs, org.telegram.messenger.g0.L(100.0f), false, null, false), tL_wallPaper.document), null);
        } else {
            setImageDrawable(null);
        }
        w(false);
    }

    public final void v(Object obj, boolean z10, boolean z11) {
        File A;
        String name;
        int i7 = this.K;
        RadialProgress2 radialProgress2 = this.I;
        boolean z12 = obj instanceof TLRPC.TL_wallPaper;
        if (!z12 && !(obj instanceof jf)) {
            radialProgress2.setIcon(6, z10, z11);
            return;
        }
        if (z12) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            name = org.telegram.messenger.w7.r(null, tL_wallPaper.document);
            if (TextUtils.isEmpty(name)) {
                return;
            }
            org.telegram.messenger.w7.G(i7);
            A = org.telegram.messenger.w7.J(tL_wallPaper.document, null, true, true);
        } else {
            jf jfVar = (jf) obj;
            TLRPC.Photo photo = jfVar.K;
            if (photo != null) {
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, this.V, true, null, false);
                org.telegram.messenger.w7.G(i7);
                File J = org.telegram.messenger.w7.J(w10, null, true, true);
                name = org.telegram.messenger.w7.r(null, w10);
                A = J;
            } else {
                A = fc.A(jfVar.C);
                name = A.getName();
            }
            if (TextUtils.isEmpty(name)) {
                return;
            }
        }
        if (A.exists()) {
            org.telegram.messenger.a6.q(i7).v(this);
            radialProgress2.p(z11, 1.0f);
            radialProgress2.setIcon(6, z10, z11);
            return;
        }
        org.telegram.messenger.a6.q(i7).a(name, null, this);
        org.telegram.messenger.w7.G(i7).S(name);
        Float w11 = fc.D().w(name);
        if (w11 != null) {
            radialProgress2.p(z11, w11.floatValue());
        } else {
            radialProgress2.p(z11, 0.0f);
        }
        radialProgress2.setIcon(10, z10, z11);
    }

    public final void w(boolean z10) {
        TLRPC.TL_wallPaper tL_wallPaper = this.U.a.d.Y0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.J;
        if (!(tL_wallPaper2 == null && tL_wallPaper == null) && (tL_wallPaper == null || tL_wallPaper2 == null || tL_wallPaper2.id != tL_wallPaper.id)) {
            this.I.setIcon(4, false, z10);
        } else {
            v(tL_wallPaper, false, z10);
        }
        super.invalidate();
    }

    @Override // org.telegram.messenger.y5
    public final void o(long j3, long j10) {
    }
}
