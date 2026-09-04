package ji;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class e3 implements c5 {
    public final /* synthetic */ u a;
    public final /* synthetic */ a b;
    public final /* synthetic */ String c;
    public final /* synthetic */ v3 d;

    public e3(v3 v3Var, u uVar, a aVar, String str) {
        this.d = v3Var;
        this.a = uVar;
        this.b = aVar;
        this.c = str;
    }

    @Override // ji.c5
    public final void d(TLRPC.Document document) {
        String str = this.c;
        document.localPath = str;
        v3 v3Var = this.d;
        FileLoader.getInstance(v3Var.f3).setLocalPathTo(document, str);
        u uVar = this.a;
        uVar.h = document;
        uVar.a = 2;
        TL_iv.PageBlock pageBlock = this.b.b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.id;
        }
        v3Var.Z3.remove(uVar);
        v3Var.Y2.N(false);
        v3Var.h3.onContentChanged();
    }

    @Override // ji.c5
    public final void f(float f7) {
        this.a.f = f7;
        a aVar = this.b;
        v3 v3Var = this.d;
        View y12 = v3Var.y1(aVar);
        if (y12 instanceof z0) {
            z0 z0Var = (z0) y12;
            z0Var.h(z0Var.i());
            z0Var.k();
            z0Var.l(false);
            z0Var.requestLayout();
            z0Var.invalidate();
        }
        v3Var.h3.onContentChanged();
    }

    @Override // ji.c5
    public final void onError() {
        u uVar = this.a;
        uVar.a = 3;
        v3 v3Var = this.d;
        v3Var.Z3.remove(uVar);
        v3Var.l3.remove(this.b);
        v3Var.Y2.N(true);
        v3Var.h3.onContentChanged();
    }

    @Override // ji.c5
    public final /* synthetic */ void b(TLRPC.Photo photo) {
    }

    @Override // ji.c5
    public final /* synthetic */ void c(TLRPC.Document document) {
    }

    @Override // ji.c5
    public final /* synthetic */ void e(TLRPC.Document document) {
    }

    @Override // ji.c5
    public final /* synthetic */ void a(int i10, int i11) {
    }
}
