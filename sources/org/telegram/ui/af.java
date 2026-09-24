package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class af implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;

    public /* synthetic */ af(wn wnVar, int i10) {
        this.a = i10;
        this.b = wnVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        wn wnVar = this.b;
        switch (i10) {
            case 0:
                MessageSuggestionParams messageSuggestionParams = (MessageSuggestionParams) obj;
                wn wnVar2 = this.b;
                wnVar2.g5 = messageSuggestionParams;
                wnVar2.p5.messageOwner.suggested_post = messageSuggestionParams.toTl();
                wnVar2.yb(true, null, wnVar2.p5, null, null, null, false, true);
                break;
            case 1:
                wnVar.vb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    wnVar.finishFragment();
                    break;
                }
                break;
            case 2:
                wnVar.E1 = (ChannelBoostsController.CanApplyBoost) obj;
                break;
            case 3:
                wnVar.da((String) obj, false);
                break;
            case 4:
                wnVar.Db((MessageSuggestionParams) obj);
                break;
            case 5:
                View view = (View) obj;
                if (!(view instanceof org.telegram.ui.Cells.u1)) {
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
                            ((org.telegram.ui.Cells.w1) view).getTextView().setTranslationX(wnVar.R8() / 2.0f);
                            break;
                        }
                    } else {
                        org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
                        w0Var.e0 = wnVar.t9();
                        w0Var.i0 = wnVar.C9();
                        wnVar.B9();
                        wnVar.Q8();
                        int R8 = wnVar.R8();
                        if (w0Var.j0 != R8) {
                            w0Var.j0 = R8;
                            w0Var.invalidate();
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
                    u1Var.E8 = wnVar.t9();
                    u1Var.F8 = wnVar.C9();
                    boolean B9 = wnVar.B9();
                    if (u1Var.G8 != B9) {
                        u1Var.G8 = B9;
                        wnVar.x0.getClass();
                        int R = RecyclerView.R(view);
                        u1Var.n8 = true;
                        u1Var.forceLayout();
                        if (R >= 0) {
                            wnVar.A0.m(R);
                        }
                    }
                    u1Var.H8 = wnVar.Q8();
                    int R82 = wnVar.R8();
                    if (u1Var.I8 != R82) {
                        u1Var.I8 = R82;
                        u1Var.y4();
                        u1Var.invalidate();
                        break;
                    }
                }
                break;
            case 6:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    wnVar.D1 = tL_premium_boostsStatus;
                    wnVar.getMessagesController().getBoostsController().userCanBoostChannel(wnVar.T5, tL_premium_boostsStatus, new af(wnVar, 2));
                    break;
                }
                break;
            case 7:
                Long l4 = (Long) obj;
                org.telegram.ui.Components.k31 k31Var = wnVar.R1;
                if (k31Var != null) {
                    k31Var.m(l4.longValue(), true);
                    break;
                }
                break;
            case 8:
                wnVar.d0.c.add(((org.telegram.ui.ActionBar.u0) obj).getIconView());
                break;
            case 9:
                int intValue = ((Integer) obj).intValue();
                int i11 = wn.Gc;
                wnVar.Ba(intValue);
                break;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i12 = wn.Gc;
                wnVar.Ba(intValue2);
                break;
        }
    }
}
