// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class iw8 extends s91 implements gx5 {
    public final boolean a;

    public iw8(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.a = false;
    }

    @Override // s91
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final gx5 getReflected() {
        if (this.a) {
            qyc.c("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
            return null;
        }
        dx5 compute = compute();
        if (compute != this) {
            return (gx5) compute;
        }
        throw new yx2("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    @Override // s91
    public final dx5 compute() {
        return this.a ? this : super.compute();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iw8) {
            iw8 iw8Var = (iw8) obj;
            return getOwner().equals(iw8Var.getOwner()) && getName().equals(iw8Var.getName()) && getSignature().equals(iw8Var.getSignature()) && ur5.a(getBoundReceiver(), iw8Var.getBoundReceiver());
        }
        if (obj instanceof gx5) {
            return obj.equals(compute());
        }
        return false;
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    public final String toString() {
        dx5 compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
