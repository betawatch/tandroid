package mg;

import android.view.ViewTreeObserver;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class l implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ MediaController.CropState a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ q d;

    public l(q qVar, MediaController.CropState cropState, int i10, int i11) {
        this.d = qVar;
        this.a = cropState;
        this.b = i10;
        this.c = i11;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        float f7;
        float f10;
        q qVar = this.d;
        qVar.l(false);
        CropAreaView cropAreaView = qVar.a;
        MediaController.CropState cropState = this.a;
        if (cropState != null) {
            float f11 = cropState.lockedAspectRatio;
            if (f11 > 1.0E-4f) {
                cropAreaView.setLockedAspectRatio(f11);
                p pVar = qVar.M;
                if (pVar != null) {
                    pVar.E(true);
                }
            }
            qVar.setFreeform(cropState.freeform);
            float aspectRatio = cropAreaView.getAspectRatio();
            int i10 = cropState.transformRotation;
            int i11 = this.b;
            int i12 = this.c;
            if (i10 == 90 || i10 == 270) {
                aspectRatio = 1.0f / aspectRatio;
                o oVar = qVar.L;
                f7 = oVar.b;
                f10 = oVar.a;
            } else {
                o oVar2 = qVar.L;
                f7 = oVar2.a;
                f10 = oVar2.b;
                i12 = i11;
                i11 = i12;
            }
            if (!qVar.x || cropAreaView.getLockAspectRatio() <= 0.0f) {
                cropAreaView.e(qVar.getCurrentWidth(), qVar.getCurrentHeight(), (((float) i10) + qVar.L.g) % 180.0f != 0.0f, qVar.x);
            } else {
                cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
            }
            o.d(qVar.L, i10);
            cropAreaView.setActualRect((aspectRatio * cropState.cropPw) / cropState.cropPh);
            o oVar3 = qVar.L;
            oVar3.j = cropState.mirrored;
            o.e(oVar3, cropState.cropRotate);
            o oVar4 = qVar.L;
            float f12 = cropState.cropPx * i11;
            float f13 = oVar4.f;
            o.f(oVar4, f12 * f13, cropState.cropPy * i12 * f13);
            float max = Math.max(cropAreaView.getCropWidth() / f7, cropAreaView.getCropHeight() / f10);
            o oVar5 = qVar.L;
            o.g(oVar5, cropState.cropScale * (max / oVar5.f), 0.0f, 0.0f);
            qVar.r(false);
            p pVar2 = qVar.M;
            if (pVar2 != null) {
                pVar2.W(false);
            }
        }
        cropAreaView.getViewTreeObserver().removeOnPreDrawListener(this);
        return false;
    }
}
