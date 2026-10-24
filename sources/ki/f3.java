package ki;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class f3 implements z4 {
    public final /* synthetic */ t a;
    public final /* synthetic */ a b;
    public final /* synthetic */ String c;
    public final /* synthetic */ w3 d;

    public f3(w3 w3Var, t tVar, a aVar, String str) {
        this.d = w3Var;
        this.a = tVar;
        this.b = aVar;
        this.c = str;
    }

    @Override // ki.z4
    public final void d(TLRPC.Document document) {
        String str = this.c;
        document.localPath = str;
        w3 w3Var = this.d;
        FileLoader.getInstance(w3Var.g3).setLocalPathTo(document, str);
        t tVar = this.a;
        tVar.h = document;
        tVar.a = 2;
        TL_iv.PageBlock pageBlock = this.b.b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.id;
        }
        w3Var.a4.remove(tVar);
        w3Var.Z2.N(false);
        w3Var.i3.onContentChanged();
    }

    @Override // ki.z4
    public final void f(float f7) {
        this.a.f = f7;
        a aVar = this.b;
        w3 w3Var = this.d;
        View F1 = w3Var.F1(aVar);
        if (F1 instanceof z0) {
            z0 z0Var = (z0) F1;
            z0Var.g(z0Var.h());
            z0Var.j();
            z0Var.k(false);
            z0Var.requestLayout();
            z0Var.invalidate();
        }
        w3Var.i3.onContentChanged();
    }

    @Override // ki.z4
    public final void onError() {
        t tVar = this.a;
        tVar.a = 3;
        w3 w3Var = this.d;
        w3Var.a4.remove(tVar);
        w3Var.m3.remove(this.b);
        w3Var.Z2.N(true);
        w3Var.i3.onContentChanged();
    }

    @Override // ki.z4
    public final /* synthetic */ void b(TLRPC.Photo photo) {
    }

    @Override // ki.z4
    public final /* synthetic */ void c(TLRPC.Document document) {
    }

    @Override // ki.z4
    public final /* synthetic */ void e(TLRPC.Document document) {
    }

    @Override // ki.z4
    public final /* synthetic */ void a(int i10, int i11) {
    }
}
