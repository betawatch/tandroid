package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class s31 extends f2.b1 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;

    public s31(v31 v31Var) {
        this.a = 0;
        this.c = v31Var;
    }

    @Override // f2.b1
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

    @Override // f2.b1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 0:
                v31 v31Var = (v31) this.c;
                this.b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.b) > AndroidUtilities.dp(96.0f)) {
                    View findFocus = v31Var.e.findFocus();
                    if (findFocus == null) {
                        findFocus = v31Var.e;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i11 != 0) {
                    v31.m(v31Var);
                    break;
                }
                break;
            default:
                int i12 = this.b + i11;
                this.b = i12;
                ((org.telegram.ui.x11) this.c).D.setAlpha((i12 * 1.0f) / AndroidUtilities.dp(6.0f));
                break;
        }
    }

    public s31(org.telegram.ui.x11 x11Var) {
        this.a = 1;
        this.c = x11Var;
        this.b = 0;
    }
}
