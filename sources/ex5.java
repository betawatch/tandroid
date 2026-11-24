// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ex5 {
    public static final /* synthetic */ ex5[] a = {new ex5("PUBLIC", 0), new ex5("PROTECTED", 1), new ex5("INTERNAL", 2), new ex5("PRIVATE", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    ex5 EF5;

    public static ex5 valueOf(String str) {
        return (ex5) Enum.valueOf(ex5.class, str);
    }

    public static ex5[] values() {
        return (ex5[]) a.clone();
    }
}
