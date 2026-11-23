package oi;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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

    @Override // oi.x4
    public final void a() {
        s sVar = this.a;
        sVar.a = 3;
        t3 t3Var = this.c;
        t3Var.h4.remove(sVar);
        int indexOf = t3Var.t3.indexOf(this.b);
        if (indexOf >= 0) {
            t3Var.t3.remove(indexOf);
            t3Var.g3.O(true);
        }
        t3Var.p3.onContentChanged();
    }

    @Override // oi.x4
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
        t3Var.h4.remove(sVar);
        t3Var.g3.O(false);
        t3Var.p3.onContentChanged();
    }

    @Override // oi.x4
    public final void g(float f10) {
        this.a.f = f10;
        a aVar = this.b;
        t3 t3Var = this.c;
        View C1 = t3Var.C1(aVar);
        if (C1 instanceof x) {
            ((x) C1).n(false);
            C1.invalidate();
        }
        t3Var.p3.onContentChanged();
    }

    @Override // oi.x4
    public final /* synthetic */ void c(TLRPC.Photo photo) {
    }

    @Override // oi.x4
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // oi.x4
    public final /* synthetic */ void e(TLRPC.Document document) {
    }

    @Override // oi.x4
    public final /* synthetic */ void b(int i7, int i10) {
    }
}
