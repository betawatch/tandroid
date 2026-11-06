package gb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class n implements pa.f {
    public static final n b;
    public static final /* synthetic */ n[] c;
    public final int a;

    static {
        n nVar = new n("EVENT_TYPE_UNKNOWN", 0, 0);
        n nVar2 = new n("SESSION_START", 1, 1);
        b = nVar2;
        n[] nVarArr = {nVar, nVar2};
        c = nVarArr;
        c8.j1.a(nVarArr);
    }

    public n(String str, int i7, int i10) {
        this.a = i10;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) c.clone();
    }

    @Override // pa.f
    public final int a() {
        return this.a;
    }
}
