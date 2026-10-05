package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class m51 extends s4.s0 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;

    public m51(p51 p51Var) {
        this.a = 0;
        this.c = p51Var;
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
                p51 p51Var = (p51) this.c;
                this.b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.b) > AndroidUtilities.dp(96.0f)) {
                    View findFocus = p51Var.e.findFocus();
                    if (findFocus == null) {
                        findFocus = p51Var.e;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i11 != 0) {
                    p51.m(p51Var);
                    break;
                }
                break;
            default:
                int i12 = this.b + i11;
                this.b = i12;
                ((org.telegram.ui.x21) this.c).H.setAlpha((i12 * 1.0f) / AndroidUtilities.dp(6.0f));
                break;
        }
    }

    public m51(org.telegram.ui.x21 x21Var) {
        this.a = 1;
        this.c = x21Var;
        this.b = 0;
    }
}
