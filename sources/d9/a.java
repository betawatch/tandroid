package d9;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes.dex */
public abstract class a implements f {
    public abstract boolean a(char c10);

    @Override // d9.f
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }
}
