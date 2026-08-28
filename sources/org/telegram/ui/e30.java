package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class e30 extends f2.d1 {
    public final /* synthetic */ o50 a;

    public e30(o50 o50Var) {
        this.a = o50Var;
    }

    @Override // f2.d1
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        ViewGroup viewGroup;
        o50 o50Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) o50Var).containerView;
        viewGroup.invalidate();
        o50Var.W1.invalidate();
    }
}
