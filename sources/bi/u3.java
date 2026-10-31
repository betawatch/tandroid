package bi;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class u3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ d4 e;

    public u3(d4 d4Var, int i10, int i11, int i12, int i13) {
        this.e = d4Var;
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = i13;
    }

    public final TL_iv.RichMessage a() {
        d4 d4Var = this.e;
        ArrayList arrayList = d4Var.s3;
        int i10 = this.a;
        a aVar = (a) arrayList.get(i10);
        ArrayList arrayList2 = d4Var.s3;
        int i11 = this.b;
        a aVar2 = (a) arrayList2.get(i11);
        TL_iv.PageBlock pageBlock = aVar.b;
        TL_iv.PageBlock pageBlock2 = aVar2.b;
        int i12 = this.d;
        TL_iv.PageBlock O1 = d4.O1(d4Var, aVar, this.c, i10 == i11 ? i12 : -1);
        TL_iv.PageBlock O12 = i10 == i11 ? null : d4.O1(d4Var, aVar2, 0, i12);
        if (O1 != null) {
            aVar.b = O1;
        }
        if (O12 != null) {
            aVar2.b = O12;
        }
        try {
            ArrayList<TL_iv.PageBlock> b32 = d4Var.b3(i10, i11 + 1, 0, false);
            ArrayList<TLRPC.Photo> D2 = d4Var.D2(i10, i11);
            ArrayList<TLRPC.Document> C2 = d4Var.C2(i10, i11);
            aVar.b = pageBlock;
            aVar2.b = pageBlock2;
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = b32;
            richMessage.photos = D2;
            richMessage.documents = C2;
            return richMessage;
        } catch (Throwable th2) {
            aVar.b = pageBlock;
            aVar2.b = pageBlock2;
            throw th2;
        }
    }
}
