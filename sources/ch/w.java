package ch;

import android.animation.ValueAnimator;
import android.content.Context;
import android.opengl.Matrix;
import di.a6;
import di.b5;
import di.b6;
import di.bb;
import di.cb;
import di.i1;
import di.lb;
import di.o4;
import di.p4;
import di.q4;
import di.r4;
import di.s4;
import di.s5;
import di.t4;
import di.v0;
import di.v5;
import di.w5;
import di.x4;
import di.y4;
import fi.b1;
import java.util.Arrays;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.iu0;
import org.telegram.ui.Components.p20;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c8;
import org.telegram.ui.Wallet.g5;
import org.telegram.ui.Wallet.h5;
import org.telegram.ui.an;
import org.telegram.ui.qv;
import org.telegram.ui.yw;
import ug.x0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c6  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        boolean z11;
        char c10;
        char c11;
        int i7;
        char c12;
        int i10 = this.a;
        boolean z12 = true;
        Object obj = this.b;
        switch (i10) {
            case 0:
                e2 e2Var = ((x) obj).h2.r;
                if (e2Var instanceof an) {
                    e2Var.showDialog(new x0(e2Var, 11, false));
                    break;
                } else {
                    e2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        Q.showDialog(new x0(e2Var, 11, false));
                        break;
                    }
                }
                break;
            case 1:
                ((ci.s) obj).e();
                break;
            case 2:
                ((d3.e) obj).h.s();
                break;
            case 3:
                d3.t tVar = (d3.t) obj;
                tVar.m--;
                break;
            case 4:
                r9.a.postVsyncCallback((d3.b0) obj);
                break;
            case 5:
                di.b bVar = (di.b) obj;
                bVar.getClass();
                new cb(bVar.getContext(), bVar.b).show();
                break;
            case 6:
                di.s sVar = (di.s) obj;
                if (sVar.isAttachedToWindow() && !sVar.c.canScrollVertically(1)) {
                    sVar.a();
                    break;
                }
                break;
            case 7:
                new iu0(((p20) obj).getContext()).show();
                break;
            case 8:
                org.telegram.messenger.g0.J3(((di.p0) obj).a2);
                break;
            case 9:
                org.telegram.messenger.g0.J3(((di.s0) obj).r1);
                break;
            case 10:
                org.telegram.messenger.g0.J3(((v0) obj).n1);
                break;
            case 11:
                ((i1) obj).onBackPressed();
                break;
            case 12:
                g5 g5Var = (g5) ((b6) obj);
                c8 c8Var = g5Var.c.k0;
                if (c8Var != null) {
                    TL_wallet.nftItem nftitem = g5Var.b;
                    if (c8Var.A()) {
                        c8Var.c0(c8Var.v(nftitem));
                        break;
                    }
                }
                break;
            case 13:
                h5 h5Var = (h5) ((a6) obj);
                c8 c8Var2 = h5Var.b.k0;
                if (c8Var2 != null) {
                    c8Var2.b0(h5Var.a);
                    break;
                }
                break;
            case 14:
                y4 y4Var = (y4) obj;
                y4Var.i0 = false;
                y4Var.k0 = false;
                y4Var.a(y4Var.a0, y4Var.b0, y4Var.c0, y4Var.d0);
                break;
            case 15:
                ((o4) obj).invalidateSelf();
                break;
            case 16:
                s4 s4Var = (s4) obj;
                r4 r4Var = s4Var.I;
                if (r4Var == null) {
                    char c13 = 2;
                    z10 = true;
                    if (Math.abs(s4Var.d) <= 1.0E-4f && Math.abs(s4Var.e) <= 1.0E-4f) {
                        z11 = false;
                        c10 = c13;
                        if (s4Var.H == null ? z10 : z11) {
                            for (int i11 = 0; i11 < 6; i11++) {
                                Matrix.multiplyMV(s4Var.n, 0, s4Var.c, 0, s4Var.h[i11], 0);
                                s4Var.r[i11] = s4Var.n[c10];
                            }
                            Arrays.sort(s4Var.s, new p4(s4Var, 0));
                            s4Var.invalidate();
                        }
                        if (!s4Var.isAttachedToWindow()) {
                            org.telegram.messenger.g0.i3(s4Var.J, 16L);
                            break;
                        }
                    } else {
                        s4Var.a();
                        c11 = c13;
                    }
                } else {
                    s4 s4Var2 = r4Var.a;
                    float[] fArr = r4Var.h;
                    if (!r4Var.e && (i7 = r4Var.c) != 0) {
                        if (r4Var.l) {
                            s4Var2.a();
                        } else {
                            int c14 = p1.g.c(((q4) r4Var.b.get(i7 - 1)).a);
                            if (c14 == 1 || c14 == 2) {
                                char c15 = 2;
                                z10 = true;
                                s4Var2.a();
                                int i12 = r4Var.f - 1;
                                r4Var.f = i12;
                                c11 = c15;
                                if (i12 <= 0) {
                                    r4Var.b();
                                    c11 = c15;
                                }
                            } else if (c14 == 3) {
                                float pow = 1.0f - ((float) Math.pow(1.0f - (1.0f - (r4Var.f / r4Var.g)), 3.0d));
                                float f10 = 1.0f - pow;
                                if (Math.abs(r4Var.j * f10) > 1.0E-4f || Math.abs(r4Var.k * f10) > 1.0E-4f) {
                                    float[] fArr2 = new float[16];
                                    c12 = 2;
                                    float f11 = r4Var.j * f10 * 0.96f;
                                    s4Var2.getClass();
                                    s4.b(1.0f, 0.0f, f11, fArr2);
                                    s4Var2.getClass();
                                    s4.d(fArr2, fArr, fArr);
                                    float f12 = r4Var.k * f10 * 0.96f;
                                    s4Var2.getClass();
                                    s4.b(0.0f, 1.0f, f12, fArr2);
                                    s4.d(fArr2, fArr, fArr);
                                } else {
                                    c12 = 2;
                                }
                                float[] fArr3 = r4Var.i;
                                float[] fArr4 = s4Var2.c;
                                int i13 = 0;
                                while (i13 < 16) {
                                    float f13 = fArr[i13];
                                    fArr4[i13] = com.google.android.gms.internal.vision.e2.z(fArr3[i13], f13, pow, f13);
                                    i13++;
                                    z12 = z12;
                                }
                                z10 = z12;
                                float f14 = fArr4[0];
                                float f15 = fArr4[z10 ? 1 : 0];
                                float f16 = fArr4[c12];
                                float[] fArr5 = new float[3];
                                fArr5[0] = f14;
                                fArr5[z10 ? 1 : 0] = f15;
                                fArr5[c12] = f16;
                                float f17 = fArr4[4];
                                float f18 = fArr4[5];
                                float f19 = fArr4[6];
                                float[] fArr6 = new float[3];
                                fArr6[0] = f17;
                                fArr6[z10 ? 1 : 0] = f18;
                                fArr6[c12] = f19;
                                float[] fArr7 = new float[3];
                                s4.e(fArr5);
                                s4.c(fArr5, fArr6, fArr7);
                                s4.e(fArr7);
                                s4.c(fArr7, fArr5, fArr6);
                                fArr4[0] = fArr5[0];
                                fArr4[z10 ? 1 : 0] = fArr5[z10 ? 1 : 0];
                                fArr4[c12] = fArr5[c12];
                                fArr4[4] = fArr6[0];
                                fArr4[5] = fArr6[z10 ? 1 : 0];
                                fArr4[6] = fArr6[c12];
                                fArr4[8] = fArr7[0];
                                fArr4[9] = fArr7[z10 ? 1 : 0];
                                fArr4[10] = fArr7[c12];
                                int i14 = r4Var.f - 1;
                                r4Var.f = i14;
                                c11 = c12;
                                if (i14 <= 0) {
                                    System.arraycopy(r4Var.i, 0, s4Var2.c, 0, 16);
                                    s4Var2.d = 0.0f;
                                    s4Var2.e = 0.0f;
                                    r4Var.b();
                                    c11 = c12;
                                }
                            }
                        }
                    }
                    c11 = 2;
                    z10 = true;
                }
                z11 = z10 ? 1 : 0;
                c10 = c11;
                if (s4Var.H == null ? z10 : z11) {
                }
                if (!s4Var.isAttachedToWindow()) {
                }
                break;
            case 17:
                ((t4) obj).invalidate();
                break;
            case 18:
                ((x4) obj).invalidateSelf();
                break;
            case 19:
                w5 w5Var = (w5) obj;
                w wVar = w5Var.m0;
                i9[] i9VarArr = w5Var.d;
                if (!i9VarArr[2 - w5Var.v0].getImageReceiver().J()) {
                    org.telegram.messenger.g0.r(wVar);
                    org.telegram.messenger.g0.i3(wVar, 150L);
                    break;
                } else {
                    b5 b5Var = w5Var.b0;
                    if (b5Var != null && b5Var.c == 1 && w5Var.isAttachedToWindow()) {
                        org.telegram.messenger.g0.r(wVar);
                        ValueAnimator valueAnimator = w5Var.l0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            w5Var.l0 = null;
                        }
                        int i15 = 1 - w5Var.v0;
                        w5Var.v0 = i15;
                        ch0 B = i9VarArr[2 - i15].getImageReceiver().B();
                        ch0 B2 = i9VarArr[w5Var.v0 + 1].getImageReceiver().B();
                        if (B2 != null && B != null) {
                            B2.T(false, B.t());
                        }
                        w5Var.d0.c();
                        int i16 = w5Var.v0 + 1;
                        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = w5Var.c0;
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) w5Var.f0.c();
                        stargiftattributebackdropArr[i16] = stargiftattributebackdrop;
                        w5Var.e(i16, stargiftattributebackdrop);
                        w5Var.g(1, (TL_stars.starGiftAttributePattern) w5Var.e0.c(), true);
                        w5Var.a();
                        float f20 = w5Var.v0;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f20, f20);
                        w5Var.l0 = ofFloat;
                        ofFloat.addUpdateListener(new s5(w5Var, 2));
                        w5Var.l0.addListener(new v5(w5Var));
                        w5Var.l0.setDuration(320L);
                        w5Var.l0.setInterpolator(er.h);
                        w5Var.l0.start();
                        break;
                    }
                }
                break;
            case 20:
                lb lbVar = (lb) obj;
                if (lbVar.V != null && lbVar.b0 != -1) {
                    lbVar.n1("POSTED_ALIGN");
                    lbVar.V.a();
                    break;
                }
                break;
            case 21:
                ((vg.m) obj).setPaused(true);
                break;
            case 22:
                org.telegram.messenger.g0.J3((EditTextBoldCursor) obj);
                break;
            case 23:
                ((v0[]) obj)[0].dismiss();
                break;
            case 24:
                vf.c.t(((bb) obj).getContext(), hd.M0(2131744966, null));
                break;
            case 25:
                vf.c.t(((cb) obj).getContext(), hd.M0(2131744966, null));
                break;
            case 26:
                ab.q qVar = (ab.q) obj;
                ((Context) qVar.b).unregisterReceiver((f2.a) qVar.c);
                break;
            case 27:
                f2.a aVar = (f2.a) obj;
                if (aVar.c.a) {
                    aVar.a.a.C1(3, false);
                    break;
                }
                break;
            case 28:
                yw ywVar = ((qv) obj).P0;
                if (!ywVar.M || !ywVar.j4().I()) {
                    ywVar.J4(true, true);
                    break;
                } else {
                    ywVar.F0.h();
                    break;
                }
                break;
            default:
                ((b1) obj).a.t(false);
                break;
        }
    }
}
