// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class go0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TLRPC.Chat b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ qac e;

    public /* synthetic */ go0(TLRPC.Chat chat, int i, ArrayList arrayList, qac qacVar, byte b) {
        this.a = b;
        this.b = chat;
        this.c = i;
        this.d = arrayList;
        this.e = qacVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        qac qacVar = this.e;
        ArrayList arrayList = this.d;
        int i = this.c;
        TLRPC.Chat chat = this.b;
        switch (b) {
            case 0:
                if (chat == null) {
                    oo0.o(i, arrayList);
                }
                qacVar.a(arrayList);
                break;
            default:
                if (chat == null) {
                    oo0.o(i, arrayList);
                }
                qacVar.a(arrayList);
                break;
        }
    }
}
