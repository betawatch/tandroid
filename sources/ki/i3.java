package ki;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class i3 implements z4 {
    public final /* synthetic */ t a;
    public final /* synthetic */ a b;
    public final /* synthetic */ w3 c;

    public i3(a aVar, t tVar, w3 w3Var) {
        this.c = w3Var;
        this.a = tVar;
        this.b = aVar;
    }

    @Override // ki.z4
    public final void a(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            t tVar = this.a;
            tVar.j = i10;
            tVar.k = i11;
        }
        View A1 = this.c.A1(this.b);
        if (A1 instanceof u4) {
            A1.requestLayout();
            A1.invalidate();
        }
    }

    @Override // ki.z4
    public final void b(TLRPC.Photo photo) {
        int i10;
        int i11;
        t tVar = this.a;
        tVar.g = photo;
        tVar.a = 2;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
        if (closestPhotoSizeWithSize != null && (i10 = closestPhotoSizeWithSize.w) > 0 && (i11 = closestPhotoSizeWithSize.h) > 0) {
            tVar.j = i10;
            tVar.k = i11;
        }
        a aVar = this.b;
        TL_iv.PageBlock O3 = w3.O3(aVar, tVar);
        if (O3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) O3).photo_id = photo.id;
        }
        w3 w3Var = this.c;
        w3Var.X3.remove(tVar);
        w3Var.o4(aVar);
        w3Var.f3.onContentChanged();
    }

    @Override // ki.z4
    public final void c(TLRPC.Document document) {
        t tVar = this.a;
        tVar.h = document;
        tVar.a = 2;
        a aVar = this.b;
        TL_iv.PageBlock O3 = w3.O3(aVar, tVar);
        if (O3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) O3).video_id = document.id;
        }
        w3 w3Var = this.c;
        w3Var.X3.remove(tVar);
        w3Var.o4(aVar);
        w3Var.f3.onContentChanged();
    }

    @Override // ki.z4
    public final void f(float f7) {
        this.a.f = f7;
        a aVar = this.b;
        w3 w3Var = this.c;
        View A1 = w3Var.A1(aVar);
        if (A1 instanceof u4) {
            A1.requestLayout();
            A1.invalidate();
        }
        w3Var.f3.onContentChanged();
    }

    @Override // ki.z4
    public final void onError() {
        t tVar = this.a;
        tVar.a = 3;
        w3 w3Var = this.c;
        w3Var.X3.remove(tVar);
        w3Var.r4(this.b, tVar);
        w3Var.f3.onContentChanged();
    }

    @Override // ki.z4
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // ki.z4
    public final /* synthetic */ void e(TLRPC.Document document) {
    }
}
