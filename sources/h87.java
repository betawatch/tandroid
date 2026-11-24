// default package

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class h87 implements RequestDelegate {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TLRPC.User d;
    public final /* synthetic */ gk7 e;
    public final /* synthetic */ Object f;

    public /* synthetic */ h87(na7 na7Var, int i, TLRPC.Chat chat, TLRPC.User user, boolean z) {
        this.e = na7Var;
        this.b = i;
        this.f = chat;
        this.d = user;
        this.c = z;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.f;
        gk7 gk7Var = this.e;
        switch (b) {
            case 0:
                na7 na7Var = (na7) gk7Var;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                na7Var.getClass();
                if (tL_error == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Integer.valueOf(this.b));
                    na7Var.getMessagesStorage().Z1(chat != null ? -chat.id : this.d.id, arrayList, !this.c, -1, 0, false, null);
                    na7Var.R3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            default:
                gl.c3(new m05((u58) gk7Var, (String) obj, this.b, tLObject, this.c, this.d));
                break;
        }
    }

    public /* synthetic */ h87(u58 u58Var, String str, int i, boolean z, TLRPC.User user) {
        this.e = u58Var;
        this.f = str;
        this.b = i;
        this.c = z;
        this.d = user;
    }
}
