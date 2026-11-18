package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class di extends p6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ si c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di(si siVar, int i7) {
        super("translation", 0);
        this.b = i7;
        switch (i7) {
            case 1:
                this.c = siVar;
                super("openProgress", 0);
                break;
            default:
                this.c = siVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.p6
    public final void c(Object obj, float f10) {
        float f11;
        switch (this.b) {
            case 0:
                si siVar = this.c;
                siVar.Y1 = f10;
                ki kiVar = siVar.x2;
                if (kiVar != null) {
                    if ((kiVar instanceof pm) || (siVar.w2 instanceof pm)) {
                        int max = Math.max(kiVar.getWidth(), siVar.w2.getWidth());
                        if (siVar.x2 instanceof pm) {
                            siVar.w2.setTranslationX((-max) * f10);
                            siVar.x2.setTranslationX((1.0f - f10) * max);
                        } else {
                            siVar.w2.setTranslationX(max * f10);
                            siVar.x2.setTranslationX((1.0f - f10) * (-max));
                        }
                    } else {
                        kiVar.setAlpha(f10);
                        siVar.x2.v(f10);
                        ki kiVar2 = siVar.x2;
                        rn rnVar = siVar.h2;
                        if (kiVar2 == rnVar || siVar.w2 == rnVar) {
                            siVar.Q1(kiVar2 == rnVar ? 1 : 0);
                        }
                        ki kiVar3 = siVar.x2;
                        rn rnVar2 = siVar.i2;
                        if (kiVar3 == rnVar2 || siVar.w2 == rnVar2) {
                            siVar.Q1(kiVar3 == rnVar2 ? 1 : 0);
                        }
                        siVar.x2.setTranslationY(org.telegram.messenger.g0.L(78.0f) * f10);
                        siVar.w2.v(1.0f - Math.min(1.0f, f10 / 0.7f));
                        siVar.w2.m(siVar.j4);
                    }
                    if (siVar.r3 != null) {
                        siVar.Q1(1);
                    }
                    siVar.b.invalidate();
                    break;
                }
                break;
            default:
                th thVar = this.c.w3;
                int childCount = thVar.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    float f12 = (3 - i7) * 32.0f;
                    View childAt = thVar.getChildAt(i7);
                    if (f10 > f12) {
                        float f13 = f10 - f12;
                        if (f13 <= 200.0f) {
                            float f14 = f13 / 200.0f;
                            f11 = lr.g.getInterpolation(f14) * 1.1f;
                            childAt.setAlpha(lr.j.getInterpolation(f14));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f15 = f13 - 200.0f;
                            f11 = f15 <= 100.0f ? 1.1f - (lr.i.getInterpolation(f15 / 100.0f) * 0.1f) : 1.0f;
                        }
                    } else {
                        f11 = 0.0f;
                    }
                    if (childAt instanceof ni) {
                        ((ni) childAt).a.setAttachScale(f11);
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
