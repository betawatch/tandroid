package org.telegram.ui.Components;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class x80 extends yh.m {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x80(bi.w4 w4Var, bi.w4 w4Var2, FrameLayout frameLayout, long j3) {
        super(w4Var2, frameLayout, j3, true);
        this.F = w4Var;
    }

    @Override // yh.m
    public final void f(String str, boolean z9, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.E) {
            case 0:
                yh.b bVar = (yh.b) this.F;
                cv0 cv0Var = bVar.N1;
                if (!this.e.isEmpty()) {
                    if (!z10) {
                        super.f(str, z9, z10);
                        break;
                    } else {
                        bVar.s1.J.setText("");
                        break;
                    }
                } else if (cv0Var.getVisibility() != 4) {
                    cv0Var.setVisibility(4);
                    break;
                }
                break;
            default:
                if (!z10) {
                    super.f(str, z9, z10);
                    break;
                } else {
                    kVar = ((org.telegram.ui.ActionBar.f2) ((bi.w4) this.F)).actionBar;
                    kVar.setSearchFieldText("");
                    break;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x80(yh.b bVar, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.l2 l2Var, long j3) {
        super(f2Var, l2Var, j3, false);
        this.F = bVar;
    }
}
