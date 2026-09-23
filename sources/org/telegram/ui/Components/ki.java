package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ki extends r6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ wi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ki(wi wiVar, int i10) {
        super("translation", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = wiVar;
                super("openProgress", 0);
                break;
            default:
                this.c = wiVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.r6
    public final void b(Object obj, float f7) {
        ViewGroup viewGroup;
        float f10;
        switch (this.b) {
            case 0:
                wi wiVar = this.c;
                wiVar.d0 = f7;
                oi oiVar = wiVar.z0;
                if (oiVar != null) {
                    if ((oiVar instanceof rm) || (wiVar.y0 instanceof rm)) {
                        int max = Math.max(oiVar.getWidth(), wiVar.y0.getWidth());
                        if (wiVar.z0 instanceof rm) {
                            wiVar.y0.setTranslationX((-max) * f7);
                            wiVar.z0.setTranslationX((1.0f - f7) * max);
                        } else {
                            wiVar.y0.setTranslationX(max * f7);
                            wiVar.z0.setTranslationX((1.0f - f7) * (-max));
                        }
                    } else {
                        oiVar.setAlpha(f7);
                        wiVar.z0.s(f7);
                        oi oiVar2 = wiVar.z0;
                        vn vnVar = wiVar.m0;
                        if (oiVar2 == vnVar || wiVar.y0 == vnVar) {
                            wiVar.a2(oiVar2 == vnVar ? 1 : 0);
                        }
                        oi oiVar3 = wiVar.z0;
                        vn vnVar2 = wiVar.n0;
                        if (oiVar3 == vnVar2 || wiVar.y0 == vnVar2) {
                            wiVar.a2(oiVar3 == vnVar2 ? 1 : 0);
                        }
                        wiVar.z0.setTranslationY(AndroidUtilities.dp(78.0f) * f7);
                        wiVar.y0.s(1.0f - Math.min(1.0f, f7 / 0.7f));
                        wiVar.y0.k(wiVar.l2);
                    }
                    if (wiVar.t1 != null) {
                        wiVar.a2(1);
                    }
                    wiVar.Z0();
                    viewGroup = ((org.telegram.ui.ActionBar.f3) wiVar).containerView;
                    viewGroup.invalidate();
                    break;
                }
                break;
            default:
                zh zhVar = this.c.y1;
                int childCount = zhVar.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    float f11 = (3 - i10) * 32.0f;
                    View childAt = zhVar.getChildAt(i10);
                    if (f7 > f11) {
                        float f12 = f7 - f11;
                        if (f12 <= 200.0f) {
                            float f13 = f12 / 200.0f;
                            f10 = rr.g.getInterpolation(f13) * 1.1f;
                            childAt.setAlpha(rr.j.getInterpolation(f13));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f14 = f12 - 200.0f;
                            f10 = f14 <= 100.0f ? 1.1f - (rr.i.getInterpolation(f14 / 100.0f) * 0.1f) : 1.0f;
                        }
                    } else {
                        f10 = 0.0f;
                    }
                    if (childAt instanceof ri) {
                        ((ri) childAt).a.setAttachScale(f10);
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
