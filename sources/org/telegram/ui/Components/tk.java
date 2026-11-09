package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class tk extends v4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wk b;

    public /* synthetic */ tk(wk wkVar, int i7) {
        this.a = i7;
        this.b = wkVar;
    }

    @Override // v4.s0
    public final void a(RecyclerView recyclerView, int i7) {
        yi0 yi0Var;
        switch (this.a) {
            case 0:
                wk wkVar = this.b;
                bi.q1 q1Var = wkVar.L;
                boolean z9 = i7 != 0;
                wkVar.H = z9;
                if (!z9 && wkVar.F != null) {
                    wkVar.F = null;
                }
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    di diVar = wkVar.b;
                    int i10 = diVar.s0;
                    if (((diVar.V3[0] - i10) - L) + i10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (yi0Var = (yi0) q1Var.K(0)) != null) {
                        View view = yi0Var.a;
                        if (view.getTop() > 0) {
                            q1Var.w0(0, view.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            default:
                if (i7 == 1) {
                    wk wkVar2 = this.b;
                    if (wkVar2.c0 && wkVar2.d0) {
                        org.telegram.messenger.g0.v1(wkVar2.b.getCurrentFocus());
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
                wk wkVar = this.b;
                wkVar.i0();
                if (wkVar.F != null) {
                    wkVar.G += i10;
                }
                wkVar.b.M1(wkVar, i10);
                break;
        }
    }
}
