package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ji extends u6 {
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

    @Override // org.telegram.ui.Components.u6
    public final void c(Object obj, float f7) {
        ViewGroup viewGroup;
        float f10;
        switch (this.b) {
            case 0:
                vi viVar = this.c;
                viVar.d0 = f7;
                ni niVar = viVar.C0;
                if (niVar != null) {
                    if ((niVar instanceof en) || (viVar.B0 instanceof en)) {
                        int max = Math.max(niVar.getWidth(), viVar.B0.getWidth());
                        if (viVar.C0 instanceof en) {
                            viVar.B0.setTranslationX((-max) * f7);
                            viVar.C0.setTranslationX((1.0f - f7) * max);
                        } else {
                            viVar.B0.setTranslationX(max * f7);
                            viVar.C0.setTranslationX((1.0f - f7) * (-max));
                        }
                    } else {
                        niVar.setAlpha(f7);
                        viVar.C0.v(f7);
                        ni niVar2 = viVar.C0;
                        io ioVar = viVar.m0;
                        if (niVar2 == ioVar || viVar.B0 == ioVar) {
                            viVar.e2(niVar2 == ioVar ? 1 : 0);
                        }
                        ni niVar3 = viVar.C0;
                        io ioVar2 = viVar.n0;
                        if (niVar3 == ioVar2 || viVar.B0 == ioVar2) {
                            viVar.e2(niVar3 == ioVar2 ? 1 : 0);
                        }
                        viVar.C0.setTranslationY(AndroidUtilities.dp(78.0f) * f7);
                        viVar.B0.v(1.0f - Math.min(1.0f, f7 / 0.7f));
                        viVar.B0.l(viVar.o2);
                    }
                    if (viVar.w1 != null) {
                        viVar.e2(1);
                    }
                    viVar.b1();
                    viewGroup = ((org.telegram.ui.ActionBar.e3) viVar).containerView;
                    viewGroup.invalidate();
                    break;
                }
                break;
            default:
                yh yhVar = this.c.B1;
                int childCount = yhVar.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    float f11 = (3 - i10) * 32.0f;
                    View childAt = yhVar.getChildAt(i10);
                    if (f7 > f11) {
                        float f12 = f7 - f11;
                        if (f12 <= 200.0f) {
                            float f13 = f12 / 200.0f;
                            f10 = es.g.getInterpolation(f13) * 1.1f;
                            childAt.setAlpha(es.j.getInterpolation(f13));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f14 = f12 - 200.0f;
                            f10 = f14 <= 100.0f ? 1.1f - (es.i.getInterpolation(f14 / 100.0f) * 0.1f) : 1.0f;
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
