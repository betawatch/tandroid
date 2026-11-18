package oi;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class e3 implements w4 {
    public final /* synthetic */ r a;
    public final /* synthetic */ a b;
    public final /* synthetic */ s3 c;

    public e3(a aVar, r rVar, s3 s3Var) {
        this.c = s3Var;
        this.a = rVar;
        this.b = aVar;
    }

    @Override // oi.w4
    public final void a() {
        r rVar = this.a;
        rVar.a = 3;
        s3 s3Var = this.c;
        s3Var.h4.remove(rVar);
        int indexOf = s3Var.t3.indexOf(this.b);
        if (indexOf >= 0) {
            s3Var.t3.remove(indexOf);
            s3Var.g3.O(true);
        }
        s3Var.p3.onContentChanged();
    }

    @Override // oi.w4
    public final void f(TLRPC.Document document) {
        r rVar = this.a;
        rVar.h = document;
        rVar.i = document;
        rVar.a = 2;
        TL_iv.PageBlock pageBlock = this.b.b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.id;
        }
        s3 s3Var = this.c;
        s3Var.h4.remove(rVar);
        s3Var.g3.O(false);
        s3Var.p3.onContentChanged();
    }

    @Override // oi.w4
    public final void g(float f10) {
        this.a.f = f10;
        a aVar = this.b;
        s3 s3Var = this.c;
        View C1 = s3Var.C1(aVar);
        if (C1 instanceof w) {
            ((w) C1).n(false);
            C1.invalidate();
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
    public final /* synthetic */ void e(TLRPC.Document document) {
    }

    @Override // oi.w4
    public final /* synthetic */ void b(int i7, int i10) {
    }
}
