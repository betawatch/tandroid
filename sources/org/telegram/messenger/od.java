package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class od implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ od(MessagesController messagesController, long j3, Utilities.Callback callback, TLRPC.User user, int i10) {
        this.d = messagesController;
        this.b = j3;
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
                AndroidUtilities.runOnUIThread(new di.s3((org.telegram.ui.Cells.h6) this.d, tLObject, (MessagesStorage) this.e, this.b, this.c, (ArrayList) this.f, 2));
                break;
        }
    }

    public /* synthetic */ od(org.telegram.ui.Cells.h6 h6Var, MessagesStorage messagesStorage, long j3, int i10, ArrayList arrayList) {
        this.d = h6Var;
        this.e = messagesStorage;
        this.b = j3;
        this.c = i10;
        this.f = arrayList;
    }
}
