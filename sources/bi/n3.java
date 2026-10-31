package bi;

import android.view.View;
import org.telegram.messenger.b8;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class n3 implements k5 {
    public final /* synthetic */ w a;
    public final /* synthetic */ a b;
    public final /* synthetic */ String c;
    public final /* synthetic */ d4 d;

    public n3(d4 d4Var, w wVar, a aVar, String str) {
        this.d = d4Var;
        this.a = wVar;
        this.b = aVar;
        this.c = str;
    }

    @Override // bi.k5
    public final void a() {
        w wVar = this.a;
        wVar.a = 3;
        d4 d4Var = this.d;
        d4Var.g4.remove(wVar);
        d4Var.s3.remove(this.b);
        d4Var.f3.O(true);
        d4Var.o3.onContentChanged();
    }

    @Override // bi.k5
    public final void e(TLRPC.Document document) {
        String str = this.c;
        document.localPath = str;
        d4 d4Var = this.d;
        b8.G(d4Var.m3).f0(str, document);
        w wVar = this.a;
        wVar.h = document;
        wVar.a = 2;
        TL_iv.PageBlock pageBlock = this.b.b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.id;
        }
        d4Var.g4.remove(wVar);
        d4Var.f3.O(false);
        d4Var.o3.onContentChanged();
    }

    @Override // bi.k5
    public final void g(float f7) {
        this.a.f = f7;
        a aVar = this.b;
        d4 d4Var = this.d;
        View C1 = d4Var.C1(aVar);
        if (C1 instanceof e1) {
            e1 e1Var = (e1) C1;
            e1Var.g(e1Var.j());
            e1Var.l();
            e1Var.m(false);
            e1Var.requestLayout();
            e1Var.invalidate();
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
    public final /* synthetic */ void f(TLRPC.Document document) {
    }

    @Override // bi.k5
    public final /* synthetic */ void b(int i10, int i11) {
    }
}
