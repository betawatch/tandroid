// default package

import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class fg5 extends hg5 {
    public final fg5 e;
    public ArrayList f;

    public fg5(String str, int i, Map map, fg5 fg5Var) {
        super(i, str, map);
        this.e = fg5Var;
    }

    @Override // hg5
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
                ((fg5) obj).b(i);
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
        fg5 fg5Var = this.e;
        sb.append(fg5Var != null ? fg5Var.a : null);
        sb.append(", children=");
        sb.append(this.f);
        sb.append('}');
        return sb.toString();
    }
}
