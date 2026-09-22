package ii;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class g3 implements z4 {
    public final /* synthetic */ u a;
    public final /* synthetic */ a b;
    public final /* synthetic */ w3 c;

    public g3(a aVar, u uVar, w3 w3Var) {
        this.c = w3Var;
        this.a = uVar;
        this.b = aVar;
    }

    @Override // ii.z4
    public final void e(TLRPC.Document document) {
        u uVar = this.a;
        uVar.h = document;
        uVar.i = document;
        uVar.a = 2;
        TL_iv.PageBlock pageBlock = this.b.b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.id;
        }
        w3 w3Var = this.c;
        w3Var.Z3.remove(uVar);
        w3Var.Y2.N(false);
        w3Var.h3.onContentChanged();
    }

    @Override // ii.z4
    public final void f(float f7) {
        this.a.f = f7;
        a aVar = this.b;
        w3 w3Var = this.c;
        View A1 = w3Var.A1(aVar);
        if (A1 instanceof z) {
            ((z) A1).m(false);
            A1.invalidate();
        }
        w3Var.h3.onContentChanged();
    }

    @Override // ii.z4
    public final void onError() {
        u uVar = this.a;
        uVar.a = 3;
        w3 w3Var = this.c;
        w3Var.Z3.remove(uVar);
        int indexOf = w3Var.l3.indexOf(this.b);
        if (indexOf >= 0) {
            w3Var.l3.remove(indexOf);
            w3Var.Y2.N(true);
        }
        w3Var.h3.onContentChanged();
    }

    @Override // ii.z4
    public final /* synthetic */ void b(TLRPC.Photo photo) {
    }

    @Override // ii.z4
    public final /* synthetic */ void c(TLRPC.Document document) {
    }

    @Override // ii.z4
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // ii.z4
    public final /* synthetic */ void a(int i10, int i11) {
    }
}
