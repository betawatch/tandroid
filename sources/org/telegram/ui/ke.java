package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ke implements org.telegram.messenger.z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;

    public /* synthetic */ ke(an anVar, int i7) {
        this.a = i7;
        this.b = anVar;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        int i7 = this.a;
        an anVar = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.lj ljVar = (org.telegram.messenger.lj) obj;
                an anVar2 = this.b;
                anVar2.x5 = ljVar;
                anVar2.G5.k.suggested_post = ljVar.c();
                anVar2.gc(true, null, anVar2.G5, null, null, true, 0, null, false, 0L, null, true);
                break;
            case 1:
                anVar.kc((org.telegram.messenger.lj) obj);
                break;
            case 2:
                anVar.cc(true, false);
                if (((Boolean) obj).booleanValue()) {
                    anVar.finishFragment();
                    break;
                }
                break;
            case 3:
                anVar.Ga((String) obj, false);
                break;
            case 4:
                anVar.T1 = (org.telegram.messenger.e3) obj;
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
                            ((org.telegram.ui.Cells.z1) view).getTextView().setTranslationX(anVar.n9() / 2.0f);
                            break;
                        }
                    } else {
                        org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) view;
                        t0Var.f0 = anVar.Q9();
                        t0Var.j0 = anVar.ba();
                        anVar.aa();
                        anVar.m9();
                        int n92 = anVar.n9();
                        if (t0Var.k0 != n92) {
                            t0Var.k0 = n92;
                            t0Var.invalidate();
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
                    q1Var.W6 = anVar.Q9();
                    q1Var.X6 = anVar.ba();
                    boolean aa2 = anVar.aa();
                    if (q1Var.Y6 != aa2) {
                        q1Var.Y6 = aa2;
                        anVar.A0.getClass();
                        int R = RecyclerView.R(view);
                        q1Var.F6 = true;
                        q1Var.forceLayout();
                        if (R >= 0) {
                            anVar.D0.g(R);
                        }
                    }
                    q1Var.Z6 = anVar.m9();
                    int n93 = anVar.n9();
                    if (q1Var.a7 != n93) {
                        q1Var.a7 = n93;
                        q1Var.a4();
                        q1Var.invalidate();
                        break;
                    }
                }
                break;
            case 6:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    anVar.S1 = tL_premium_boostsStatus;
                    anVar.getMessagesController().G0().b(anVar.k6, tL_premium_boostsStatus, new ke(anVar, 4));
                    break;
                }
                break;
            case 7:
                Long l10 = (Long) obj;
                org.telegram.ui.Components.p11 p11Var = anVar.g2;
                if (p11Var != null) {
                    p11Var.n(l10.longValue(), true);
                    break;
                }
                break;
            case 8:
                anVar.f0.c.add(((org.telegram.ui.ActionBar.q0) obj).getIconView());
                break;
            case 9:
                int intValue = ((Integer) obj).intValue();
                int i10 = an.ld;
                anVar.db(intValue);
                break;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i11 = an.ld;
                anVar.db(intValue2);
                break;
        }
    }
}
