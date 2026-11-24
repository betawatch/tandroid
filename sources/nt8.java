// default package

import java.util.Locale;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class nt8 implements dn7, fn7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ st8 b;

    public /* synthetic */ nt8(st8 st8Var, byte b) {
        this.a = b;
        this.b = st8Var;
    }

    @Override // dn7
    public final String c(int i) {
        byte b = this.a;
        st8 st8Var = this.b;
        switch (b) {
            case 0:
                return st8Var.P ? k96.a0("MilesShort", null, 2131748235, Integer.valueOf(i)) : k96.a0("KMetersShort", null, 2131748869, Integer.valueOf(i));
            default:
                if (!st8Var.P) {
                    if (i == 1) {
                        return k96.a0("MetersShort", null, 2131748250, 50);
                    }
                    if (i > 1) {
                        i--;
                    }
                    return k96.a0("MetersShort", null, 2131748250, Integer.valueOf(i * 100));
                }
                if (i == 1) {
                    return k96.a0("FootsShort", null, 2131750584, Integer.valueOf(kk7.Y3));
                }
                if (i > 1) {
                    i--;
                }
                Locale locale = Locale.US;
                return de9.k(i, ".");
        }
    }

    @Override // fn7
    public final void i(hn7 hn7Var, int i) {
        st8 st8Var = this.b;
        try {
            st8Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        st8Var.c(true);
    }
}
