package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class b51 extends s4.s0 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;

    public b51(e51 e51Var) {
        this.a = 0;
        this.c = e51Var;
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
                e51 e51Var = (e51) this.c;
                this.b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.b) > AndroidUtilities.dp(96.0f)) {
                    View findFocus = e51Var.e.findFocus();
                    if (findFocus == null) {
                        findFocus = e51Var.e;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i11 != 0) {
                    e51.m(e51Var);
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

    public b51(org.telegram.ui.e31 e31Var) {
        this.a = 1;
        this.c = e31Var;
        this.b = 0;
    }
}
