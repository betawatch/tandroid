package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class yh extends m6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ li c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh(li liVar, int i10) {
        super("translation", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = liVar;
                super("openProgress", 0);
                break;
            default:
                this.c = liVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.m6
    public final void b(Object obj, float f10) {
        ViewGroup viewGroup;
        float f11;
        switch (this.b) {
            case 0:
                li liVar = this.c;
                liVar.a0 = f10;
                di diVar = liVar.w0;
                if (diVar != null) {
                    if ((diVar instanceof om) || (liVar.v0 instanceof om)) {
                        int max = Math.max(diVar.getWidth(), liVar.v0.getWidth());
                        if (liVar.w0 instanceof om) {
                            liVar.v0.setTranslationX((-max) * f10);
                            liVar.w0.setTranslationX((1.0f - f10) * max);
                        } else {
                            liVar.v0.setTranslationX(max * f10);
                            liVar.w0.setTranslationX((1.0f - f10) * (-max));
                        }
                    } else {
                        diVar.setAlpha(f10);
                        liVar.w0.s(f10);
                        di diVar2 = liVar.w0;
                        qn qnVar = liVar.j0;
                        if (diVar2 == qnVar || liVar.v0 == qnVar) {
                            liVar.a2(diVar2 == qnVar ? 1 : 0);
                        }
                        di diVar3 = liVar.w0;
                        qn qnVar2 = liVar.k0;
                        if (diVar3 == qnVar2 || liVar.v0 == qnVar2) {
                            liVar.a2(diVar3 == qnVar2 ? 1 : 0);
                        }
                        liVar.w0.setTranslationY(AndroidUtilities.dp(78.0f) * f10);
                        liVar.v0.s(1.0f - Math.min(1.0f, f10 / 0.7f));
                        liVar.v0.k(liVar.i2);
                    }
                    if (liVar.q1 != null) {
                        liVar.a2(1);
                    }
                    liVar.Z0();
                    viewGroup = ((org.telegram.ui.ActionBar.g3) liVar).containerView;
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
                    if (childAt instanceof gi) {
                        ((gi) childAt).a.setAttachScale(f11);
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
