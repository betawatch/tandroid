// default package

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class o81 extends i49 {
    public boolean a;
    public final /* synthetic */ z81 b;

    public o81(z81 z81Var) {
        this.b = z81Var;
    }

    @Override // i49
    public final void b(RecyclerView recyclerView, int i, int i2) {
        z81 z81Var = this.b;
        ArrayList arrayList = z81Var.x;
        int K0 = z81Var.b.K0();
        int abs = K0 == -1 ? 0 : Math.abs(z81Var.b.M0() - K0) + 1;
        if (abs > 0) {
            int size = z81Var.c.g3.E.size();
            if (!z81Var.F && !z81Var.y && !arrayList.isEmpty() && K0 + abs >= size - 5) {
                gl.c3(new q21(this, (w81) b00.f(1, arrayList), (byte) 6));
            }
        }
        if (i2 != 0 && this.a) {
            z81Var.f.e(i2 < 0, true);
        }
        this.a = true;
    }
}
