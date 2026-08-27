package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class uh extends l6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ gi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uh(gi giVar, int i10) {
        super("translation", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = giVar;
                super("openProgress", 0);
                break;
            default:
                this.c = giVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.l6
    public final void c(Object obj, float f10) {
        ViewGroup viewGroup;
        float f11;
        switch (this.b) {
            case 0:
                gi giVar = this.c;
                giVar.Z = f10;
                yh yhVar = giVar.v0;
                if (yhVar != null) {
                    if ((yhVar instanceof em) || (giVar.u0 instanceof em)) {
                        int max = Math.max(yhVar.getWidth(), giVar.u0.getWidth());
                        if (giVar.v0 instanceof em) {
                            giVar.u0.setTranslationX((-max) * f10);
                            giVar.v0.setTranslationX((1.0f - f10) * max);
                        } else {
                            giVar.u0.setTranslationX(max * f10);
                            giVar.v0.setTranslationX((1.0f - f10) * (-max));
                        }
                    } else {
                        yhVar.setAlpha(f10);
                        giVar.v0.t(f10);
                        yh yhVar2 = giVar.v0;
                        in inVar = giVar.i0;
                        if (yhVar2 == inVar || giVar.u0 == inVar) {
                            giVar.a2(yhVar2 == inVar ? 1 : 0);
                        }
                        yh yhVar3 = giVar.v0;
                        in inVar2 = giVar.j0;
                        if (yhVar3 == inVar2 || giVar.u0 == inVar2) {
                            giVar.a2(yhVar3 == inVar2 ? 1 : 0);
                        }
                        giVar.v0.setTranslationY(AndroidUtilities.dp(78.0f) * f10);
                        giVar.u0.t(1.0f - Math.min(1.0f, f10 / 0.7f));
                        giVar.u0.k(giVar.h2);
                    }
                    if (giVar.p1 != null) {
                        giVar.a2(1);
                    }
                    giVar.Z0();
                    viewGroup = ((org.telegram.ui.ActionBar.e3) giVar).containerView;
                    viewGroup.invalidate();
                    break;
                }
                break;
            default:
                jh jhVar = this.c.u1;
                int childCount = jhVar.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    float f12 = (3 - i10) * 32.0f;
                    View childAt = jhVar.getChildAt(i10);
                    if (f10 > f12) {
                        float f13 = f10 - f12;
                        if (f13 <= 200.0f) {
                            float f14 = f13 / 200.0f;
                            f11 = er.g.getInterpolation(f14) * 1.1f;
                            childAt.setAlpha(er.j.getInterpolation(f14));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f15 = f13 - 200.0f;
                            f11 = f15 <= 100.0f ? 1.1f - (er.i.getInterpolation(f15 / 100.0f) * 0.1f) : 1.0f;
                        }
                    } else {
                        f11 = 0.0f;
                    }
                    if (childAt instanceof bi) {
                        ((bi) childAt).a.setAttachScale(f11);
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
