package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class bo implements y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;

    public /* synthetic */ bo(np npVar, int i7) {
        this.a = i7;
        this.b = npVar;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                TLRPC.messages_AvailableEffects messages_availableeffects = (TLRPC.messages_AvailableEffects) obj;
                np npVar = this.b;
                if (npVar.n8 != messages_availableeffects) {
                    npVar.n8 = messages_availableeffects;
                    if (messages_availableeffects != null) {
                        org.telegram.ui.Components.p5.g(npVar.currentAccount).f(npVar.n8.documents);
                    }
                    npVar.getNotificationCenter().k(ls.w3, new Object[0]);
                }
                npVar.m8 = false;
                break;
            case 1:
                g0.g3(new gi(17, this.b, (TLRPC.TL_help_appConfig) obj));
                break;
            default:
                g0.g3(new kl(this.b, (TL_account.TL_webBrowserSettings) obj, 1));
                break;
        }
    }
}
