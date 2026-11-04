package mi;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class k3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ t3 e;

    public k3(t3 t3Var, int i3, int i10, int i11, int i12) {
        this.e = t3Var;
        this.a = i3;
        this.b = i10;
        this.c = i11;
        this.d = i12;
    }

    public final TL_iv.RichMessage a() {
        t3 t3Var = this.e;
        ArrayList arrayList = t3Var.t3;
        int i3 = this.a;
        a aVar = (a) arrayList.get(i3);
        ArrayList arrayList2 = t3Var.t3;
        int i10 = this.b;
        a aVar2 = (a) arrayList2.get(i10);
        TL_iv.PageBlock pageBlock = aVar.b;
        TL_iv.PageBlock pageBlock2 = aVar2.b;
        int i11 = this.d;
        TL_iv.PageBlock P1 = t3.P1(t3Var, aVar, this.c, i3 == i10 ? i11 : -1);
        TL_iv.PageBlock P12 = i3 == i10 ? null : t3.P1(t3Var, aVar2, 0, i11);
        if (P1 != null) {
            aVar.b = P1;
        }
        if (P12 != null) {
            aVar2.b = P12;
        }
        try {
            ArrayList<TL_iv.PageBlock> b32 = t3Var.b3(i3, i10 + 1, 0, false);
            ArrayList<TLRPC.Photo> D2 = t3Var.D2(i3, i10);
            ArrayList<TLRPC.Document> C2 = t3Var.C2(i3, i10);
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
