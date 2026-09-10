package hi;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class l3 implements c5 {
    public final /* synthetic */ v a;
    public final /* synthetic */ a b;
    public final /* synthetic */ z3 c;

    public l3(a aVar, v vVar, z3 z3Var) {
        this.c = z3Var;
        this.a = vVar;
        this.b = aVar;
    }

    @Override // hi.c5
    public final void a(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            v vVar = this.a;
            vVar.j = i10;
            vVar.k = i11;
        }
        View y12 = this.c.y1(this.b);
        if (y12 instanceof x4) {
            y12.requestLayout();
            y12.invalidate();
        }
    }

    @Override // hi.c5
    public final void b(TLRPC.Photo photo) {
        int i10;
        int i11;
        v vVar = this.a;
        vVar.g = photo;
        vVar.a = 2;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
        if (closestPhotoSizeWithSize != null && (i10 = closestPhotoSizeWithSize.w) > 0 && (i11 = closestPhotoSizeWithSize.h) > 0) {
            vVar.j = i10;
            vVar.k = i11;
        }
        a aVar = this.b;
        TL_iv.PageBlock M3 = z3.M3(aVar, vVar);
        if (M3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) M3).photo_id = photo.id;
        }
        z3 z3Var = this.c;
        z3Var.Z3.remove(vVar);
        z3Var.m4(aVar);
        z3Var.h3.onContentChanged();
    }

    @Override // hi.c5
    public final void c(TLRPC.Document document) {
        v vVar = this.a;
        vVar.h = document;
        vVar.a = 2;
        a aVar = this.b;
        TL_iv.PageBlock M3 = z3.M3(aVar, vVar);
        if (M3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) M3).video_id = document.id;
        }
        z3 z3Var = this.c;
        z3Var.Z3.remove(vVar);
        z3Var.m4(aVar);
        z3Var.h3.onContentChanged();
    }

    @Override // hi.c5
    public final void f(float f7) {
        this.a.f = f7;
        a aVar = this.b;
        z3 z3Var = this.c;
        View y12 = z3Var.y1(aVar);
        if (y12 instanceof x4) {
            y12.requestLayout();
            y12.invalidate();
        }
        z3Var.h3.onContentChanged();
    }

    @Override // hi.c5
    public final void onError() {
        v vVar = this.a;
        vVar.a = 3;
        z3 z3Var = this.c;
        z3Var.Z3.remove(vVar);
        z3Var.p4(this.b, vVar);
        z3Var.h3.onContentChanged();
    }

    @Override // hi.c5
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // hi.c5
    public final /* synthetic */ void e(TLRPC.Document document) {
    }
}
