package li;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class i3 implements z4 {
    public final /* synthetic */ t a;
    public final /* synthetic */ a b;
    public final /* synthetic */ v3 c;

    public i3(a aVar, t tVar, v3 v3Var) {
        this.c = v3Var;
        this.a = tVar;
        this.b = aVar;
    }

    @Override // li.z4
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

    @Override // li.z4
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
        TL_iv.PageBlock T3 = v3.T3(aVar, tVar);
        if (T3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) T3).photo_id = photo.id;
        }
        v3 v3Var = this.c;
        v3Var.h4.remove(tVar);
        v3Var.t4(aVar);
        v3Var.p3.onContentChanged();
    }

    @Override // li.z4
    public final void c(TLRPC.Document document) {
        t tVar = this.a;
        tVar.h = document;
        tVar.a = 2;
        a aVar = this.b;
        TL_iv.PageBlock T3 = v3.T3(aVar, tVar);
        if (T3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) T3).video_id = document.id;
        }
        v3 v3Var = this.c;
        v3Var.h4.remove(tVar);
        v3Var.t4(aVar);
        v3Var.p3.onContentChanged();
    }

    @Override // li.z4
    public final void f(float f7) {
        this.a.f = f7;
        a aVar = this.b;
        v3 v3Var = this.c;
        View F1 = v3Var.F1(aVar);
        if (F1 instanceof u4) {
            F1.requestLayout();
            F1.invalidate();
        }
        v3Var.p3.onContentChanged();
    }

    @Override // li.z4
    public final void onError() {
        t tVar = this.a;
        tVar.a = 3;
        v3 v3Var = this.c;
        v3Var.h4.remove(tVar);
        v3Var.w4(this.b, tVar);
        v3Var.p3.onContentChanged();
    }

    @Override // li.z4
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // li.z4
    public final /* synthetic */ void e(TLRPC.Document document) {
    }
}
