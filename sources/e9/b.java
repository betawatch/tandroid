package e9;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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

    @Override // e9.i
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

    @Override // e9.d, e9.i
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
