package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class fl implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ fl(int i7, View view) {
        this.a = i7;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        RecyclerView recyclerView;
        switch (this.a) {
            case 0:
                kl klVar = (kl) this.b;
                v7 v7Var = klVar.b.V2;
                float alpha = v7Var != null ? v7Var.getAlpha() : 0.0f;
                if (alpha != klVar.A0) {
                    klVar.A0 = alpha;
                    klVar.i0();
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.y3 y3Var = ((EditTextBoldCursor) this.b).Z0;
                if (y3Var != null) {
                    y3Var.c();
                    break;
                }
                break;
            case 2:
                ((u60) this.b).invalidate();
                break;
            default:
                qt0 qt0Var = (qt0) this.b;
                if (qt0Var.a && qt0Var.b > 0) {
                    qt0Var.f("PRE_DRAW_BEFORE", null, 0, 0, true);
                }
                qt0Var.p();
                if (qt0Var.h0 && (recyclerView = qt0Var.F) != null && !recyclerView.c0()) {
                    float n10 = qt0Var.n();
                    if (!Float.isInfinite(n10)) {
                        qt0Var.h0 = false;
                        qt0Var.t(qt0Var.F, Math.round(n10 - qt0Var.V));
                        qt0Var.B();
                    }
                }
                if (qt0Var.a && qt0Var.b > 0) {
                    qt0Var.f("PRE_DRAW_AFTER", null, 0, 0, true);
                    qt0Var.b--;
                    qt0Var.c++;
                    break;
                }
                break;
        }
        return true;
    }
}
