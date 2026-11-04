package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class le implements org.telegram.messenger.u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm b;

    public /* synthetic */ le(wm wmVar, int i3) {
        this.a = i3;
        this.b = wmVar;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        int i3 = this.a;
        wm wmVar = this.b;
        switch (i3) {
            case 0:
                org.telegram.messenger.ej ejVar = (org.telegram.messenger.ej) obj;
                wm wmVar2 = this.b;
                wmVar2.x5 = ejVar;
                wmVar2.G5.k.suggested_post = ejVar.c();
                wmVar2.bc(true, null, wmVar2.G5, null, null, true, 0, null, false, 0L, null, true);
                break;
            case 1:
                wmVar.gc((org.telegram.messenger.ej) obj);
                break;
            case 2:
                wmVar.Yb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    wmVar.finishFragment();
                    break;
                }
                break;
            case 3:
                wmVar.Da((String) obj, false);
                break;
            case 4:
                wmVar.T1 = (org.telegram.messenger.e3) obj;
                break;
            case 5:
                View view = (View) obj;
                if (!(view instanceof org.telegram.ui.Cells.q1)) {
                    if (!(view instanceof org.telegram.ui.Cells.t0)) {
                        if (!(view instanceof org.telegram.ui.Cells.z1)) {
                            if (!(view instanceof org.telegram.ui.Cells.a0)) {
                                if (view instanceof org.telegram.ui.Cells.f0) {
                                    view.invalidate();
                                    break;
                                }
                            } else {
                                view.invalidate();
                                break;
                            }
                        } else {
                            ((org.telegram.ui.Cells.z1) view).getTextView().setTranslationX(wmVar.l9() / 2.0f);
                            break;
                        }
                    } else {
                        org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) view;
                        t0Var.f0 = wmVar.O9();
                        t0Var.j0 = wmVar.Z9();
                        wmVar.Y9();
                        wmVar.k9();
                        int l92 = wmVar.l9();
                        if (t0Var.k0 != l92) {
                            t0Var.k0 = l92;
                            t0Var.invalidate();
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
                    q1Var.V6 = wmVar.O9();
                    q1Var.W6 = wmVar.Z9();
                    boolean Y9 = wmVar.Y9();
                    if (q1Var.X6 != Y9) {
                        q1Var.X6 = Y9;
                        wmVar.A0.getClass();
                        int R = RecyclerView.R(view);
                        q1Var.E6 = true;
                        q1Var.forceLayout();
                        if (R >= 0) {
                            wmVar.D0.g(R);
                        }
                    }
                    q1Var.Y6 = wmVar.k9();
                    int l93 = wmVar.l9();
                    if (q1Var.Z6 != l93) {
                        q1Var.Z6 = l93;
                        q1Var.X3();
                        q1Var.invalidate();
                        break;
                    }
                }
                break;
            case 6:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    wmVar.S1 = tL_premium_boostsStatus;
                    wmVar.getMessagesController().G0().b(wmVar.k6, tL_premium_boostsStatus, new le(wmVar, 4));
                    break;
                }
                break;
            case 7:
                Long l10 = (Long) obj;
                org.telegram.ui.Components.g11 g11Var = wmVar.g2;
                if (g11Var != null) {
                    g11Var.n(l10.longValue(), true);
                    break;
                }
                break;
            case 8:
                wmVar.f0.c.add(((org.telegram.ui.ActionBar.q0) obj).getIconView());
                break;
            case 9:
                int intValue = ((Integer) obj).intValue();
                int i10 = wm.jd;
                wmVar.ab(intValue);
                break;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i11 = wm.jd;
                wmVar.ab(intValue2);
                break;
        }
    }
}
