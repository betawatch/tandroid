package hi;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class q3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ z3 e;

    public q3(z3 z3Var, int i10, int i11, int i12, int i13) {
        this.e = z3Var;
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = i13;
    }

    public final TL_iv.RichMessage a() {
        z3 z3Var = this.e;
        ArrayList arrayList = z3Var.l3;
        int i10 = this.a;
        a aVar = (a) arrayList.get(i10);
        ArrayList arrayList2 = z3Var.l3;
        int i11 = this.b;
        a aVar2 = (a) arrayList2.get(i11);
        TL_iv.PageBlock pageBlock = aVar.b;
        TL_iv.PageBlock pageBlock2 = aVar2.b;
        int i12 = this.d;
        TL_iv.PageBlock K1 = z3.K1(z3Var, aVar, this.c, i10 == i11 ? i12 : -1);
        TL_iv.PageBlock K12 = i10 == i11 ? null : z3.K1(z3Var, aVar2, 0, i12);
        if (K1 != null) {
            aVar.b = K1;
        }
        if (K12 != null) {
            aVar2.b = K12;
        }
        try {
            ArrayList<TL_iv.PageBlock> X2 = z3Var.X2(i10, i11 + 1, 0, false);
            ArrayList<TLRPC.Photo> z22 = z3Var.z2(i10, i11);
            ArrayList<TLRPC.Document> y22 = z3Var.y2(i10, i11);
            aVar.b = pageBlock;
            aVar2.b = pageBlock2;
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = X2;
            richMessage.photos = z22;
            richMessage.documents = y22;
            return richMessage;
        } catch (Throwable th2) {
            aVar.b = pageBlock;
            aVar2.b = pageBlock2;
            throw th2;
        }
    }
}
