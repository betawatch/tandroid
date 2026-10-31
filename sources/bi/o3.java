package bi;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class o3 implements k5 {
    public final /* synthetic */ w a;
    public final /* synthetic */ a b;
    public final /* synthetic */ d4 c;

    public o3(a aVar, w wVar, d4 d4Var) {
        this.c = d4Var;
        this.a = wVar;
        this.b = aVar;
    }

    @Override // bi.k5
    public final void a() {
        w wVar = this.a;
        wVar.a = 3;
        d4 d4Var = this.c;
        d4Var.g4.remove(wVar);
        int indexOf = d4Var.s3.indexOf(this.b);
        if (indexOf >= 0) {
            d4Var.s3.remove(indexOf);
            d4Var.f3.O(true);
        }
        d4Var.o3.onContentChanged();
    }

    @Override // bi.k5
    public final void f(TLRPC.Document document) {
        w wVar = this.a;
        wVar.h = document;
        wVar.i = document;
        wVar.a = 2;
        TL_iv.PageBlock pageBlock = this.b.b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.id;
        }
        d4 d4Var = this.c;
        d4Var.g4.remove(wVar);
        d4Var.f3.O(false);
        d4Var.o3.onContentChanged();
    }

    @Override // bi.k5
    public final void g(float f7) {
        this.a.f = f7;
        a aVar = this.b;
        d4 d4Var = this.c;
        View C1 = d4Var.C1(aVar);
        if (C1 instanceof b0) {
            ((b0) C1).o(false);
            C1.invalidate();
        }
        d4Var.o3.onContentChanged();
    }

    @Override // bi.k5
    public final /* synthetic */ void c(TLRPC.Photo photo) {
    }

    @Override // bi.k5
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // bi.k5
    public final /* synthetic */ void e(TLRPC.Document document) {
    }

    @Override // bi.k5
    public final /* synthetic */ void b(int i10, int i11) {
    }
}
