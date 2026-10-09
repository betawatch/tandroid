package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cf implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ cf(zn znVar, int i10) {
        this.a = i10;
        this.b = znVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        zn znVar = this.b;
        switch (i10) {
            case 0:
                MessageSuggestionParams messageSuggestionParams = (MessageSuggestionParams) obj;
                zn znVar2 = this.b;
                znVar2.g5 = messageSuggestionParams;
                znVar2.p5.messageOwner.suggested_post = messageSuggestionParams.toTl();
                znVar2.Cb(true, null, znVar2.p5, null, null, true, 0, null, false, 0L, null, true);
                break;
            case 1:
                znVar.zb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    znVar.finishFragment();
                    break;
                }
                break;
            case 2:
                znVar.ia((String) obj, false);
                break;
            case 3:
                znVar.E1 = (ChannelBoostsController.CanApplyBoost) obj;
                break;
            case 4:
                znVar.Hb((MessageSuggestionParams) obj);
                break;
            case 5:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    znVar.D1 = tL_premium_boostsStatus;
                    znVar.getMessagesController().getBoostsController().userCanBoostChannel(znVar.T5, tL_premium_boostsStatus, new cf(znVar, 3));
                    break;
                }
                break;
            case 6:
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
                            ((org.telegram.ui.Cells.w1) view).getTextView().setTranslationX(znVar.W8() / 2.0f);
                            break;
                        }
                    } else {
                        org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
                        w0Var.e0 = znVar.y9();
                        w0Var.i0 = znVar.H9();
                        znVar.G9();
                        znVar.V8();
                        int W8 = znVar.W8();
                        if (w0Var.j0 != W8) {
                            w0Var.j0 = W8;
                            w0Var.invalidate();
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
                    u1Var.E8 = znVar.y9();
                    u1Var.F8 = znVar.H9();
                    boolean G9 = znVar.G9();
                    if (u1Var.G8 != G9) {
                        u1Var.G8 = G9;
                        znVar.x0.getClass();
                        int R = RecyclerView.R(view);
                        u1Var.n8 = true;
                        u1Var.forceLayout();
                        if (R >= 0) {
                            znVar.A0.m(R);
                        }
                    }
                    u1Var.H8 = znVar.V8();
                    int W82 = znVar.W8();
                    if (u1Var.I8 != W82) {
                        u1Var.I8 = W82;
                        u1Var.y4();
                        u1Var.invalidate();
                        break;
                    }
                }
                break;
            case 7:
                Long l4 = (Long) obj;
                org.telegram.ui.Components.c41 c41Var = znVar.R1;
                if (c41Var != null) {
                    c41Var.m(l4.longValue(), true);
                    break;
                }
                break;
            case 8:
                znVar.d0.c.add(((org.telegram.ui.ActionBar.v0) obj).getIconView());
                break;
            case 9:
                int intValue = ((Integer) obj).intValue();
                int i11 = zn.Hc;
                znVar.Fa(intValue);
                break;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i12 = zn.Hc;
                znVar.Fa(intValue2);
                break;
        }
    }
}
