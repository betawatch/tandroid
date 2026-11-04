package mi;

import android.view.View;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class g3 implements y4 {
    public final /* synthetic */ s a;
    public final /* synthetic */ a b;
    public final /* synthetic */ t3 c;

    public g3(a aVar, s sVar, t3 t3Var) {
        this.c = t3Var;
        this.a = sVar;
        this.b = aVar;
    }

    @Override // mi.y4
    public final void a() {
        s sVar = this.a;
        sVar.a = 3;
        t3 t3Var = this.c;
        t3Var.h4.remove(sVar);
        t3Var.t4(this.b, sVar);
        t3Var.p3.onContentChanged();
    }

    @Override // mi.y4
    public final void b(int i3, int i10) {
        if (i3 > 0 && i10 > 0) {
            s sVar = this.a;
            sVar.j = i3;
            sVar.k = i10;
        }
        View C1 = this.c.C1(this.b);
        if (C1 instanceof t4) {
            C1.requestLayout();
            C1.invalidate();
        }
    }

    @Override // mi.y4
    public final void c(TLRPC.Photo photo) {
        int i3;
        int i10;
        s sVar = this.a;
        sVar.g = photo;
        sVar.a = 2;
        TLRPC.PhotoSize w10 = w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
        if (w10 != null && (i3 = w10.w) > 0 && (i10 = w10.h) > 0) {
            sVar.j = i3;
            sVar.k = i10;
        }
        a aVar = this.b;
        TL_iv.PageBlock Q3 = t3.Q3(aVar, sVar);
        if (Q3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) Q3).photo_id = photo.id;
        }
        t3 t3Var = this.c;
        t3Var.h4.remove(sVar);
        t3Var.q4(aVar);
        t3Var.p3.onContentChanged();
    }

    @Override // mi.y4
    public final void d(TLRPC.Document document) {
        s sVar = this.a;
        sVar.h = document;
        sVar.a = 2;
        a aVar = this.b;
        TL_iv.PageBlock Q3 = t3.Q3(aVar, sVar);
        if (Q3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) Q3).video_id = document.id;
        }
        t3 t3Var = this.c;
        t3Var.h4.remove(sVar);
        t3Var.q4(aVar);
        t3Var.p3.onContentChanged();
    }

    @Override // mi.y4
    public final void g(float f10) {
        this.a.f = f10;
        a aVar = this.b;
        t3 t3Var = this.c;
        View C1 = t3Var.C1(aVar);
        if (C1 instanceof t4) {
            C1.requestLayout();
            C1.invalidate();
        }
        t3Var.p3.onContentChanged();
    }

    @Override // mi.y4
    public final /* synthetic */ void e(TLRPC.Document document) {
    }

    @Override // mi.y4
    public final /* synthetic */ void f(TLRPC.Document document) {
    }
}
