// default package

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class kc6 extends vc6 {
    public boolean e0;
    public final /* synthetic */ uc6 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc6(uc6 uc6Var, Context context, int i, long j, vnb vnbVar, boolean z, boolean z2) {
        super(context, i, j, false, vnbVar, false, z, z2);
        this.f0 = uc6Var;
        this.e0 = true;
    }

    @Override // vc6
    public final void J() {
        this.f0.B0(null);
    }

    @Override // vc6
    public final void N(ArrayList arrayList) {
        int i;
        uc6 uc6Var = this.f0;
        r47 r47Var = uc6Var.J0;
        if (r47Var != null && r47Var.C3()) {
            if (arrayList != null) {
                i = 0;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    pc6 pc6Var = (pc6) arrayList.get(i2);
                    if (pc6Var != null && !lbc.D(pc6Var.c)) {
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            if (this.e0 && i == 1) {
                uc6Var.q0 = ((pc6) arrayList.get(0)).a;
            }
            this.e0 = false;
            uc6Var.W.setVisibility(i != 1 ? 8 : 0);
        }
        super.N(arrayList);
    }
}
