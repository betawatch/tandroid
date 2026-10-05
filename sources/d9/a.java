package d9;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public abstract class a implements f {
    public abstract boolean a(char c10);

    @Override // d9.f
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }
}
