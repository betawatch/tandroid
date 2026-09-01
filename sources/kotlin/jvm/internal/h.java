package kotlin.jvm.internal;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class h extends c implements g, hd.e {
    private final int arity;
    private final int flags;

    public h(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.arity = i10;
        this.flags = 0;
    }

    @Override // kotlin.jvm.internal.c
    public hd.b computeReflected() {
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
        if (obj instanceof hd.e) {
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

    @Override // hd.e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // hd.e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // hd.e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // hd.e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // hd.e
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        hd.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.c
    public hd.e getReflected() {
        hd.b compute = compute();
        if (compute != this) {
            return (hd.e) compute;
        }
        throw new cd.a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
