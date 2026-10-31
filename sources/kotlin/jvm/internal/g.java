package kotlin.jvm.internal;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class g extends b implements f, pd.e {
    private final int arity;
    private final int flags;

    public g(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.arity = i10;
        this.flags = 0;
    }

    @Override // kotlin.jvm.internal.b
    public pd.b computeReflected() {
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
        if (obj instanceof pd.e) {
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

    @Override // pd.e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // pd.e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // pd.e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // pd.e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // pd.e
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        pd.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.b
    public pd.e getReflected() {
        pd.b compute = compute();
        if (compute != this) {
            return (pd.e) compute;
        }
        throw new kd.a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
