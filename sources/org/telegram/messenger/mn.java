package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.jo0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class mn implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TLRPC.User d;
    public final /* synthetic */ vs e;
    public final /* synthetic */ Object f;

    public /* synthetic */ mn(wp wpVar, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.e = wpVar;
        this.b = i10;
        this.f = chat;
        this.d = user;
        this.c = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                wp wpVar = (wp) this.e;
                TLRPC.Chat chat = (TLRPC.Chat) this.f;
                wpVar.getClass();
                if (tL_error == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Integer.valueOf(this.b));
                    wpVar.getMessagesStorage().c2(chat != null ? -chat.id : this.d.id, arrayList, !this.c, -1, 0, false, null);
                    wpVar.L3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            default:
                i0.g3(new bi.y2((jo0) this.e, (String) this.f, this.b, tLObject, this.c, this.d));
                break;
        }
    }

    public /* synthetic */ mn(jo0 jo0Var, String str, int i10, boolean z10, TLRPC.User user) {
        this.e = jo0Var;
        this.f = str;
        this.b = i10;
        this.c = z10;
        this.d = user;
    }
}
