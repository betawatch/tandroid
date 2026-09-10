package org.telegram.ui;

import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class df implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ eo b;

    public /* synthetic */ df(eo eoVar, int i10) {
        this.a = i10;
        this.b = eoVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        eo eoVar = this.b;
        switch (i10) {
            case 0:
                MessageSuggestionParams messageSuggestionParams = (MessageSuggestionParams) obj;
                eo eoVar2 = this.b;
                eoVar2.g5 = messageSuggestionParams;
                eoVar2.p5.messageOwner.suggested_post = messageSuggestionParams.toTl();
                eoVar2.yb(true, null, eoVar2.p5, null, null, null, false, true);
                break;
            case 1:
                eoVar.vb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    eoVar.finishFragment();
                    break;
                }
                break;
            case 2:
                eoVar.da((String) obj, false);
                break;
            case 3:
                eoVar.Db((MessageSuggestionParams) obj);
                break;
            case 4:
                Long l4 = (Long) obj;
                org.telegram.ui.Components.k31 k31Var = eoVar.R1;
                if (k31Var != null) {
                    k31Var.m(l4.longValue(), true);
                    break;
                }
                break;
            case 5:
                is isVar = eoVar.d0;
                isVar.c.add(((org.telegram.ui.ActionBar.w0) obj).getIconView());
                break;
            case 6:
                int intValue = ((Integer) obj).intValue();
                int i11 = eo.Hc;
                eoVar.Ba(intValue);
                break;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i12 = eo.Hc;
                eoVar.Ba(intValue2);
                break;
        }
    }
}
