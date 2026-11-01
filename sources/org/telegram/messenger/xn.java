package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class xn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wp b;
    public final /* synthetic */ TLRPC.Dialog c;

    public /* synthetic */ xn(wp wpVar, TLRPC.Dialog dialog, int i10) {
        this.a = i10;
        this.b = wpVar;
        this.c = dialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = v2.a;
                TLRPC.Dialog dialog = this.c;
                if (z10) {
                    f8.b("checkLastDialogMessage for " + dialog.id + " has not message");
                }
                wp wpVar = this.b;
                if (wpVar.getMediaDataController().R(dialog.id, 0L) == null) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) wpVar.Q.f(dialog.id);
                    if (dialog2 != null) {
                        if (v2.a) {
                            StringBuilder sb2 = new StringBuilder("checkLastDialogMessage for ");
                            sb2.append(dialog.id);
                            sb2.append(" current dialog top message ");
                            i0.a.p(dialog2.top_message, sb2);
                        }
                        if (dialog2.top_message == 0) {
                            wpVar.X(3, dialog.id, false);
                            break;
                        }
                    } else {
                        if (v2.a) {
                            f8.b("checkLastDialogMessage for " + dialog.id + " current dialog not found");
                        }
                        is messagesStorage = wpVar.getMessagesStorage();
                        messagesStorage.a.c(new pr(messagesStorage, dialog.id, new xn(wpVar, dialog, 2), 1));
                        break;
                    }
                }
                break;
            case 1:
                this.b.d1.e(this.c.id);
                break;
            default:
                wp wpVar2 = this.b;
                wpVar2.getClass();
                wpVar2.X(3, this.c.id, false);
                break;
        }
    }
}
