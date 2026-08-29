package kotlin.jvm.internal;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class h extends c implements g, fd.e {
    private final int arity;
    private final int flags;

    public h(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.arity = i10;
        this.flags = 0;
    }

    @Override // kotlin.jvm.internal.c
    public fd.b computeReflected() {
        r.a.getClass();
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
        if (obj instanceof fd.e) {
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

    @Override // fd.e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // fd.e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // fd.e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // fd.e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // fd.e
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        fd.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.c
    public fd.e getReflected() {
        fd.b compute = compute();
        if (compute != this) {
            return (fd.e) compute;
        }
        throw new ad.a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
