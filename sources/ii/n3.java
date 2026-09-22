package ii;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class n3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ w3 e;

    public n3(w3 w3Var, int i10, int i11, int i12, int i13) {
        this.e = w3Var;
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = i13;
    }

    public final TL_iv.RichMessage a() {
        w3 w3Var = this.e;
        ArrayList arrayList = w3Var.l3;
        int i10 = this.a;
        a aVar = (a) arrayList.get(i10);
        ArrayList arrayList2 = w3Var.l3;
        int i11 = this.b;
        a aVar2 = (a) arrayList2.get(i11);
        TL_iv.PageBlock pageBlock = aVar.b;
        TL_iv.PageBlock pageBlock2 = aVar2.b;
        int i12 = this.d;
        TL_iv.PageBlock L1 = w3.L1(w3Var, aVar, this.c, i10 == i11 ? i12 : -1);
        TL_iv.PageBlock L12 = i10 == i11 ? null : w3.L1(w3Var, aVar2, 0, i12);
        if (L1 != null) {
            aVar.b = L1;
        }
        if (L12 != null) {
            aVar2.b = L12;
        }
        try {
            ArrayList<TL_iv.PageBlock> Y2 = w3Var.Y2(i10, i11 + 1, 0, false);
            ArrayList<TLRPC.Photo> A2 = w3Var.A2(i10, i11);
            ArrayList<TLRPC.Document> z22 = w3Var.z2(i10, i11);
            aVar.b = pageBlock;
            aVar2.b = pageBlock2;
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = Y2;
            richMessage.photos = A2;
            richMessage.documents = z22;
            return richMessage;
        } catch (Throwable th2) {
            aVar.b = pageBlock;
            aVar2.b = pageBlock2;
            throw th2;
        }
    }
}
