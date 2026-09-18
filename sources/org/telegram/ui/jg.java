package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jg implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;

    public /* synthetic */ jg(bo boVar, int i10) {
        this.a = i10;
        this.b = boVar;
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
                bo boVar = this.b;
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
                            ((org.telegram.ui.Cells.v1) view).getTextView().setTranslationX(boVar.R8() / 2.0f);
                            break;
                        }
                    } else {
                        org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
                        w0Var.e0 = boVar.t9();
                        w0Var.i0 = boVar.C9();
                        boVar.B9();
                        boVar.Q8();
                        int R8 = boVar.R8();
                        if (w0Var.j0 != R8) {
                            w0Var.j0 = R8;
                            w0Var.invalidate();
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
                    t1Var.E8 = boVar.t9();
                    t1Var.F8 = boVar.C9();
                    boolean B9 = boVar.B9();
                    if (t1Var.G8 != B9) {
                        t1Var.G8 = B9;
                        boVar.x0.getClass();
                        int S = RecyclerView.S(view);
                        t1Var.n8 = true;
                        t1Var.forceLayout();
                        if (S >= 0) {
                            boVar.A0.m(S);
                        }
                    }
                    t1Var.H8 = boVar.Q8();
                    int R82 = boVar.R8();
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
                    bo boVar2 = this.b;
                    boVar2.D1 = tL_premium_boostsStatus;
                    boVar2.getMessagesController().getBoostsController().userCanBoostChannel(boVar2.T5, tL_premium_boostsStatus, new jg(boVar2, 0));
                    break;
                }
                break;
        }
    }
}
