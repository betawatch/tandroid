package org.telegram.ui;

import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class af implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;

    public /* synthetic */ af(bo boVar, int i10) {
        this.a = i10;
        this.b = boVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        bo boVar = this.b;
        switch (i10) {
            case 0:
                MessageSuggestionParams messageSuggestionParams = (MessageSuggestionParams) obj;
                bo boVar2 = this.b;
                boVar2.g5 = messageSuggestionParams;
                boVar2.p5.messageOwner.suggested_post = messageSuggestionParams.toTl();
                boVar2.yb(true, null, boVar2.p5, null, null, null, false, true);
                break;
            case 1:
                boVar.vb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    boVar.finishFragment();
                    break;
                }
                break;
            case 2:
                boVar.da((String) obj, false);
                break;
            case 3:
                boVar.Db((MessageSuggestionParams) obj);
                break;
            case 4:
                Long l4 = (Long) obj;
                org.telegram.ui.Components.x21 x21Var = boVar.R1;
                if (x21Var != null) {
                    x21Var.m(l4.longValue(), true);
                    break;
                }
                break;
            case 5:
                hs hsVar = boVar.d0;
                hsVar.c.add(((org.telegram.ui.ActionBar.v0) obj).getIconView());
                break;
            case 6:
                int intValue = ((Integer) obj).intValue();
                int i11 = bo.Gc;
                boVar.Ba(intValue);
                break;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i12 = bo.Gc;
                boVar.Ba(intValue2);
                break;
        }
    }
}
