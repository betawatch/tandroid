package og;

import android.view.ViewTreeObserver;
import org.telegram.messenger.we;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class k implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ we b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ o e;

    public /* synthetic */ k(o oVar, we weVar, int i7, int i10, int i11) {
        this.a = i11;
        this.e = oVar;
        this.b = weVar;
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
                we weVar = this.b;
                if (weVar != null) {
                    float f14 = weVar.v;
                    if (f14 > 1.0E-4f) {
                        cropAreaView.setLockedAspectRatio(f14);
                        n nVar = oVar.N;
                        if (nVar != null) {
                            nVar.w(true);
                        }
                    }
                    oVar.setFreeform(weVar.u);
                    float aspectRatio = cropAreaView.getAspectRatio();
                    int i7 = weVar.k;
                    int i10 = this.c;
                    int i11 = this.d;
                    if (i7 == 90 || i7 == 270) {
                        aspectRatio = 1.0f / aspectRatio;
                        m mVar = oVar.M;
                        f10 = mVar.b;
                        f11 = mVar.a;
                    } else {
                        m mVar2 = oVar.M;
                        f10 = mVar2.a;
                        f11 = mVar2.b;
                        i11 = i10;
                        i10 = i11;
                    }
                    if (!oVar.y || cropAreaView.getLockAspectRatio() <= 0.0f) {
                        cropAreaView.e(oVar.getCurrentWidth(), oVar.getCurrentHeight(), (((float) i7) + oVar.M.g) % 180.0f != 0.0f, oVar.y);
                    } else {
                        cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                        cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
                    }
                    m.d(oVar.M, i7);
                    cropAreaView.setActualRect((aspectRatio * weVar.e) / weVar.f);
                    m mVar3 = oVar.M;
                    mVar3.j = weVar.l;
                    m.e(mVar3, weVar.d);
                    m mVar4 = oVar.M;
                    float f15 = weVar.a * i10;
                    float f16 = mVar4.f;
                    m.f(mVar4, f15 * f16, weVar.b * i11 * f16);
                    float max = Math.max(cropAreaView.getCropWidth() / f10, cropAreaView.getCropHeight() / f11);
                    m mVar5 = oVar.M;
                    m.g(mVar5, weVar.c * (max / mVar5.f), 0.0f, 0.0f);
                    oVar.r(false);
                    n nVar2 = oVar.N;
                    if (nVar2 != null) {
                        nVar2.D(false);
                    }
                }
                cropAreaView.getViewTreeObserver().removeOnPreDrawListener(this);
                break;
            default:
                o oVar2 = this.e;
                oVar2.l(false);
                CropAreaView cropAreaView2 = oVar2.a;
                we weVar2 = this.b;
                if (weVar2 != null) {
                    float f17 = weVar2.v;
                    if (f17 > 1.0E-4f) {
                        cropAreaView2.setLockedAspectRatio(f17);
                        n nVar3 = oVar2.N;
                        if (nVar3 != null) {
                            nVar3.w(true);
                        }
                    }
                    oVar2.setFreeform(weVar2.u);
                    float aspectRatio2 = cropAreaView2.getAspectRatio();
                    int i12 = weVar2.k;
                    int i13 = this.c;
                    int i14 = this.d;
                    if (i12 == 90 || i12 == 270) {
                        aspectRatio2 = 1.0f / aspectRatio2;
                        m mVar6 = oVar2.M;
                        f12 = mVar6.b;
                        f13 = mVar6.a;
                    } else {
                        m mVar7 = oVar2.M;
                        f12 = mVar7.a;
                        f13 = mVar7.b;
                        i14 = i13;
                        i13 = i14;
                    }
                    if (!oVar2.y || cropAreaView2.getLockAspectRatio() <= 0.0f) {
                        cropAreaView2.e(oVar2.getCurrentWidth(), oVar2.getCurrentHeight(), (((float) i12) + oVar2.M.g) % 180.0f != 0.0f, oVar2.y);
                    } else {
                        cropAreaView2.setLockedAspectRatio(1.0f / cropAreaView2.getLockAspectRatio());
                        cropAreaView2.setActualRect(cropAreaView2.getLockAspectRatio());
                    }
                    m.d(oVar2.M, i12);
                    cropAreaView2.setActualRect((aspectRatio2 * weVar2.e) / weVar2.f);
                    m mVar8 = oVar2.M;
                    mVar8.j = weVar2.l;
                    m.e(mVar8, weVar2.d);
                    m mVar9 = oVar2.M;
                    float f18 = weVar2.a * i13;
                    float f19 = mVar9.f;
                    m.f(mVar9, f18 * f19, weVar2.b * i14 * f19);
                    float max2 = Math.max(cropAreaView2.getCropWidth() / f12, cropAreaView2.getCropHeight() / f13);
                    m mVar10 = oVar2.M;
                    m.g(mVar10, weVar2.c * (max2 / mVar10.f), 0.0f, 0.0f);
                    oVar2.r(false);
                    n nVar4 = oVar2.N;
                    if (nVar4 != null) {
                        nVar4.D(false);
                    }
                }
                cropAreaView2.getViewTreeObserver().removeOnPreDrawListener(this);
                break;
        }
        return false;
    }
}
