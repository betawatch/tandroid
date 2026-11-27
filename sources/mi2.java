// default package

import java.lang.reflect.Method;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class mi2 {
    public final byte a;
    public final Method b;

    /* JADX WARN: Multi-variable type inference failed */
    public mi2(int i, Method method) {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mi2)) {
            return false;
        }
        mi2 mi2Var = (mi2) obj;
        return this.a == mi2Var.a && this.b.getName().equals(mi2Var.b.getName());
    }

    public final int hashCode() {
        return this.b.getName().hashCode() + (this.a * 31);
    }
}
