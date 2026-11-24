// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class gn0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TLRPC.Chat b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ p8c e;

    public /* synthetic */ gn0(TLRPC.Chat chat, int i, ArrayList arrayList, p8c p8cVar, byte b) {
        this.a = b;
        this.b = chat;
        this.c = i;
        this.d = arrayList;
        this.e = p8cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        p8c p8cVar = this.e;
        ArrayList arrayList = this.d;
        int i = this.c;
        TLRPC.Chat chat = this.b;
        switch (b) {
            case 0:
                if (chat == null) {
                    on0.o(i, arrayList);
                }
                p8cVar.a(arrayList);
                break;
            default:
                if (chat == null) {
                    on0.o(i, arrayList);
                }
                p8cVar.a(arrayList);
                break;
        }
    }
}
