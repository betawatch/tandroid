// default package

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fc6 extends qc6 {
    public boolean e0;
    public final /* synthetic */ pc6 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc6(pc6 pc6Var, Context context, int i, long j, ylb ylbVar, boolean z, boolean z2) {
        super(context, i, j, false, ylbVar, false, z, z2);
        this.f0 = pc6Var;
        this.e0 = true;
    }

    @Override // qc6
    public final void J() {
        this.f0.B0(null);
    }

    @Override // qc6
    public final void N(ArrayList arrayList) {
        int i;
        pc6 pc6Var = this.f0;
        k47 k47Var = pc6Var.J0;
        if (k47Var != null && k47Var.C3()) {
            if (arrayList != null) {
                i = 0;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    kc6 kc6Var = (kc6) arrayList.get(i2);
                    if (kc6Var != null && !m9c.D(kc6Var.c)) {
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            if (this.e0 && i == 1) {
                pc6Var.q0 = ((kc6) arrayList.get(0)).a;
            }
            this.e0 = false;
            pc6Var.W.setVisibility(i != 1 ? 8 : 0);
        }
        super.N(arrayList);
    }
}
