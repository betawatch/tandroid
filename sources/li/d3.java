package li;

import android.view.View;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class d3 implements x4 {
    public final /* synthetic */ s a;
    public final /* synthetic */ a b;
    public final /* synthetic */ String c;
    public final /* synthetic */ t3 d;

    public d3(t3 t3Var, s sVar, a aVar, String str) {
        this.d = t3Var;
        this.a = sVar;
        this.b = aVar;
        this.c = str;
    }

    @Override // li.x4
    public final void a() {
        s sVar = this.a;
        sVar.a = 3;
        t3 t3Var = this.d;
        t3Var.g4.remove(sVar);
        t3Var.s3.remove(this.b);
        t3Var.f3.O(true);
        t3Var.o3.onContentChanged();
    }

    @Override // li.x4
    public final void e(TLRPC.Document document) {
        String str = this.c;
        document.localPath = str;
        t3 t3Var = this.d;
        w7.G(t3Var.m3).e0(str, document);
        s sVar = this.a;
        sVar.h = document;
        sVar.a = 2;
        TL_iv.PageBlock pageBlock = this.b.b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.id;
        }
        t3Var.g4.remove(sVar);
        t3Var.f3.O(false);
        t3Var.o3.onContentChanged();
    }

    @Override // li.x4
    public final void g(float f10) {
        this.a.f = f10;
        a aVar = this.b;
        t3 t3Var = this.d;
        View C1 = t3Var.C1(aVar);
        if (C1 instanceof x0) {
            x0 x0Var = (x0) C1;
            x0Var.g(x0Var.h());
            x0Var.l();
            x0Var.m(false);
            x0Var.requestLayout();
            x0Var.invalidate();
        }
        t3Var.o3.onContentChanged();
    }

    @Override // li.x4
    public final /* synthetic */ void c(TLRPC.Photo photo) {
    }

    @Override // li.x4
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // li.x4
    public final /* synthetic */ void f(TLRPC.Document document) {
    }

    @Override // li.x4
    public final /* synthetic */ void b(int i7, int i10) {
    }
}
