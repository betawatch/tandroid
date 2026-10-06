package ii;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class h3 implements b5 {
    public final /* synthetic */ u a;
    public final /* synthetic */ a b;
    public final /* synthetic */ x3 c;

    public h3(a aVar, u uVar, x3 x3Var) {
        this.c = x3Var;
        this.a = uVar;
        this.b = aVar;
    }

    @Override // ii.b5
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
        x3Var.g4.remove(uVar);
        x3Var.f3.N(false);
        x3Var.o3.onContentChanged();
    }

    @Override // ii.b5
    public final void f(float f7) {
        this.a.f = f7;
        a aVar = this.b;
        x3 x3Var = this.c;
        View A1 = x3Var.A1(aVar);
        if (A1 instanceof z) {
            ((z) A1).m(false);
            A1.invalidate();
        }
        x3Var.o3.onContentChanged();
    }

    @Override // ii.b5
    public final void onError() {
        u uVar = this.a;
        uVar.a = 3;
        x3 x3Var = this.c;
        x3Var.g4.remove(uVar);
        int indexOf = x3Var.s3.indexOf(this.b);
        if (indexOf >= 0) {
            x3Var.s3.remove(indexOf);
            x3Var.f3.N(true);
        }
        x3Var.o3.onContentChanged();
    }

    @Override // ii.b5
    public final /* synthetic */ void b(TLRPC.Photo photo) {
    }

    @Override // ii.b5
    public final /* synthetic */ void c(TLRPC.Document document) {
    }

    @Override // ii.b5
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // ii.b5
    public final /* synthetic */ void a(int i10, int i11) {
    }
}
