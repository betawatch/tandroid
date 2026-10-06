package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class ii extends r6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ xi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii(xi xiVar, int i10) {
        super("translation", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = xiVar;
                super("openProgress", 0);
                break;
            default:
                this.c = xiVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.r6
    public final void c(Object obj, float f7) {
        ViewGroup viewGroup;
        float f10;
        switch (this.b) {
            case 0:
                xi xiVar = this.c;
                xiVar.d0 = f7;
                pi piVar = xiVar.z0;
                if (piVar != null) {
                    if ((piVar instanceof tm) || (xiVar.y0 instanceof tm)) {
                        int max = Math.max(piVar.getWidth(), xiVar.y0.getWidth());
                        if (xiVar.z0 instanceof tm) {
                            xiVar.y0.setTranslationX((-max) * f7);
                            xiVar.z0.setTranslationX((1.0f - f7) * max);
                        } else {
                            xiVar.y0.setTranslationX(max * f7);
                            xiVar.z0.setTranslationX((1.0f - f7) * (-max));
                        }
                    } else {
                        piVar.setAlpha(f7);
                        xiVar.z0.s(f7);
                        pi piVar2 = xiVar.z0;
                        xn xnVar = xiVar.m0;
                        if (piVar2 == xnVar || xiVar.y0 == xnVar) {
                            xiVar.Z1(piVar2 == xnVar ? 1 : 0);
                        }
                        pi piVar3 = xiVar.z0;
                        xn xnVar2 = xiVar.n0;
                        if (piVar3 == xnVar2 || xiVar.y0 == xnVar2) {
                            xiVar.Z1(piVar3 == xnVar2 ? 1 : 0);
                        }
                        xiVar.z0.setTranslationY(AndroidUtilities.dp(78.0f) * f7);
                        xiVar.y0.s(1.0f - Math.min(1.0f, f7 / 0.7f));
                        xiVar.y0.k(xiVar.l2);
                    }
                    if (xiVar.t1 != null) {
                        xiVar.Z1(1);
                    }
                    viewGroup = ((org.telegram.ui.ActionBar.f3) xiVar).containerView;
                    viewGroup.invalidate();
                    break;
                }
                break;
            default:
                xh xhVar = this.c.y1;
                int childCount = xhVar.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    float f11 = (3 - i10) * 32.0f;
                    View childAt = xhVar.getChildAt(i10);
                    if (f7 > f11) {
                        float f12 = f7 - f11;
                        if (f12 <= 200.0f) {
                            float f13 = f12 / 200.0f;
                            f10 = tr.g.getInterpolation(f13) * 1.1f;
                            childAt.setAlpha(tr.j.getInterpolation(f13));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f14 = f12 - 200.0f;
                            f10 = f14 <= 100.0f ? 1.1f - (tr.i.getInterpolation(f14 / 100.0f) * 0.1f) : 1.0f;
                        }
                    } else {
                        f10 = 0.0f;
                    }
                    if (childAt instanceof si) {
                        ((si) childAt).a.setAttachScale(f10);
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
