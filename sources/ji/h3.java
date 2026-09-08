package ji;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class h3 implements c5 {
    public final /* synthetic */ u a;
    public final /* synthetic */ a b;
    public final /* synthetic */ v3 c;

    public h3(a aVar, u uVar, v3 v3Var) {
        this.c = v3Var;
        this.a = uVar;
        this.b = aVar;
    }

    @Override // ji.c5
    public final void a(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            u uVar = this.a;
            uVar.j = i10;
            uVar.k = i11;
        }
        View y12 = this.c.y1(this.b);
        if (y12 instanceof w4) {
            y12.requestLayout();
            y12.invalidate();
        }
    }

    @Override // ji.c5
    public final void b(TLRPC.Photo photo) {
        int i10;
        int i11;
        u uVar = this.a;
        uVar.g = photo;
        uVar.a = 2;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
        if (closestPhotoSizeWithSize != null && (i10 = closestPhotoSizeWithSize.w) > 0 && (i11 = closestPhotoSizeWithSize.h) > 0) {
            uVar.j = i10;
            uVar.k = i11;
        }
        a aVar = this.b;
        TL_iv.PageBlock M3 = v3.M3(aVar, uVar);
        if (M3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) M3).photo_id = photo.id;
        }
        v3 v3Var = this.c;
        v3Var.Z3.remove(uVar);
        v3Var.m4(aVar);
        v3Var.h3.onContentChanged();
    }

    @Override // ji.c5
    public final void c(TLRPC.Document document) {
        u uVar = this.a;
        uVar.h = document;
        uVar.a = 2;
        a aVar = this.b;
        TL_iv.PageBlock M3 = v3.M3(aVar, uVar);
        if (M3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) M3).video_id = document.id;
        }
        v3 v3Var = this.c;
        v3Var.Z3.remove(uVar);
        v3Var.m4(aVar);
        v3Var.h3.onContentChanged();
    }

    @Override // ji.c5
    public final void f(float f7) {
        this.a.f = f7;
        a aVar = this.b;
        v3 v3Var = this.c;
        View y12 = v3Var.y1(aVar);
        if (y12 instanceof w4) {
            y12.requestLayout();
            y12.invalidate();
        }
        v3Var.h3.onContentChanged();
    }

    @Override // ji.c5
    public final void onError() {
        u uVar = this.a;
        uVar.a = 3;
        v3 v3Var = this.c;
        v3Var.Z3.remove(uVar);
        v3Var.p4(this.b, uVar);
        v3Var.h3.onContentChanged();
    }

    @Override // ji.c5
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // ji.c5
    public final /* synthetic */ void e(TLRPC.Document document) {
    }
}
