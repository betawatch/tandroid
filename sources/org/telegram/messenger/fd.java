package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class fd implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ fd(MessagesController messagesController, long j10, Utilities.Callback callback, TLRPC.User user, int i10) {
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
                AndroidUtilities.runOnUIThread(new hh.v6((org.telegram.ui.Cells.c6) this.d, tLObject, (MessagesStorage) this.e, this.b, this.c, (ArrayList) this.f));
                break;
        }
    }

    public /* synthetic */ fd(org.telegram.ui.Cells.c6 c6Var, MessagesStorage messagesStorage, long j10, int i10, ArrayList arrayList) {
        this.d = c6Var;
        this.e = messagesStorage;
        this.b = j10;
        this.c = i10;
        this.f = arrayList;
    }
}
