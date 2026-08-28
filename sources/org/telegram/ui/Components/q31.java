package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class q31 extends f2.d1 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;

    public q31(t31 t31Var) {
        this.a = 0;
        this.c = t31Var;
    }

    @Override // f2.d1
    public void a(RecyclerView recyclerView, int i9) {
        switch (this.a) {
            case 0:
                if (i9 == 0) {
                    this.b = 0;
                    break;
                }
                break;
        }
    }

    @Override // f2.d1
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        switch (this.a) {
            case 0:
                t31 t31Var = (t31) this.c;
                this.b += i10;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.b) > AndroidUtilities.dp(96.0f)) {
                    View findFocus = t31Var.e.findFocus();
                    if (findFocus == null) {
                        findFocus = t31Var.e;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i10 != 0) {
                    t31.m(t31Var);
                    break;
                }
                break;
            default:
                int i11 = this.b + i10;
                this.b = i11;
                ((org.telegram.ui.y11) this.c).D.setAlpha((i11 * 1.0f) / AndroidUtilities.dp(6.0f));
                break;
        }
    }

    public q31(org.telegram.ui.y11 y11Var) {
        this.a = 1;
        this.c = y11Var;
        this.b = 0;
    }
}
