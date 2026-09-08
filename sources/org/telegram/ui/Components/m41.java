package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class m41 extends s4.s0 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;

    public m41(p41 p41Var) {
        this.a = 0;
        this.c = p41Var;
    }

    @Override // s4.s0
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.a) {
            case 0:
                if (i10 == 0) {
                    this.b = 0;
                    break;
                }
                break;
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 0:
                p41 p41Var = (p41) this.c;
                this.b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.b) > AndroidUtilities.dp(96.0f)) {
                    View findFocus = p41Var.e.findFocus();
                    if (findFocus == null) {
                        findFocus = p41Var.e;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i11 != 0) {
                    p41.m(p41Var);
                    break;
                }
                break;
            default:
                int i12 = this.b + i11;
                this.b = i12;
                ((org.telegram.ui.f31) this.c).H.setAlpha((i12 * 1.0f) / AndroidUtilities.dp(6.0f));
                break;
        }
    }

    public m41(org.telegram.ui.f31 f31Var) {
        this.a = 1;
        this.c = f31Var;
        this.b = 0;
    }
}
