package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ji extends s6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ vi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji(vi viVar, int i10) {
        super("translation", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = viVar;
                super("openProgress", 0);
                break;
            default:
                this.c = viVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.s6
    public final void b(Object obj, float f7) {
        ViewGroup viewGroup;
        float f10;
        switch (this.b) {
            case 0:
                vi viVar = this.c;
                viVar.d0 = f7;
                ni niVar = viVar.z0;
                if (niVar != null) {
                    if ((niVar instanceof qm) || (viVar.y0 instanceof qm)) {
                        int max = Math.max(niVar.getWidth(), viVar.y0.getWidth());
                        if (viVar.z0 instanceof qm) {
                            viVar.y0.setTranslationX((-max) * f7);
                            viVar.z0.setTranslationX((1.0f - f7) * max);
                        } else {
                            viVar.y0.setTranslationX(max * f7);
                            viVar.z0.setTranslationX((1.0f - f7) * (-max));
                        }
                    } else {
                        niVar.setAlpha(f7);
                        viVar.z0.s(f7);
                        ni niVar2 = viVar.z0;
                        tn tnVar = viVar.m0;
                        if (niVar2 == tnVar || viVar.y0 == tnVar) {
                            viVar.a2(niVar2 == tnVar ? 1 : 0);
                        }
                        ni niVar3 = viVar.z0;
                        tn tnVar2 = viVar.n0;
                        if (niVar3 == tnVar2 || viVar.y0 == tnVar2) {
                            viVar.a2(niVar3 == tnVar2 ? 1 : 0);
                        }
                        viVar.z0.setTranslationY(AndroidUtilities.dp(78.0f) * f7);
                        viVar.y0.s(1.0f - Math.min(1.0f, f7 / 0.7f));
                        viVar.y0.k(viVar.l2);
                    }
                    if (viVar.t1 != null) {
                        viVar.a2(1);
                    }
                    viVar.Z0();
                    viewGroup = ((org.telegram.ui.ActionBar.f3) viVar).containerView;
                    viewGroup.invalidate();
                    break;
                }
                break;
            default:
                yh yhVar = this.c.y1;
                int childCount = yhVar.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    float f11 = (3 - i10) * 32.0f;
                    View childAt = yhVar.getChildAt(i10);
                    if (f7 > f11) {
                        float f12 = f7 - f11;
                        if (f12 <= 200.0f) {
                            float f13 = f12 / 200.0f;
                            f10 = pr.g.getInterpolation(f13) * 1.1f;
                            childAt.setAlpha(pr.j.getInterpolation(f13));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f14 = f12 - 200.0f;
                            f10 = f14 <= 100.0f ? 1.1f - (pr.i.getInterpolation(f14 / 100.0f) * 0.1f) : 1.0f;
                        }
                    } else {
                        f10 = 0.0f;
                    }
                    if (childAt instanceof qi) {
                        ((qi) childAt).a.setAttachScale(f10);
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
