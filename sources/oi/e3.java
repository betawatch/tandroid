package oi;

import android.view.View;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class e3 implements x4 {
    public final /* synthetic */ r a;
    public final /* synthetic */ a b;
    public final /* synthetic */ String c;
    public final /* synthetic */ t3 d;

    public e3(t3 t3Var, r rVar, a aVar, String str) {
        this.d = t3Var;
        this.a = rVar;
        this.b = aVar;
        this.c = str;
    }

    @Override // oi.x4
    public final void a() {
        r rVar = this.a;
        rVar.a = 3;
        t3 t3Var = this.d;
        t3Var.h4.remove(rVar);
        t3Var.t3.remove(this.b);
        t3Var.g3.O(true);
        t3Var.p3.onContentChanged();
    }

    @Override // oi.x4
    public final void e(TLRPC.Document document) {
        String str = this.c;
        document.localPath = str;
        t3 t3Var = this.d;
        w7.G(t3Var.n3).e0(str, document);
        r rVar = this.a;
        rVar.h = document;
        rVar.a = 2;
        TL_iv.PageBlock pageBlock = this.b.b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.id;
        }
        t3Var.h4.remove(rVar);
        t3Var.g3.O(false);
        t3Var.p3.onContentChanged();
    }

    @Override // oi.x4
    public final void g(float f10) {
        this.a.f = f10;
        a aVar = this.b;
        t3 t3Var = this.d;
        View C1 = t3Var.C1(aVar);
        if (C1 instanceof w0) {
            w0 w0Var = (w0) C1;
            w0Var.g(w0Var.h());
            w0Var.l();
            w0Var.m(false);
            w0Var.requestLayout();
            w0Var.invalidate();
        }
        t3Var.p3.onContentChanged();
    }

    @Override // oi.x4
    public final /* synthetic */ void c(TLRPC.Photo photo) {
    }

    @Override // oi.x4
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // oi.x4
    public final /* synthetic */ void f(TLRPC.Document document) {
    }

    @Override // oi.x4
    public final /* synthetic */ void b(int i7, int i10) {
    }
}
