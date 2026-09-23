package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class po extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ po(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        Runnable runnable;
        switch (this.a) {
            case 0:
                so soVar = (so) this.b;
                if (i10 == -1) {
                    if (soVar.e0(true)) {
                        soVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    soVar.j0();
                    break;
                }
                break;
            case 1:
                gp gpVar = (gp) this.b;
                if (i10 == -1) {
                    gpVar.finishFragment();
                    break;
                } else if (i10 == 1) {
                    org.telegram.ui.Components.qr qrVar = gpVar.r;
                    if (qrVar == null || qrVar.c <= 0.0f) {
                        gpVar.Y();
                        break;
                    }
                }
                break;
            case 2:
                if (i10 == -1) {
                    ((sp) this.b).finishFragment();
                    break;
                }
                break;
            case 3:
                if (i10 == -1) {
                    ((zp) this.b).finishFragment();
                    break;
                }
                break;
            case 4:
                lq lqVar = (lq) this.b;
                if (i10 == -1) {
                    if (lqVar.m0(true)) {
                        lqVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    lqVar.r0(true);
                    break;
                }
                break;
            case 5:
                qr qrVar2 = (qr) this.b;
                if (i10 == -1) {
                    if (qrVar2.g0(true)) {
                        qrVar2.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    qrVar2.u0();
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
                if (i10 == -1 && (runnable = ((org.telegram.ui.Components.kf0) this.b).r) != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    break;
                }
                break;
            case 11:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.qg0) this.b).dismiss();
                    break;
                }
                break;
            case 12:
                ((org.telegram.ui.Components.hq0) this.b).onBackPressed();
                break;
            case 13:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.y51) this.b).finishFragment();
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
                    ((xt) this.b).finishFragment();
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
                    ((wu) this.b).finishFragment();
                    break;
                }
                break;
            case 20:
                if (i10 == -1) {
                    ((kv) this.b).finishFragment();
                    break;
                }
                break;
            case 21:
                if (i10 == -1) {
                    ((jz) this.b).finishFragment();
                    break;
                }
                break;
            case 22:
                zz zzVar = (zz) this.b;
                if (i10 == -1) {
                    if (zzVar.W(true)) {
                        zzVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    if (Math.abs(zzVar.T - 1.0f) < 0.1f) {
                        zzVar.c0();
                        break;
                    } else if (Math.abs(zzVar.T - 0.5f) < 0.1f) {
                        for (int i11 = 0; i11 < zzVar.a.getChildCount(); i11++) {
                            View childAt = zzVar.a.getChildAt(i11);
                            zzVar.a.getClass();
                            if (RecyclerView.R(childAt) == zzVar.L && (childAt instanceof org.telegram.ui.Components.a10)) {
                                int i12 = -zzVar.s;
                                zzVar.s = i12;
                                AndroidUtilities.shakeViewSpring(childAt, i12);
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
            case 23:
                c10 c10Var = (c10) this.b;
                if (i10 == -1) {
                    if (c10Var.h0(true)) {
                        c10Var.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    c10Var.q0();
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
                    ((o20) this.b).finishFragment();
                    break;
                }
                break;
            case 26:
                b70 b70Var = (b70) this.b;
                if (i10 == -1) {
                    if (b70Var.f0(true)) {
                        b70Var.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    b70Var.o0();
                    break;
                }
                break;
            case 27:
                if (i10 == -1) {
                    ((i70) this.b).finishFragment();
                    break;
                }
                break;
            case 28:
                if (i10 == -1) {
                    ((k70) this.b).finishFragment();
                    break;
                }
                break;
            default:
                if (i10 == -1) {
                    ((q70) this.b).finishFragment();
                    break;
                }
                break;
        }
    }
}
