// default package

import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class fwb extends i49 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ lwb c;

    public fwb(lwb lwbVar, int i, long j) {
        this.c = lwbVar;
        this.a = i;
        this.b = j;
    }

    @Override // i49
    public final void a(RecyclerView recyclerView, int i) {
        EditText editText = this.c.w;
        if (i == 1 && editText.hasFocus()) {
            gl.t1(editText);
            editText.clearFocus();
        }
    }

    @Override // i49
    public final void b(RecyclerView recyclerView, int i, int i2) {
        lwb lwbVar = this.c;
        lwbVar.o();
        t26 t26Var = (t26) recyclerView.getLayoutManager();
        if (t26Var == null || t26Var.M0() < lwbVar.s.c.size() - 3) {
            return;
        }
        if (lwbVar.i()) {
            lwbVar.j();
            return;
        }
        boolean z = lwbVar.d;
        int i3 = this.a;
        if (z) {
            na7.q1(i3).D1().g(false);
            return;
        }
        pub pubVar = na7.q1(i3).g4;
        long j = -this.b;
        if (pubVar.e(j)) {
            return;
        }
        pubVar.o(j);
    }
}
