package ki;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class g3 implements z4 {
    public final /* synthetic */ t a;
    public final /* synthetic */ a b;
    public final /* synthetic */ w3 c;

    public g3(a aVar, t tVar, w3 w3Var) {
        this.c = w3Var;
        this.a = tVar;
        this.b = aVar;
    }

    @Override // ki.z4
    public final void e(TLRPC.Document document) {
        t tVar = this.a;
        tVar.h = document;
        tVar.i = document;
        tVar.a = 2;
        TL_iv.PageBlock pageBlock = this.b.b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.id;
        }
        w3 w3Var = this.c;
        w3Var.X3.remove(tVar);
        w3Var.W2.N(false);
        w3Var.f3.onContentChanged();
    }

    @Override // ki.z4
    public final void f(float f7) {
        this.a.f = f7;
        a aVar = this.b;
        w3 w3Var = this.c;
        View A1 = w3Var.A1(aVar);
        if (A1 instanceof z) {
            ((z) A1).m(false);
            A1.invalidate();
        }
        w3Var.f3.onContentChanged();
    }

    @Override // ki.z4
    public final void onError() {
        t tVar = this.a;
        tVar.a = 3;
        w3 w3Var = this.c;
        w3Var.X3.remove(tVar);
        int indexOf = w3Var.j3.indexOf(this.b);
        if (indexOf >= 0) {
            w3Var.j3.remove(indexOf);
            w3Var.W2.N(true);
        }
        w3Var.f3.onContentChanged();
    }

    @Override // ki.z4
    public final /* synthetic */ void b(TLRPC.Photo photo) {
    }

    @Override // ki.z4
    public final /* synthetic */ void c(TLRPC.Document document) {
    }

    @Override // ki.z4
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // ki.z4
    public final /* synthetic */ void a(int i10, int i11) {
    }
}
