package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class g61 extends s4.r0 {
    public final /* synthetic */ j61 a;

    public g61(j61 j61Var) {
        this.a = j61Var;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        j61 j61Var = this.a;
        if (j61Var.d.I1) {
            AndroidUtilities.hideKeyboard(j61Var.c0);
        }
        j61.T(j61Var);
    }
}
