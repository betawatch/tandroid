package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class lf implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ lf(zn znVar, int i10) {
        this.a = i10;
        this.b = znVar;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.E1 = (ChannelBoostsController.CanApplyBoost) obj;
                break;
            case 1:
                View view = (View) obj;
                boolean z10 = view instanceof org.telegram.ui.Cells.u1;
                zn znVar = this.b;
                if (!z10) {
                    if (!(view instanceof org.telegram.ui.Cells.w0)) {
                        if (!(view instanceof org.telegram.ui.Cells.w1)) {
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
                            ((org.telegram.ui.Cells.w1) view).getTextView().setTranslationX(znVar.R8() / 2.0f);
                            break;
                        }
                    } else {
                        org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
                        w0Var.e0 = znVar.t9();
                        w0Var.i0 = znVar.C9();
                        znVar.B9();
                        znVar.Q8();
                        int R8 = znVar.R8();
                        if (w0Var.j0 != R8) {
                            w0Var.j0 = R8;
                            w0Var.invalidate();
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
                    u1Var.E8 = znVar.t9();
                    u1Var.F8 = znVar.C9();
                    boolean B9 = znVar.B9();
                    if (u1Var.G8 != B9) {
                        u1Var.G8 = B9;
                        znVar.x0.getClass();
                        int S = RecyclerView.S(view);
                        u1Var.n8 = true;
                        u1Var.forceLayout();
                        if (S >= 0) {
                            znVar.A0.m(S);
                        }
                    }
                    u1Var.H8 = znVar.Q8();
                    int R82 = znVar.R8();
                    if (u1Var.I8 != R82) {
                        u1Var.I8 = R82;
                        u1Var.y4();
                        u1Var.invalidate();
                        break;
                    }
                }
                break;
            default:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    zn znVar2 = this.b;
                    znVar2.D1 = tL_premium_boostsStatus;
                    znVar2.getMessagesController().getBoostsController().userCanBoostChannel(znVar2.T5, tL_premium_boostsStatus, new lf(znVar2, 0));
                    break;
                }
                break;
        }
    }
}
