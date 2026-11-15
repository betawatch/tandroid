package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class co implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;

    public /* synthetic */ co(np npVar, int i7) {
        this.a = i7;
        this.b = npVar;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                TLRPC.messages_AvailableEffects messages_availableeffects = (TLRPC.messages_AvailableEffects) obj;
                np npVar = this.b;
                if (npVar.i8 != messages_availableeffects) {
                    npVar.i8 = messages_availableeffects;
                    if (messages_availableeffects != null) {
                        org.telegram.ui.Components.g5.g(npVar.currentAccount).f(npVar.i8.documents);
                    }
                    npVar.getNotificationCenter().k(ns.u3, new Object[0]);
                }
                npVar.h8 = false;
                break;
            case 1:
                g0.h3(new fi(18, this.b, (TLRPC.TL_help_appConfig) obj));
                break;
            default:
                g0.h3(new il(this.b, (TL_account.TL_webBrowserSettings) obj, 0));
                break;
        }
    }
}
