package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                ((j60) this.b).invalidate();
                break;
            default:
                jt0 jt0Var = (jt0) this.b;
                if (jt0Var.a && jt0Var.b > 0) {
                    jt0Var.f("PRE_DRAW_BEFORE", null, 0, 0, true);
                }
                jt0Var.p();
                if (jt0Var.g0 && (recyclerView = jt0Var.E) != null && !recyclerView.c0()) {
                    float n10 = jt0Var.n();
                    if (!Float.isInfinite(n10)) {
                        jt0Var.g0 = false;
                        jt0Var.t(jt0Var.E, Math.round(n10 - jt0Var.U));
                        jt0Var.B();
                    }
                }
                if (jt0Var.a && jt0Var.b > 0) {
                    jt0Var.f("PRE_DRAW_AFTER", null, 0, 0, true);
                    jt0Var.b--;
                    jt0Var.c++;
                    break;
                }
                break;
        }
        return true;
    }
}
