package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class oo extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oo(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        Runnable runnable;
        switch (this.a) {
            case 0:
                ro roVar = (ro) this.b;
                if (i10 == -1) {
                    if (roVar.e0(true)) {
                        roVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    roVar.j0();
                    break;
                }
                break;
            case 1:
                fp fpVar = (fp) this.b;
                if (i10 == -1) {
                    fpVar.finishFragment();
                    break;
                } else if (i10 == 1) {
                    org.telegram.ui.Components.qr qrVar = fpVar.r;
                    if (qrVar == null || qrVar.c <= 0.0f) {
                        fpVar.Y();
                        break;
                    }
                }
                break;
            case 2:
                if (i10 == -1) {
                    ((rp) this.b).finishFragment();
                    break;
                }
                break;
            case 3:
                if (i10 == -1) {
                    ((yp) this.b).finishFragment();
                    break;
                }
                break;
            case 4:
                kq kqVar = (kq) this.b;
                if (i10 == -1) {
                    if (kqVar.m0(true)) {
                        kqVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    kqVar.r0(true);
                    break;
                }
                break;
            case 5:
                pr prVar = (pr) this.b;
                if (i10 == -1) {
                    if (prVar.g0(true)) {
                        prVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    prVar.u0();
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.b;
                if (i10 == -1) {
                    j8Var.dismiss();
                    break;
                } else {
                    j8Var.t0(i10);
                    break;
                }
            case 7:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.bb) this.b).dismiss();
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Components.wi wiVar = (org.telegram.ui.Components.wi) this.b;
                if (i10 != -1) {
                    wiVar.y0.t(i10);
                    break;
                } else if (!wiVar.y0.i()) {
                    wiVar.dismiss();
                    break;
                }
                break;
            case 9:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.c40) this.b).finishFragment();
                    break;
                }
                break;
            case 10:
                if (i10 == -1 && (runnable = ((org.telegram.ui.Components.uf0) this.b).r) != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    break;
                }
                break;
            case 11:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.ah0) this.b).dismiss();
                    break;
                }
                break;
            case 12:
                ((org.telegram.ui.Components.uq0) this.b).onBackPressed();
                break;
            case 13:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.m61) this.b).finishFragment();
                    break;
                }
                break;
            case 14:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.voip.x0) this.b).b(false, false);
                    break;
                }
                break;
            case 15:
                if (i10 == -1) {
                    ((fi1) this.b).a(false, false);
                    break;
                }
                break;
            case 16:
                if (i10 == -1) {
                    ((wt) this.b).finishFragment();
                    break;
                }
                break;
            case 17:
                if (i10 == -1) {
                    ((DataAutoDownloadActivity) this.b).finishFragment();
                    break;
                }
                break;
            case 18:
                if (i10 == -1) {
                    ((DataSettingsActivity) this.b).finishFragment();
                    break;
                }
                break;
            case 19:
                if (i10 == -1) {
                    ((vu) this.b).finishFragment();
                    break;
                }
                break;
            case 20:
                if (i10 == -1) {
                    ((jv) this.b).finishFragment();
                    break;
                }
                break;
            case 21:
                if (i10 == -1) {
                    ((iz) this.b).finishFragment();
                    break;
                }
                break;
            case 22:
                yz yzVar = (yz) this.b;
                if (i10 == -1) {
                    if (yzVar.W(true)) {
                        yzVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    if (Math.abs(yzVar.T - 1.0f) < 0.1f) {
                        yzVar.c0();
                        break;
                    } else if (Math.abs(yzVar.T - 0.5f) < 0.1f) {
                        for (int i11 = 0; i11 < yzVar.a.getChildCount(); i11++) {
                            View childAt = yzVar.a.getChildAt(i11);
                            yzVar.a.getClass();
                            if (RecyclerView.R(childAt) == yzVar.L && (childAt instanceof org.telegram.ui.Components.a10)) {
                                int i12 = -yzVar.s;
                                yzVar.s = i12;
                                AndroidUtilities.shakeViewSpring(childAt, i12);
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
            case 23:
                b10 b10Var = (b10) this.b;
                if (i10 == -1) {
                    if (b10Var.h0(true)) {
                        b10Var.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    b10Var.q0();
                    break;
                }
                break;
            case 24:
                if (i10 == -1) {
                    ((FiltersSetupActivity) this.b).finishFragment();
                    break;
                }
                break;
            case 25:
                if (i10 == -1) {
                    ((m20) this.b).finishFragment();
                    break;
                }
                break;
            case 26:
                z60 z60Var = (z60) this.b;
                if (i10 == -1) {
                    if (z60Var.f0(true)) {
                        z60Var.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    z60Var.o0();
                    break;
                }
                break;
            case 27:
                if (i10 == -1) {
                    ((g70) this.b).finishFragment();
                    break;
                }
                break;
            case 28:
                if (i10 == -1) {
                    ((i70) this.b).finishFragment();
                    break;
                }
                break;
            default:
                if (i10 == -1) {
                    ((o70) this.b).finishFragment();
                    break;
                }
                break;
        }
    }
}
