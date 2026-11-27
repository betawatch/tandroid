// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
