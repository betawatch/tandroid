// default package

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ia7 implements RequestDelegate {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TLRPC.User d;
    public final /* synthetic */ jm7 e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ia7(oc7 oc7Var, int i, TLRPC.Chat chat, TLRPC.User user, boolean z) {
        this.e = oc7Var;
        this.b = i;
        this.f = chat;
        this.d = user;
        this.c = z;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.f;
        jm7 jm7Var = this.e;
        switch (b) {
            case 0:
                oc7 oc7Var = (oc7) jm7Var;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                oc7Var.getClass();
                if (tL_error == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Integer.valueOf(this.b));
                    oc7Var.getMessagesStorage().Z1(chat != null ? -chat.id : this.d.id, arrayList, !this.c, -1, 0, false, null);
                    oc7Var.T3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            default:
                gm.c3(new m25((w78) jm7Var, (String) obj, this.b, tLObject, this.c, this.d));
                break;
        }
    }

    public /* synthetic */ ia7(w78 w78Var, String str, int i, boolean z, TLRPC.User user) {
        this.e = w78Var;
        this.f = str;
        this.b = i;
        this.c = z;
        this.d = user;
    }
}
