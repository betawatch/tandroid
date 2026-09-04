package kotlin.jvm.internal;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public abstract class g extends b implements f, vd.e {
    private final int arity;
    private final int flags;

    public g(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.arity = i10;
        this.flags = 0;
    }

    @Override // kotlin.jvm.internal.b
    public vd.b computeReflected() {
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
        if (obj instanceof vd.e) {
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

    @Override // vd.e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // vd.e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // vd.e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // vd.e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // vd.e
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        vd.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.b
    public vd.e getReflected() {
        vd.b compute = compute();
        if (compute != this) {
            return (vd.e) compute;
        }
        throw new qd.a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
