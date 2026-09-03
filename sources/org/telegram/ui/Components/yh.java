package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class yh extends m6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ mi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh(mi miVar, int i10) {
        super("translation", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = miVar;
                super("openProgress", 0);
                break;
            default:
                this.c = miVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.m6
    public final void b(Object obj, float f10) {
        ViewGroup viewGroup;
        float f11;
        switch (this.b) {
            case 0:
                mi miVar = this.c;
                miVar.a0 = f10;
                ei eiVar = miVar.w0;
                if (eiVar != null) {
                    if ((eiVar instanceof pm) || (miVar.v0 instanceof pm)) {
                        int max = Math.max(eiVar.getWidth(), miVar.v0.getWidth());
                        if (miVar.w0 instanceof pm) {
                            miVar.v0.setTranslationX((-max) * f10);
                            miVar.w0.setTranslationX((1.0f - f10) * max);
                        } else {
                            miVar.v0.setTranslationX(max * f10);
                            miVar.w0.setTranslationX((1.0f - f10) * (-max));
                        }
                    } else {
                        eiVar.setAlpha(f10);
                        miVar.w0.s(f10);
                        ei eiVar2 = miVar.w0;
                        rn rnVar = miVar.j0;
                        if (eiVar2 == rnVar || miVar.v0 == rnVar) {
                            miVar.a2(eiVar2 == rnVar ? 1 : 0);
                        }
                        ei eiVar3 = miVar.w0;
                        rn rnVar2 = miVar.k0;
                        if (eiVar3 == rnVar2 || miVar.v0 == rnVar2) {
                            miVar.a2(eiVar3 == rnVar2 ? 1 : 0);
                        }
                        miVar.w0.setTranslationY(AndroidUtilities.dp(78.0f) * f10);
                        miVar.v0.s(1.0f - Math.min(1.0f, f10 / 0.7f));
                        miVar.v0.k(miVar.i2);
                    }
                    if (miVar.q1 != null) {
                        miVar.a2(1);
                    }
                    miVar.Z0();
                    viewGroup = ((org.telegram.ui.ActionBar.h3) miVar).containerView;
                    viewGroup.invalidate();
                    break;
                }
                break;
            default:
                nh nhVar = this.c.v1;
                int childCount = nhVar.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    float f12 = (3 - i10) * 32.0f;
                    View childAt = nhVar.getChildAt(i10);
                    if (f10 > f12) {
                        float f13 = f10 - f12;
                        if (f13 <= 200.0f) {
                            float f14 = f13 / 200.0f;
                            f11 = pr.g.getInterpolation(f14) * 1.1f;
                            childAt.setAlpha(pr.j.getInterpolation(f14));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f15 = f13 - 200.0f;
                            f11 = f15 <= 100.0f ? 1.1f - (pr.i.getInterpolation(f15 / 100.0f) * 0.1f) : 1.0f;
                        }
                    } else {
                        f11 = 0.0f;
                    }
                    if (childAt instanceof hi) {
                        ((hi) childAt).a.setAttachScale(f11);
                    }
                }
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Float.valueOf(this.c.a0);
            default:
                return Float.valueOf(0.0f);
        }
    }
}
