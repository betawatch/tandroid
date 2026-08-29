package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class bi extends q6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ ni c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(ni niVar, int i10) {
        super("translation", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = niVar;
                super("openProgress", 0);
                break;
            default:
                this.c = niVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.q6
    public final void b(Object obj, float f9) {
        ViewGroup viewGroup;
        float f10;
        switch (this.b) {
            case 0:
                ni niVar = this.c;
                niVar.Z = f9;
                fi fiVar = niVar.v0;
                if (fiVar != null) {
                    if ((fiVar instanceof lm) || (niVar.u0 instanceof lm)) {
                        int max = Math.max(fiVar.getWidth(), niVar.u0.getWidth());
                        if (niVar.v0 instanceof lm) {
                            niVar.u0.setTranslationX((-max) * f9);
                            niVar.v0.setTranslationX((1.0f - f9) * max);
                        } else {
                            niVar.u0.setTranslationX(max * f9);
                            niVar.v0.setTranslationX((1.0f - f9) * (-max));
                        }
                    } else {
                        fiVar.setAlpha(f9);
                        niVar.v0.s(f9);
                        fi fiVar2 = niVar.v0;
                        on onVar = niVar.i0;
                        if (fiVar2 == onVar || niVar.u0 == onVar) {
                            niVar.a2(fiVar2 == onVar ? 1 : 0);
                        }
                        fi fiVar3 = niVar.v0;
                        on onVar2 = niVar.j0;
                        if (fiVar3 == onVar2 || niVar.u0 == onVar2) {
                            niVar.a2(fiVar3 == onVar2 ? 1 : 0);
                        }
                        niVar.v0.setTranslationY(AndroidUtilities.dp(78.0f) * f9);
                        niVar.u0.s(1.0f - Math.min(1.0f, f9 / 0.7f));
                        niVar.u0.k(niVar.h2);
                    }
                    if (niVar.p1 != null) {
                        niVar.a2(1);
                    }
                    niVar.Z0();
                    viewGroup = ((org.telegram.ui.ActionBar.f3) niVar).containerView;
                    viewGroup.invalidate();
                    break;
                }
                break;
            default:
                qh qhVar = this.c.u1;
                int childCount = qhVar.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    float f11 = (3 - i10) * 32.0f;
                    View childAt = qhVar.getChildAt(i10);
                    if (f9 > f11) {
                        float f12 = f9 - f11;
                        if (f12 <= 200.0f) {
                            float f13 = f12 / 200.0f;
                            f10 = jr.g.getInterpolation(f13) * 1.1f;
                            childAt.setAlpha(jr.j.getInterpolation(f13));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f14 = f12 - 200.0f;
                            f10 = f14 <= 100.0f ? 1.1f - (jr.i.getInterpolation(f14 / 100.0f) * 0.1f) : 1.0f;
                        }
                    } else {
                        f10 = 0.0f;
                    }
                    if (childAt instanceof ii) {
                        ((ii) childAt).a.setAttachScale(f10);
                    }
                }
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Float.valueOf(this.c.Z);
            default:
                return Float.valueOf(0.0f);
        }
    }
}
