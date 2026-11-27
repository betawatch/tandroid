// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
