package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ne implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;

    public /* synthetic */ ne(an anVar, int i7) {
        this.a = i7;
        this.b = anVar;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        int i7 = this.a;
        an anVar = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.nj njVar = (org.telegram.messenger.nj) obj;
                an anVar2 = this.b;
                anVar2.w5 = njVar;
                anVar2.F5.k.suggested_post = njVar.c();
                anVar2.cc(true, null, anVar2.F5, null, null, true, 0, null, false, 0L, null, true);
                break;
            case 1:
                anVar.gc((org.telegram.messenger.nj) obj);
                break;
            case 2:
                anVar.Yb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    anVar.finishFragment();
                    break;
                }
                break;
            case 3:
                anVar.Da((String) obj, false);
                break;
            case 4:
                anVar.S1 = (org.telegram.messenger.e3) obj;
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
                            ((org.telegram.ui.Cells.z1) view).getTextView().setTranslationX(anVar.l9() / 2.0f);
                            break;
                        }
                    } else {
                        org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) view;
                        t0Var.e0 = anVar.O9();
                        t0Var.i0 = anVar.Z9();
                        anVar.Y9();
                        anVar.k9();
                        int l92 = anVar.l9();
                        if (t0Var.j0 != l92) {
                            t0Var.j0 = l92;
                            t0Var.invalidate();
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
                    q1Var.V6 = anVar.O9();
                    q1Var.W6 = anVar.Z9();
                    boolean Y9 = anVar.Y9();
                    if (q1Var.X6 != Y9) {
                        q1Var.X6 = Y9;
                        anVar.z0.getClass();
                        int R = RecyclerView.R(view);
                        q1Var.E6 = true;
                        q1Var.forceLayout();
                        if (R >= 0) {
                            anVar.C0.g(R);
                        }
                    }
                    q1Var.Y6 = anVar.k9();
                    int l93 = anVar.l9();
                    if (q1Var.Z6 != l93) {
                        q1Var.Z6 = l93;
                        q1Var.Y3();
                        q1Var.invalidate();
                        break;
                    }
                }
                break;
            case 6:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    anVar.R1 = tL_premium_boostsStatus;
                    anVar.getMessagesController().G0().b(anVar.j6, tL_premium_boostsStatus, new ne(anVar, 4));
                    break;
                }
                break;
            case 7:
                Long l10 = (Long) obj;
                org.telegram.ui.Components.m11 m11Var = anVar.f2;
                if (m11Var != null) {
                    m11Var.n(l10.longValue(), true);
                    break;
                }
                break;
            case 8:
                anVar.e0.c.add(((org.telegram.ui.ActionBar.r0) obj).getIconView());
                break;
            case 9:
                int intValue = ((Integer) obj).intValue();
                int i10 = an.id;
                anVar.ab(intValue);
                break;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i11 = an.id;
                anVar.ab(intValue2);
                break;
        }
    }
}
