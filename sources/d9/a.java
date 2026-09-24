package d9;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public abstract class a implements f {
    public abstract boolean a(char c10);

    @Override // d9.f
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }
}
