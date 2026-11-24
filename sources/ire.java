// default package

import java.io.IOException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class ire extends IOException {
    public static ire a() {
        return new ire("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static ire b() {
        return new ire("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static ire c() {
        return new ire("Protocol message had invalid UTF-8.");
    }
}
