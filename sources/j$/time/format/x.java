package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes4.dex */
public final class x {
    public static final x ALWAYS;
    public static final x EXCEEDS_PAD;
    public static final x NEVER;
    public static final x NORMAL;
    public static final x NOT_NEGATIVE;
    public static final /* synthetic */ x[] a;

    static {
        x xVar = new x("NORMAL", 0);
        NORMAL = xVar;
        x xVar2 = new x("ALWAYS", 1);
        ALWAYS = xVar2;
        x xVar3 = new x("NEVER", 2);
        NEVER = xVar3;
        x xVar4 = new x("NOT_NEGATIVE", 3);
        NOT_NEGATIVE = xVar4;
        x xVar5 = new x("EXCEEDS_PAD", 4);
        EXCEEDS_PAD = xVar5;
        a = new x[]{xVar, xVar2, xVar3, xVar4, xVar5};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) a.clone();
    }
}
