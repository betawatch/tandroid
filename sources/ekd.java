// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ekd {
    public static final ekd a;
    public static final /* synthetic */ ekd[] b;

    static {
        ekd ekdVar = new ekd("DEFAULT", 0);
        a = ekdVar;
        b = new ekd[]{ekdVar, new ekd("SIGNED", 1), new ekd("FIXED", 2)};
    }

    public static ekd[] values() {
        return (ekd[]) b.clone();
    }
}
