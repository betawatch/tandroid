package eg;

import android.view.ViewTreeObserver;
import org.telegram.messenger.ye;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ye b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ q e;

    public /* synthetic */ l(q qVar, ye yeVar, int i10, int i11, int i12) {
        this.a = i12;
        this.e = qVar;
        this.b = yeVar;
        this.c = i10;
        this.d = i11;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        float f7;
        float f10;
        float f11;
        float f12;
        switch (this.a) {
            case 0:
                q qVar = this.e;
                qVar.l(false);
                CropAreaView cropAreaView = qVar.a;
                ye yeVar = this.b;
                if (yeVar != null) {
                    float f13 = yeVar.v;
                    if (f13 > 1.0E-4f) {
                        cropAreaView.setLockedAspectRatio(f13);
                        p pVar = qVar.M;
                        if (pVar != null) {
                            pVar.g(true);
                        }
                    }
                    qVar.setFreeform(yeVar.u);
                    float aspectRatio = cropAreaView.getAspectRatio();
                    int i10 = yeVar.k;
                    int i11 = this.c;
                    int i12 = this.d;
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
                    if (!qVar.y || cropAreaView.getLockAspectRatio() <= 0.0f) {
                        cropAreaView.e(qVar.getCurrentWidth(), qVar.getCurrentHeight(), (((float) i10) + qVar.L.g) % 180.0f != 0.0f, qVar.y);
                    } else {
                        cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                        cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
                    }
                    o.d(qVar.L, i10);
                    cropAreaView.setActualRect((aspectRatio * yeVar.e) / yeVar.f);
                    o oVar3 = qVar.L;
                    oVar3.j = yeVar.l;
                    o.e(oVar3, yeVar.d);
                    o oVar4 = qVar.L;
                    float f14 = yeVar.a * i11;
                    float f15 = oVar4.f;
                    o.f(oVar4, f14 * f15, yeVar.b * i12 * f15);
                    float max = Math.max(cropAreaView.getCropWidth() / f7, cropAreaView.getCropHeight() / f10);
                    o oVar5 = qVar.L;
                    o.g(oVar5, yeVar.c * (max / oVar5.f), 0.0f, 0.0f);
                    qVar.r(false);
                    p pVar2 = qVar.M;
                    if (pVar2 != null) {
                        pVar2.l(false);
                    }
                }
                cropAreaView.getViewTreeObserver().removeOnPreDrawListener(this);
                break;
            default:
                q qVar2 = this.e;
                qVar2.l(false);
                CropAreaView cropAreaView2 = qVar2.a;
                ye yeVar2 = this.b;
                if (yeVar2 != null) {
                    float f16 = yeVar2.v;
                    if (f16 > 1.0E-4f) {
                        cropAreaView2.setLockedAspectRatio(f16);
                        p pVar3 = qVar2.M;
                        if (pVar3 != null) {
                            pVar3.g(true);
                        }
                    }
                    qVar2.setFreeform(yeVar2.u);
                    float aspectRatio2 = cropAreaView2.getAspectRatio();
                    int i13 = yeVar2.k;
                    int i14 = this.c;
                    int i15 = this.d;
                    if (i13 == 90 || i13 == 270) {
                        aspectRatio2 = 1.0f / aspectRatio2;
                        o oVar6 = qVar2.L;
                        f11 = oVar6.b;
                        f12 = oVar6.a;
                    } else {
                        o oVar7 = qVar2.L;
                        f11 = oVar7.a;
                        f12 = oVar7.b;
                        i15 = i14;
                        i14 = i15;
                    }
                    if (!qVar2.y || cropAreaView2.getLockAspectRatio() <= 0.0f) {
                        cropAreaView2.e(qVar2.getCurrentWidth(), qVar2.getCurrentHeight(), (((float) i13) + qVar2.L.g) % 180.0f != 0.0f, qVar2.y);
                    } else {
                        cropAreaView2.setLockedAspectRatio(1.0f / cropAreaView2.getLockAspectRatio());
                        cropAreaView2.setActualRect(cropAreaView2.getLockAspectRatio());
                    }
                    o.d(qVar2.L, i13);
                    cropAreaView2.setActualRect((aspectRatio2 * yeVar2.e) / yeVar2.f);
                    o oVar8 = qVar2.L;
                    oVar8.j = yeVar2.l;
                    o.e(oVar8, yeVar2.d);
                    o oVar9 = qVar2.L;
                    float f17 = yeVar2.a * i14;
                    float f18 = oVar9.f;
                    o.f(oVar9, f17 * f18, yeVar2.b * i15 * f18);
                    float max2 = Math.max(cropAreaView2.getCropWidth() / f11, cropAreaView2.getCropHeight() / f12);
                    o oVar10 = qVar2.L;
                    o.g(oVar10, yeVar2.c * (max2 / oVar10.f), 0.0f, 0.0f);
                    qVar2.r(false);
                    p pVar4 = qVar2.M;
                    if (pVar4 != null) {
                        pVar4.l(false);
                    }
                }
                cropAreaView2.getViewTreeObserver().removeOnPreDrawListener(this);
                break;
        }
        return false;
    }
}
