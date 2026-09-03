package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class f71 extends f2.z0 {
    public final /* synthetic */ i71 a;

    public f71(i71 i71Var) {
        this.a = i71Var;
    }

    @Override // f2.z0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        i71 i71Var = this.a;
        if (i71Var.d.H1) {
            AndroidUtilities.hideKeyboard(i71Var.Z);
        }
        i71.S(i71Var);
    }
}
