// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class av8 extends sa1 implements bx5 {
    public final boolean a;

    public av8(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.a = false;
    }

    @Override // sa1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final bx5 getReflected() {
        if (this.a) {
            rjb.j("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
            return null;
        }
        yw5 compute = compute();
        if (compute != this) {
            return (bx5) compute;
        }
        throw new oy2("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    @Override // sa1
    public final yw5 compute() {
        return this.a ? this : super.compute();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof av8) {
            av8 av8Var = (av8) obj;
            return getOwner().equals(av8Var.getOwner()) && getName().equals(av8Var.getName()) && getSignature().equals(av8Var.getSignature()) && rr5.a(getBoundReceiver(), av8Var.getBoundReceiver());
        }
        if (obj instanceof bx5) {
            return obj.equals(compute());
        }
        return false;
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    public final String toString() {
        yw5 compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
