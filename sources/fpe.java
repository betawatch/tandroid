// default package

import java.io.IOException;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class fpe extends IOException {
    public static fpe a() {
        return new fpe("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static fpe b() {
        return new fpe("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static fpe c() {
        return new fpe("Protocol message had invalid UTF-8.");
    }
}
