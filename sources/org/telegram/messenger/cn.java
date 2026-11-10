package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.an0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class cn implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TLRPC.User d;
    public final /* synthetic */ ls e;
    public final /* synthetic */ Object f;

    public /* synthetic */ cn(qp qpVar, int i7, TLRPC.Chat chat, TLRPC.User user, boolean z9) {
        this.e = qpVar;
        this.b = i7;
        this.f = chat;
        this.d = user;
        this.c = z9;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                qp qpVar = (qp) this.e;
                TLRPC.Chat chat = (TLRPC.Chat) this.f;
                qpVar.getClass();
                if (tL_error == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Integer.valueOf(this.b));
                    qpVar.getMessagesStorage().c2(chat != null ? -chat.id : this.d.id, arrayList, !this.c, -1, 0, false, null);
                    qpVar.O3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            default:
                g0.h3(new li.p2((an0) this.e, (String) this.f, this.b, tLObject, this.c, this.d));
                break;
        }
    }

    public /* synthetic */ cn(an0 an0Var, String str, int i7, boolean z9, TLRPC.User user) {
        this.e = an0Var;
        this.f = str;
        this.b = i7;
        this.c = z9;
        this.d = user;
    }
}
