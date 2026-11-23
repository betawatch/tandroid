package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class nn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;
    public final /* synthetic */ TLRPC.Dialog c;

    public /* synthetic */ nn(np npVar, TLRPC.Dialog dialog, int i7) {
        this.a = i7;
        this.b = npVar;
        this.c = dialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = s2.a;
                TLRPC.Dialog dialog = this.c;
                if (z10) {
                    a8.b("checkLastDialogMessage for " + dialog.id + " has not message");
                }
                np npVar = this.b;
                if (npVar.getMediaDataController().T(dialog.id, 0L) == null) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) npVar.R.f(dialog.id);
                    if (dialog2 != null) {
                        if (s2.a) {
                            StringBuilder sb2 = new StringBuilder("checkLastDialogMessage for ");
                            sb2.append(dialog.id);
                            sb2.append(" current dialog top message ");
                            i5.c.t(dialog2.top_message, sb2);
                        }
                        if (dialog2.top_message == 0) {
                            npVar.X(3, dialog.id, false);
                            break;
                        }
                    } else {
                        if (s2.a) {
                            a8.b("checkLastDialogMessage for " + dialog.id + " current dialog not found");
                        }
                        ur messagesStorage = npVar.getMessagesStorage();
                        messagesStorage.a.c(new cr(messagesStorage, dialog.id, new nn(npVar, dialog, 2), 1));
                        break;
                    }
                }
                break;
            case 1:
                this.b.e1.e(this.c.id);
                break;
            default:
                np npVar2 = this.b;
                npVar2.getClass();
                npVar2.X(3, this.c.id, false);
                break;
        }
    }
}
