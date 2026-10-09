package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class mi extends t6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ yi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi(yi yiVar, int i10) {
        super("translation", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = yiVar;
                super("openProgress", 0);
                break;
            default:
                this.c = yiVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.t6
    public final void c(Object obj, float f7) {
        ViewGroup viewGroup;
        float f10;
        switch (this.b) {
            case 0:
                yi yiVar = this.c;
                yiVar.d0 = f7;
                qi qiVar = yiVar.C0;
                if (qiVar != null) {
                    if ((qiVar instanceof hn) || (yiVar.B0 instanceof hn)) {
                        int max = Math.max(qiVar.getWidth(), yiVar.B0.getWidth());
                        if (yiVar.C0 instanceof hn) {
                            yiVar.B0.setTranslationX((-max) * f7);
                            yiVar.C0.setTranslationX((1.0f - f7) * max);
                        } else {
                            yiVar.B0.setTranslationX(max * f7);
                            yiVar.C0.setTranslationX((1.0f - f7) * (-max));
                        }
                    } else {
                        qiVar.setAlpha(f7);
                        yiVar.C0.v(f7);
                        qi qiVar2 = yiVar.C0;
                        lo loVar = yiVar.m0;
                        if (qiVar2 == loVar || yiVar.B0 == loVar) {
                            yiVar.e2(qiVar2 == loVar ? 1 : 0);
                        }
                        qi qiVar3 = yiVar.C0;
                        lo loVar2 = yiVar.n0;
                        if (qiVar3 == loVar2 || yiVar.B0 == loVar2) {
                            yiVar.e2(qiVar3 == loVar2 ? 1 : 0);
                        }
                        yiVar.C0.setTranslationY(AndroidUtilities.dp(78.0f) * f7);
                        yiVar.B0.v(1.0f - Math.min(1.0f, f7 / 0.7f));
                        yiVar.B0.l(yiVar.o2);
                    }
                    if (yiVar.w1 != null) {
                        yiVar.e2(1);
                    }
                    yiVar.b1();
                    viewGroup = ((org.telegram.ui.ActionBar.f3) yiVar).containerView;
                    viewGroup.invalidate();
                    break;
                }
                break;
            default:
                bi biVar = this.c.B1;
                int childCount = biVar.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    float f11 = (3 - i10) * 32.0f;
                    View childAt = biVar.getChildAt(i10);
                    if (f7 > f11) {
                        float f12 = f7 - f11;
                        if (f12 <= 200.0f) {
                            float f13 = f12 / 200.0f;
                            f10 = hs.g.getInterpolation(f13) * 1.1f;
                            childAt.setAlpha(hs.j.getInterpolation(f13));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f14 = f12 - 200.0f;
                            f10 = f14 <= 100.0f ? 1.1f - (hs.i.getInterpolation(f14 / 100.0f) * 0.1f) : 1.0f;
                        }
                    } else {
                        f10 = 0.0f;
                    }
                    if (childAt instanceof ti) {
                        ((ti) childAt).a.setAttachScale(f10);
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
