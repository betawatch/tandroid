package org.telegram.ui;

import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
                org.telegram.ui.Components.m31 m31Var = znVar.R1;
                if (m31Var != null) {
                    m31Var.m(l4.longValue(), true);
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
