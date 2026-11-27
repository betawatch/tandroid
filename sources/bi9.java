// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class bi9 implements rj9 {
    public final /* synthetic */ p07 a;
    public final /* synthetic */ mk0 b;
    public final /* synthetic */ pi9 c;

    public bi9(pi9 pi9Var, p07 p07Var, mk0 mk0Var) {
        this.c = pi9Var;
        this.a = p07Var;
        this.b = mk0Var;
    }

    @Override // rj9
    public final void a() {
        p07 p07Var = this.a;
        p07Var.a = (byte) 3;
        pi9 pi9Var = this.c;
        pi9Var.h4.remove(p07Var);
        ArrayList arrayList = pi9Var.t3;
        int indexOf = arrayList.indexOf(this.b);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
            pi9Var.g3.O(true);
        }
        pi9Var.p3.onContentChanged();
    }

    @Override // rj9
    public final void f(TLRPC.Document document) {
        p07 p07Var = this.a;
        p07Var.h = document;
        p07Var.i = document;
        p07Var.a = (byte) 2;
        TL_iv.PageBlock pageBlock = this.b.b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.id;
        }
        pi9 pi9Var = this.c;
        pi9Var.h4.remove(p07Var);
        pi9Var.g3.O(false);
        pi9Var.p3.onContentChanged();
    }

    @Override // rj9
    public final void g(float f) {
        this.a.f = f;
        mk0 mk0Var = this.b;
        pi9 pi9Var = this.c;
        View D1 = pi9Var.D1(mk0Var);
        if (D1 instanceof xe9) {
            ((xe9) D1).o(false);
            D1.invalidate();
        }
        pi9Var.p3.onContentChanged();
    }

    @Override // rj9
    public final void c(TLRPC.Photo photo) {
    }

    @Override // rj9
    public final void d(TLRPC.Document document) {
    }

    @Override // rj9
    public final void e(TLRPC.Document document) {
    }

    @Override // rj9
    public final void b(int i, int i2) {
    }
}
