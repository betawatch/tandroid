package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class lh extends j6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ bi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lh(bi biVar, int i3) {
        super("translation", 0);
        this.b = i3;
        switch (i3) {
            case 1:
                this.c = biVar;
                super("openProgress", 0);
                break;
            default:
                this.c = biVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.j6
    public final void c(Object obj, float f10) {
        float f11;
        switch (this.b) {
            case 0:
                bi biVar = this.c;
                biVar.V1 = f10;
                th thVar = biVar.u2;
                if (thVar != null) {
                    if ((thVar instanceof am) || (biVar.t2 instanceof am)) {
                        int max = Math.max(thVar.getWidth(), biVar.t2.getWidth());
                        if (biVar.u2 instanceof am) {
                            biVar.t2.setTranslationX((-max) * f10);
                            biVar.u2.setTranslationX((1.0f - f10) * max);
                        } else {
                            biVar.t2.setTranslationX(max * f10);
                            biVar.u2.setTranslationX((1.0f - f10) * (-max));
                        }
                    } else {
                        thVar.setAlpha(f10);
                        biVar.u2.v(f10);
                        th thVar2 = biVar.u2;
                        an anVar = biVar.e2;
                        if (thVar2 == anVar || biVar.t2 == anVar) {
                            biVar.P1(thVar2 == anVar ? 1 : 0);
                        }
                        th thVar3 = biVar.u2;
                        an anVar2 = biVar.f2;
                        if (thVar3 == anVar2 || biVar.t2 == anVar2) {
                            biVar.P1(thVar3 == anVar2 ? 1 : 0);
                        }
                        biVar.u2.setTranslationY(org.telegram.messenger.g0.L(78.0f) * f10);
                        biVar.t2.v(1.0f - Math.min(1.0f, f10 / 0.7f));
                        biVar.t2.m(biVar.g4);
                    }
                    if (biVar.o3 != null) {
                        biVar.P1(1);
                    }
                    biVar.b.invalidate();
                    break;
                }
                break;
            default:
                bh bhVar = this.c.t3;
                int childCount = bhVar.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    float f12 = (3 - i3) * 32.0f;
                    View childAt = bhVar.getChildAt(i3);
                    if (f10 > f12) {
                        float f13 = f10 - f12;
                        if (f13 <= 200.0f) {
                            float f14 = f13 / 200.0f;
                            f11 = xq.g.getInterpolation(f14) * 1.1f;
                            childAt.setAlpha(xq.j.getInterpolation(f14));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f15 = f13 - 200.0f;
                            f11 = f15 <= 100.0f ? 1.1f - (xq.i.getInterpolation(f15 / 100.0f) * 0.1f) : 1.0f;
                        }
                    } else {
                        f11 = 0.0f;
                    }
                    if (childAt instanceof wh) {
                        ((wh) childAt).a.setAttachScale(f11);
                    }
                }
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Float.valueOf(this.c.V1);
            default:
                return Float.valueOf(0.0f);
        }
    }
}
