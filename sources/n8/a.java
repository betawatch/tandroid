package n8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class a implements f {
    public abstract boolean a(char c10);

    @Override // n8.f
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }
}
