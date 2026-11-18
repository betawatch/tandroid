package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class ao implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp b;

    public /* synthetic */ ao(mp mpVar, int i7) {
        this.a = i7;
        this.b = mpVar;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                TLRPC.messages_AvailableEffects messages_availableeffects = (TLRPC.messages_AvailableEffects) obj;
                mp mpVar = this.b;
                if (mpVar.n8 != messages_availableeffects) {
                    mpVar.n8 = messages_availableeffects;
                    if (messages_availableeffects != null) {
                        org.telegram.ui.Components.o5.g(mpVar.currentAccount).f(mpVar.n8.documents);
                    }
                    mpVar.getNotificationCenter().k(ks.w3, new Object[0]);
                }
                mpVar.m8 = false;
                break;
            case 1:
                g0.g3(new fi(17, this.b, (TLRPC.TL_help_appConfig) obj));
                break;
            default:
                g0.g3(new jl(this.b, (TL_account.TL_webBrowserSettings) obj, 1));
                break;
        }
    }
}
