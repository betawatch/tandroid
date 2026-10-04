package ii;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final class o3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ x3 e;

    public o3(x3 x3Var, int i10, int i11, int i12, int i13) {
        this.e = x3Var;
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = i13;
    }

    public final TL_iv.RichMessage a() {
        x3 x3Var = this.e;
        ArrayList arrayList = x3Var.s3;
        int i10 = this.a;
        a aVar = (a) arrayList.get(i10);
        ArrayList arrayList2 = x3Var.s3;
        int i11 = this.b;
        a aVar2 = (a) arrayList2.get(i11);
        TL_iv.PageBlock pageBlock = aVar.b;
        TL_iv.PageBlock pageBlock2 = aVar2.b;
        int i12 = this.d;
        TL_iv.PageBlock N1 = x3.N1(x3Var, aVar, this.c, i10 == i11 ? i12 : -1);
        TL_iv.PageBlock N12 = i10 == i11 ? null : x3.N1(x3Var, aVar2, 0, i12);
        if (N1 != null) {
            aVar.b = N1;
        }
        if (N12 != null) {
            aVar2.b = N12;
        }
        try {
            ArrayList<TL_iv.PageBlock> a32 = x3Var.a3(i10, i11 + 1, 0, false);
            ArrayList<TLRPC.Photo> C2 = x3Var.C2(i10, i11);
            ArrayList<TLRPC.Document> B2 = x3Var.B2(i10, i11);
            aVar.b = pageBlock;
            aVar2.b = pageBlock2;
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = a32;
            richMessage.photos = C2;
            richMessage.documents = B2;
            return richMessage;
        } catch (Throwable th2) {
            aVar.b = pageBlock;
            aVar2.b = pageBlock2;
            throw th2;
        }
    }
}
