package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class me implements org.telegram.messenger.x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;

    public /* synthetic */ me(bn bnVar, int i7) {
        this.a = i7;
        this.b = bnVar;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        int i7 = this.a;
        bn bnVar = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) obj;
                bn bnVar2 = this.b;
                bnVar2.y5 = kjVar;
                bnVar2.H5.k.suggested_post = kjVar.c();
                bnVar2.gc(true, null, bnVar2.H5, null, null, true, 0, null, false, 0L, null, true);
                break;
            case 1:
                bnVar.kc((org.telegram.messenger.kj) obj);
                break;
            case 2:
                bnVar.cc(true, false);
                if (((Boolean) obj).booleanValue()) {
                    bnVar.finishFragment();
                    break;
                }
                break;
            case 3:
                bnVar.Ga((String) obj, false);
                break;
            case 4:
                bnVar.T1 = (org.telegram.messenger.g3) obj;
                break;
            case 5:
                View view = (View) obj;
                if (!(view instanceof org.telegram.ui.Cells.r1)) {
                    if (!(view instanceof org.telegram.ui.Cells.v0)) {
                        if (!(view instanceof org.telegram.ui.Cells.a2)) {
                            if (!(view instanceof org.telegram.ui.Cells.a0)) {
                                if (view instanceof org.telegram.ui.Cells.g0) {
                                    view.invalidate();
                                    break;
                                }
                            } else {
                                view.invalidate();
                                break;
                            }
                        } else {
                            ((org.telegram.ui.Cells.a2) view).getTextView().setTranslationX(bnVar.n9() / 2.0f);
                            break;
                        }
                    } else {
                        org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
                        v0Var.f0 = bnVar.Q9();
                        v0Var.j0 = bnVar.ba();
                        bnVar.aa();
                        bnVar.m9();
                        int n92 = bnVar.n9();
                        if (v0Var.k0 != n92) {
                            v0Var.k0 = n92;
                            v0Var.invalidate();
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) view;
                    r1Var.W6 = bnVar.Q9();
                    r1Var.X6 = bnVar.ba();
                    boolean aa2 = bnVar.aa();
                    if (r1Var.Y6 != aa2) {
                        r1Var.Y6 = aa2;
                        bnVar.A0.getClass();
                        int R = RecyclerView.R(view);
                        r1Var.F6 = true;
                        r1Var.forceLayout();
                        if (R >= 0) {
                            bnVar.D0.g(R);
                        }
                    }
                    r1Var.Z6 = bnVar.m9();
                    int n93 = bnVar.n9();
                    if (r1Var.a7 != n93) {
                        r1Var.a7 = n93;
                        r1Var.b4();
                        r1Var.invalidate();
                        break;
                    }
                }
                break;
            case 6:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    bnVar.S1 = tL_premium_boostsStatus;
                    bnVar.getMessagesController().I0().b(bnVar.l6, tL_premium_boostsStatus, new me(bnVar, 4));
                    break;
                }
                break;
            case 7:
                Long l10 = (Long) obj;
                org.telegram.ui.Components.z11 z11Var = bnVar.g2;
                if (z11Var != null) {
                    z11Var.n(l10.longValue(), true);
                    break;
                }
                break;
            case 8:
                bnVar.f0.c.add(((org.telegram.ui.ActionBar.r0) obj).getIconView());
                break;
            case 9:
                int intValue = ((Integer) obj).intValue();
                int i10 = bn.md;
                bnVar.db(intValue);
                break;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i11 = bn.md;
                bnVar.db(intValue2);
                break;
        }
    }
}
