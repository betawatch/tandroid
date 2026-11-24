// default package

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class iv3 extends eu5 {
    public boolean e;
    public final /* synthetic */ kv3 f;

    public iv3(kv3 kv3Var) {
        this.f = kv3Var;
    }

    @Override // eu5
    public final void a(RecyclerView recyclerView, u69 u69Var) {
        super.a(recyclerView, u69Var);
        u69Var.a.setPressed(false);
    }

    @Override // eu5
    public final boolean o(RecyclerView recyclerView, u69 u69Var, u69 u69Var2) {
        if (u69Var.f != u69Var2.f) {
            return false;
        }
        int b = u69Var.b();
        int b2 = u69Var2.b();
        kv3 kv3Var = this.f;
        hv3 hv3Var = kv3Var.a;
        kv3 kv3Var2 = hv3Var.f;
        int i = kv3Var2.n;
        ArrayList arrayList = kv3Var2.e;
        int i2 = b - i;
        int i3 = b2 - i;
        int i4 = kv3Var2.r - i;
        if (i2 >= 0 && i3 >= 0 && i2 < i4 && i3 < i4) {
            Long l = (Long) arrayList.get(i2);
            arrayList.set(i2, (Long) arrayList.get(i3));
            arrayList.set(i3, l);
            hv3Var.j(b, b2);
            ((xc5) u69Var.a).setDrawDivider(b2 != kv3Var.r - 1);
            ((xc5) u69Var2.a).setDrawDivider(b != kv3Var.r - 1);
            this.e = true;
        }
        return true;
    }

    @Override // eu5
    public final void q(u69 u69Var, int i) {
        kv3 kv3Var = this.f;
        if (i != 0) {
            kv3Var.b.J0(false);
            u69Var.a.setPressed(true);
        } else if (this.e) {
            jv3 jv3Var = kv3Var.f;
            if (jv3Var != null) {
                jv3Var.a();
            }
            this.e = false;
        }
    }
}
