package ii;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class g3 implements b5 {
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

    @Override // ii.b5
    public final void d(TLRPC.Document document) {
        String str = this.c;
        document.localPath = str;
        x3 x3Var = this.d;
        FileLoader.getInstance(x3Var.m3).setLocalPathTo(document, str);
        u uVar = this.a;
        uVar.h = document;
        uVar.a = 2;
        TL_iv.PageBlock pageBlock = this.b.b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.id;
        }
        x3Var.g4.remove(uVar);
        x3Var.f3.N(false);
        x3Var.o3.onContentChanged();
    }

    @Override // ii.b5
    public final void f(float f7) {
        this.a.f = f7;
        a aVar = this.b;
        x3 x3Var = this.d;
        View A1 = x3Var.A1(aVar);
        if (A1 instanceof a1) {
            a1 a1Var = (a1) A1;
            a1Var.h(a1Var.i());
            a1Var.k();
            a1Var.l(false);
            a1Var.requestLayout();
            a1Var.invalidate();
        }
        x3Var.o3.onContentChanged();
    }

    @Override // ii.b5
    public final void onError() {
        u uVar = this.a;
        uVar.a = 3;
        x3 x3Var = this.d;
        x3Var.g4.remove(uVar);
        x3Var.s3.remove(this.b);
        x3Var.f3.N(true);
        x3Var.o3.onContentChanged();
    }

    @Override // ii.b5
    public final /* synthetic */ void b(TLRPC.Photo photo) {
    }

    @Override // ii.b5
    public final /* synthetic */ void c(TLRPC.Document document) {
    }

    @Override // ii.b5
    public final /* synthetic */ void e(TLRPC.Document document) {
    }

    @Override // ii.b5
    public final /* synthetic */ void a(int i10, int i11) {
    }
}
