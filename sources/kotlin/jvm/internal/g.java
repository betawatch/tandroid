package kotlin.jvm.internal;

import hd.e0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class g extends b implements f, dd.e {
    private final int arity;
    private final int flags;

    public g(int i9, Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.arity = i9;
        this.flags = 0;
    }

    @Override // kotlin.jvm.internal.b
    public dd.b computeReflected() {
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
        if (obj instanceof dd.e) {
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

    @Override // dd.e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // dd.e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // dd.e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // dd.e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // dd.e
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        dd.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.b
    public dd.e getReflected() {
        dd.b compute = compute();
        if (compute != this) {
            return (dd.e) compute;
        }
        throw new e0("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
