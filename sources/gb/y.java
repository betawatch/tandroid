package gb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class y implements pa.f {
    public static final y b;
    public static final /* synthetic */ y[] c;
    public final int a;

    static {
        y yVar = new y("LOG_ENVIRONMENT_UNKNOWN", 0, 0);
        y yVar2 = new y("LOG_ENVIRONMENT_AUTOPUSH", 1, 1);
        y yVar3 = new y("LOG_ENVIRONMENT_STAGING", 2, 2);
        y yVar4 = new y("LOG_ENVIRONMENT_PROD", 3, 3);
        b = yVar4;
        y[] yVarArr = {yVar, yVar2, yVar3, yVar4};
        c = yVarArr;
        c8.j1.a(yVarArr);
    }

    public y(String str, int i7, int i10) {
        this.a = i10;
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) c.clone();
    }

    @Override // pa.f
    public final int a() {
        return this.a;
    }
}
