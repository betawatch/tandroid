package li;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class e3 implements x4 {
    public final /* synthetic */ s a;
    public final /* synthetic */ a b;
    public final /* synthetic */ t3 c;

    public e3(a aVar, s sVar, t3 t3Var) {
        this.c = t3Var;
        this.a = sVar;
        this.b = aVar;
    }

    @Override // li.x4
    public final void a() {
        s sVar = this.a;
        sVar.a = 3;
        t3 t3Var = this.c;
        t3Var.g4.remove(sVar);
        int indexOf = t3Var.s3.indexOf(this.b);
        if (indexOf >= 0) {
            t3Var.s3.remove(indexOf);
            t3Var.f3.O(true);
        }
        t3Var.o3.onContentChanged();
    }

    @Override // li.x4
    public final void f(TLRPC.Document document) {
        s sVar = this.a;
        sVar.h = document;
        sVar.i = document;
        sVar.a = 2;
        TL_iv.PageBlock pageBlock = this.b.b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.id;
        }
        t3 t3Var = this.c;
        t3Var.g4.remove(sVar);
        t3Var.f3.O(false);
        t3Var.o3.onContentChanged();
    }

    @Override // li.x4
    public final void g(float f10) {
        this.a.f = f10;
        a aVar = this.b;
        t3 t3Var = this.c;
        View C1 = t3Var.C1(aVar);
        if (C1 instanceof x) {
            ((x) C1).n(false);
            C1.invalidate();
        }
        t3Var.o3.onContentChanged();
    }

    @Override // li.x4
    public final /* synthetic */ void c(TLRPC.Photo photo) {
    }

    @Override // li.x4
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // li.x4
    public final /* synthetic */ void e(TLRPC.Document document) {
    }

    @Override // li.x4
    public final /* synthetic */ void b(int i7, int i10) {
    }
}
