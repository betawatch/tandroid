package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class e61 extends s4.r0 {
    public final /* synthetic */ h61 a;

    public e61(h61 h61Var) {
        this.a = h61Var;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        h61 h61Var = this.a;
        if (h61Var.d.I1) {
            AndroidUtilities.hideKeyboard(h61Var.c0);
        }
        h61.T(h61Var);
    }
}
