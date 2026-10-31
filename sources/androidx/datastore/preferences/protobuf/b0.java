package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class b0 extends IOException {
    public static b0 a() {
        return new b0("Protocol message had invalid UTF-8.");
    }

    public static a0 b() {
        return new a0("Protocol message tag had invalid wire type.");
    }

    public static b0 c() {
        return new b0("CodedInputStream encountered a malformed varint.");
    }

    public static b0 d() {
        return new b0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static b0 e() {
        return new b0("Failed to parse the message.");
    }

    public static b0 f() {
        return new b0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
