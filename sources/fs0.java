// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class fs0 implements x74, zga, bha, ed, n8c {
    public final /* synthetic */ ss0 a;

    public /* synthetic */ fs0(ss0 ss0Var) {
        this.a = ss0Var;
    }

    @Override // zga
    public final int b() {
        return this.a.n;
    }

    @Override // bha
    public final float c(RecyclerView recyclerView) {
        return dha.j(recyclerView);
    }

    @Override // bha
    public final RecyclerView h(View view) {
        ss0 ss0Var = this.a;
        if (ss0Var.a) {
            return ((rs0) view).c;
        }
        ss0Var.L.getClass();
        return ((gva) view).a;
    }

    @Override // n8c
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        this.a.u0((c4c) obj);
    }

    @Override // x74
    public final void p(int i, float f, float f2, y74 y74Var) {
        this.a.x0();
    }

    @Override // bha
    public final /* synthetic */ void t(RecyclerView recyclerView) {
        de9.d(recyclerView);
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        ss0 ss0Var = this.a;
        ss0Var.getClass();
        ss0Var.presentFragment(new p3c(6, null));
    }

    @Override // x74
    public final void F(float f, int i) {
    }
}
