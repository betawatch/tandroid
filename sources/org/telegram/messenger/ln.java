package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.lo0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ln implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TLRPC.User d;
    public final /* synthetic */ us e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ln(vp vpVar, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.e = vpVar;
        this.b = i10;
        this.f = chat;
        this.d = user;
        this.c = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                vp vpVar = (vp) this.e;
                TLRPC.Chat chat = (TLRPC.Chat) this.f;
                vpVar.getClass();
                if (tL_error == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Integer.valueOf(this.b));
                    vpVar.getMessagesStorage().c2(chat != null ? -chat.id : this.d.id, arrayList, !this.c, -1, 0, false, null);
                    vpVar.L3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            default:
                i0.g3(new bi.y2((lo0) this.e, (String) this.f, this.b, tLObject, this.c, this.d));
                break;
        }
    }

    public /* synthetic */ ln(lo0 lo0Var, String str, int i10, boolean z10, TLRPC.User user) {
        this.e = lo0Var;
        this.f = str;
        this.b = i10;
        this.c = z10;
        this.d = user;
    }
}
