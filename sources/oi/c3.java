package oi;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class c3 implements v4 {
    public final /* synthetic */ r a;
    public final /* synthetic */ a b;
    public final /* synthetic */ q3 c;

    public c3(a aVar, r rVar, q3 q3Var) {
        this.c = q3Var;
        this.a = rVar;
        this.b = aVar;
    }

    @Override // oi.v4
    public final void a() {
        r rVar = this.a;
        rVar.a = 3;
        q3 q3Var = this.c;
        q3Var.h4.remove(rVar);
        int indexOf = q3Var.t3.indexOf(this.b);
        if (indexOf >= 0) {
            q3Var.t3.remove(indexOf);
            q3Var.g3.O(true);
        }
        q3Var.p3.onContentChanged();
    }

    @Override // oi.v4
    public final void f(TLRPC.Document document) {
        r rVar = this.a;
        rVar.h = document;
        rVar.i = document;
        rVar.a = 2;
        TL_iv.PageBlock pageBlock = this.b.b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.id;
        }
        q3 q3Var = this.c;
        q3Var.h4.remove(rVar);
        q3Var.g3.O(false);
        q3Var.p3.onContentChanged();
    }

    @Override // oi.v4
    public final void g(float f10) {
        this.a.f = f10;
        a aVar = this.b;
        q3 q3Var = this.c;
        View C1 = q3Var.C1(aVar);
        if (C1 instanceof w) {
            ((w) C1).n(false);
            C1.invalidate();
        }
        q3Var.p3.onContentChanged();
    }

    @Override // oi.v4
    public final /* synthetic */ void c(TLRPC.Photo photo) {
    }

    @Override // oi.v4
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // oi.v4
    public final /* synthetic */ void e(TLRPC.Document document) {
    }

    @Override // oi.v4
    public final /* synthetic */ void b(int i7, int i10) {
    }
}
