package bi;

import android.view.View;
import org.telegram.messenger.b8;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class p3 implements k5 {
    public final /* synthetic */ w a;
    public final /* synthetic */ a b;
    public final /* synthetic */ d4 c;

    public p3(a aVar, w wVar, d4 d4Var) {
        this.c = d4Var;
        this.a = wVar;
        this.b = aVar;
    }

    @Override // bi.k5
    public final void a() {
        w wVar = this.a;
        wVar.a = 3;
        d4 d4Var = this.c;
        d4Var.g4.remove(wVar);
        d4Var.t4(this.b, wVar);
        d4Var.o3.onContentChanged();
    }

    @Override // bi.k5
    public final void b(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            w wVar = this.a;
            wVar.j = i10;
            wVar.k = i11;
        }
        View C1 = this.c.C1(this.b);
        if (C1 instanceof f5) {
            C1.requestLayout();
            C1.invalidate();
        }
    }

    @Override // bi.k5
    public final void c(TLRPC.Photo photo) {
        int i10;
        int i11;
        w wVar = this.a;
        wVar.g = photo;
        wVar.a = 2;
        TLRPC.PhotoSize w9 = b8.w(photo.sizes, org.telegram.messenger.i0.Z0(false), false, null, false);
        if (w9 != null && (i10 = w9.w) > 0 && (i11 = w9.h) > 0) {
            wVar.j = i10;
            wVar.k = i11;
        }
        a aVar = this.b;
        TL_iv.PageBlock Q3 = d4.Q3(aVar, wVar);
        if (Q3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) Q3).photo_id = photo.id;
        }
        d4 d4Var = this.c;
        d4Var.g4.remove(wVar);
        d4Var.q4(aVar);
        d4Var.o3.onContentChanged();
    }

    @Override // bi.k5
    public final void d(TLRPC.Document document) {
        w wVar = this.a;
        wVar.h = document;
        wVar.a = 2;
        a aVar = this.b;
        TL_iv.PageBlock Q3 = d4.Q3(aVar, wVar);
        if (Q3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) Q3).video_id = document.id;
        }
        d4 d4Var = this.c;
        d4Var.g4.remove(wVar);
        d4Var.q4(aVar);
        d4Var.o3.onContentChanged();
    }

    @Override // bi.k5
    public final void g(float f7) {
        this.a.f = f7;
        a aVar = this.b;
        d4 d4Var = this.c;
        View C1 = d4Var.C1(aVar);
        if (C1 instanceof f5) {
            C1.requestLayout();
            C1.invalidate();
        }
        d4Var.o3.onContentChanged();
    }

    @Override // bi.k5
    public final /* synthetic */ void e(TLRPC.Document document) {
    }

    @Override // bi.k5
    public final /* synthetic */ void f(TLRPC.Document document) {
    }
}
