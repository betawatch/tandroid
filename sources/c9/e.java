package c9;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class e implements ra.m {
    public final Class a;

    public /* synthetic */ e(Class cls) {
        this.a = cls;
    }

    @Override // ra.m
    public Object u2() {
        Class cls = this.a;
        try {
            return ra.r.a.a(cls);
        } catch (Exception e) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
        }
    }
}
