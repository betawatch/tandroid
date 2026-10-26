package kotlin.jvm.internal;

import ce.e0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class g extends b implements f, yd.e {
    private final int arity;
    private final int flags;

    public g(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.arity = i10;
        this.flags = 0;
    }

    @Override // kotlin.jvm.internal.b
    public yd.b computeReflected() {
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
        if (obj instanceof yd.e) {
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

    @Override // yd.e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // yd.e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // yd.e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // yd.e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // yd.e
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        yd.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.b
    public yd.e getReflected() {
        yd.b compute = compute();
        if (compute != this) {
            return (yd.e) compute;
        }
        throw new e0("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
