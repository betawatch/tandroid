package li;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class f3 implements z4 {
    public final /* synthetic */ t a;
    public final /* synthetic */ a b;
    public final /* synthetic */ String c;
    public final /* synthetic */ v3 d;

    public f3(v3 v3Var, t tVar, a aVar, String str) {
        this.d = v3Var;
        this.a = tVar;
        this.b = aVar;
        this.c = str;
    }

    @Override // li.z4
    public final void d(TLRPC.Document document) {
        String str = this.c;
        document.localPath = str;
        v3 v3Var = this.d;
        FileLoader.getInstance(v3Var.n3).setLocalPathTo(document, str);
        t tVar = this.a;
        tVar.h = document;
        tVar.a = 2;
        TL_iv.PageBlock pageBlock = this.b.b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.id;
        }
        v3Var.h4.remove(tVar);
        v3Var.g3.O(false);
        v3Var.p3.onContentChanged();
    }

    @Override // li.z4
    public final void f(float f7) {
        this.a.f = f7;
        a aVar = this.b;
        v3 v3Var = this.d;
        View F1 = v3Var.F1(aVar);
        if (F1 instanceof y0) {
            y0 y0Var = (y0) F1;
            y0Var.g(y0Var.h());
            y0Var.j();
            y0Var.k(false);
            y0Var.requestLayout();
            y0Var.invalidate();
        }
        v3Var.p3.onContentChanged();
    }

    @Override // li.z4
    public final void onError() {
        t tVar = this.a;
        tVar.a = 3;
        v3 v3Var = this.d;
        v3Var.h4.remove(tVar);
        v3Var.t3.remove(this.b);
        v3Var.g3.O(true);
        v3Var.p3.onContentChanged();
    }

    @Override // li.z4
    public final /* synthetic */ void b(TLRPC.Photo photo) {
    }

    @Override // li.z4
    public final /* synthetic */ void c(TLRPC.Document document) {
    }

    @Override // li.z4
    public final /* synthetic */ void e(TLRPC.Document document) {
    }

    @Override // li.z4
    public final /* synthetic */ void a(int i10, int i11) {
    }
}
