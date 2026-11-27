// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class h1c {
    public static final h1c a;
    public static final h1c b;
    public static final h1c c;
    public static final /* synthetic */ h1c[] d;

    static {
        h1c h1cVar = new h1c("TOP", 0);
        a = h1cVar;
        h1c h1cVar2 = new h1c("LEFT", 1);
        b = h1cVar2;
        h1c h1cVar3 = new h1c("BOTTOM", 2);
        c = h1cVar3;
        d = new h1c[]{h1cVar, h1cVar2, h1cVar3};
    }

    public static h1c valueOf(String str) {
        return (h1c) Enum.valueOf(h1c.class, str);
    }

    public static h1c[] values() {
        return (h1c[]) d.clone();
    }
}
