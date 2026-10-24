package ki;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
        ArrayList arrayList = w3Var.m3;
        int i10 = this.a;
        a aVar = (a) arrayList.get(i10);
        ArrayList arrayList2 = w3Var.m3;
        int i11 = this.b;
        a aVar2 = (a) arrayList2.get(i11);
        TL_iv.PageBlock pageBlock = aVar.b;
        TL_iv.PageBlock pageBlock2 = aVar2.b;
        int i12 = this.d;
        TL_iv.PageBlock R1 = w3.R1(w3Var, aVar, this.c, i10 == i11 ? i12 : -1);
        TL_iv.PageBlock R12 = i10 == i11 ? null : w3.R1(w3Var, aVar2, 0, i12);
        if (R1 != null) {
            aVar.b = R1;
        }
        if (R12 != null) {
            aVar2.b = R12;
        }
        try {
            ArrayList<TL_iv.PageBlock> e32 = w3Var.e3(i10, i11 + 1, 0, false);
            ArrayList<TLRPC.Photo> G2 = w3Var.G2(i10, i11);
            ArrayList<TLRPC.Document> F2 = w3Var.F2(i10, i11);
            aVar.b = pageBlock;
            aVar2.b = pageBlock2;
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = e32;
            richMessage.photos = G2;
            richMessage.documents = F2;
            return richMessage;
        } catch (Throwable th2) {
            aVar.b = pageBlock;
            aVar2.b = pageBlock2;
            throw th2;
        }
    }
}
