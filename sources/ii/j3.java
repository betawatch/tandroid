package ii;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class j3 implements a5 {
    public final /* synthetic */ u a;
    public final /* synthetic */ a b;
    public final /* synthetic */ x3 c;

    public j3(a aVar, u uVar, x3 x3Var) {
        this.c = x3Var;
        this.a = uVar;
        this.b = aVar;
    }

    @Override // ii.a5
    public final void a(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            u uVar = this.a;
            uVar.j = i10;
            uVar.k = i11;
        }
        View z12 = this.c.z1(this.b);
        if (z12 instanceof v4) {
            z12.requestLayout();
            z12.invalidate();
        }
    }

    @Override // ii.a5
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
        TL_iv.PageBlock N3 = x3.N3(aVar, uVar);
        if (N3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) N3).photo_id = photo.id;
        }
        x3 x3Var = this.c;
        x3Var.Z3.remove(uVar);
        x3Var.n4(aVar);
        x3Var.h3.onContentChanged();
    }

    @Override // ii.a5
    public final void c(TLRPC.Document document) {
        u uVar = this.a;
        uVar.h = document;
        uVar.a = 2;
        a aVar = this.b;
        TL_iv.PageBlock N3 = x3.N3(aVar, uVar);
        if (N3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) N3).video_id = document.id;
        }
        x3 x3Var = this.c;
        x3Var.Z3.remove(uVar);
        x3Var.n4(aVar);
        x3Var.h3.onContentChanged();
    }

    @Override // ii.a5
    public final void f(float f7) {
        this.a.f = f7;
        a aVar = this.b;
        x3 x3Var = this.c;
        View z12 = x3Var.z1(aVar);
        if (z12 instanceof v4) {
            z12.requestLayout();
            z12.invalidate();
        }
        x3Var.h3.onContentChanged();
    }

    @Override // ii.a5
    public final void onError() {
        u uVar = this.a;
        uVar.a = 3;
        x3 x3Var = this.c;
        x3Var.Z3.remove(uVar);
        x3Var.q4(this.b, uVar);
        x3Var.h3.onContentChanged();
    }

    @Override // ii.a5
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // ii.a5
    public final /* synthetic */ void e(TLRPC.Document document) {
    }
}
