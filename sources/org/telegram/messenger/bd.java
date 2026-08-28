package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class bd implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ bd(MessagesController messagesController, long j10, Utilities.Callback callback, TLRPC.User user, int i9) {
        this.d = messagesController;
        this.b = j10;
        this.e = callback;
        this.f = user;
        this.c = i9;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ((MessagesController) this.d).lambda$loadFullUser$72(this.b, (Utilities.Callback) this.e, (TLRPC.User) this.f, this.c, tLObject, tL_error);
                break;
            default:
                AndroidUtilities.runOnUIThread(new gh.w6((org.telegram.ui.Cells.f6) this.d, tLObject, (MessagesStorage) this.e, this.b, this.c, (ArrayList) this.f));
                break;
        }
    }

    public /* synthetic */ bd(org.telegram.ui.Cells.f6 f6Var, MessagesStorage messagesStorage, long j10, int i9, ArrayList arrayList) {
        this.d = f6Var;
        this.e = messagesStorage;
        this.b = j10;
        this.c = i9;
        this.f = arrayList;
    }
}
