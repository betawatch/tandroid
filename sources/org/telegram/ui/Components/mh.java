package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class mh extends h6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ bi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mh(bi biVar, int i10) {
        super("translation", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = biVar;
                super("openProgress", 0);
                break;
            default:
                this.c = biVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.h6
    public final void c(Object obj, float f7) {
        float f10;
        switch (this.b) {
            case 0:
                bi biVar = this.c;
                biVar.U1 = f7;
                uh uhVar = biVar.t2;
                if (uhVar != null) {
                    if ((uhVar instanceof jm) || (biVar.s2 instanceof jm)) {
                        int max = Math.max(uhVar.getWidth(), biVar.s2.getWidth());
                        if (biVar.t2 instanceof jm) {
                            biVar.s2.setTranslationX((-max) * f7);
                            biVar.t2.setTranslationX((1.0f - f7) * max);
                        } else {
                            biVar.s2.setTranslationX(max * f7);
                            biVar.t2.setTranslationX((1.0f - f7) * (-max));
                        }
                    } else {
                        uhVar.setAlpha(f7);
                        biVar.t2.u(f7);
                        uh uhVar2 = biVar.t2;
                        jn jnVar = biVar.d2;
                        if (uhVar2 == jnVar || biVar.s2 == jnVar) {
                            biVar.O1(uhVar2 == jnVar ? 1 : 0);
                        }
                        uh uhVar3 = biVar.t2;
                        jn jnVar2 = biVar.e2;
                        if (uhVar3 == jnVar2 || biVar.s2 == jnVar2) {
                            biVar.O1(uhVar3 == jnVar2 ? 1 : 0);
                        }
                        biVar.t2.setTranslationY(org.telegram.messenger.i0.L(78.0f) * f7);
                        biVar.s2.u(1.0f - Math.min(1.0f, f7 / 0.7f));
                        biVar.s2.l(biVar.f4);
                    }
                    if (biVar.n3 != null) {
                        biVar.O1(1);
                    }
                    biVar.b.invalidate();
                    break;
                }
                break;
            default:
                bh bhVar = this.c.s3;
                int childCount = bhVar.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    float f11 = (3 - i10) * 32.0f;
                    View childAt = bhVar.getChildAt(i10);
                    if (f7 > f11) {
                        float f12 = f7 - f11;
                        if (f12 <= 200.0f) {
                            float f13 = f12 / 200.0f;
                            f10 = gr.g.getInterpolation(f13) * 1.1f;
                            childAt.setAlpha(gr.j.getInterpolation(f13));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f14 = f12 - 200.0f;
                            f10 = f14 <= 100.0f ? 1.1f - (gr.i.getInterpolation(f14 / 100.0f) * 0.1f) : 1.0f;
                        }
                    } else {
                        f10 = 0.0f;
                    }
                    if (childAt instanceof xh) {
                        ((xh) childAt).a.setAttachScale(f10);
                    }
                }
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Float.valueOf(this.c.U1);
            default:
                return Float.valueOf(0.0f);
        }
    }
}
