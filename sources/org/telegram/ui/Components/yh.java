package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class yh extends l6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ ki c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh(ki kiVar, int i9) {
        super("translation", 0);
        this.b = i9;
        switch (i9) {
            case 1:
                this.c = kiVar;
                super("openProgress", 0);
                break;
            default:
                this.c = kiVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.l6
    public final void b(Object obj, float f10) {
        ViewGroup viewGroup;
        float f11;
        switch (this.b) {
            case 0:
                ki kiVar = this.c;
                kiVar.Z = f10;
                ci ciVar = kiVar.v0;
                if (ciVar != null) {
                    if ((ciVar instanceof hm) || (kiVar.u0 instanceof hm)) {
                        int max = Math.max(ciVar.getWidth(), kiVar.u0.getWidth());
                        if (kiVar.v0 instanceof hm) {
                            kiVar.u0.setTranslationX((-max) * f10);
                            kiVar.v0.setTranslationX((1.0f - f10) * max);
                        } else {
                            kiVar.u0.setTranslationX(max * f10);
                            kiVar.v0.setTranslationX((1.0f - f10) * (-max));
                        }
                    } else {
                        ciVar.setAlpha(f10);
                        kiVar.v0.s(f10);
                        ci ciVar2 = kiVar.v0;
                        jn jnVar = kiVar.i0;
                        if (ciVar2 == jnVar || kiVar.u0 == jnVar) {
                            kiVar.a2(ciVar2 == jnVar ? 1 : 0);
                        }
                        ci ciVar3 = kiVar.v0;
                        jn jnVar2 = kiVar.j0;
                        if (ciVar3 == jnVar2 || kiVar.u0 == jnVar2) {
                            kiVar.a2(ciVar3 == jnVar2 ? 1 : 0);
                        }
                        kiVar.v0.setTranslationY(AndroidUtilities.dp(78.0f) * f10);
                        kiVar.u0.s(1.0f - Math.min(1.0f, f10 / 0.7f));
                        kiVar.u0.k(kiVar.h2);
                    }
                    if (kiVar.p1 != null) {
                        kiVar.a2(1);
                    }
                    kiVar.Z0();
                    viewGroup = ((org.telegram.ui.ActionBar.f3) kiVar).containerView;
                    viewGroup.invalidate();
                    break;
                }
                break;
            default:
                nh nhVar = this.c.u1;
                int childCount = nhVar.getChildCount();
                for (int i9 = 0; i9 < childCount; i9++) {
                    float f12 = (3 - i9) * 32.0f;
                    View childAt = nhVar.getChildAt(i9);
                    if (f10 > f12) {
                        float f13 = f10 - f12;
                        if (f13 <= 200.0f) {
                            float f14 = f13 / 200.0f;
                            f11 = gr.g.getInterpolation(f14) * 1.1f;
                            childAt.setAlpha(gr.j.getInterpolation(f14));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f15 = f13 - 200.0f;
                            f11 = f15 <= 100.0f ? 1.1f - (gr.i.getInterpolation(f15 / 100.0f) * 0.1f) : 1.0f;
                        }
                    } else {
                        f11 = 0.0f;
                    }
                    if (childAt instanceof fi) {
                        ((fi) childAt).a.setAttachScale(f11);
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
