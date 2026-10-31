package mg;

import java.util.ArrayList;
import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.Chat b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ q20 e;

    public /* synthetic */ a0(TLRPC.Chat chat, int i10, ArrayList arrayList, q20 q20Var, int i11) {
        this.a = i11;
        this.b = chat;
        this.c = i10;
        this.d = arrayList;
        this.e = q20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TLRPC.Chat chat = this.b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    k0.m(this.c, arrayList);
                }
                this.e.a(arrayList);
                break;
            default:
                TLRPC.Chat chat2 = this.b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    k0.m(this.c, arrayList2);
                }
                this.e.a(arrayList2);
                break;
        }
    }
}
