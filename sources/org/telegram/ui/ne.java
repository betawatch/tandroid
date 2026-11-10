package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ne implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;

    public /* synthetic */ ne(cn cnVar, int i7) {
        this.a = i7;
        this.b = cnVar;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        int i7 = this.a;
        cn cnVar = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.nj njVar = (org.telegram.messenger.nj) obj;
                cn cnVar2 = this.b;
                cnVar2.w5 = njVar;
                cnVar2.F5.k.suggested_post = njVar.c();
                cnVar2.ec(true, null, cnVar2.F5, null, null, true, 0, null, false, 0L);
                break;
            case 1:
                cnVar.jc((org.telegram.messenger.nj) obj);
                break;
            case 2:
                cnVar.bc(true, false);
                if (((Boolean) obj).booleanValue()) {
                    cnVar.finishFragment();
                    break;
                }
                break;
            case 3:
                cnVar.Fa((String) obj, false);
                break;
            case 4:
                cnVar.S1 = (org.telegram.messenger.e3) obj;
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
                            ((org.telegram.ui.Cells.z1) view).getTextView().setTranslationX(cnVar.m9() / 2.0f);
                            break;
                        }
                    } else {
                        org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) view;
                        t0Var.e0 = cnVar.P9();
                        t0Var.i0 = cnVar.aa();
                        cnVar.Z9();
                        cnVar.l9();
                        int m92 = cnVar.m9();
                        if (t0Var.j0 != m92) {
                            t0Var.j0 = m92;
                            t0Var.invalidate();
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
                    q1Var.V6 = cnVar.P9();
                    q1Var.W6 = cnVar.aa();
                    boolean Z9 = cnVar.Z9();
                    if (q1Var.X6 != Z9) {
                        q1Var.X6 = Z9;
                        cnVar.z0.getClass();
                        int R = RecyclerView.R(view);
                        q1Var.E6 = true;
                        q1Var.forceLayout();
                        if (R >= 0) {
                            cnVar.C0.g(R);
                        }
                    }
                    q1Var.Y6 = cnVar.l9();
                    int m93 = cnVar.m9();
                    if (q1Var.Z6 != m93) {
                        q1Var.Z6 = m93;
                        q1Var.Z3();
                        q1Var.invalidate();
                        break;
                    }
                }
                break;
            case 6:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    cnVar.R1 = tL_premium_boostsStatus;
                    cnVar.getMessagesController().G0().b(cnVar.j6, tL_premium_boostsStatus, new ne(cnVar, 4));
                    break;
                }
                break;
            case 7:
                Long l10 = (Long) obj;
                org.telegram.ui.Components.m11 m11Var = cnVar.f2;
                if (m11Var != null) {
                    m11Var.n(l10.longValue(), true);
                    break;
                }
                break;
            case 8:
                cnVar.e0.c.add(((org.telegram.ui.ActionBar.r0) obj).getIconView());
                break;
            case 9:
                int intValue = ((Integer) obj).intValue();
                int i10 = cn.kd;
                cnVar.cb(intValue);
                break;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i11 = cn.kd;
                cnVar.cb(intValue2);
                break;
        }
    }
}
