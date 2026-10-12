package ji;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class g3 implements d5 {
    public final /* synthetic */ u a;
    public final /* synthetic */ a b;
    public final /* synthetic */ String c;
    public final /* synthetic */ x3 d;

    public g3(x3 x3Var, u uVar, a aVar, String str) {
        this.d = x3Var;
        this.a = uVar;
        this.b = aVar;
        this.c = str;
    }

    @Override // ji.d5
    public final void d(TLRPC.Document document) {
        String str = this.c;
        document.localPath = str;
        x3 x3Var = this.d;
        FileLoader.getInstance(x3Var.d3).setLocalPathTo(document, str);
        u uVar = this.a;
        uVar.h = document;
        uVar.a = 2;
        TL_iv.PageBlock pageBlock = this.b.b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.id;
        }
        x3Var.X3.remove(uVar);
        x3Var.W2.N(false);
        x3Var.f3.onContentChanged();
    }

    @Override // ji.d5
    public final void f(float f7) {
        this.a.f = f7;
        a aVar = this.b;
        x3 x3Var = this.d;
        View A1 = x3Var.A1(aVar);
        if (A1 instanceof z0) {
            z0 z0Var = (z0) A1;
            z0Var.h(z0Var.i());
            z0Var.k();
            z0Var.l(false);
            z0Var.requestLayout();
            z0Var.invalidate();
        }
        x3Var.f3.onContentChanged();
    }

    @Override // ji.d5
    public final void onError() {
        u uVar = this.a;
        uVar.a = 3;
        x3 x3Var = this.d;
        x3Var.X3.remove(uVar);
        x3Var.j3.remove(this.b);
        x3Var.W2.N(true);
        x3Var.f3.onContentChanged();
    }

    @Override // ji.d5
    public final /* synthetic */ void b(TLRPC.Photo photo) {
    }

    @Override // ji.d5
    public final /* synthetic */ void c(TLRPC.Document document) {
    }

    @Override // ji.d5
    public final /* synthetic */ void e(TLRPC.Document document) {
    }

    @Override // ji.d5
    public final /* synthetic */ void a(int i10, int i11) {
    }
}
