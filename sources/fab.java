// default package

import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class fab {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ fab(j00 j00Var) {
        this.a = j00Var.a;
        this.b = j00Var.b;
        this.c = j00Var.c;
    }

    public final ocf a() {
        gl2 gl2Var = new gl2((byte) 24, false);
        Boolean bool = Boolean.FALSE;
        gl2Var.b = bool;
        gl2Var.c = Boolean.valueOf(this.a);
        gl2Var.d = Boolean.valueOf(this.b);
        gl2Var.e = bool;
        gl2Var.f = Boolean.valueOf(this.c);
        return new ocf(gl2Var);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fab)) {
            return false;
        }
        fab fabVar = (fab) obj;
        return this.a == fabVar.a && this.b == fabVar.b && this.c == fabVar.c && cqe.a(null, null);
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.a);
        Boolean valueOf2 = Boolean.valueOf(this.b);
        Boolean valueOf3 = Boolean.valueOf(this.c);
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, valueOf, valueOf2, bool, valueOf3, null});
    }
}
