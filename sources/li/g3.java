package li;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class g3 implements z4 {
    public final /* synthetic */ t a;
    public final /* synthetic */ a b;
    public final /* synthetic */ v3 c;

    public g3(a aVar, t tVar, v3 v3Var) {
        this.c = v3Var;
        this.a = tVar;
        this.b = aVar;
    }

    @Override // li.z4
    public final void e(TLRPC.Document document) {
        t tVar = this.a;
        tVar.h = document;
        tVar.i = document;
        tVar.a = 2;
        TL_iv.PageBlock pageBlock = this.b.b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.id;
        }
        v3 v3Var = this.c;
        v3Var.h4.remove(tVar);
        v3Var.g3.O(false);
        v3Var.p3.onContentChanged();
    }

    @Override // li.z4
    public final void f(float f7) {
        this.a.f = f7;
        a aVar = this.b;
        v3 v3Var = this.c;
        View F1 = v3Var.F1(aVar);
        if (F1 instanceof y) {
            ((y) F1).l(false);
            F1.invalidate();
        }
        v3Var.p3.onContentChanged();
    }

    @Override // li.z4
    public final void onError() {
        t tVar = this.a;
        tVar.a = 3;
        v3 v3Var = this.c;
        v3Var.h4.remove(tVar);
        int indexOf = v3Var.t3.indexOf(this.b);
        if (indexOf >= 0) {
            v3Var.t3.remove(indexOf);
            v3Var.g3.O(true);
        }
        v3Var.p3.onContentChanged();
    }

    @Override // li.z4
    public final /* synthetic */ void b(TLRPC.Photo photo) {
    }

    @Override // li.z4
    public final /* synthetic */ void c(TLRPC.Document document) {
    }

    @Override // li.z4
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // li.z4
    public final /* synthetic */ void a(int i10, int i11) {
    }
}
