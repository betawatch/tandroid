package kotlin.jvm.internal;

import be.e0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public abstract class g extends b implements f, xd.e {
    private final int arity;
    private final int flags;

    public g(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.arity = i10;
        this.flags = 0;
    }

    @Override // kotlin.jvm.internal.b
    public xd.b computeReflected() {
        q.a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return getName().equals(gVar.getName()) && getSignature().equals(gVar.getSignature()) && this.flags == gVar.flags && this.arity == gVar.arity && i.a(getBoundReceiver(), gVar.getBoundReceiver()) && i.a(getOwner(), gVar.getOwner());
        }
        if (obj instanceof xd.e) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.f
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // xd.e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // xd.e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // xd.e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // xd.e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // xd.e
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        xd.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.b
    public xd.e getReflected() {
        xd.b compute = compute();
        if (compute != this) {
            return (xd.e) compute;
        }
        throw new e0("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
