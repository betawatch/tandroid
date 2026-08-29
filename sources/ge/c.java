package ge;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c {
    public static final c a;
    public static final c b;
    public static final c c;
    public static final /* synthetic */ c[] d;

    static {
        c cVar = new c("LEFT", 0);
        a = cVar;
        c cVar2 = new c("CENTER", 1);
        b = cVar2;
        c cVar3 = new c("RIGHT", 2);
        c = cVar3;
        d = new c[]{cVar, cVar2, cVar3};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d.clone();
    }
}
