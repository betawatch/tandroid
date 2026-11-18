package oi;

import android.view.View;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class d3 implements w4 {
    public final /* synthetic */ r a;
    public final /* synthetic */ a b;
    public final /* synthetic */ String c;
    public final /* synthetic */ s3 d;

    public d3(s3 s3Var, r rVar, a aVar, String str) {
        this.d = s3Var;
        this.a = rVar;
        this.b = aVar;
        this.c = str;
    }

    @Override // oi.w4
    public final void a() {
        r rVar = this.a;
        rVar.a = 3;
        s3 s3Var = this.d;
        s3Var.h4.remove(rVar);
        s3Var.t3.remove(this.b);
        s3Var.g3.O(true);
        s3Var.p3.onContentChanged();
    }

    @Override // oi.w4
    public final void e(TLRPC.Document document) {
        String str = this.c;
        document.localPath = str;
        s3 s3Var = this.d;
        w7.G(s3Var.n3).e0(str, document);
        r rVar = this.a;
        rVar.h = document;
        rVar.a = 2;
        TL_iv.PageBlock pageBlock = this.b.b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.id;
        }
        s3Var.h4.remove(rVar);
        s3Var.g3.O(false);
        s3Var.p3.onContentChanged();
    }

    @Override // oi.w4
    public final void g(float f10) {
        this.a.f = f10;
        a aVar = this.b;
        s3 s3Var = this.d;
        View C1 = s3Var.C1(aVar);
        if (C1 instanceof v0) {
            v0 v0Var = (v0) C1;
            v0Var.g(v0Var.h());
            v0Var.l();
            v0Var.m(false);
            v0Var.requestLayout();
            v0Var.invalidate();
        }
        s3Var.p3.onContentChanged();
    }

    @Override // oi.w4
    public final /* synthetic */ void c(TLRPC.Photo photo) {
    }

    @Override // oi.w4
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // oi.w4
    public final /* synthetic */ void f(TLRPC.Document document) {
    }

    @Override // oi.w4
    public final /* synthetic */ void b(int i7, int i10) {
    }
}
