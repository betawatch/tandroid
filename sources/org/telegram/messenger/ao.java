package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class ao implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp b;

    public /* synthetic */ ao(mp mpVar, int i7) {
        this.a = i7;
        this.b = mpVar;
    }

    @Override // org.telegram.messenger.w10
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
