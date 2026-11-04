package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class jn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hp b;
    public final /* synthetic */ TLRPC.Dialog c;

    public /* synthetic */ jn(hp hpVar, TLRPC.Dialog dialog, int i3) {
        this.a = i3;
        this.b = hpVar;
        this.c = dialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = r2.a;
                TLRPC.Dialog dialog = this.c;
                if (z10) {
                    a8.b("checkLastDialogMessage for " + dialog.id + " has not message");
                }
                hp hpVar = this.b;
                if (hpVar.getMediaDataController().R(dialog.id, 0L) == null) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) hpVar.R.f(dialog.id);
                    if (dialog2 != null) {
                        if (r2.a) {
                            StringBuilder sb2 = new StringBuilder("checkLastDialogMessage for ");
                            sb2.append(dialog.id);
                            sb2.append(" current dialog top message ");
                            k2.p1.q(dialog2.top_message, sb2);
                        }
                        if (dialog2.top_message == 0) {
                            hpVar.X(3, dialog.id, false);
                            break;
                        }
                    } else {
                        if (r2.a) {
                            a8.b("checkLastDialogMessage for " + dialog.id + " current dialog not found");
                        }
                        qr messagesStorage = hpVar.getMessagesStorage();
                        messagesStorage.a.c(new zq(messagesStorage, dialog.id, new jn(hpVar, dialog, 2), 1));
                        break;
                    }
                }
                break;
            case 1:
                this.b.e1.e(this.c.id);
                break;
            default:
                hp hpVar2 = this.b;
                hpVar2.getClass();
                hpVar2.X(3, this.c.id, false);
                break;
        }
    }
}
