package ki;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
        View F1 = this.c.F1(this.b);
        if (F1 instanceof u4) {
            F1.requestLayout();
            F1.invalidate();
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
        TL_iv.PageBlock T3 = w3.T3(aVar, tVar);
        if (T3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) T3).photo_id = photo.id;
        }
        w3 w3Var = this.c;
        w3Var.a4.remove(tVar);
        w3Var.t4(aVar);
        w3Var.i3.onContentChanged();
    }

    @Override // ki.z4
    public final void c(TLRPC.Document document) {
        t tVar = this.a;
        tVar.h = document;
        tVar.a = 2;
        a aVar = this.b;
        TL_iv.PageBlock T3 = w3.T3(aVar, tVar);
        if (T3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) T3).video_id = document.id;
        }
        w3 w3Var = this.c;
        w3Var.a4.remove(tVar);
        w3Var.t4(aVar);
        w3Var.i3.onContentChanged();
    }

    @Override // ki.z4
    public final void f(float f7) {
        this.a.f = f7;
        a aVar = this.b;
        w3 w3Var = this.c;
        View F1 = w3Var.F1(aVar);
        if (F1 instanceof u4) {
            F1.requestLayout();
            F1.invalidate();
        }
        w3Var.i3.onContentChanged();
    }

    @Override // ki.z4
    public final void onError() {
        t tVar = this.a;
        tVar.a = 3;
        w3 w3Var = this.c;
        w3Var.a4.remove(tVar);
        w3Var.w4(this.b, tVar);
        w3Var.i3.onContentChanged();
    }

    @Override // ki.z4
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // ki.z4
    public final /* synthetic */ void e(TLRPC.Document document) {
    }
}
