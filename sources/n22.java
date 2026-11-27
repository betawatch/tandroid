// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class n22 implements t69, s22 {
    public final /* synthetic */ b32 a;

    public /* synthetic */ n22(b32 b32Var) {
        this.a = b32Var;
    }

    @Override // s22
    public final void b(TLRPC.TL_userContact_old2 tL_userContact_old2, boolean z, int i, long j) {
        b32 b32Var = this.a;
        b32Var.b.a(true);
        b32Var.K.b(tL_userContact_old2, z, i, j);
    }

    @Override // t69
    public final boolean e(int i, View view) {
        Object O;
        b32 b32Var = this.a;
        j79 adapter = b32Var.s.getAdapter();
        x22 x22Var = b32Var.G;
        if (adapter == x22Var) {
            O = x22Var.E(i);
        } else {
            v22 v22Var = b32Var.F;
            O = v22Var.O(v22Var.S(i), v22Var.Q(i));
        }
        if (O == null) {
            return false;
        }
        b32Var.P((a32) view, O);
        return true;
    }

    @Override // s22
    public final void a(ArrayList arrayList, String str, boolean z, int i, long j, boolean z2) {
    }
}
