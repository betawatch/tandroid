package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public final class k implements f {
    public static final k INSENSITIVE;
    public static final k LENIENT;
    public static final k SENSITIVE;
    public static final k STRICT;
    public static final /* synthetic */ k[] a;

    static {
        k kVar = new k("SENSITIVE", 0);
        SENSITIVE = kVar;
        k kVar2 = new k("INSENSITIVE", 1);
        INSENSITIVE = kVar2;
        k kVar3 = new k("STRICT", 2);
        STRICT = kVar3;
        k kVar4 = new k("LENIENT", 3);
        LENIENT = kVar4;
        a = new k[]{kVar, kVar2, kVar3, kVar4};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) a.clone();
    }

    @Override // j$.time.format.f
    public final boolean j(r rVar, StringBuilder sb) {
        return true;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return "ParseCaseSensitive(true)";
        }
        if (ordinal == 1) {
            return "ParseCaseSensitive(false)";
        }
        if (ordinal == 2) {
            return "ParseStrict(true)";
        }
        if (ordinal == 3) {
            return "ParseStrict(false)";
        }
        throw new IllegalStateException("Unreachable");
    }
}
