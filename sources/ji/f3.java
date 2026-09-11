package ji;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class f3 implements c5 {
    public final /* synthetic */ u a;
    public final /* synthetic */ a b;
    public final /* synthetic */ v3 c;

    public f3(a aVar, u uVar, v3 v3Var) {
        this.c = v3Var;
        this.a = uVar;
        this.b = aVar;
    }

    @Override // ji.c5
    public final void e(TLRPC.Document document) {
        u uVar = this.a;
        uVar.h = document;
        uVar.i = document;
        uVar.a = 2;
        TL_iv.PageBlock pageBlock = this.b.b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.id;
        }
        v3 v3Var = this.c;
        v3Var.Z3.remove(uVar);
        v3Var.Y2.N(false);
        v3Var.h3.onContentChanged();
    }

    @Override // ji.c5
    public final void f(float f7) {
        this.a.f = f7;
        a aVar = this.b;
        v3 v3Var = this.c;
        View y12 = v3Var.y1(aVar);
        if (y12 instanceof z) {
            ((z) y12).m(false);
            y12.invalidate();
        }
        v3Var.h3.onContentChanged();
    }

    @Override // ji.c5
    public final void onError() {
        u uVar = this.a;
        uVar.a = 3;
        v3 v3Var = this.c;
        v3Var.Z3.remove(uVar);
        int indexOf = v3Var.l3.indexOf(this.b);
        if (indexOf >= 0) {
            v3Var.l3.remove(indexOf);
            v3Var.Y2.N(true);
        }
        v3Var.h3.onContentChanged();
    }

    @Override // ji.c5
    public final /* synthetic */ void b(TLRPC.Photo photo) {
    }

    @Override // ji.c5
    public final /* synthetic */ void c(TLRPC.Document document) {
    }

    @Override // ji.c5
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // ji.c5
    public final /* synthetic */ void a(int i10, int i11) {
    }
}
