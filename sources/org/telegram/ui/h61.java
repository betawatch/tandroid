package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class h61 extends f2.b1 {
    public final /* synthetic */ k61 a;

    public h61(k61 k61Var) {
        this.a = k61Var;
    }

    @Override // f2.b1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        k61 k61Var = this.a;
        if (k61Var.d.G1) {
            AndroidUtilities.hideKeyboard(k61Var.Y);
        }
        k61.S(k61Var);
    }
}
