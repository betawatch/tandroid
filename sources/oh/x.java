package oh;

import androidx.recyclerview.widget.RecyclerView;
import f2.b1;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class x extends b1 {
    public final /* synthetic */ j0 a;

    public x(j0 j0Var) {
        this.a = j0Var;
    }

    @Override // f2.b1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        j0 j0Var = this.a;
        if (j0Var.C.G1) {
            AndroidUtilities.hideKeyboard(j0Var.A.r);
        }
    }
}
