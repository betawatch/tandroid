package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class id implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ id(MessagesController messagesController, long j10, Utilities.Callback callback, TLRPC.User user, int i10) {
        this.d = messagesController;
        this.b = j10;
        this.e = callback;
        this.f = user;
        this.c = i10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ((MessagesController) this.d).lambda$loadFullUser$72(this.b, (Utilities.Callback) this.e, (TLRPC.User) this.f, this.c, tLObject, tL_error);
                break;
            default:
                AndroidUtilities.runOnUIThread(new jh.t6((org.telegram.ui.Cells.d6) this.d, tLObject, (MessagesStorage) this.e, this.b, this.c, (ArrayList) this.f));
                break;
        }
    }

    public /* synthetic */ id(org.telegram.ui.Cells.d6 d6Var, MessagesStorage messagesStorage, long j10, int i10, ArrayList arrayList) {
        this.d = d6Var;
        this.e = messagesStorage;
        this.b = j10;
        this.c = i10;
        this.f = arrayList;
    }
}
