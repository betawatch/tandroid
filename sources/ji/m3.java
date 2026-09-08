package ji;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class m3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ v3 e;

    public m3(v3 v3Var, int i10, int i11, int i12, int i13) {
        this.e = v3Var;
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = i13;
    }

    public final TL_iv.RichMessage a() {
        v3 v3Var = this.e;
        ArrayList arrayList = v3Var.l3;
        int i10 = this.a;
        a aVar = (a) arrayList.get(i10);
        ArrayList arrayList2 = v3Var.l3;
        int i11 = this.b;
        a aVar2 = (a) arrayList2.get(i11);
        TL_iv.PageBlock pageBlock = aVar.b;
        TL_iv.PageBlock pageBlock2 = aVar2.b;
        int i12 = this.d;
        TL_iv.PageBlock K1 = v3.K1(v3Var, aVar, this.c, i10 == i11 ? i12 : -1);
        TL_iv.PageBlock K12 = i10 == i11 ? null : v3.K1(v3Var, aVar2, 0, i12);
        if (K1 != null) {
            aVar.b = K1;
        }
        if (K12 != null) {
            aVar2.b = K12;
        }
        try {
            ArrayList<TL_iv.PageBlock> X2 = v3Var.X2(i10, i11 + 1, 0, false);
            ArrayList<TLRPC.Photo> z22 = v3Var.z2(i10, i11);
            ArrayList<TLRPC.Document> y22 = v3Var.y2(i10, i11);
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
