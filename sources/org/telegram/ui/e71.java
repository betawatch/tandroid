package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class e71 extends f2.a1 {
    public final /* synthetic */ h71 a;

    public e71(h71 h71Var) {
        this.a = h71Var;
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        h71 h71Var = this.a;
        if (h71Var.d.H1) {
            AndroidUtilities.hideKeyboard(h71Var.Z);
        }
        h71.S(h71Var);
    }
}
