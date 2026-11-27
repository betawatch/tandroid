// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gn0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TLRPC.Chat b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ pcc e;

    public /* synthetic */ gn0(TLRPC.Chat chat, int i, ArrayList arrayList, pcc pccVar, byte b) {
        this.a = b;
        this.b = chat;
        this.c = i;
        this.d = arrayList;
        this.e = pccVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        pcc pccVar = this.e;
        ArrayList arrayList = this.d;
        int i = this.c;
        TLRPC.Chat chat = this.b;
        switch (b) {
            case 0:
                if (chat == null) {
                    on0.o(i, arrayList);
                }
                pccVar.a(arrayList);
                break;
            default:
                if (chat == null) {
                    on0.o(i, arrayList);
                }
                pccVar.a(arrayList);
                break;
        }
    }
}
