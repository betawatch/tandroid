package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class af implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;

    public /* synthetic */ af(xn xnVar, int i10) {
        this.a = i10;
        this.b = xnVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        xn xnVar = this.b;
        switch (i10) {
            case 0:
                MessageSuggestionParams messageSuggestionParams = (MessageSuggestionParams) obj;
                xn xnVar2 = this.b;
                xnVar2.g5 = messageSuggestionParams;
                xnVar2.p5.messageOwner.suggested_post = messageSuggestionParams.toTl();
                xnVar2.yb(true, null, xnVar2.p5, null, null, null, false, true);
                break;
            case 1:
                xnVar.vb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    xnVar.finishFragment();
                    break;
                }
                break;
            case 2:
                xnVar.da((String) obj, false);
                break;
            case 3:
                xnVar.Db((MessageSuggestionParams) obj);
                break;
            case 4:
                xnVar.E1 = (ChannelBoostsController.CanApplyBoost) obj;
                break;
            case 5:
                View view = (View) obj;
                if (!(view instanceof org.telegram.ui.Cells.t1)) {
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
                            ((org.telegram.ui.Cells.v1) view).getTextView().setTranslationX(xnVar.R8() / 2.0f);
                            break;
                        }
                    } else {
                        org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
                        w0Var.e0 = xnVar.t9();
                        w0Var.i0 = xnVar.C9();
                        xnVar.B9();
                        xnVar.Q8();
                        int R8 = xnVar.R8();
                        if (w0Var.j0 != R8) {
                            w0Var.j0 = R8;
                            w0Var.invalidate();
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
                    t1Var.E8 = xnVar.t9();
                    t1Var.F8 = xnVar.C9();
                    boolean B9 = xnVar.B9();
                    if (t1Var.G8 != B9) {
                        t1Var.G8 = B9;
                        xnVar.x0.getClass();
                        int R = RecyclerView.R(view);
                        t1Var.n8 = true;
                        t1Var.forceLayout();
                        if (R >= 0) {
                            xnVar.A0.m(R);
                        }
                    }
                    t1Var.H8 = xnVar.Q8();
                    int R82 = xnVar.R8();
                    if (t1Var.I8 != R82) {
                        t1Var.I8 = R82;
                        t1Var.y4();
                        t1Var.invalidate();
                        break;
                    }
                }
                break;
            case 6:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    xnVar.D1 = tL_premium_boostsStatus;
                    xnVar.getMessagesController().getBoostsController().userCanBoostChannel(xnVar.T5, tL_premium_boostsStatus, new af(xnVar, 4));
                    break;
                }
                break;
            case 7:
                Long l4 = (Long) obj;
                org.telegram.ui.Components.w21 w21Var = xnVar.R1;
                if (w21Var != null) {
                    w21Var.m(l4.longValue(), true);
                    break;
                }
                break;
            case 8:
                xnVar.d0.c.add(((org.telegram.ui.ActionBar.v0) obj).getIconView());
                break;
            case 9:
                int intValue = ((Integer) obj).intValue();
                int i11 = xn.Gc;
                xnVar.Ba(intValue);
                break;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i12 = xn.Gc;
                xnVar.Ba(intValue2);
                break;
        }
    }
}
