package org.telegram.ui;

import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class bf implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ co b;

    public /* synthetic */ bf(co coVar, int i10) {
        this.a = i10;
        this.b = coVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        co coVar = this.b;
        switch (i10) {
            case 0:
                MessageSuggestionParams messageSuggestionParams = (MessageSuggestionParams) obj;
                co coVar2 = this.b;
                coVar2.g5 = messageSuggestionParams;
                coVar2.p5.messageOwner.suggested_post = messageSuggestionParams.toTl();
                coVar2.yb(true, null, coVar2.p5, null, null, null, false, true);
                break;
            case 1:
                coVar.vb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    coVar.finishFragment();
                    break;
                }
                break;
            case 2:
                coVar.da((String) obj, false);
                break;
            case 3:
                coVar.Db((MessageSuggestionParams) obj);
                break;
            case 4:
                Long l4 = (Long) obj;
                org.telegram.ui.Components.w21 w21Var = coVar.R1;
                if (w21Var != null) {
                    w21Var.m(l4.longValue(), true);
                    break;
                }
                break;
            case 5:
                hs hsVar = coVar.d0;
                hsVar.c.add(((org.telegram.ui.ActionBar.v0) obj).getIconView());
                break;
            case 6:
                int intValue = ((Integer) obj).intValue();
                int i11 = co.Hc;
                coVar.Ba(intValue);
                break;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i12 = co.Hc;
                coVar.Ba(intValue2);
                break;
        }
    }
}
