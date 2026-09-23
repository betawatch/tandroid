package ii;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class g3 implements a5 {
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

    @Override // ii.a5
    public final void d(TLRPC.Document document) {
        String str = this.c;
        document.localPath = str;
        x3 x3Var = this.d;
        FileLoader.getInstance(x3Var.f3).setLocalPathTo(document, str);
        u uVar = this.a;
        uVar.h = document;
        uVar.a = 2;
        TL_iv.PageBlock pageBlock = this.b.b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.id;
        }
        x3Var.Z3.remove(uVar);
        x3Var.Y2.N(false);
        x3Var.h3.onContentChanged();
    }

    @Override // ii.a5
    public final void f(float f7) {
        this.a.f = f7;
        a aVar = this.b;
        x3 x3Var = this.d;
        View z12 = x3Var.z1(aVar);
        if (z12 instanceof a1) {
            a1 a1Var = (a1) z12;
            a1Var.h(a1Var.i());
            a1Var.k();
            a1Var.l(false);
            a1Var.requestLayout();
            a1Var.invalidate();
        }
        x3Var.h3.onContentChanged();
    }

    @Override // ii.a5
    public final void onError() {
        u uVar = this.a;
        uVar.a = 3;
        x3 x3Var = this.d;
        x3Var.Z3.remove(uVar);
        x3Var.l3.remove(this.b);
        x3Var.Y2.N(true);
        x3Var.h3.onContentChanged();
    }

    @Override // ii.a5
    public final /* synthetic */ void b(TLRPC.Photo photo) {
    }

    @Override // ii.a5
    public final /* synthetic */ void c(TLRPC.Document document) {
    }

    @Override // ii.a5
    public final /* synthetic */ void e(TLRPC.Document document) {
    }

    @Override // ii.a5
    public final /* synthetic */ void a(int i10, int i11) {
    }
}
