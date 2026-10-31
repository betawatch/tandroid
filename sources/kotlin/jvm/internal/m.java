package kotlin.jvm.internal;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class m extends b implements pd.g {
    public final boolean a;

    public m(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.a = false;
    }

    @Override // kotlin.jvm.internal.b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final pd.g getReflected() {
        if (this.a) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        pd.b compute = compute();
        if (compute != this) {
            return (pd.g) compute;
        }
        throw new kd.a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    @Override // kotlin.jvm.internal.b
    public final pd.b compute() {
        return this.a ? this : super.compute();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return getOwner().equals(mVar.getOwner()) && getName().equals(mVar.getName()) && getSignature().equals(mVar.getSignature()) && i.a(getBoundReceiver(), mVar.getBoundReceiver());
        }
        if (obj instanceof pd.g) {
            return obj.equals(compute());
        }
        return false;
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    public final String toString() {
        pd.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
