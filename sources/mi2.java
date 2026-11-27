// default package

import java.lang.reflect.Method;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
