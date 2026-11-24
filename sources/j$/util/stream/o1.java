package j$.util.stream;

import java.util.function.Supplier;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o1 implements Supplier {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u1 b;

    public /* synthetic */ o1(u1 u1Var, byte b) {
        this.a = b;
        this.b = u1Var;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return new r1(this.b);
            case 1:
                return new q1(this.b);
            default:
                return new s1(this.b);
        }
    }
}
