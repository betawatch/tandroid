package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.cn0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class an implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TLRPC.User d;
    public final /* synthetic */ fs e;
    public final /* synthetic */ Object f;

    public /* synthetic */ an(mp mpVar, int i7, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.e = mpVar;
        this.b = i7;
        this.f = chat;
        this.d = user;
        this.c = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                mp mpVar = (mp) this.e;
                TLRPC.Chat chat = (TLRPC.Chat) this.f;
                mpVar.getClass();
                if (tL_error == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Integer.valueOf(this.b));
                    mpVar.getMessagesStorage().c2(chat != null ? -chat.id : this.d.id, arrayList, !this.c, -1, 0, false, null);
                    mpVar.V3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            default:
                g0.g3(new oi.o2((cn0) this.e, (String) this.f, this.b, tLObject, this.c, this.d));
                break;
        }
    }

    public /* synthetic */ an(cn0 cn0Var, String str, int i7, boolean z10, TLRPC.User user) {
        this.e = cn0Var;
        this.f = str;
        this.b = i7;
        this.c = z10;
        this.d = user;
    }
}
