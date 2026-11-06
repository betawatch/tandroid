package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class tn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qp b;
    public final /* synthetic */ TLRPC.Dialog c;

    public /* synthetic */ tn(qp qpVar, TLRPC.Dialog dialog, int i7) {
        this.a = i7;
        this.b = qpVar;
        this.c = dialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z9 = r2.a;
                TLRPC.Dialog dialog = this.c;
                if (z9) {
                    a8.b("checkLastDialogMessage for " + dialog.id + " has not message");
                }
                qp qpVar = this.b;
                if (qpVar.getMediaDataController().R(dialog.id, 0L) == null) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) qpVar.Q.f(dialog.id);
                    if (dialog2 != null) {
                        if (r2.a) {
                            StringBuilder sb2 = new StringBuilder("checkLastDialogMessage for ");
                            sb2.append(dialog.id);
                            sb2.append(" current dialog top message ");
                            jg.g.s(dialog2.top_message, sb2);
                        }
                        if (dialog2.top_message == 0) {
                            qpVar.X(3, dialog.id, false);
                            break;
                        }
                    } else {
                        if (r2.a) {
                            a8.b("checkLastDialogMessage for " + dialog.id + " current dialog not found");
                        }
                        yr messagesStorage = qpVar.getMessagesStorage();
                        messagesStorage.a.c(new hr(messagesStorage, dialog.id, new tn(qpVar, dialog, 2), 1));
                        break;
                    }
                }
                break;
            case 1:
                this.b.d1.e(this.c.id);
                break;
            default:
                qp qpVar2 = this.b;
                qpVar2.getClass();
                qpVar2.X(3, this.c.id, false);
                break;
        }
    }
}
