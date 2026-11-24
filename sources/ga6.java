// default package

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ga6 extends ra6 {
    public boolean e0;
    public final /* synthetic */ qa6 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga6(qa6 qa6Var, Context context, int i, long j, wjb wjbVar, boolean z, boolean z2) {
        super(context, i, j, false, wjbVar, false, z, z2);
        this.f0 = qa6Var;
        this.e0 = true;
    }

    @Override // ra6
    public final void J() {
        this.f0.A0(null);
    }

    @Override // ra6
    public final void N(ArrayList arrayList) {
        int i;
        qa6 qa6Var = this.f0;
        k27 k27Var = qa6Var.J0;
        if (k27Var != null && k27Var.C3()) {
            if (arrayList != null) {
                i = 0;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    la6 la6Var = (la6) arrayList.get(i2);
                    if (la6Var != null && !l7c.C(la6Var.c)) {
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            if (this.e0 && i == 1) {
                qa6Var.q0 = ((la6) arrayList.get(0)).a;
            }
            this.e0 = false;
            qa6Var.W.setVisibility(i != 1 ? 8 : 0);
        }
        super.N(arrayList);
    }
}
