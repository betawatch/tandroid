package ii;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
        TL_iv.PageBlock M1 = w3.M1(w3Var, aVar, this.c, i10 == i11 ? i12 : -1);
        TL_iv.PageBlock M12 = i10 == i11 ? null : w3.M1(w3Var, aVar2, 0, i12);
        if (M1 != null) {
            aVar.b = M1;
        }
        if (M12 != null) {
            aVar2.b = M12;
        }
        try {
            ArrayList<TL_iv.PageBlock> Z2 = w3Var.Z2(i10, i11 + 1, 0, false);
            ArrayList<TLRPC.Photo> B2 = w3Var.B2(i10, i11);
            ArrayList<TLRPC.Document> A2 = w3Var.A2(i10, i11);
            aVar.b = pageBlock;
            aVar2.b = pageBlock2;
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = Z2;
            richMessage.photos = B2;
            richMessage.documents = A2;
            return richMessage;
        } catch (Throwable th2) {
            aVar.b = pageBlock;
            aVar2.b = pageBlock2;
            throw th2;
        }
    }
}
