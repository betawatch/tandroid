// default package

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class mvd {
    public static z01 a(int i, x01 x01Var, int i2) {
        int i3 = i2 & 2;
        x01 x01Var2 = x01.a;
        if (i3 != 0) {
            x01Var = x01Var2;
        }
        if (i == -2) {
            if (x01Var != x01Var2) {
                return new ps2(1, x01Var);
            }
            xe1.p.getClass();
            return new z01(we1.b);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? x01Var == x01Var2 ? new z01(i) : new ps2(i, x01Var) : new z01(ConnectionsManager.DEFAULT_DATACENTER_ID) : x01Var == x01Var2 ? new z01(0) : new ps2(1, x01Var);
        }
        if (x01Var == x01Var2) {
            return new ps2(1, x01.b);
        }
        lq5.j("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        return null;
    }
}
