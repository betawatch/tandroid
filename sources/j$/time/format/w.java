package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes4.dex */
public final class w {
    public static final w LENIENT;
    public static final w SMART;
    public static final w STRICT;
    public static final /* synthetic */ w[] a;

    static {
        w wVar = new w("STRICT", 0);
        STRICT = wVar;
        w wVar2 = new w("SMART", 1);
        SMART = wVar2;
        w wVar3 = new w("LENIENT", 2);
        LENIENT = wVar3;
        a = new w[]{wVar, wVar2, wVar3};
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) a.clone();
    }
}
