package kotlin.jvm.internal;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public abstract class n extends c implements vd.g {
    public final boolean a;

    public n(Object obj, Class cls, String str, String str2, int i7) {
        super(obj, cls, str, str2, (i7 & 1) == 1);
        this.a = false;
    }

    @Override // kotlin.jvm.internal.c
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final vd.g getReflected() {
        if (this.a) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        vd.b compute = compute();
        if (compute != this) {
            return (vd.g) compute;
        }
        throw new qd.a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    @Override // kotlin.jvm.internal.c
    public final vd.b compute() {
        return this.a ? this : super.compute();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return getOwner().equals(nVar.getOwner()) && getName().equals(nVar.getName()) && getSignature().equals(nVar.getSignature()) && j.a(getBoundReceiver(), nVar.getBoundReceiver());
        }
        if (obj instanceof vd.g) {
            return obj.equals(compute());
        }
        return false;
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    public final String toString() {
        vd.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
