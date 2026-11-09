package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class go implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qp b;

    public /* synthetic */ go(qp qpVar, int i7) {
        this.a = i7;
        this.b = qpVar;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                TLRPC.messages_AvailableEffects messages_availableeffects = (TLRPC.messages_AvailableEffects) obj;
                qp qpVar = this.b;
                if (qpVar.h8 != messages_availableeffects) {
                    qpVar.h8 = messages_availableeffects;
                    if (messages_availableeffects != null) {
                        org.telegram.ui.Components.i5.g(qpVar.currentAccount).f(qpVar.h8.documents);
                    }
                    qpVar.getNotificationCenter().k(qs.u3, new Object[0]);
                }
                qpVar.g8 = false;
                break;
            case 1:
                g0.h3(new hi(18, this.b, (TLRPC.TL_help_appConfig) obj));
                break;
            default:
                g0.h3(new ll(this.b, (TL_account.TL_webBrowserSettings) obj, 0));
                break;
        }
    }
}
