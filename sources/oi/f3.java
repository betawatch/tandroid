package oi;

import android.view.View;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class f3 implements w4 {
    public final /* synthetic */ r a;
    public final /* synthetic */ a b;
    public final /* synthetic */ s3 c;

    public f3(a aVar, r rVar, s3 s3Var) {
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
        s3Var.t4(this.b, rVar);
        s3Var.p3.onContentChanged();
    }

    @Override // oi.w4
    public final void b(int i7, int i10) {
        if (i7 > 0 && i10 > 0) {
            r rVar = this.a;
            rVar.j = i7;
            rVar.k = i10;
        }
        View C1 = this.c.C1(this.b);
        if (C1 instanceof r4) {
            C1.requestLayout();
            C1.invalidate();
        }
    }

    @Override // oi.w4
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
        TL_iv.PageBlock Q3 = s3.Q3(aVar, rVar);
        if (Q3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) Q3).photo_id = photo.id;
        }
        s3 s3Var = this.c;
        s3Var.h4.remove(rVar);
        s3Var.q4(aVar);
        s3Var.p3.onContentChanged();
    }

    @Override // oi.w4
    public final void d(TLRPC.Document document) {
        r rVar = this.a;
        rVar.h = document;
        rVar.a = 2;
        a aVar = this.b;
        TL_iv.PageBlock Q3 = s3.Q3(aVar, rVar);
        if (Q3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) Q3).video_id = document.id;
        }
        s3 s3Var = this.c;
        s3Var.h4.remove(rVar);
        s3Var.q4(aVar);
        s3Var.p3.onContentChanged();
    }

    @Override // oi.w4
    public final void g(float f10) {
        this.a.f = f10;
        a aVar = this.b;
        s3 s3Var = this.c;
        View C1 = s3Var.C1(aVar);
        if (C1 instanceof r4) {
            C1.requestLayout();
            C1.invalidate();
        }
        s3Var.p3.onContentChanged();
    }

    @Override // oi.w4
    public final /* synthetic */ void e(TLRPC.Document document) {
    }

    @Override // oi.w4
    public final /* synthetic */ void f(TLRPC.Document document) {
    }
}
