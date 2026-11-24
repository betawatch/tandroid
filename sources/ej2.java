// default package

import java.lang.reflect.Method;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ej2 {
    public final byte a;
    public final Method b;

    /* JADX WARN: Multi-variable type inference failed */
    public ej2(int i, Method method) {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ej2)) {
            return false;
        }
        ej2 ej2Var = (ej2) obj;
        return this.a == ej2Var.a && this.b.getName().equals(ej2Var.b.getName());
    }

    public final int hashCode() {
        return this.b.getName().hashCode() + (this.a * 31);
    }
}
