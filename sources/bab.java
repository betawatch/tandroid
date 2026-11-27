// default package

import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bab implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sbb b;

    public /* synthetic */ bab(sbb sbbVar, byte b) {
        this.a = b;
        this.b = sbbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        hbb hbbVar;
        rbb rbbVar;
        byte b = this.a;
        byte b2 = 3;
        byte b3 = 0;
        sbb sbbVar = this.b;
        switch (b) {
            case 0:
                sbbVar.p();
                break;
            case 1:
                sbbVar.getClass();
                sbbVar.d(1.0f, true, new bab(sbbVar, b2));
                sbbVar.c1.b(true, true);
                break;
            case 2:
                c8b c8bVar = sbbVar.L1;
                if (c8bVar != null) {
                    c8bVar.y0 = !c8bVar.y0;
                    hbb hbbVar2 = sbbVar.Y0;
                    if (hbbVar2 != null) {
                        hbbVar2.u(c8bVar);
                    }
                    wab wabVar = sbbVar.w1;
                    if (wabVar != null && wabVar.B0 != null) {
                        while (b3 < sbbVar.w1.B0.getChildCount()) {
                            View childAt = sbbVar.w1.B0.getChildAt(b3);
                            if (childAt instanceof b47) {
                                ((b47) childAt).setupTheme(sbbVar.L1);
                            }
                            b3++;
                        }
                    }
                    sbbVar.n0(true);
                    break;
                }
                break;
            case 3:
            case 22:
                sbbVar.N();
                break;
            case 4:
                sbbVar.o(true);
                break;
            case 5:
                sbbVar.Z(false);
                break;
            case 6:
                sbbVar.B0.setCameraThumb(sbbVar.y());
                xab xabVar = sbbVar.C0;
                if (xabVar != null) {
                    xabVar.destroy(true, null);
                    hl.B2(sbbVar.C0);
                    gbb gbbVar = sbbVar.B0;
                    if (gbbVar != null) {
                        gbbVar.setCameraView(null);
                    }
                    sbbVar.C0 = null;
                    break;
                }
                break;
            case 7:
                sbbVar.B0.setCameraThumb(sbbVar.y());
                break;
            case 8:
                if (sbbVar.g0 == 1) {
                    sbbVar.k0(2, false, true);
                    break;
                }
                break;
            case 9:
                oab oabVar = sbbVar.e1;
                if (oabVar != null) {
                    int i = -(hl.L(24.0f) + sbbVar.d1.getEditTextHeight());
                    oabVar.setTranslationY(i - (sbbVar.a1 != null ? r8.getContentHeight() - hl.L(5.0f) : 0));
                    break;
                }
                break;
            case 10:
                gbb gbbVar2 = sbbVar.B0;
                if (gbbVar2 != null) {
                    gbbVar2.c.c(sbbVar.E0.E ? (my8) sbbVar.D0.d : null);
                    break;
                }
                break;
            case 11:
                sbbVar.l0(true);
                break;
            case 12:
                sbbVar.q();
                break;
            case 13:
                ibb ibbVar = sbbVar.d1;
                if (ibbVar != null) {
                    ibbVar.m();
                    break;
                }
                break;
            case 14:
                if (sbbVar.h0 == -1 && sbbVar.g0 == 1) {
                    ibb ibbVar2 = sbbVar.d1;
                    if (!ibbVar2.p0 && !ibbVar2.O1) {
                        ksb ksbVar = sbbVar.a1;
                        if (!ksbVar.Q) {
                            oab oabVar2 = sbbVar.e1;
                            if (!oabVar2.N) {
                                sbbVar.k0(0, false, true);
                                wab wabVar2 = sbbVar.w1;
                                if (wabVar2 != null) {
                                    wabVar2.Q0(2);
                                    wabVar2.Z1 = true;
                                    wabVar2.l0(true);
                                    sbbVar.w1.w0 = true;
                                    break;
                                }
                            } else {
                                oabVar2.c(false, true);
                                break;
                            }
                        } else {
                            ksbVar.Q = false;
                            if (ksbVar.F && ksbVar.h == null) {
                                ksbVar.H = true;
                                esb esbVar = ksbVar.a;
                                if (esbVar != null) {
                                    esbVar.e1(true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 15:
                sbbVar.O1 = true;
                sbbVar.c1.setShareEnabled(false);
                fq3 fq3Var = sbbVar.f1;
                fq3Var.getClass();
                fq3Var.c(ob6.N0("VideoConvertFail"));
                break;
            case 16:
                sbbVar.B0.setCameraThumb(sbbVar.y());
                break;
            case 17:
                rbb rbbVar2 = sbbVar.n;
                x53 x53Var = sbbVar.a;
                new d31(rbbVar2, x53Var).Q(R.raw.voip_invite, 36, hl.N2(ob6.M0(2131744235, null), aob.Xc, 0, new bab(sbbVar, (byte) 26), x53Var)).k(true);
                break;
            case 18:
                sbbVar.d(1.0f, true, new bab(sbbVar, (byte) 22));
                break;
            case 19:
                w9b w9bVar = sbbVar.r0;
                if (w9bVar != null) {
                    w9bVar.dismiss();
                }
                sbbVar.I(2, true);
                break;
            case 20:
                sbbVar.k0(-1, false, true);
                break;
            case 21:
                sbbVar.k0(-1, false, true);
                break;
            case 23:
                if (!sbbVar.L1.b0 && sbbVar.r0 != null && (hbbVar = sbbVar.Y0) != null) {
                    hbbVar.g(new dab(sbbVar, b3), hbbVar, sbbVar.x1, sbbVar.A1);
                }
                sbbVar.I(1, true);
                break;
            case 24:
                sbbVar.i0(false);
                sbbVar.f2 = null;
                break;
            case 25:
                sbbVar.i0(false);
                sbbVar.f2 = null;
                break;
            case 26:
                sbbVar.S();
                break;
            case 27:
                WindowManager windowManager = sbbVar.f;
                if (windowManager != null && (rbbVar = sbbVar.n) != null && rbbVar.getParent() != null) {
                    windowManager.removeView(sbbVar.n);
                    break;
                }
                break;
            case 28:
                sbbVar.c(false);
                sbbVar.n2 = null;
                break;
            default:
                if (sbbVar.u2 >= 0) {
                    uc7.e1().edit().putFloat("frontflash_warmth", sbbVar.s.o).putFloat("frontflash_intensity", sbbVar.s.p).apply();
                }
                sbbVar.s.e(0.0f, 240L, null);
                sbbVar.F0.setSelected(false);
                break;
        }
    }
}
