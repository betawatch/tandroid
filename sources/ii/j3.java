package ii;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final class j3 implements b5 {
    public final /* synthetic */ u a;
    public final /* synthetic */ a b;
    public final /* synthetic */ x3 c;

    public j3(a aVar, u uVar, x3 x3Var) {
        this.c = x3Var;
        this.a = uVar;
        this.b = aVar;
    }

    @Override // ii.b5
    public final void a(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            u uVar = this.a;
            uVar.j = i10;
            uVar.k = i11;
        }
        View B1 = this.c.B1(this.b);
        if (B1 instanceof w4) {
            B1.requestLayout();
            B1.invalidate();
        }
    }

    @Override // ii.b5
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
        TL_iv.PageBlock P3 = x3.P3(aVar, uVar);
        if (P3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) P3).photo_id = photo.id;
        }
        x3 x3Var = this.c;
        x3Var.g4.remove(uVar);
        x3Var.p4(aVar);
        x3Var.o3.onContentChanged();
    }

    @Override // ii.b5
    public final void c(TLRPC.Document document) {
        u uVar = this.a;
        uVar.h = document;
        uVar.a = 2;
        a aVar = this.b;
        TL_iv.PageBlock P3 = x3.P3(aVar, uVar);
        if (P3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) P3).video_id = document.id;
        }
        x3 x3Var = this.c;
        x3Var.g4.remove(uVar);
        x3Var.p4(aVar);
        x3Var.o3.onContentChanged();
    }

    @Override // ii.b5
    public final void f(float f7) {
        this.a.f = f7;
        a aVar = this.b;
        x3 x3Var = this.c;
        View B1 = x3Var.B1(aVar);
        if (B1 instanceof w4) {
            B1.requestLayout();
            B1.invalidate();
        }
        x3Var.o3.onContentChanged();
    }

    @Override // ii.b5
    public final void onError() {
        u uVar = this.a;
        uVar.a = 3;
        x3 x3Var = this.c;
        x3Var.g4.remove(uVar);
        x3Var.s4(this.b, uVar);
        x3Var.o3.onContentChanged();
    }

    @Override // ii.b5
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // ii.b5
    public final /* synthetic */ void e(TLRPC.Document document) {
    }
}
