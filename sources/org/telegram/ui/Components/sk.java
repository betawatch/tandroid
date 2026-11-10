package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class sk extends v4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vk b;

    public /* synthetic */ sk(vk vkVar, int i7) {
        this.a = i7;
        this.b = vkVar;
    }

    @Override // v4.s0
    public final void a(RecyclerView recyclerView, int i7) {
        xi0 xi0Var;
        switch (this.a) {
            case 0:
                vk vkVar = this.b;
                bi.q1 q1Var = vkVar.L;
                boolean z9 = i7 != 0;
                vkVar.H = z9;
                if (!z9 && vkVar.F != null) {
                    vkVar.F = null;
                }
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    ci ciVar = vkVar.b;
                    int i10 = ciVar.s0;
                    if (((ciVar.Y3[0] - i10) - L) + i10 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (xi0Var = (xi0) q1Var.K(0)) != null) {
                        View view = xi0Var.a;
                        if (view.getTop() > 0) {
                            q1Var.w0(0, view.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            default:
                if (i7 == 1) {
                    vk vkVar2 = this.b;
                    if (vkVar2.c0 && vkVar2.d0) {
                        org.telegram.messenger.g0.v1(vkVar2.b.getCurrentFocus());
                        break;
                    }
                }
                break;
        }
    }

    @Override // v4.s0
    public void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.a) {
            case 0:
                vk vkVar = this.b;
                vkVar.i0();
                if (vkVar.F != null) {
                    vkVar.G += i10;
                }
                vkVar.b.M1(vkVar, i10);
                break;
        }
    }
}
