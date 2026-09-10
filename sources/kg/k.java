package kg;

import android.view.ViewTreeObserver;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class k implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ MediaController.CropState a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ p d;

    public k(p pVar, MediaController.CropState cropState, int i10, int i11) {
        this.d = pVar;
        this.a = cropState;
        this.b = i10;
        this.c = i11;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        float f7;
        float f10;
        p pVar = this.d;
        pVar.l(false);
        CropAreaView cropAreaView = pVar.a;
        MediaController.CropState cropState = this.a;
        if (cropState != null) {
            float f11 = cropState.lockedAspectRatio;
            if (f11 > 1.0E-4f) {
                cropAreaView.setLockedAspectRatio(f11);
                o oVar = pVar.M;
                if (oVar != null) {
                    oVar.N(true);
                }
            }
            pVar.setFreeform(cropState.freeform);
            float aspectRatio = cropAreaView.getAspectRatio();
            int i10 = cropState.transformRotation;
            int i11 = this.b;
            int i12 = this.c;
            if (i10 == 90 || i10 == 270) {
                aspectRatio = 1.0f / aspectRatio;
                n nVar = pVar.L;
                f7 = nVar.b;
                f10 = nVar.a;
            } else {
                n nVar2 = pVar.L;
                f7 = nVar2.a;
                f10 = nVar2.b;
                i12 = i11;
                i11 = i12;
            }
            if (!pVar.x || cropAreaView.getLockAspectRatio() <= 0.0f) {
                cropAreaView.e(pVar.getCurrentWidth(), pVar.getCurrentHeight(), (((float) i10) + pVar.L.g) % 180.0f != 0.0f, pVar.x);
            } else {
                cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
            }
            n.d(pVar.L, i10);
            cropAreaView.setActualRect((aspectRatio * cropState.cropPw) / cropState.cropPh);
            n nVar3 = pVar.L;
            nVar3.j = cropState.mirrored;
            n.e(nVar3, cropState.cropRotate);
            n nVar4 = pVar.L;
            float f12 = cropState.cropPx * i11;
            float f13 = nVar4.f;
            n.f(nVar4, f12 * f13, cropState.cropPy * i12 * f13);
            float max = Math.max(cropAreaView.getCropWidth() / f7, cropAreaView.getCropHeight() / f10);
            n nVar5 = pVar.L;
            n.g(nVar5, cropState.cropScale * (max / nVar5.f), 0.0f, 0.0f);
            pVar.r(false);
            o oVar2 = pVar.M;
            if (oVar2 != null) {
                oVar2.i0(false);
            }
        }
        cropAreaView.getViewTreeObserver().removeOnPreDrawListener(this);
        return false;
    }
}
