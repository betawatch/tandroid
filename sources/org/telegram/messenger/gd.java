package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class gd implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ gd(MessagesController messagesController, long j3, Utilities.Callback callback, TLRPC.User user, int i10) {
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
                AndroidUtilities.runOnUIThread(new fi.p3((org.telegram.ui.Cells.f6) this.d, tLObject, (MessagesStorage) this.e, this.b, this.c, (ArrayList) this.f, 2));
                break;
        }
    }

    public /* synthetic */ gd(org.telegram.ui.Cells.f6 f6Var, MessagesStorage messagesStorage, long j3, int i10, ArrayList arrayList) {
        this.d = f6Var;
        this.e = messagesStorage;
        this.b = j3;
        this.c = i10;
        this.f = arrayList;
    }
}
