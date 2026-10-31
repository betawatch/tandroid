package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class wn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vp b;
    public final /* synthetic */ TLRPC.Dialog c;

    public /* synthetic */ wn(vp vpVar, TLRPC.Dialog dialog, int i10) {
        this.a = i10;
        this.b = vpVar;
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
                vp vpVar = this.b;
                if (vpVar.getMediaDataController().R(dialog.id, 0L) == null) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) vpVar.Q.f(dialog.id);
                    if (dialog2 != null) {
                        if (v2.a) {
                            StringBuilder sb2 = new StringBuilder("checkLastDialogMessage for ");
                            sb2.append(dialog.id);
                            sb2.append(" current dialog top message ");
                            i0.a.p(dialog2.top_message, sb2);
                        }
                        if (dialog2.top_message == 0) {
                            vpVar.X(3, dialog.id, false);
                            break;
                        }
                    } else {
                        if (v2.a) {
                            f8.b("checkLastDialogMessage for " + dialog.id + " current dialog not found");
                        }
                        hs messagesStorage = vpVar.getMessagesStorage();
                        messagesStorage.a.c(new or(messagesStorage, dialog.id, new wn(vpVar, dialog, 2), 1));
                        break;
                    }
                }
                break;
            case 1:
                this.b.d1.e(this.c.id);
                break;
            default:
                vp vpVar2 = this.b;
                vpVar2.getClass();
                vpVar2.X(3, this.c.id, false);
                break;
        }
    }
}
