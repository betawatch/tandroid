package kotlin.jvm.internal;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class h extends c implements g, sd.e {
    private final int arity;
    private final int flags;

    public h(int i3, Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.arity = i3;
        this.flags = 0;
    }

    @Override // kotlin.jvm.internal.c
    public sd.b computeReflected() {
        s.a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return getName().equals(hVar.getName()) && getSignature().equals(hVar.getSignature()) && this.flags == hVar.flags && this.arity == hVar.arity && j.a(getBoundReceiver(), hVar.getBoundReceiver()) && j.a(getOwner(), hVar.getOwner());
        }
        if (obj instanceof sd.e) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.g
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // sd.e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // sd.e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // sd.e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // sd.e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // sd.e
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        sd.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.c
    public sd.e getReflected() {
        sd.b compute = compute();
        if (compute != this) {
            return (sd.e) compute;
        }
        throw new nd.a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
