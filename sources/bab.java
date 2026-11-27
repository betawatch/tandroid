// default package

import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class bab implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rbb b;

    public /* synthetic */ bab(rbb rbbVar, byte b) {
        this.a = b;
        this.b = rbbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        gbb gbbVar;
        qbb qbbVar;
        byte b = this.a;
        byte b2 = 3;
        byte b3 = 0;
        rbb rbbVar = this.b;
        switch (b) {
            case 0:
                rbbVar.p();
                break;
            case 1:
                rbbVar.getClass();
                rbbVar.d(1.0f, true, new bab(rbbVar, b2));
                rbbVar.c1.b(true, true);
                break;
            case 2:
                c8b c8bVar = rbbVar.L1;
                if (c8bVar != null) {
                    c8bVar.y0 = !c8bVar.y0;
                    gbb gbbVar2 = rbbVar.Y0;
                    if (gbbVar2 != null) {
                        gbbVar2.u(c8bVar);
                    }
                    vab vabVar = rbbVar.w1;
                    if (vabVar != null && vabVar.B0 != null) {
                        while (b3 < rbbVar.w1.B0.getChildCount()) {
                            View childAt = rbbVar.w1.B0.getChildAt(b3);
                            if (childAt instanceof b47) {
                                ((b47) childAt).setupTheme(rbbVar.L1);
                            }
                            b3++;
                        }
                    }
                    rbbVar.n0(true);
                    break;
                }
                break;
            case 3:
            case 22:
                rbbVar.N();
                break;
            case 4:
                rbbVar.o(true);
                break;
            case 5:
                rbbVar.Z(false);
                break;
            case 6:
                rbbVar.B0.setCameraThumb(rbbVar.y());
                wab wabVar = rbbVar.C0;
                if (wabVar != null) {
                    wabVar.destroy(true, null);
                    hl.B2(rbbVar.C0);
                    fbb fbbVar = rbbVar.B0;
                    if (fbbVar != null) {
                        fbbVar.setCameraView(null);
                    }
                    rbbVar.C0 = null;
                    break;
                }
                break;
            case 7:
                rbbVar.B0.setCameraThumb(rbbVar.y());
                break;
            case 8:
                if (rbbVar.g0 == 1) {
                    rbbVar.k0(2, false, true);
                    break;
                }
                break;
            case 9:
                nab nabVar = rbbVar.e1;
                if (nabVar != null) {
                    int i = -(hl.L(24.0f) + rbbVar.d1.getEditTextHeight());
                    nabVar.setTranslationY(i - (rbbVar.a1 != null ? r8.getContentHeight() - hl.L(5.0f) : 0));
                    break;
                }
                break;
            case 10:
                fbb fbbVar2 = rbbVar.B0;
                if (fbbVar2 != null) {
                    fbbVar2.c.c(rbbVar.E0.E ? (my8) rbbVar.D0.d : null);
                    break;
                }
                break;
            case 11:
                rbbVar.l0(true);
                break;
            case 12:
                rbbVar.q();
                break;
            case 13:
                hbb hbbVar = rbbVar.d1;
                if (hbbVar != null) {
                    hbbVar.m();
                    break;
                }
                break;
            case 14:
                if (rbbVar.h0 == -1 && rbbVar.g0 == 1) {
                    hbb hbbVar2 = rbbVar.d1;
                    if (!hbbVar2.p0 && !hbbVar2.O1) {
                        ksb ksbVar = rbbVar.a1;
                        if (!ksbVar.Q) {
                            nab nabVar2 = rbbVar.e1;
                            if (!nabVar2.N) {
                                rbbVar.k0(0, false, true);
                                vab vabVar2 = rbbVar.w1;
                                if (vabVar2 != null) {
                                    vabVar2.Q0(2);
                                    vabVar2.Z1 = true;
                                    vabVar2.l0(true);
                                    rbbVar.w1.w0 = true;
                                    break;
                                }
                            } else {
                                nabVar2.c(false, true);
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
                rbbVar.O1 = true;
                rbbVar.c1.setShareEnabled(false);
                fq3 fq3Var = rbbVar.f1;
                fq3Var.getClass();
                fq3Var.c(ob6.N0("VideoConvertFail"));
                break;
            case 16:
                rbbVar.B0.setCameraThumb(rbbVar.y());
                break;
            case 17:
                qbb qbbVar2 = rbbVar.n;
                x53 x53Var = rbbVar.a;
                new d31(qbbVar2, x53Var).Q(R.raw.voip_invite, 36, hl.N2(ob6.M0(2131744235, null), aob.Xc, 0, new bab(rbbVar, (byte) 26), x53Var)).k(true);
                break;
            case 18:
                rbbVar.d(1.0f, true, new bab(rbbVar, (byte) 22));
                break;
            case 19:
                w9b w9bVar = rbbVar.r0;
                if (w9bVar != null) {
                    w9bVar.dismiss();
                }
                rbbVar.I(2, true);
                break;
            case 20:
                rbbVar.k0(-1, false, true);
                break;
            case 21:
                rbbVar.k0(-1, false, true);
                break;
            case 23:
                if (!rbbVar.L1.b0 && rbbVar.r0 != null && (gbbVar = rbbVar.Y0) != null) {
                    gbbVar.g(new dab(rbbVar, b3), gbbVar, rbbVar.x1, rbbVar.A1);
                }
                rbbVar.I(1, true);
                break;
            case 24:
                rbbVar.i0(false);
                rbbVar.f2 = null;
                break;
            case 25:
                rbbVar.i0(false);
                rbbVar.f2 = null;
                break;
            case 26:
                rbbVar.S();
                break;
            case 27:
                WindowManager windowManager = rbbVar.f;
                if (windowManager != null && (qbbVar = rbbVar.n) != null && qbbVar.getParent() != null) {
                    windowManager.removeView(rbbVar.n);
                    break;
                }
                break;
            case 28:
                rbbVar.c(false);
                rbbVar.n2 = null;
                break;
            default:
                if (rbbVar.u2 >= 0) {
                    uc7.e1().edit().putFloat("frontflash_warmth", rbbVar.s.o).putFloat("frontflash_intensity", rbbVar.s.p).apply();
                }
                rbbVar.s.e(0.0f, 240L, null);
                rbbVar.F0.setSelected(false);
                break;
        }
    }
}
