package d9;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class b extends g {
    public static final b c = new b("CharMatcher.any()", 0);
    public static final b d = new b("CharMatcher.ascii()", 1);
    public static final b e = new b("CharMatcher.javaIsoControl()", 2);
    public static final b f = new b("CharMatcher.none()", 3);
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, int i10) {
        super(str);
        this.b = i10;
    }

    @Override // d9.i
    public final boolean c(char c10) {
        switch (this.b) {
            case 0:
                return true;
            case 1:
                return c10 <= 127;
            case 2:
                return c10 <= 31 || (c10 >= 127 && c10 <= 159);
            default:
                return false;
        }
    }

    @Override // d9.d, d9.i
    public i d() {
        switch (this.b) {
            case 0:
                return f;
            case 3:
                return c;
            default:
                return super.d();
        }
    }
}
