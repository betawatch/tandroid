package hi;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class j3 implements c5 {
    public final /* synthetic */ v a;
    public final /* synthetic */ a b;
    public final /* synthetic */ z3 c;

    public j3(a aVar, v vVar, z3 z3Var) {
        this.c = z3Var;
        this.a = vVar;
        this.b = aVar;
    }

    @Override // hi.c5
    public final void e(TLRPC.Document document) {
        v vVar = this.a;
        vVar.h = document;
        vVar.i = document;
        vVar.a = 2;
        TL_iv.PageBlock pageBlock = this.b.b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.id;
        }
        z3 z3Var = this.c;
        z3Var.Z3.remove(vVar);
        z3Var.Y2.N(false);
        z3Var.h3.onContentChanged();
    }

    @Override // hi.c5
    public final void f(float f7) {
        this.a.f = f7;
        a aVar = this.b;
        z3 z3Var = this.c;
        View y12 = z3Var.y1(aVar);
        if (y12 instanceof a0) {
            ((a0) y12).m(false);
            y12.invalidate();
        }
        z3Var.h3.onContentChanged();
    }

    @Override // hi.c5
    public final void onError() {
        v vVar = this.a;
        vVar.a = 3;
        z3 z3Var = this.c;
        z3Var.Z3.remove(vVar);
        int indexOf = z3Var.l3.indexOf(this.b);
        if (indexOf >= 0) {
            z3Var.l3.remove(indexOf);
            z3Var.Y2.N(true);
        }
        z3Var.h3.onContentChanged();
    }

    @Override // hi.c5
    public final /* synthetic */ void b(TLRPC.Photo photo) {
    }

    @Override // hi.c5
    public final /* synthetic */ void c(TLRPC.Document document) {
    }

    @Override // hi.c5
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // hi.c5
    public final /* synthetic */ void a(int i10, int i11) {
    }
}
