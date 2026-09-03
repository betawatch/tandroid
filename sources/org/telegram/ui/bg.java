package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bg implements h5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;

    public /* synthetic */ bg(xn xnVar, int i10) {
        this.a = i10;
        this.b = xnVar;
    }

    @Override // h5.d
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.B1 = (ChannelBoostsController.CanApplyBoost) obj;
                break;
            case 1:
                View view = (View) obj;
                boolean z4 = view instanceof org.telegram.ui.Cells.t1;
                xn xnVar = this.b;
                if (!z4) {
                    if (!(view instanceof org.telegram.ui.Cells.v0)) {
                        if (!(view instanceof org.telegram.ui.Cells.v1)) {
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
                            ((org.telegram.ui.Cells.v1) view).getTextView().setTranslationX(xnVar.R8() / 2.0f);
                            break;
                        }
                    } else {
                        org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
                        v0Var.b0 = xnVar.t9();
                        v0Var.f0 = xnVar.C9();
                        xnVar.B9();
                        xnVar.Q8();
                        int R8 = xnVar.R8();
                        if (v0Var.g0 != R8) {
                            v0Var.g0 = R8;
                            v0Var.invalidate();
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
                    t1Var.B8 = xnVar.t9();
                    t1Var.C8 = xnVar.C9();
                    boolean B9 = xnVar.B9();
                    if (t1Var.D8 != B9) {
                        t1Var.D8 = B9;
                        xnVar.u0.getClass();
                        int R = RecyclerView.R(view);
                        t1Var.k8 = true;
                        t1Var.forceLayout();
                        if (R >= 0) {
                            xnVar.x0.m(R);
                        }
                    }
                    t1Var.E8 = xnVar.Q8();
                    int R82 = xnVar.R8();
                    if (t1Var.F8 != R82) {
                        t1Var.F8 = R82;
                        t1Var.y4();
                        t1Var.invalidate();
                        break;
                    }
                }
                break;
            default:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    xn xnVar2 = this.b;
                    xnVar2.A1 = tL_premium_boostsStatus;
                    xnVar2.getMessagesController().getBoostsController().userCanBoostChannel(xnVar2.Q5, tL_premium_boostsStatus, new bg(xnVar2, 0));
                    break;
                }
                break;
        }
    }
}
