package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i61 extends f2.d1 {
    public final /* synthetic */ l61 a;

    public i61(l61 l61Var) {
        this.a = l61Var;
    }

    @Override // f2.d1
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        l61 l61Var = this.a;
        if (l61Var.d.G1) {
            AndroidUtilities.hideKeyboard(l61Var.Y);
        }
        l61.R(l61Var);
    }
}
