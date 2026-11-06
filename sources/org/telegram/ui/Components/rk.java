package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rk implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ rk(int i7, View view) {
        this.a = i7;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        RecyclerView recyclerView;
        switch (this.a) {
            case 0:
                wk wkVar = (wk) this.b;
                r7 r7Var = wkVar.b.R2;
                float alpha = r7Var != null ? r7Var.getAlpha() : 0.0f;
                if (alpha != wkVar.z0) {
                    wkVar.z0 = alpha;
                    wkVar.i0();
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.w3 w3Var = ((EditTextBoldCursor) this.b).Y0;
                if (w3Var != null) {
                    w3Var.c();
                    break;
                }
                break;
            case 2:
                ((i60) this.b).invalidate();
                break;
            default:
                ht0 ht0Var = (ht0) this.b;
                if (ht0Var.a && ht0Var.b > 0) {
                    ht0Var.f("PRE_DRAW_BEFORE", null, 0, 0, true);
                }
                ht0Var.p();
                if (ht0Var.g0 && (recyclerView = ht0Var.E) != null && !recyclerView.c0()) {
                    float n10 = ht0Var.n();
                    if (!Float.isInfinite(n10)) {
                        ht0Var.g0 = false;
                        ht0Var.t(ht0Var.E, Math.round(n10 - ht0Var.U));
                        ht0Var.B();
                    }
                }
                if (ht0Var.a && ht0Var.b > 0) {
                    ht0Var.f("PRE_DRAW_AFTER", null, 0, 0, true);
                    ht0Var.b--;
                    ht0Var.c++;
                    break;
                }
                break;
        }
        return true;
    }
}
