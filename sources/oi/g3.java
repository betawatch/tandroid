package oi;

import android.view.View;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class g3 implements x4 {
    public final /* synthetic */ r a;
    public final /* synthetic */ a b;
    public final /* synthetic */ t3 c;

    public g3(a aVar, r rVar, t3 t3Var) {
        this.c = t3Var;
        this.a = rVar;
        this.b = aVar;
    }

    @Override // oi.x4
    public final void a() {
        r rVar = this.a;
        rVar.a = 3;
        t3 t3Var = this.c;
        t3Var.h4.remove(rVar);
        t3Var.t4(this.b, rVar);
        t3Var.p3.onContentChanged();
    }

    @Override // oi.x4
    public final void b(int i7, int i10) {
        if (i7 > 0 && i10 > 0) {
            r rVar = this.a;
            rVar.j = i7;
            rVar.k = i10;
        }
        View C1 = this.c.C1(this.b);
        if (C1 instanceof s4) {
            C1.requestLayout();
            C1.invalidate();
        }
    }

    @Override // oi.x4
    public final void c(TLRPC.Photo photo) {
        int i7;
        int i10;
        r rVar = this.a;
        rVar.g = photo;
        rVar.a = 2;
        TLRPC.PhotoSize w10 = w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
        if (w10 != null && (i7 = w10.w) > 0 && (i10 = w10.h) > 0) {
            rVar.j = i7;
            rVar.k = i10;
        }
        a aVar = this.b;
        TL_iv.PageBlock Q3 = t3.Q3(aVar, rVar);
        if (Q3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) Q3).photo_id = photo.id;
        }
        t3 t3Var = this.c;
        t3Var.h4.remove(rVar);
        t3Var.q4(aVar);
        t3Var.p3.onContentChanged();
    }

    @Override // oi.x4
    public final void d(TLRPC.Document document) {
        r rVar = this.a;
        rVar.h = document;
        rVar.a = 2;
        a aVar = this.b;
        TL_iv.PageBlock Q3 = t3.Q3(aVar, rVar);
        if (Q3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) Q3).video_id = document.id;
        }
        t3 t3Var = this.c;
        t3Var.h4.remove(rVar);
        t3Var.q4(aVar);
        t3Var.p3.onContentChanged();
    }

    @Override // oi.x4
    public final void g(float f10) {
        this.a.f = f10;
        a aVar = this.b;
        t3 t3Var = this.c;
        View C1 = t3Var.C1(aVar);
        if (C1 instanceof s4) {
            C1.requestLayout();
            C1.invalidate();
        }
        t3Var.p3.onContentChanged();
    }

    @Override // oi.x4
    public final /* synthetic */ void e(TLRPC.Document document) {
    }

    @Override // oi.x4
    public final /* synthetic */ void f(TLRPC.Document document) {
    }
}
