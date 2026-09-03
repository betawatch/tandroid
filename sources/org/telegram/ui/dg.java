package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dg implements h5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ dg(zn znVar, int i10) {
        this.a = i10;
        this.b = znVar;
    }

    @Override // h5.d
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.B1 = (ChannelBoostsController.CanApplyBoost) obj;
                break;
            case 1:
                View view = (View) obj;
                boolean z4 = view instanceof org.telegram.ui.Cells.s1;
                zn znVar = this.b;
                if (!z4) {
                    if (!(view instanceof org.telegram.ui.Cells.v0)) {
                        if (!(view instanceof org.telegram.ui.Cells.u1)) {
                            if (!(view instanceof org.telegram.ui.Cells.b0)) {
                                if (view instanceof org.telegram.ui.Cells.h0) {
                                    view.invalidate();
                                    break;
                                }
                            } else {
                                view.invalidate();
                                break;
                            }
                        } else {
                            ((org.telegram.ui.Cells.u1) view).getTextView().setTranslationX(znVar.R8() / 2.0f);
                            break;
                        }
                    } else {
                        org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
                        v0Var.b0 = znVar.t9();
                        v0Var.f0 = znVar.C9();
                        znVar.B9();
                        znVar.Q8();
                        int R8 = znVar.R8();
                        if (v0Var.g0 != R8) {
                            v0Var.g0 = R8;
                            v0Var.invalidate();
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
                    s1Var.B8 = znVar.t9();
                    s1Var.C8 = znVar.C9();
                    boolean B9 = znVar.B9();
                    if (s1Var.D8 != B9) {
                        s1Var.D8 = B9;
                        znVar.u0.getClass();
                        int R = RecyclerView.R(view);
                        s1Var.k8 = true;
                        s1Var.forceLayout();
                        if (R >= 0) {
                            znVar.x0.m(R);
                        }
                    }
                    s1Var.E8 = znVar.Q8();
                    int R82 = znVar.R8();
                    if (s1Var.F8 != R82) {
                        s1Var.F8 = R82;
                        s1Var.y4();
                        s1Var.invalidate();
                        break;
                    }
                }
                break;
            default:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    zn znVar2 = this.b;
                    znVar2.A1 = tL_premium_boostsStatus;
                    znVar2.getMessagesController().getBoostsController().userCanBoostChannel(znVar2.Q5, tL_premium_boostsStatus, new dg(znVar2, 0));
                    break;
                }
                break;
        }
    }
}
