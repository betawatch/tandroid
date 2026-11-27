// default package

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class e12 extends yc8 {
    public final /* synthetic */ no6 a;
    public final /* synthetic */ n12 b;

    public e12(n12 n12Var, no6 no6Var) {
        this.b = n12Var;
        this.a = no6Var;
    }

    @Override // yc8, ed8
    public final void L(int i, oec oecVar, final boolean z, final int i2, int i3, final boolean z2) {
        n12 n12Var = this.b;
        n12Var.s4 = true;
        if (n12Var.W3 == null) {
            return;
        }
        final no6 no6Var = this.a;
        no6Var.s = oecVar;
        jj.X(n12Var.G3, 0L, n12Var.S0() + 1, new pcc() { // from class: d12
            @Override // pcc
            public final void a(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.u1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, no6Var);
                e12.this.b.W3.z0(7, true, z, i2, 0, 0L, false, z2, ((Long) obj).longValue());
            }
        });
    }
}
