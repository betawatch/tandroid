package org.telegram.ui;

import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cf implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;

    public /* synthetic */ cf(bo boVar, int i10) {
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
                boVar2.yb(true, null, boVar2.p5, null, null, true, 0, null, false, 0L, null, true);
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
                org.telegram.ui.Components.y21 y21Var = boVar.R1;
                if (y21Var != null) {
                    y21Var.m(l4.longValue(), true);
                    break;
                }
                break;
            case 5:
                js jsVar = boVar.d0;
                jsVar.c.add(((org.telegram.ui.ActionBar.w0) obj).getIconView());
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
