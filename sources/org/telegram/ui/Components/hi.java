package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class hi extends s6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ ti c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi(ti tiVar, int i10) {
        super("translation", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = tiVar;
                super("openProgress", 0);
                break;
            default:
                this.c = tiVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.s6
    public final void c(Object obj, float f7) {
        ViewGroup viewGroup;
        float f10;
        switch (this.b) {
            case 0:
                ti tiVar = this.c;
                tiVar.d0 = f7;
                li liVar = tiVar.C0;
                if (liVar != null) {
                    if ((liVar instanceof bn) || (tiVar.B0 instanceof bn)) {
                        int max = Math.max(liVar.getWidth(), tiVar.B0.getWidth());
                        if (tiVar.C0 instanceof bn) {
                            tiVar.B0.setTranslationX((-max) * f7);
                            tiVar.C0.setTranslationX((1.0f - f7) * max);
                        } else {
                            tiVar.B0.setTranslationX(max * f7);
                            tiVar.C0.setTranslationX((1.0f - f7) * (-max));
                        }
                    } else {
                        liVar.setAlpha(f7);
                        tiVar.C0.v(f7);
                        li liVar2 = tiVar.C0;
                        fo foVar = tiVar.m0;
                        if (liVar2 == foVar || tiVar.B0 == foVar) {
                            tiVar.e2(liVar2 == foVar ? 1 : 0);
                        }
                        li liVar3 = tiVar.C0;
                        fo foVar2 = tiVar.n0;
                        if (liVar3 == foVar2 || tiVar.B0 == foVar2) {
                            tiVar.e2(liVar3 == foVar2 ? 1 : 0);
                        }
                        tiVar.C0.setTranslationY(AndroidUtilities.dp(78.0f) * f7);
                        tiVar.B0.v(1.0f - Math.min(1.0f, f7 / 0.7f));
                        tiVar.B0.l(tiVar.o2);
                    }
                    if (tiVar.w1 != null) {
                        tiVar.e2(1);
                    }
                    tiVar.b1();
                    viewGroup = ((org.telegram.ui.ActionBar.f3) tiVar).containerView;
                    viewGroup.invalidate();
                    break;
                }
                break;
            default:
                xh xhVar = this.c.B1;
                int childCount = xhVar.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    float f11 = (3 - i10) * 32.0f;
                    View childAt = xhVar.getChildAt(i10);
                    if (f7 > f11) {
                        float f12 = f7 - f11;
                        if (f12 <= 200.0f) {
                            float f13 = f12 / 200.0f;
                            f10 = bs.g.getInterpolation(f13) * 1.1f;
                            childAt.setAlpha(bs.j.getInterpolation(f13));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f14 = f12 - 200.0f;
                            f10 = f14 <= 100.0f ? 1.1f - (bs.i.getInterpolation(f14 / 100.0f) * 0.1f) : 1.0f;
                        }
                    } else {
                        f10 = 0.0f;
                    }
                    if (childAt instanceof oi) {
                        ((oi) childAt).a.setAttachScale(f10);
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
