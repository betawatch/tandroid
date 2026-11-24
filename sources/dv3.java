// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class dv3 extends oec {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ew3 c;

    public dv3(ew3 ew3Var, boolean z, Context context) {
        this.c = ew3Var;
        this.a = z;
        this.b = context;
    }

    @Override // oec
    public final void b(View view, int i, int i2) {
        ov3 ov3Var = (ov3) view;
        if (this.a) {
            i = 1;
        }
        ov3Var.a(i);
    }

    @Override // oec
    public final View d(int i) {
        Context context = this.b;
        ew3 ew3Var = this.c;
        return i == 1 ? new nv3(ew3Var, context) : new tv3(ew3Var, context);
    }

    @Override // oec
    public final int e() {
        return this.a ? 1 : 3;
    }

    @Override // oec
    public final int h(int i) {
        return (i == 0 || i == 1) ? 0 : 1;
    }
}
