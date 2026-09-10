package hi;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class i3 implements c5 {
    public final /* synthetic */ v a;
    public final /* synthetic */ a b;
    public final /* synthetic */ String c;
    public final /* synthetic */ z3 d;

    public i3(z3 z3Var, v vVar, a aVar, String str) {
        this.d = z3Var;
        this.a = vVar;
        this.b = aVar;
        this.c = str;
    }

    @Override // hi.c5
    public final void d(TLRPC.Document document) {
        String str = this.c;
        document.localPath = str;
        z3 z3Var = this.d;
        FileLoader.getInstance(z3Var.f3).setLocalPathTo(document, str);
        v vVar = this.a;
        vVar.h = document;
        vVar.a = 2;
        TL_iv.PageBlock pageBlock = this.b.b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.id;
        }
        z3Var.Z3.remove(vVar);
        z3Var.Y2.N(false);
        z3Var.h3.onContentChanged();
    }

    @Override // hi.c5
    public final void f(float f7) {
        this.a.f = f7;
        a aVar = this.b;
        z3 z3Var = this.d;
        View y12 = z3Var.y1(aVar);
        if (y12 instanceof c1) {
            c1 c1Var = (c1) y12;
            c1Var.h(c1Var.i());
            c1Var.k();
            c1Var.l(false);
            c1Var.requestLayout();
            c1Var.invalidate();
        }
        z3Var.h3.onContentChanged();
    }

    @Override // hi.c5
    public final void onError() {
        v vVar = this.a;
        vVar.a = 3;
        z3 z3Var = this.d;
        z3Var.Z3.remove(vVar);
        z3Var.l3.remove(this.b);
        z3Var.Y2.N(true);
        z3Var.h3.onContentChanged();
    }

    @Override // hi.c5
    public final /* synthetic */ void b(TLRPC.Photo photo) {
    }

    @Override // hi.c5
    public final /* synthetic */ void c(TLRPC.Document document) {
    }

    @Override // hi.c5
    public final /* synthetic */ void e(TLRPC.Document document) {
    }

    @Override // hi.c5
    public final /* synthetic */ void a(int i10, int i11) {
    }
}
