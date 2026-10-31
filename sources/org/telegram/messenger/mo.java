package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class mo implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vp b;

    public /* synthetic */ mo(vp vpVar, int i10) {
        this.a = i10;
        this.b = vpVar;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                TLRPC.messages_AvailableEffects messages_availableeffects = (TLRPC.messages_AvailableEffects) obj;
                vp vpVar = this.b;
                if (vpVar.i8 != messages_availableeffects) {
                    vpVar.i8 = messages_availableeffects;
                    if (messages_availableeffects != null) {
                        org.telegram.ui.Components.f5.g(vpVar.currentAccount).f(vpVar.i8.documents);
                    }
                    vpVar.getNotificationCenter().k(zs.u3, new Object[0]);
                }
                vpVar.h8 = false;
                break;
            case 1:
                i0.g3(new oi(17, this.b, (TLRPC.TL_help_appConfig) obj));
                break;
            default:
                i0.g3(new pl(this.b, (TL_account.TL_webBrowserSettings) obj, 0));
                break;
        }
    }
}
