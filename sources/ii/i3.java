package ii;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
        View A1 = this.c.A1(this.b);
        if (A1 instanceof u4) {
            A1.requestLayout();
            A1.invalidate();
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
        TL_iv.PageBlock O3 = w3.O3(aVar, uVar);
        if (O3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) O3).photo_id = photo.id;
        }
        w3 w3Var = this.c;
        w3Var.Z3.remove(uVar);
        w3Var.o4(aVar);
        w3Var.h3.onContentChanged();
    }

    @Override // ii.z4
    public final void c(TLRPC.Document document) {
        u uVar = this.a;
        uVar.h = document;
        uVar.a = 2;
        a aVar = this.b;
        TL_iv.PageBlock O3 = w3.O3(aVar, uVar);
        if (O3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) O3).video_id = document.id;
        }
        w3 w3Var = this.c;
        w3Var.Z3.remove(uVar);
        w3Var.o4(aVar);
        w3Var.h3.onContentChanged();
    }

    @Override // ii.z4
    public final void f(float f7) {
        this.a.f = f7;
        a aVar = this.b;
        w3 w3Var = this.c;
        View A1 = w3Var.A1(aVar);
        if (A1 instanceof u4) {
            A1.requestLayout();
            A1.invalidate();
        }
        w3Var.h3.onContentChanged();
    }

    @Override // ii.z4
    public final void onError() {
        u uVar = this.a;
        uVar.a = 3;
        w3 w3Var = this.c;
        w3Var.Z3.remove(uVar);
        w3Var.r4(this.b, uVar);
        w3Var.h3.onContentChanged();
    }

    @Override // ii.z4
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // ii.z4
    public final /* synthetic */ void e(TLRPC.Document document) {
    }
}
