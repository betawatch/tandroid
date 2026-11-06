package c8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class v {
    public static final v a;
    public static final /* synthetic */ v[] b;

    static {
        v vVar = new v("DEFAULT", 0);
        a = vVar;
        b = new v[]{vVar, new v("SIGNED", 1), new v("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) b.clone();
    }
}
