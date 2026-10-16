package ji;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class h3 implements d5 {
    public final /* synthetic */ u a;
    public final /* synthetic */ a b;
    public final /* synthetic */ x3 c;

    public h3(a aVar, u uVar, x3 x3Var) {
        this.c = x3Var;
        this.a = uVar;
        this.b = aVar;
    }

    @Override // ji.d5
    public final void e(TLRPC.Document document) {
        u uVar = this.a;
        uVar.h = document;
        uVar.i = document;
        uVar.a = 2;
        TL_iv.PageBlock pageBlock = this.b.b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.id;
        }
        x3 x3Var = this.c;
        x3Var.X3.remove(uVar);
        x3Var.W2.N(false);
        x3Var.f3.onContentChanged();
    }

    @Override // ji.d5
    public final void f(float f7) {
        this.a.f = f7;
        a aVar = this.b;
        x3 x3Var = this.c;
        View A1 = x3Var.A1(aVar);
        if (A1 instanceof z) {
            ((z) A1).m(false);
            A1.invalidate();
        }
        x3Var.f3.onContentChanged();
    }

    @Override // ji.d5
    public final void onError() {
        u uVar = this.a;
        uVar.a = 3;
        x3 x3Var = this.c;
        x3Var.X3.remove(uVar);
        int indexOf = x3Var.j3.indexOf(this.b);
        if (indexOf >= 0) {
            x3Var.j3.remove(indexOf);
            x3Var.W2.N(true);
        }
        x3Var.f3.onContentChanged();
    }

    @Override // ji.d5
    public final /* synthetic */ void b(TLRPC.Photo photo) {
    }

    @Override // ji.d5
    public final /* synthetic */ void c(TLRPC.Document document) {
    }

    @Override // ji.d5
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // ji.d5
    public final /* synthetic */ void a(int i10, int i11) {
    }
}
