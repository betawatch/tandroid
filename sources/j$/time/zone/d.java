package j$.time.zone;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes4.dex */
public final class d {
    public static final d STANDARD;
    public static final d UTC;
    public static final d WALL;
    public static final /* synthetic */ d[] a;

    static {
        d dVar = new d("UTC", 0);
        UTC = dVar;
        d dVar2 = new d("WALL", 1);
        WALL = dVar2;
        d dVar3 = new d("STANDARD", 2);
        STANDARD = dVar3;
        a = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) a.clone();
    }
}
