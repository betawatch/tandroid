package org.telegram.ui;

import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class bf implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ bf(zn znVar, int i10) {
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
                znVar2.yb(true, null, znVar2.p5, null, null, true, 0, null, false, 0L, null, true);
                break;
            case 1:
                znVar.vb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    znVar.finishFragment();
                    break;
                }
                break;
            case 2:
                znVar.da((String) obj, false);
                break;
            case 3:
                znVar.Db((MessageSuggestionParams) obj);
                break;
            case 4:
                Long l4 = (Long) obj;
                org.telegram.ui.Components.n31 n31Var = znVar.R1;
                if (n31Var != null) {
                    n31Var.m(l4.longValue(), true);
                    break;
                }
                break;
            case 5:
                hs hsVar = znVar.d0;
                hsVar.c.add(((org.telegram.ui.ActionBar.v0) obj).getIconView());
                break;
            case 6:
                int intValue = ((Integer) obj).intValue();
                int i11 = zn.Gc;
                znVar.Ba(intValue);
                break;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i12 = zn.Gc;
                znVar.Ba(intValue2);
                break;
        }
    }
}
