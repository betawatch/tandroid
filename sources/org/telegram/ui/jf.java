package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jf implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo b;

    public /* synthetic */ jf(fo foVar, int i10) {
        this.a = i10;
        this.b = foVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        fo foVar = this.b;
        switch (i10) {
            case 0:
                MessageSuggestionParams messageSuggestionParams = (MessageSuggestionParams) obj;
                fo foVar2 = this.b;
                foVar2.g5 = messageSuggestionParams;
                foVar2.p5.messageOwner.suggested_post = messageSuggestionParams.toTl();
                foVar2.Cb(true, null, foVar2.p5, null, null, null, false);
                break;
            case 1:
                foVar.zb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    foVar.finishFragment();
                    break;
                }
                break;
            case 2:
                foVar.ia((String) obj, false);
                break;
            case 3:
                foVar.E1 = (ChannelBoostsController.CanApplyBoost) obj;
                break;
            case 4:
                foVar.Hb((MessageSuggestionParams) obj);
                break;
            case 5:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    foVar.D1 = tL_premium_boostsStatus;
                    foVar.getMessagesController().getBoostsController().userCanBoostChannel(foVar.T5, tL_premium_boostsStatus, new jf(foVar, 3));
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
                            ((org.telegram.ui.Cells.w1) view).getTextView().setTranslationX(foVar.W8() / 2.0f);
                            break;
                        }
                    } else {
                        org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
                        w0Var.e0 = foVar.y9();
                        w0Var.i0 = foVar.H9();
                        foVar.G9();
                        foVar.V8();
                        int W8 = foVar.W8();
                        if (w0Var.j0 != W8) {
                            w0Var.j0 = W8;
                            w0Var.invalidate();
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
                    u1Var.E8 = foVar.y9();
                    u1Var.F8 = foVar.H9();
                    boolean G9 = foVar.G9();
                    if (u1Var.G8 != G9) {
                        u1Var.G8 = G9;
                        foVar.x0.getClass();
                        int R = RecyclerView.R(view);
                        u1Var.n8 = true;
                        u1Var.forceLayout();
                        if (R >= 0) {
                            foVar.A0.m(R);
                        }
                    }
                    u1Var.H8 = foVar.V8();
                    int W82 = foVar.W8();
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
                org.telegram.ui.Components.y31 y31Var = foVar.R1;
                if (y31Var != null) {
                    y31Var.m(l4.longValue(), true);
                    break;
                }
                break;
            case 8:
                foVar.d0.c.add(((org.telegram.ui.ActionBar.u0) obj).getIconView());
                break;
            case 9:
                int intValue = ((Integer) obj).intValue();
                int i11 = fo.Hc;
                foVar.Fa(intValue);
                break;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i12 = fo.Hc;
                foVar.Fa(intValue2);
                break;
        }
    }
}
