package oi;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class h3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ q3 e;

    public h3(q3 q3Var, int i7, int i10, int i11, int i12) {
        this.e = q3Var;
        this.a = i7;
        this.b = i10;
        this.c = i11;
        this.d = i12;
    }

    public final TL_iv.RichMessage a() {
        q3 q3Var = this.e;
        ArrayList arrayList = q3Var.t3;
        int i7 = this.a;
        a aVar = (a) arrayList.get(i7);
        ArrayList arrayList2 = q3Var.t3;
        int i10 = this.b;
        a aVar2 = (a) arrayList2.get(i10);
        TL_iv.PageBlock pageBlock = aVar.b;
        TL_iv.PageBlock pageBlock2 = aVar2.b;
        int i11 = this.d;
        TL_iv.PageBlock P1 = q3.P1(q3Var, aVar, this.c, i7 == i10 ? i11 : -1);
        TL_iv.PageBlock P12 = i7 == i10 ? null : q3.P1(q3Var, aVar2, 0, i11);
        if (P1 != null) {
            aVar.b = P1;
        }
        if (P12 != null) {
            aVar2.b = P12;
        }
        try {
            ArrayList<TL_iv.PageBlock> b32 = q3Var.b3(i7, i10 + 1, 0, false);
            ArrayList<TLRPC.Photo> D2 = q3Var.D2(i7, i10);
            ArrayList<TLRPC.Document> C2 = q3Var.C2(i7, i10);
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
