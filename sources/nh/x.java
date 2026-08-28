package nh;

import androidx.recyclerview.widget.RecyclerView;
import f2.d1;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class x extends d1 {
    public final /* synthetic */ j0 a;

    public x(j0 j0Var) {
        this.a = j0Var;
    }

    @Override // f2.d1
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        j0 j0Var = this.a;
        if (j0Var.C.G1) {
            AndroidUtilities.hideKeyboard(j0Var.A.r);
        }
    }
}
