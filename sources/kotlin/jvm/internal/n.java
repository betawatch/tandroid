package kotlin.jvm.internal;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class n extends c implements hd.g {
    public final boolean a;

    public n(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.a = false;
    }

    @Override // kotlin.jvm.internal.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final hd.g getReflected() {
        if (this.a) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        hd.b compute = compute();
        if (compute != this) {
            return (hd.g) compute;
        }
        throw new cd.a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    @Override // kotlin.jvm.internal.c
    public final hd.b compute() {
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
        if (obj instanceof hd.g) {
            return obj.equals(compute());
        }
        return false;
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    public final String toString() {
        hd.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
