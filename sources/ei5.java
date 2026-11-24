// default package

import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ei5 extends gi5 {
    public final ei5 e;
    public ArrayList f;

    public ei5(String str, int i, Map map, ei5 ei5Var) {
        super(i, str, map);
        this.e = ei5Var;
    }

    @Override // gi5
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
                ((ei5) obj).b(i);
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
        ei5 ei5Var = this.e;
        sb.append(ei5Var != null ? ei5Var.a : null);
        sb.append(", children=");
        sb.append(this.f);
        sb.append('}');
        return sb.toString();
    }
}
