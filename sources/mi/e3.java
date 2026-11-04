package mi;

import android.view.View;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class e3 implements y4 {
    public final /* synthetic */ s a;
    public final /* synthetic */ a b;
    public final /* synthetic */ String c;
    public final /* synthetic */ t3 d;

    public e3(t3 t3Var, s sVar, a aVar, String str) {
        this.d = t3Var;
        this.a = sVar;
        this.b = aVar;
        this.c = str;
    }

    @Override // mi.y4
    public final void a() {
        s sVar = this.a;
        sVar.a = 3;
        t3 t3Var = this.d;
        t3Var.h4.remove(sVar);
        t3Var.t3.remove(this.b);
        t3Var.g3.O(true);
        t3Var.p3.onContentChanged();
    }

    @Override // mi.y4
    public final void e(TLRPC.Document document) {
        String str = this.c;
        document.localPath = str;
        t3 t3Var = this.d;
        w7.G(t3Var.n3).f0(str, document);
        s sVar = this.a;
        sVar.h = document;
        sVar.a = 2;
        TL_iv.PageBlock pageBlock = this.b.b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.id;
        }
        t3Var.h4.remove(sVar);
        t3Var.g3.O(false);
        t3Var.p3.onContentChanged();
    }

    @Override // mi.y4
    public final void g(float f10) {
        this.a.f = f10;
        a aVar = this.b;
        t3 t3Var = this.d;
        View C1 = t3Var.C1(aVar);
        if (C1 instanceof y0) {
            y0 y0Var = (y0) C1;
            y0Var.g(y0Var.h());
            y0Var.l();
            y0Var.m(false);
            y0Var.requestLayout();
            y0Var.invalidate();
        }
        t3Var.p3.onContentChanged();
    }

    @Override // mi.y4
    public final /* synthetic */ void c(TLRPC.Photo photo) {
    }

    @Override // mi.y4
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // mi.y4
    public final /* synthetic */ void f(TLRPC.Document document) {
    }

    @Override // mi.y4
    public final /* synthetic */ void b(int i3, int i10) {
    }
}
