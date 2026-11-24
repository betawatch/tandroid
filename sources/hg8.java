// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class hg8 implements bg8 {
    public static final dg8 a;
    public static final /* synthetic */ hg8[] b;

    static {
        dg8 dg8Var = new dg8();
        a = dg8Var;
        b = new hg8[]{dg8Var, new hg8() { // from class: eg8
            @Override // bg8
            public final boolean apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.alwaysFalse()";
            }
        }, new hg8() { // from class: fg8
            @Override // bg8
            public final boolean apply(Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.isNull()";
            }
        }, new hg8() { // from class: gg8
            @Override // bg8
            public final boolean apply(Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.notNull()";
            }
        }};
    }

    public static hg8 valueOf(String str) {
        return (hg8) Enum.valueOf(hg8.class, str);
    }

    public static hg8[] values() {
        return (hg8[]) b.clone();
    }
}
