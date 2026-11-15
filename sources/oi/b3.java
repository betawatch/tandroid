package oi;

import android.view.View;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class b3 implements v4 {
    public final /* synthetic */ r a;
    public final /* synthetic */ a b;
    public final /* synthetic */ String c;
    public final /* synthetic */ q3 d;

    public b3(q3 q3Var, r rVar, a aVar, String str) {
        this.d = q3Var;
        this.a = rVar;
        this.b = aVar;
        this.c = str;
    }

    @Override // oi.v4
    public final void a() {
        r rVar = this.a;
        rVar.a = 3;
        q3 q3Var = this.d;
        q3Var.h4.remove(rVar);
        q3Var.t3.remove(this.b);
        q3Var.g3.O(true);
        q3Var.p3.onContentChanged();
    }

    @Override // oi.v4
    public final void e(TLRPC.Document document) {
        String str = this.c;
        document.localPath = str;
        q3 q3Var = this.d;
        w7.G(q3Var.n3).e0(str, document);
        r rVar = this.a;
        rVar.h = document;
        rVar.a = 2;
        TL_iv.PageBlock pageBlock = this.b.b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.id;
        }
        q3Var.h4.remove(rVar);
        q3Var.g3.O(false);
        q3Var.p3.onContentChanged();
    }

    @Override // oi.v4
    public final void g(float f10) {
        this.a.f = f10;
        a aVar = this.b;
        q3 q3Var = this.d;
        View C1 = q3Var.C1(aVar);
        if (C1 instanceof v0) {
            v0 v0Var = (v0) C1;
            v0Var.g(v0Var.h());
            v0Var.l();
            v0Var.m(false);
            v0Var.requestLayout();
            v0Var.invalidate();
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
    public final /* synthetic */ void f(TLRPC.Document document) {
    }

    @Override // oi.v4
    public final /* synthetic */ void b(int i7, int i10) {
    }
}
