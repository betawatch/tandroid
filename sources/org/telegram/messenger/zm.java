package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.zm0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class zm implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TLRPC.User d;
    public final /* synthetic */ is e;
    public final /* synthetic */ Object f;

    public /* synthetic */ zm(np npVar, int i7, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.e = npVar;
        this.b = i7;
        this.f = chat;
        this.d = user;
        this.c = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                np npVar = (np) this.e;
                TLRPC.Chat chat = (TLRPC.Chat) this.f;
                npVar.getClass();
                if (tL_error == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Integer.valueOf(this.b));
                    npVar.getMessagesStorage().c2(chat != null ? -chat.id : this.d.id, arrayList, !this.c, -1, 0, false, null);
                    npVar.O3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            default:
                g0.h3(new oi.n2((zm0) this.e, (String) this.f, this.b, tLObject, this.c, this.d));
                break;
        }
    }

    public /* synthetic */ zm(zm0 zm0Var, String str, int i7, boolean z10, TLRPC.User user) {
        this.e = zm0Var;
        this.f = str;
        this.b = i7;
        this.c = z10;
        this.d = user;
    }
}
