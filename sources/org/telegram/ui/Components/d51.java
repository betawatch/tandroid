package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class d51 extends s4.s0 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;

    public d51(g51 g51Var) {
        this.a = 0;
        this.c = g51Var;
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
                g51 g51Var = (g51) this.c;
                this.b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.b) > AndroidUtilities.dp(96.0f)) {
                    View findFocus = g51Var.e.findFocus();
                    if (findFocus == null) {
                        findFocus = g51Var.e;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i11 != 0) {
                    g51.m(g51Var);
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

    public d51(org.telegram.ui.e31 e31Var) {
        this.a = 1;
        this.c = e31Var;
        this.b = 0;
    }
}
