// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class gi9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ pi9 e;

    public gi9(pi9 pi9Var, int i, int i2, int i3, int i4) {
        this.e = pi9Var;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final TL_iv.RichMessage a() {
        pi9 pi9Var = this.e;
        ArrayList arrayList = pi9Var.t3;
        int i = this.a;
        mk0 mk0Var = (mk0) arrayList.get(i);
        ArrayList arrayList2 = pi9Var.t3;
        int i2 = this.b;
        mk0 mk0Var2 = (mk0) arrayList2.get(i2);
        TL_iv.PageBlock pageBlock = mk0Var.b;
        TL_iv.PageBlock pageBlock2 = mk0Var2.b;
        int i3 = this.d;
        TL_iv.PageBlock L4 = pi9Var.L4(mk0Var, this.c, i == i2 ? i3 : -1);
        TL_iv.PageBlock L42 = i == i2 ? null : pi9Var.L4(mk0Var2, 0, i3);
        if (L4 != null) {
            mk0Var.b = L4;
        }
        if (L42 != null) {
            mk0Var2.b = L42;
        }
        try {
            ArrayList<TL_iv.PageBlock> V2 = pi9Var.V2(i, i2 + 1, 0, false);
            ArrayList<TLRPC.Photo> x2 = pi9Var.x2(i, i2);
            ArrayList<TLRPC.Document> w2 = pi9Var.w2(i, i2);
            mk0Var.b = pageBlock;
            mk0Var2.b = pageBlock2;
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = V2;
            richMessage.photos = x2;
            richMessage.documents = w2;
            return richMessage;
        } catch (Throwable th) {
            mk0Var.b = pageBlock;
            mk0Var2.b = pageBlock2;
            throw th;
        }
    }
}
