package kotlin.jvm.internal;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract class h extends c implements g, vd.e {
    private final int arity;
    private final int flags;

    public h(int i7, Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.arity = i7;
        this.flags = 0;
    }

    @Override // kotlin.jvm.internal.c
    public vd.b computeReflected() {
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
        if (obj instanceof vd.e) {
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

    @Override // kotlin.jvm.internal.c
    public vd.e getReflected() {
        vd.b compute = compute();
        if (compute != this) {
            return (vd.e) compute;
        }
        throw new qd.a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
