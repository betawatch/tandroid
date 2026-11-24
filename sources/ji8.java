// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class ji8 implements di8 {
    public static final fi8 a;
    public static final /* synthetic */ ji8[] b;

    static {
        fi8 fi8Var = new fi8();
        a = fi8Var;
        b = new ji8[]{fi8Var, new ji8() { // from class: gi8
            @Override // di8
            public final boolean apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.alwaysFalse()";
            }
        }, new ji8() { // from class: hi8
            @Override // di8
            public final boolean apply(Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.isNull()";
            }
        }, new ji8() { // from class: ii8
            @Override // di8
            public final boolean apply(Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.notNull()";
            }
        }};
    }

    public static ji8 valueOf(String str) {
        return (ji8) Enum.valueOf(ji8.class, str);
    }

    public static ji8[] values() {
        return (ji8[]) b.clone();
    }
}
