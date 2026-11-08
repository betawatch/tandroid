package og;

import android.view.ViewTreeObserver;
import org.telegram.messenger.ye;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class k implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ye b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ o e;

    public /* synthetic */ k(o oVar, ye yeVar, int i7, int i10, int i11) {
        this.a = i11;
        this.e = oVar;
        this.b = yeVar;
        this.c = i7;
        this.d = i10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        float f10;
        float f11;
        float f12;
        float f13;
        switch (this.a) {
            case 0:
                o oVar = this.e;
                oVar.l(false);
                CropAreaView cropAreaView = oVar.a;
                ye yeVar = this.b;
                if (yeVar != null) {
                    float f14 = yeVar.v;
                    if (f14 > 1.0E-4f) {
                        cropAreaView.setLockedAspectRatio(f14);
                        n nVar = oVar.M;
                        if (nVar != null) {
                            nVar.H(true);
                        }
                    }
                    oVar.setFreeform(yeVar.u);
                    float aspectRatio = cropAreaView.getAspectRatio();
                    int i7 = yeVar.k;
                    int i10 = this.c;
                    int i11 = this.d;
                    if (i7 == 90 || i7 == 270) {
                        aspectRatio = 1.0f / aspectRatio;
                        m mVar = oVar.L;
                        f10 = mVar.b;
                        f11 = mVar.a;
                    } else {
                        m mVar2 = oVar.L;
                        f10 = mVar2.a;
                        f11 = mVar2.b;
                        i11 = i10;
                        i10 = i11;
                    }
                    if (!oVar.y || cropAreaView.getLockAspectRatio() <= 0.0f) {
                        cropAreaView.e(oVar.getCurrentWidth(), oVar.getCurrentHeight(), (((float) i7) + oVar.L.g) % 180.0f != 0.0f, oVar.y);
                    } else {
                        cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                        cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
                    }
                    m.d(oVar.L, i7);
                    cropAreaView.setActualRect((aspectRatio * yeVar.e) / yeVar.f);
                    m mVar3 = oVar.L;
                    mVar3.j = yeVar.l;
                    m.e(mVar3, yeVar.d);
                    m mVar4 = oVar.L;
                    float f15 = yeVar.a * i10;
                    float f16 = mVar4.f;
                    m.f(mVar4, f15 * f16, yeVar.b * i11 * f16);
                    float max = Math.max(cropAreaView.getCropWidth() / f10, cropAreaView.getCropHeight() / f11);
                    m mVar5 = oVar.L;
                    m.g(mVar5, yeVar.c * (max / mVar5.f), 0.0f, 0.0f);
                    oVar.r(false);
                    n nVar2 = oVar.M;
                    if (nVar2 != null) {
                        nVar2.Z(false);
                    }
                }
                cropAreaView.getViewTreeObserver().removeOnPreDrawListener(this);
                break;
            default:
                o oVar2 = this.e;
                oVar2.l(false);
                CropAreaView cropAreaView2 = oVar2.a;
                ye yeVar2 = this.b;
                if (yeVar2 != null) {
                    float f17 = yeVar2.v;
                    if (f17 > 1.0E-4f) {
                        cropAreaView2.setLockedAspectRatio(f17);
                        n nVar3 = oVar2.M;
                        if (nVar3 != null) {
                            nVar3.H(true);
                        }
                    }
                    oVar2.setFreeform(yeVar2.u);
                    float aspectRatio2 = cropAreaView2.getAspectRatio();
                    int i12 = yeVar2.k;
                    int i13 = this.c;
                    int i14 = this.d;
                    if (i12 == 90 || i12 == 270) {
                        aspectRatio2 = 1.0f / aspectRatio2;
                        m mVar6 = oVar2.L;
                        f12 = mVar6.b;
                        f13 = mVar6.a;
                    } else {
                        m mVar7 = oVar2.L;
                        f12 = mVar7.a;
                        f13 = mVar7.b;
                        i14 = i13;
                        i13 = i14;
                    }
                    if (!oVar2.y || cropAreaView2.getLockAspectRatio() <= 0.0f) {
                        cropAreaView2.e(oVar2.getCurrentWidth(), oVar2.getCurrentHeight(), (((float) i12) + oVar2.L.g) % 180.0f != 0.0f, oVar2.y);
                    } else {
                        cropAreaView2.setLockedAspectRatio(1.0f / cropAreaView2.getLockAspectRatio());
                        cropAreaView2.setActualRect(cropAreaView2.getLockAspectRatio());
                    }
                    m.d(oVar2.L, i12);
                    cropAreaView2.setActualRect((aspectRatio2 * yeVar2.e) / yeVar2.f);
                    m mVar8 = oVar2.L;
                    mVar8.j = yeVar2.l;
                    m.e(mVar8, yeVar2.d);
                    m mVar9 = oVar2.L;
                    float f18 = yeVar2.a * i13;
                    float f19 = mVar9.f;
                    m.f(mVar9, f18 * f19, yeVar2.b * i14 * f19);
                    float max2 = Math.max(cropAreaView2.getCropWidth() / f12, cropAreaView2.getCropHeight() / f13);
                    m mVar10 = oVar2.L;
                    m.g(mVar10, yeVar2.c * (max2 / mVar10.f), 0.0f, 0.0f);
                    oVar2.r(false);
                    n nVar4 = oVar2.M;
                    if (nVar4 != null) {
                        nVar4.Z(false);
                    }
                }
                cropAreaView2.getViewTreeObserver().removeOnPreDrawListener(this);
                break;
        }
        return false;
    }
}
