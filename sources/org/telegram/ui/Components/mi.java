package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class mi extends q6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ yi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi(yi yiVar, int i10) {
        super("translation", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = yiVar;
                super("openProgress", 0);
                break;
            default:
                this.c = yiVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.q6
    public final void b(Object obj, float f7) {
        ViewGroup viewGroup;
        float f10;
        switch (this.b) {
            case 0:
                yi yiVar = this.c;
                yiVar.d0 = f7;
                qi qiVar = yiVar.z0;
                if (qiVar != null) {
                    if ((qiVar instanceof xm) || (yiVar.y0 instanceof xm)) {
                        int max = Math.max(qiVar.getWidth(), yiVar.y0.getWidth());
                        if (yiVar.z0 instanceof xm) {
                            yiVar.y0.setTranslationX((-max) * f7);
                            yiVar.z0.setTranslationX((1.0f - f7) * max);
                        } else {
                            yiVar.y0.setTranslationX(max * f7);
                            yiVar.z0.setTranslationX((1.0f - f7) * (-max));
                        }
                    } else {
                        qiVar.setAlpha(f7);
                        yiVar.z0.s(f7);
                        qi qiVar2 = yiVar.z0;
                        zn znVar = yiVar.m0;
                        if (qiVar2 == znVar || yiVar.y0 == znVar) {
                            yiVar.a2(qiVar2 == znVar ? 1 : 0);
                        }
                        qi qiVar3 = yiVar.z0;
                        zn znVar2 = yiVar.n0;
                        if (qiVar3 == znVar2 || yiVar.y0 == znVar2) {
                            yiVar.a2(qiVar3 == znVar2 ? 1 : 0);
                        }
                        yiVar.z0.setTranslationY(AndroidUtilities.dp(78.0f) * f7);
                        yiVar.y0.s(1.0f - Math.min(1.0f, f7 / 0.7f));
                        yiVar.y0.k(yiVar.l2);
                    }
                    if (yiVar.t1 != null) {
                        yiVar.a2(1);
                    }
                    yiVar.Z0();
                    viewGroup = ((org.telegram.ui.ActionBar.h3) yiVar).containerView;
                    viewGroup.invalidate();
                    break;
                }
                break;
            default:
                bi biVar = this.c.y1;
                int childCount = biVar.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    float f11 = (3 - i10) * 32.0f;
                    View childAt = biVar.getChildAt(i10);
                    if (f7 > f11) {
                        float f12 = f7 - f11;
                        if (f12 <= 200.0f) {
                            float f13 = f12 / 200.0f;
                            f10 = wr.g.getInterpolation(f13) * 1.1f;
                            childAt.setAlpha(wr.j.getInterpolation(f13));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f14 = f12 - 200.0f;
                            f10 = f14 <= 100.0f ? 1.1f - (wr.i.getInterpolation(f14 / 100.0f) * 0.1f) : 1.0f;
                        }
                    } else {
                        f10 = 0.0f;
                    }
                    if (childAt instanceof ti) {
                        ((ti) childAt).a.setAttachScale(f10);
                    }
                }
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Float.valueOf(this.c.d0);
            default:
                return Float.valueOf(0.0f);
        }
    }
}
