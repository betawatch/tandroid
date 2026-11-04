package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class vn implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hp b;

    public /* synthetic */ vn(hp hpVar, int i3) {
        this.a = i3;
        this.b = hpVar;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                TLRPC.messages_AvailableEffects messages_availableeffects = (TLRPC.messages_AvailableEffects) obj;
                hp hpVar = this.b;
                if (hpVar.h8 != messages_availableeffects) {
                    hpVar.h8 = messages_availableeffects;
                    if (messages_availableeffects != null) {
                        org.telegram.ui.Components.g5.g(hpVar.currentAccount).f(hpVar.h8.documents);
                    }
                    hpVar.getNotificationCenter().k(hs.u3, new Object[0]);
                }
                hpVar.g8 = false;
                break;
            case 1:
                g0.h3(new yh(18, this.b, (TLRPC.TL_help_appConfig) obj));
                break;
            default:
                g0.h3(new bl(this.b, (TL_account.TL_webBrowserSettings) obj, 0));
                break;
        }
    }
}
