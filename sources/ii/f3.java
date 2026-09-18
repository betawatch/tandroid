package ii;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final class f3 implements z4 {
    public final /* synthetic */ u a;
    public final /* synthetic */ a b;
    public final /* synthetic */ String c;
    public final /* synthetic */ w3 d;

    public f3(w3 w3Var, u uVar, a aVar, String str) {
        this.d = w3Var;
        this.a = uVar;
        this.b = aVar;
        this.c = str;
    }

    @Override // ii.z4
    public final void d(TLRPC.Document document) {
        String str = this.c;
        document.localPath = str;
        w3 w3Var = this.d;
        FileLoader.getInstance(w3Var.f3).setLocalPathTo(document, str);
        u uVar = this.a;
        uVar.h = document;
        uVar.a = 2;
        TL_iv.PageBlock pageBlock = this.b.b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.id;
        }
        w3Var.Z3.remove(uVar);
        w3Var.Y2.N(false);
        w3Var.h3.onContentChanged();
    }

    @Override // ii.z4
    public final void f(float f7) {
        this.a.f = f7;
        a aVar = this.b;
        w3 w3Var = this.d;
        View A1 = w3Var.A1(aVar);
        if (A1 instanceof a1) {
            a1 a1Var = (a1) A1;
            a1Var.h(a1Var.i());
            a1Var.k();
            a1Var.l(false);
            a1Var.requestLayout();
            a1Var.invalidate();
        }
        w3Var.h3.onContentChanged();
    }

    @Override // ii.z4
    public final void onError() {
        u uVar = this.a;
        uVar.a = 3;
        w3 w3Var = this.d;
        w3Var.Z3.remove(uVar);
        w3Var.l3.remove(this.b);
        w3Var.Y2.N(true);
        w3Var.h3.onContentChanged();
    }

    @Override // ii.z4
    public final /* synthetic */ void b(TLRPC.Photo photo) {
    }

    @Override // ii.z4
    public final /* synthetic */ void c(TLRPC.Document document) {
    }

    @Override // ii.z4
    public final /* synthetic */ void e(TLRPC.Document document) {
    }

    @Override // ii.z4
    public final /* synthetic */ void a(int i10, int i11) {
    }
}
