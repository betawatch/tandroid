package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ig implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ eo b;

    public /* synthetic */ ig(eo eoVar, int i10) {
        this.a = i10;
        this.b = eoVar;
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
                eo eoVar = this.b;
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
                            ((org.telegram.ui.Cells.v1) view).getTextView().setTranslationX(eoVar.R8() / 2.0f);
                            break;
                        }
                    } else {
                        org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
                        w0Var.e0 = eoVar.t9();
                        w0Var.i0 = eoVar.C9();
                        eoVar.B9();
                        eoVar.Q8();
                        int R8 = eoVar.R8();
                        if (w0Var.j0 != R8) {
                            w0Var.j0 = R8;
                            w0Var.invalidate();
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
                    t1Var.E8 = eoVar.t9();
                    t1Var.F8 = eoVar.C9();
                    boolean B9 = eoVar.B9();
                    if (t1Var.G8 != B9) {
                        t1Var.G8 = B9;
                        eoVar.x0.getClass();
                        int R = RecyclerView.R(view);
                        t1Var.n8 = true;
                        t1Var.forceLayout();
                        if (R >= 0) {
                            eoVar.A0.m(R);
                        }
                    }
                    t1Var.H8 = eoVar.Q8();
                    int R82 = eoVar.R8();
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
                    eo eoVar2 = this.b;
                    eoVar2.D1 = tL_premium_boostsStatus;
                    eoVar2.getMessagesController().getBoostsController().userCanBoostChannel(eoVar2.T5, tL_premium_boostsStatus, new ig(eoVar2, 0));
                    break;
                }
                break;
        }
    }
}
