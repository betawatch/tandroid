package li;

import android.view.View;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class f3 implements x4 {
    public final /* synthetic */ s a;
    public final /* synthetic */ a b;
    public final /* synthetic */ t3 c;

    public f3(a aVar, s sVar, t3 t3Var) {
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
        t3Var.t4(this.b, sVar);
        t3Var.o3.onContentChanged();
    }

    @Override // li.x4
    public final void b(int i7, int i10) {
        if (i7 > 0 && i10 > 0) {
            s sVar = this.a;
            sVar.j = i7;
            sVar.k = i10;
        }
        View C1 = this.c.C1(this.b);
        if (C1 instanceof s4) {
            C1.requestLayout();
            C1.invalidate();
        }
    }

    @Override // li.x4
    public final void c(TLRPC.Photo photo) {
        int i7;
        int i10;
        s sVar = this.a;
        sVar.g = photo;
        sVar.a = 2;
        TLRPC.PhotoSize w10 = w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
        if (w10 != null && (i7 = w10.w) > 0 && (i10 = w10.h) > 0) {
            sVar.j = i7;
            sVar.k = i10;
        }
        a aVar = this.b;
        TL_iv.PageBlock Q3 = t3.Q3(aVar, sVar);
        if (Q3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) Q3).photo_id = photo.id;
        }
        t3 t3Var = this.c;
        t3Var.g4.remove(sVar);
        t3Var.q4(aVar);
        t3Var.o3.onContentChanged();
    }

    @Override // li.x4
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
        t3Var.g4.remove(sVar);
        t3Var.q4(aVar);
        t3Var.o3.onContentChanged();
    }

    @Override // li.x4
    public final void g(float f10) {
        this.a.f = f10;
        a aVar = this.b;
        t3 t3Var = this.c;
        View C1 = t3Var.C1(aVar);
        if (C1 instanceof s4) {
            C1.requestLayout();
            C1.invalidate();
        }
        t3Var.o3.onContentChanged();
    }

    @Override // li.x4
    public final /* synthetic */ void e(TLRPC.Document document) {
    }

    @Override // li.x4
    public final /* synthetic */ void f(TLRPC.Document document) {
    }
}
