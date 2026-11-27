// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class lye {
    public static final zxe a;
    public static final zxe b;

    static {
        zxe zxeVar = null;
        try {
            zxeVar = (zxe) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = zxeVar;
        b = new zxe();
    }
}
