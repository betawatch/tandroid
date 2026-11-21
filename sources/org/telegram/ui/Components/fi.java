package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class fi extends q6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ ui c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi(ui uiVar, int i7) {
        super("translation", 0);
        this.b = i7;
        switch (i7) {
            case 1:
                this.c = uiVar;
                super("openProgress", 0);
                break;
            default:
                this.c = uiVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.q6
    public final void c(Object obj, float f10) {
        float f11;
        switch (this.b) {
            case 0:
                ui uiVar = this.c;
                uiVar.Y1 = f10;
                mi miVar = uiVar.x2;
                if (miVar != null) {
                    if ((miVar instanceof rm) || (uiVar.w2 instanceof rm)) {
                        int max = Math.max(miVar.getWidth(), uiVar.w2.getWidth());
                        if (uiVar.x2 instanceof rm) {
                            uiVar.w2.setTranslationX((-max) * f10);
                            uiVar.x2.setTranslationX((1.0f - f10) * max);
                        } else {
                            uiVar.w2.setTranslationX(max * f10);
                            uiVar.x2.setTranslationX((1.0f - f10) * (-max));
                        }
                    } else {
                        miVar.setAlpha(f10);
                        uiVar.x2.v(f10);
                        mi miVar2 = uiVar.x2;
                        tn tnVar = uiVar.h2;
                        if (miVar2 == tnVar || uiVar.w2 == tnVar) {
                            uiVar.Q1(miVar2 == tnVar ? 1 : 0);
                        }
                        mi miVar3 = uiVar.x2;
                        tn tnVar2 = uiVar.i2;
                        if (miVar3 == tnVar2 || uiVar.w2 == tnVar2) {
                            uiVar.Q1(miVar3 == tnVar2 ? 1 : 0);
                        }
                        uiVar.x2.setTranslationY(org.telegram.messenger.g0.L(78.0f) * f10);
                        uiVar.w2.v(1.0f - Math.min(1.0f, f10 / 0.7f));
                        uiVar.w2.m(uiVar.j4);
                    }
                    if (uiVar.r3 != null) {
                        uiVar.Q1(1);
                    }
                    uiVar.b.invalidate();
                    break;
                }
                break;
            default:
                vh vhVar = this.c.w3;
                int childCount = vhVar.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    float f12 = (3 - i7) * 32.0f;
                    View childAt = vhVar.getChildAt(i7);
                    if (f10 > f12) {
                        float f13 = f10 - f12;
                        if (f13 <= 200.0f) {
                            float f14 = f13 / 200.0f;
                            f11 = nr.g.getInterpolation(f14) * 1.1f;
                            childAt.setAlpha(nr.j.getInterpolation(f14));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f15 = f13 - 200.0f;
                            f11 = f15 <= 100.0f ? 1.1f - (nr.i.getInterpolation(f15 / 100.0f) * 0.1f) : 1.0f;
                        }
                    } else {
                        f11 = 0.0f;
                    }
                    if (childAt instanceof pi) {
                        ((pi) childAt).a.setAttachScale(f11);
                    }
                }
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Float.valueOf(this.c.Y1);
            default:
                return Float.valueOf(0.0f);
        }
    }
}
