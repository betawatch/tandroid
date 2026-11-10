package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qk implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ qk(int i7, View view) {
        this.a = i7;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        RecyclerView recyclerView;
        switch (this.a) {
            case 0:
                vk vkVar = (vk) this.b;
                q7 q7Var = vkVar.b.U2;
                float alpha = q7Var != null ? q7Var.getAlpha() : 0.0f;
                if (alpha != vkVar.z0) {
                    vkVar.z0 = alpha;
                    vkVar.i0();
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.x3 x3Var = ((EditTextBoldCursor) this.b).Y0;
                if (x3Var != null) {
                    x3Var.c();
                    break;
                }
                break;
            case 2:
                ((i60) this.b).invalidate();
                break;
            default:
                it0 it0Var = (it0) this.b;
                if (it0Var.a && it0Var.b > 0) {
                    it0Var.f("PRE_DRAW_BEFORE", null, 0, 0, true);
                }
                it0Var.p();
                if (it0Var.g0 && (recyclerView = it0Var.E) != null && !recyclerView.c0()) {
                    float n10 = it0Var.n();
                    if (!Float.isInfinite(n10)) {
                        it0Var.g0 = false;
                        it0Var.t(it0Var.E, Math.round(n10 - it0Var.U));
                        it0Var.B();
                    }
                }
                if (it0Var.a && it0Var.b > 0) {
                    it0Var.f("PRE_DRAW_AFTER", null, 0, 0, true);
                    it0Var.b--;
                    it0Var.c++;
                    break;
                }
                break;
        }
        return true;
    }
}
