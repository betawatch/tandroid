package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class mn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp b;
    public final /* synthetic */ TLRPC.Dialog c;

    public /* synthetic */ mn(mp mpVar, TLRPC.Dialog dialog, int i7) {
        this.a = i7;
        this.b = mpVar;
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
                mp mpVar = this.b;
                if (mpVar.getMediaDataController().T(dialog.id, 0L) == null) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) mpVar.R.f(dialog.id);
                    if (dialog2 != null) {
                        if (s2.a) {
                            StringBuilder sb2 = new StringBuilder("checkLastDialogMessage for ");
                            sb2.append(dialog.id);
                            sb2.append(" current dialog top message ");
                            i5.c.t(dialog2.top_message, sb2);
                        }
                        if (dialog2.top_message == 0) {
                            mpVar.X(3, dialog.id, false);
                            break;
                        }
                    } else {
                        if (s2.a) {
                            a8.b("checkLastDialogMessage for " + dialog.id + " current dialog not found");
                        }
                        tr messagesStorage = mpVar.getMessagesStorage();
                        messagesStorage.a.c(new br(messagesStorage, dialog.id, new mn(mpVar, dialog, 2), 1));
                        break;
                    }
                }
                break;
            case 1:
                this.b.e1.e(this.c.id);
                break;
            default:
                mp mpVar2 = this.b;
                mpVar2.getClass();
                mpVar2.X(3, this.c.id, false);
                break;
        }
    }
}
