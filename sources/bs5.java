// default package

import java.io.IOException;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class bs5 extends IOException {
    public boolean a;

    public static bs5 a() {
        return new bs5("Protocol message had invalid UTF-8.");
    }

    public static as5 b() {
        return new as5("Protocol message tag had invalid wire type.");
    }

    public static bs5 c() {
        return new bs5("CodedInputStream encountered a malformed varint.");
    }

    public static bs5 d() {
        return new bs5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static bs5 e() {
        return new bs5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
