package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.sm0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class sm implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TLRPC.User d;
    public final /* synthetic */ cs e;
    public final /* synthetic */ Object f;

    public /* synthetic */ sm(hp hpVar, int i3, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.e = hpVar;
        this.b = i3;
        this.f = chat;
        this.d = user;
        this.c = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                hp hpVar = (hp) this.e;
                TLRPC.Chat chat = (TLRPC.Chat) this.f;
                hpVar.getClass();
                if (tL_error == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Integer.valueOf(this.b));
                    hpVar.getMessagesStorage().c2(chat != null ? -chat.id : this.d.id, arrayList, !this.c, -1, 0, false, null);
                    hpVar.O3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            default:
                g0.h3(new mi.q2((sm0) this.e, (String) this.f, this.b, tLObject, this.c, this.d));
                break;
        }
    }

    public /* synthetic */ sm(sm0 sm0Var, String str, int i3, boolean z10, TLRPC.User user) {
        this.e = sm0Var;
        this.f = str;
        this.b = i3;
        this.c = z10;
        this.d = user;
    }
}
