package ci;

import android.animation.ValueAnimator;
import android.content.Context;
import android.opengl.Matrix;
import java.util.Arrays;
import org.telegram.messenger.bd;
import org.telegram.messenger.hs;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.mv;
import org.telegram.ui.uw;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d1(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03a3  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        boolean z11;
        char c2;
        char c10;
        int i3;
        char c11;
        int i10 = this.a;
        boolean z12 = true;
        int i11 = 0;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((p1) obj).onBackPressed();
                break;
            case 1:
                org.telegram.ui.Wallet.e5 e5Var = (org.telegram.ui.Wallet.e5) ((k6) obj);
                org.telegram.ui.Wallet.b8 b8Var = e5Var.c.k0;
                if (b8Var != null) {
                    TL_wallet.nftItem nftitem = e5Var.b;
                    if (b8Var.A()) {
                        b8Var.c0(b8Var.v(nftitem));
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.Wallet.f5 f5Var = (org.telegram.ui.Wallet.f5) ((j6) obj);
                org.telegram.ui.Wallet.b8 b8Var2 = f5Var.b.k0;
                if (b8Var2 != null) {
                    b8Var2.b0(f5Var.a);
                    break;
                }
                break;
            case 3:
                h5 h5Var = (h5) obj;
                h5Var.i0 = false;
                h5Var.k0 = false;
                h5Var.a(h5Var.a0, h5Var.b0, h5Var.c0, h5Var.d0);
                break;
            case 4:
                ((x4) obj).invalidateSelf();
                break;
            case 5:
                b5 b5Var = (b5) obj;
                a5 a5Var = b5Var.I;
                if (a5Var == null) {
                    char c12 = 2;
                    z10 = true;
                    if (Math.abs(b5Var.d) <= 1.0E-4f && Math.abs(b5Var.e) <= 1.0E-4f) {
                        z11 = false;
                        c2 = c12;
                        if (b5Var.H == null ? z10 : z11) {
                            for (int i12 = 0; i12 < 6; i12++) {
                                Matrix.multiplyMV(b5Var.n, 0, b5Var.c, 0, b5Var.h[i12], 0);
                                b5Var.r[i12] = b5Var.n[c2];
                            }
                            Arrays.sort(b5Var.s, new y4(b5Var, i11));
                            b5Var.invalidate();
                        }
                        if (!b5Var.isAttachedToWindow()) {
                            org.telegram.messenger.g0.i3(b5Var.J, 16L);
                            break;
                        }
                    } else {
                        b5Var.a();
                        c10 = c12;
                    }
                } else {
                    b5 b5Var2 = a5Var.a;
                    float[] fArr = a5Var.h;
                    if (!a5Var.e && (i3 = a5Var.c) != 0) {
                        if (a5Var.l) {
                            b5Var2.a();
                        } else {
                            int c13 = o1.g.c(((z4) a5Var.b.get(i3 - 1)).a);
                            if (c13 == 1 || c13 == 2) {
                                char c14 = 2;
                                z10 = true;
                                b5Var2.a();
                                int i13 = a5Var.f - 1;
                                a5Var.f = i13;
                                c10 = c14;
                                if (i13 <= 0) {
                                    a5Var.b();
                                    c10 = c14;
                                }
                            } else if (c13 == 3) {
                                float pow = 1.0f - ((float) Math.pow(1.0f - (1.0f - (a5Var.f / a5Var.g)), 3.0d));
                                float f10 = 1.0f - pow;
                                if (Math.abs(a5Var.j * f10) > 1.0E-4f || Math.abs(a5Var.k * f10) > 1.0E-4f) {
                                    float[] fArr2 = new float[16];
                                    c11 = 2;
                                    float f11 = a5Var.j * f10 * 0.96f;
                                    b5Var2.getClass();
                                    b5.b(1.0f, 0.0f, f11, fArr2);
                                    b5Var2.getClass();
                                    b5.d(fArr2, fArr, fArr);
                                    float f12 = a5Var.k * f10 * 0.96f;
                                    b5Var2.getClass();
                                    b5.b(0.0f, 1.0f, f12, fArr2);
                                    b5.d(fArr2, fArr, fArr);
                                } else {
                                    c11 = 2;
                                }
                                float[] fArr3 = a5Var.i;
                                float[] fArr4 = b5Var2.c;
                                int i14 = 0;
                                while (i14 < 16) {
                                    float f13 = fArr[i14];
                                    fArr4[i14] = com.google.android.recaptcha.internal.a.y(fArr3[i14], f13, pow, f13);
                                    i14++;
                                    z12 = z12;
                                }
                                z10 = z12;
                                float f14 = fArr4[0];
                                float f15 = fArr4[z10 ? 1 : 0];
                                float f16 = fArr4[c11];
                                float[] fArr5 = new float[3];
                                fArr5[0] = f14;
                                fArr5[z10 ? 1 : 0] = f15;
                                fArr5[c11] = f16;
                                float f17 = fArr4[4];
                                float f18 = fArr4[5];
                                float f19 = fArr4[6];
                                float[] fArr6 = new float[3];
                                fArr6[0] = f17;
                                fArr6[z10 ? 1 : 0] = f18;
                                fArr6[c11] = f19;
                                float[] fArr7 = new float[3];
                                b5.e(fArr5);
                                b5.c(fArr5, fArr6, fArr7);
                                b5.e(fArr7);
                                b5.c(fArr7, fArr5, fArr6);
                                fArr4[0] = fArr5[0];
                                fArr4[z10 ? 1 : 0] = fArr5[z10 ? 1 : 0];
                                fArr4[c11] = fArr5[c11];
                                fArr4[4] = fArr6[0];
                                fArr4[5] = fArr6[z10 ? 1 : 0];
                                fArr4[6] = fArr6[c11];
                                fArr4[8] = fArr7[0];
                                fArr4[9] = fArr7[z10 ? 1 : 0];
                                fArr4[10] = fArr7[c11];
                                int i15 = a5Var.f - 1;
                                a5Var.f = i15;
                                c10 = c11;
                                if (i15 <= 0) {
                                    System.arraycopy(a5Var.i, 0, b5Var2.c, 0, 16);
                                    b5Var2.d = 0.0f;
                                    b5Var2.e = 0.0f;
                                    a5Var.b();
                                    c10 = c11;
                                }
                            }
                        }
                    }
                    c10 = 2;
                    z10 = true;
                }
                z11 = z10 ? 1 : 0;
                c2 = c10;
                if (b5Var.H == null ? z10 : z11) {
                }
                if (!b5Var.isAttachedToWindow()) {
                }
                break;
            case 6:
                ((c5) obj).invalidate();
                break;
            case 7:
                ((g5) obj).invalidateSelf();
                break;
            case 8:
                f6 f6Var = (f6) obj;
                d1 d1Var = f6Var.m0;
                org.telegram.ui.Components.k9[] k9VarArr = f6Var.d;
                if (!k9VarArr[2 - f6Var.v0].getImageReceiver().J()) {
                    org.telegram.messenger.g0.r(d1Var);
                    org.telegram.messenger.g0.i3(d1Var, 150L);
                    break;
                } else {
                    k5 k5Var = f6Var.b0;
                    if (k5Var != null && k5Var.c == 1 && f6Var.isAttachedToWindow()) {
                        org.telegram.messenger.g0.r(d1Var);
                        ValueAnimator valueAnimator = f6Var.l0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            f6Var.l0 = null;
                        }
                        int i16 = 1 - f6Var.v0;
                        f6Var.v0 = i16;
                        ch0 B = k9VarArr[2 - i16].getImageReceiver().B();
                        ch0 B2 = k9VarArr[f6Var.v0 + 1].getImageReceiver().B();
                        if (B2 != null && B != null) {
                            B2.T(false, B.t());
                        }
                        f6Var.d0.c();
                        int i17 = f6Var.v0 + 1;
                        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = f6Var.c0;
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) f6Var.f0.c();
                        stargiftattributebackdropArr[i17] = stargiftattributebackdrop;
                        f6Var.e(i17, stargiftattributebackdrop);
                        f6Var.g(1, (TL_stars.starGiftAttributePattern) f6Var.e0.c(), true);
                        f6Var.a();
                        float f20 = f6Var.v0;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f20, f20);
                        f6Var.l0 = ofFloat;
                        ofFloat.addUpdateListener(new b6(f6Var, 2));
                        f6Var.l0.addListener(new e6(f6Var));
                        f6Var.l0.setDuration(320L);
                        f6Var.l0.setInterpolator(xq.h);
                        f6Var.l0.start();
                        break;
                    }
                }
                break;
            case 9:
                wb wbVar = (wb) obj;
                if (wbVar.V != null && wbVar.b0 != -1) {
                    wbVar.n1("POSTED_ALIGN");
                    wbVar.V.a();
                    break;
                }
                break;
            case 10:
                ((wg.m) obj).setPaused(true);
                break;
            case 11:
                org.telegram.messenger.g0.K3((EditTextBoldCursor) obj);
                break;
            case 12:
                ((a1[]) obj)[0].dismiss();
                break;
            case 13:
                sf.c.t(((mb) obj).getContext(), bd.M0(2131744976, null));
                break;
            case 14:
                sf.c.t(((nb) obj).getContext(), bd.M0(2131744976, null));
                break;
            case 15:
                dh.r rVar = (dh.r) ((android.support.v4.media.c) obj).b;
                dh.q qVar = rVar.b;
                if (qVar != null) {
                    qVar.d(true);
                }
                rVar.a.N7(true);
                break;
            case 16:
                ((ValueAnimator) obj).start();
                break;
            case 17:
                org.telegram.ui.ActionBar.d2 d2Var = ((dh.v) obj).h2.r;
                if (d2Var instanceof wm) {
                    d2Var.showDialog(new vg.v0(d2Var, 11, false));
                    break;
                } else {
                    org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        Q.showDialog(new vg.v0(d2Var, 11, false));
                        break;
                    }
                }
                break;
            case 18:
                b4.n nVar = (b4.n) obj;
                ((Context) nVar.b).unregisterReceiver((e2.a) nVar.c);
                break;
            case 19:
                e2.a aVar = (e2.a) obj;
                if (aVar.c.a) {
                    aVar.a.a.C1(3, false);
                    break;
                }
                break;
            case 20:
                uw uwVar = ((mv) obj).P0;
                if (!uwVar.M || !uwVar.j4().I()) {
                    uwVar.J4(true, true);
                    break;
                } else {
                    uwVar.F0.h();
                    break;
                }
                break;
            case 21:
                ((ei.e1) obj).a.t(false);
                break;
            case 22:
                ei.g1 g1Var = ((ei.f1) obj).a;
                hs.f(g1Var.e).k(hs.G2, Long.valueOf(g1Var.g()));
                break;
            case 23:
                ei.n1 n1Var = (ei.n1) obj;
                n1Var.I = false;
                n1Var.j(false);
                n1Var.U = false;
                break;
            case 24:
                ((ei.h3) obj).a.O0();
                break;
            case 25:
                ei.j4 j4Var = ((ei.m3) obj).y;
                ei.c4 c4Var = j4Var.A1;
                if (c4Var != null) {
                    if (!j4Var.D1 && !j4Var.E1 && !j4Var.F1) {
                        ei.r9 r9Var = ((ei.i9) c4Var).d;
                        if (!r9Var.o0.getCurrentPeerView().b1(true) && !r9Var.o0.E(true)) {
                            r9Var.D(true);
                            break;
                        }
                    } else if (j4Var.y1.e) {
                        ((ei.q9) j4Var.w2.c).loopBack();
                        break;
                    } else {
                        j4Var.G0 = 0L;
                        break;
                    }
                }
                break;
            case 26:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                    break;
                }
                break;
            case 27:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                int i18 = ProfileStoriesView.t0;
                profileStoriesView.getClass();
                org.telegram.messenger.g0.c4(profileStoriesView);
                break;
            case 28:
                ei.k5.a(((ei.g5) obj).d);
                break;
            default:
                ei.w5 w5Var = (ei.w5) obj;
                if (w5Var.isShowing()) {
                    w5Var.J0(true);
                    break;
                }
                break;
        }
    }
}
