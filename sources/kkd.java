// default package

/* loaded from: classes.dex */
public abstract class kkd {
    public static final akd a = new akd();
    public static final akd b;

    static {
        akd akdVar = null;
        try {
            akdVar = (akd) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = akdVar;
    }
}
