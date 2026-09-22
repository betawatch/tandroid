package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class n41 extends s4.s0 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;

    public n41(q41 q41Var) {
        this.a = 0;
        this.c = q41Var;
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
                q41 q41Var = (q41) this.c;
                this.b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.b) > AndroidUtilities.dp(96.0f)) {
                    View findFocus = q41Var.e.findFocus();
                    if (findFocus == null) {
                        findFocus = q41Var.e;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i11 != 0) {
                    q41.m(q41Var);
                    break;
                }
                break;
            default:
                int i12 = this.b + i11;
                this.b = i12;
                ((org.telegram.ui.e31) this.c).H.setAlpha((i12 * 1.0f) / AndroidUtilities.dp(6.0f));
                break;
        }
    }

    public n41(org.telegram.ui.e31 e31Var) {
        this.a = 1;
        this.c = e31Var;
        this.b = 0;
    }
}
