package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class hg implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ co b;

    public /* synthetic */ hg(co coVar, int i10) {
        this.a = i10;
        this.b = coVar;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.E1 = (ChannelBoostsController.CanApplyBoost) obj;
                break;
            case 1:
                View view = (View) obj;
                boolean z10 = view instanceof org.telegram.ui.Cells.t1;
                co coVar = this.b;
                if (!z10) {
                    if (!(view instanceof org.telegram.ui.Cells.w0)) {
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
                            ((org.telegram.ui.Cells.v1) view).getTextView().setTranslationX(coVar.R8() / 2.0f);
                            break;
                        }
                    } else {
                        org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
                        w0Var.e0 = coVar.t9();
                        w0Var.i0 = coVar.C9();
                        coVar.B9();
                        coVar.Q8();
                        int R8 = coVar.R8();
                        if (w0Var.j0 != R8) {
                            w0Var.j0 = R8;
                            w0Var.invalidate();
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
                    t1Var.E8 = coVar.t9();
                    t1Var.F8 = coVar.C9();
                    boolean B9 = coVar.B9();
                    if (t1Var.G8 != B9) {
                        t1Var.G8 = B9;
                        coVar.x0.getClass();
                        int R = RecyclerView.R(view);
                        t1Var.n8 = true;
                        t1Var.forceLayout();
                        if (R >= 0) {
                            coVar.A0.m(R);
                        }
                    }
                    t1Var.H8 = coVar.Q8();
                    int R82 = coVar.R8();
                    if (t1Var.I8 != R82) {
                        t1Var.I8 = R82;
                        t1Var.y4();
                        t1Var.invalidate();
                        break;
                    }
                }
                break;
            default:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    co coVar2 = this.b;
                    coVar2.D1 = tL_premium_boostsStatus;
                    coVar2.getMessagesController().getBoostsController().userCanBoostChannel(coVar2.T5, tL_premium_boostsStatus, new hg(coVar2, 0));
                    break;
                }
                break;
        }
    }
}
