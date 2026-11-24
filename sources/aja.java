// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class aja {
    public static final aja a;
    public static final aja b;
    public static final /* synthetic */ aja[] c;

    static {
        aja ajaVar = new aja("DEFAULT", 0);
        a = ajaVar;
        aja ajaVar2 = new aja("RECORDING", 1);
        b = ajaVar2;
        c = new aja[]{ajaVar, ajaVar2};
    }

    public static aja valueOf(String str) {
        return (aja) Enum.valueOf(aja.class, str);
    }

    public static aja[] values() {
        return (aja[]) c.clone();
    }
}
