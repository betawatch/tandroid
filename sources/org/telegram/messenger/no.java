package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class no implements r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wp b;

    public /* synthetic */ no(wp wpVar, int i10) {
        this.a = i10;
        this.b = wpVar;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                TLRPC.messages_AvailableEffects messages_availableeffects = (TLRPC.messages_AvailableEffects) obj;
                wp wpVar = this.b;
                if (wpVar.i8 != messages_availableeffects) {
                    wpVar.i8 = messages_availableeffects;
                    if (messages_availableeffects != null) {
                        org.telegram.ui.Components.f5.g(wpVar.currentAccount).f(wpVar.i8.documents);
                    }
                    wpVar.getNotificationCenter().k(at.u3, new Object[0]);
                }
                wpVar.h8 = false;
                break;
            case 1:
                i0.g3(new pi(17, this.b, (TLRPC.TL_help_appConfig) obj));
                break;
            default:
                i0.g3(new ql(this.b, (TL_account.TL_webBrowserSettings) obj, 0));
                break;
        }
    }
}
