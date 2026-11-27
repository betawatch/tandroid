// default package

import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class hi5 extends ji5 {
    public final hi5 e;
    public ArrayList f;

    public hi5(String str, int i, Map map, hi5 hi5Var) {
        super(i, str, map);
        this.e = hi5Var;
    }

    @Override // ji5
    public final Map a() {
        return this.c;
    }

    public final void b(int i) {
        if (this.d > -1) {
            return;
        }
        this.d = i;
        ArrayList arrayList = this.f;
        if (arrayList != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((hi5) obj).b(i);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlockImpl{name='");
        sb.append(this.a);
        sb.append("', start=");
        sb.append(this.b);
        sb.append(", end=");
        sb.append(this.d);
        sb.append(", attributes=");
        sb.append(this.c);
        sb.append(", parent=");
        hi5 hi5Var = this.e;
        sb.append(hi5Var != null ? hi5Var.a : null);
        sb.append(", children=");
        sb.append(this.f);
        sb.append('}');
        return sb.toString();
    }
}
