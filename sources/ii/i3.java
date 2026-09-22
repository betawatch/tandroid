package ii;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class i3 implements z4 {
    public final /* synthetic */ u a;
    public final /* synthetic */ a b;
    public final /* synthetic */ w3 c;

    public i3(a aVar, u uVar, w3 w3Var) {
        this.c = w3Var;
        this.a = uVar;
        this.b = aVar;
    }

    @Override // ii.z4
    public final void a(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            u uVar = this.a;
            uVar.j = i10;
            uVar.k = i11;
        }
        View z12 = this.c.z1(this.b);
        if (z12 instanceof u4) {
            z12.requestLayout();
            z12.invalidate();
        }
    }

    @Override // ii.z4
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
        TL_iv.PageBlock N3 = w3.N3(aVar, uVar);
        if (N3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) N3).photo_id = photo.id;
        }
        w3 w3Var = this.c;
        w3Var.Z3.remove(uVar);
        w3Var.n4(aVar);
        w3Var.h3.onContentChanged();
    }

    @Override // ii.z4
    public final void c(TLRPC.Document document) {
        u uVar = this.a;
        uVar.h = document;
        uVar.a = 2;
        a aVar = this.b;
        TL_iv.PageBlock N3 = w3.N3(aVar, uVar);
        if (N3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) N3).video_id = document.id;
        }
        w3 w3Var = this.c;
        w3Var.Z3.remove(uVar);
        w3Var.n4(aVar);
        w3Var.h3.onContentChanged();
    }

    @Override // ii.z4
    public final void f(float f7) {
        this.a.f = f7;
        a aVar = this.b;
        w3 w3Var = this.c;
        View z12 = w3Var.z1(aVar);
        if (z12 instanceof u4) {
            z12.requestLayout();
            z12.invalidate();
        }
        w3Var.h3.onContentChanged();
    }

    @Override // ii.z4
    public final void onError() {
        u uVar = this.a;
        uVar.a = 3;
        w3 w3Var = this.c;
        w3Var.Z3.remove(uVar);
        w3Var.q4(this.b, uVar);
        w3Var.h3.onContentChanged();
    }

    @Override // ii.z4
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // ii.z4
    public final /* synthetic */ void e(TLRPC.Document document) {
    }
}
