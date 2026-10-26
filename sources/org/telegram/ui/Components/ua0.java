package org.telegram.ui.Components;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ua0 extends yh.k {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua0(org.telegram.ui.kh0 kh0Var, org.telegram.ui.kh0 kh0Var2, FrameLayout frameLayout, long j10) {
        super(kh0Var2, frameLayout, j10, true);
        this.F = kh0Var;
    }

    @Override // yh.k
    public final void f(String str, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.E) {
            case 0:
                yh.b bVar = (yh.b) this.F;
                ey0 ey0Var = bVar.W;
                if (!this.e.isEmpty()) {
                    if (!z11) {
                        super.f(str, z10, z11);
                        break;
                    } else {
                        bVar.w.J.setText("");
                        break;
                    }
                } else if (ey0Var.getVisibility() != 4) {
                    ey0Var.setVisibility(4);
                    break;
                }
                break;
            default:
                if (!z11) {
                    super.f(str, z10, z11);
                    break;
                } else {
                    kVar = ((org.telegram.ui.ActionBar.r2) ((org.telegram.ui.kh0) this.F)).actionBar;
                    kVar.setSearchFieldText("");
                    break;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua0(yh.b bVar, org.telegram.ui.ActionBar.r2 r2Var, FrameLayout frameLayout, long j10) {
        super(r2Var, frameLayout, j10, false);
        this.F = bVar;
    }
}
