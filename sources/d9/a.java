package d9;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public abstract class a implements f {
    public abstract boolean a(char c10);

    @Override // d9.f
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }
}
