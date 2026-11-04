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
import org.telegram.messenger.ac;
import org.telegram.messenger.bf;
import org.telegram.messenger.zb;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.la0;
import org.telegram.ui.i71;
import org.telegram.ui.l71;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i5 extends org.telegram.ui.Components.k9 implements org.telegram.messenger.x5 {
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
    public la0 S;
    public int T;
    public i71 U;
    public int V;

    @Override // org.telegram.messenger.x5
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

    @Override // org.telegram.messenger.x5
    public final void M(String str) {
        this.I.p(true, 1.0f);
        TLRPC.TL_wallPaper tL_wallPaper = this.U.a.d.Y0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.J;
        if (!(tL_wallPaper2 == null && tL_wallPaper == null) && (tL_wallPaper == null || tL_wallPaper2 == null || tL_wallPaper2.id != tL_wallPaper.id)) {
            return;
        }
        v(tL_wallPaper2, false, true);
    }

    @Override // org.telegram.messenger.x5
    public int getObserverTag() {
        return this.T;
    }

    @Override // org.telegram.messenger.x5
    public final void i(long j10, long j11) {
        RadialProgress2 radialProgress2 = this.I;
        radialProgress2.p(true, Math.min(1.0f, j10 / j11));
        TLRPC.TL_wallPaper tL_wallPaper = this.U.a.d.Y0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.J;
        if ((!(tL_wallPaper2 == null && tL_wallPaper == null) && (tL_wallPaper == null || tL_wallPaper2 == null || tL_wallPaper2.id != tL_wallPaper.id)) || radialProgress2.i.q == 10) {
            return;
        }
        v(tL_wallPaper2, false, true);
    }

    @Override // org.telegram.ui.Components.k9, android.view.View
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
    @Override // org.telegram.ui.Components.k9, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int i3;
        int i10;
        l71 l71Var;
        int i11;
        int i12;
        l71 l71Var2;
        int i13;
        int i14;
        l71 l71Var3;
        int i15;
        la0 la0Var;
        BlendMode blendMode;
        RadialProgress2 radialProgress2 = this.I;
        RectF rectF = this.H;
        Paint paint = this.R;
        i71 i71Var = this.U;
        float f10 = i71Var.a.d.n1;
        this.a.Z(null);
        l71 l71Var4 = i71Var.a.d;
        if (l71Var4.b == 2) {
            i3 = l71Var4.b1;
        } else {
            int E0 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Be);
            i3 = (int) l71Var4.w.j;
            if (i3 == 0) {
                i10 = E0;
                l71Var = i71Var.a.d;
                if (l71Var.b != 2) {
                    i11 = l71Var.d1;
                } else {
                    int E02 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Ce);
                    i11 = (int) l71Var.w.k;
                    if (i11 == 0) {
                        i12 = E02;
                        l71Var2 = i71Var.a.d;
                        if (l71Var2.b == 2) {
                            i13 = l71Var2.e1;
                        } else {
                            int E03 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.De);
                            i13 = (int) l71Var2.w.l;
                            if (i13 == 0) {
                                i14 = E03;
                                l71Var3 = i71Var.a.d;
                                if (l71Var3.b != 2) {
                                    i15 = l71Var3.f1;
                                } else {
                                    int E04 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Ee);
                                    i15 = (int) l71Var3.w.m;
                                    if (i15 == 0) {
                                        i15 = E04;
                                    }
                                }
                                l71 l71Var5 = i71Var.a.d;
                                int i16 = l71Var5.b != 2 ? l71Var5.j1 : l71Var5.w.n;
                                int i17 = l71Var5.m1;
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
                                        la0 la0Var2 = this.S;
                                        if (la0Var2 != null) {
                                            la0Var2.o(i10, i12, i14, i15, 0, false);
                                        } else {
                                            int i18 = i10;
                                            la0 la0Var3 = new la0(true, i18, i12, i14, i15);
                                            i10 = i18;
                                            this.S = la0Var3;
                                            la0Var3.v(org.telegram.messenger.g0.L(6.0f));
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
                                                this.a.p1 = new PorterDuffColorFilter(i71Var.a.d.l1, PorterDuff.Mode.SRC_IN);
                                            }
                                        }
                                    } else {
                                        Rect e10 = org.telegram.ui.Components.j9.e(org.telegram.ui.Components.j9.d(i16), getMeasuredWidth(), getMeasuredHeight());
                                        this.L = new LinearGradient(e10.left, e10.top, e10.right, e10.bottom, new int[]{i10, i12}, (float[]) null, Shader.TileMode.CLAMP);
                                        this.S = null;
                                        this.a.m0(null);
                                    }
                                }
                                la0Var = this.S;
                                if (la0Var == null) {
                                    la0Var.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
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
                        l71Var3 = i71Var.a.d;
                        if (l71Var3.b != 2) {
                        }
                        l71 l71Var52 = i71Var.a.d;
                        if (l71Var52.b != 2) {
                        }
                        int i172 = l71Var52.m1;
                        if (i12 != 0) {
                        }
                        la0Var = this.S;
                        if (la0Var == null) {
                        }
                        super.onDraw(canvas);
                        if (radialProgress2.i.q == 4) {
                        }
                    }
                }
                i12 = i11;
                l71Var2 = i71Var.a.d;
                if (l71Var2.b == 2) {
                }
                i14 = i13;
                l71Var3 = i71Var.a.d;
                if (l71Var3.b != 2) {
                }
                l71 l71Var522 = i71Var.a.d;
                if (l71Var522.b != 2) {
                }
                int i1722 = l71Var522.m1;
                if (i12 != 0) {
                }
                la0Var = this.S;
                if (la0Var == null) {
                }
                super.onDraw(canvas);
                if (radialProgress2.i.q == 4) {
                }
            }
        }
        i10 = i3;
        l71Var = i71Var.a.d;
        if (l71Var.b != 2) {
        }
        i12 = i11;
        l71Var2 = i71Var.a.d;
        if (l71Var2.b == 2) {
        }
        i14 = i13;
        l71Var3 = i71Var.a.d;
        if (l71Var3.b != 2) {
        }
        l71 l71Var5222 = i71Var.a.d;
        if (l71Var5222.b != 2) {
        }
        int i17222 = l71Var5222.m1;
        if (i12 != 0) {
        }
        la0Var = this.S;
        if (la0Var == null) {
        }
        super.onDraw(canvas);
        if (radialProgress2.i.q == 4) {
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(100.0f), org.telegram.messenger.g0.L(100.0f));
    }

    public void setPattern(TLRPC.TL_wallPaper tL_wallPaper) {
        this.J = tL_wallPaper;
        if (tL_wallPaper != null) {
            g(1, 0L, tL_wallPaper, "100_100", null, "png", ac.c(org.telegram.messenger.w7.w(tL_wallPaper.document.thumbs, org.telegram.messenger.g0.L(100.0f), false, null, false), tL_wallPaper.document), null);
        } else {
            setImageDrawable(null);
        }
        w(false);
    }

    public final void v(Object obj, boolean z10, boolean z11) {
        File A;
        String name;
        int i3 = this.K;
        RadialProgress2 radialProgress2 = this.I;
        boolean z12 = obj instanceof TLRPC.TL_wallPaper;
        if (!z12 && !(obj instanceof bf)) {
            radialProgress2.setIcon(6, z10, z11);
            return;
        }
        if (z12) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            name = org.telegram.messenger.w7.r(null, tL_wallPaper.document);
            if (TextUtils.isEmpty(name)) {
                return;
            }
            org.telegram.messenger.w7.G(i3);
            A = org.telegram.messenger.w7.K(tL_wallPaper.document, null, true, true);
        } else {
            bf bfVar = (bf) obj;
            TLRPC.Photo photo = bfVar.K;
            if (photo != null) {
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, this.V, true, null, false);
                org.telegram.messenger.w7.G(i3);
                File K = org.telegram.messenger.w7.K(w10, null, true, true);
                name = org.telegram.messenger.w7.r(null, w10);
                A = K;
            } else {
                A = zb.A(bfVar.C);
                name = A.getName();
            }
            if (TextUtils.isEmpty(name)) {
                return;
            }
        }
        if (A.exists()) {
            org.telegram.messenger.z5.q(i3).v(this);
            radialProgress2.p(z11, 1.0f);
            radialProgress2.setIcon(6, z10, z11);
            return;
        }
        org.telegram.messenger.z5.q(i3).a(name, null, this);
        org.telegram.messenger.w7.G(i3).T(name);
        Float w11 = zb.D().w(name);
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

    @Override // org.telegram.messenger.x5
    public final void o(long j10, long j11) {
    }
}
