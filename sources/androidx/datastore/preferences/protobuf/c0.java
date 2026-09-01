package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public class c0 extends IOException {
    public static c0 a() {
        return new c0("Protocol message had invalid UTF-8.");
    }

    public static b0 b() {
        return new b0("Protocol message tag had invalid wire type.");
    }

    public static c0 c() {
        return new c0("CodedInputStream encountered a malformed varint.");
    }

    public static c0 d() {
        return new c0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static c0 e() {
        return new c0("Failed to parse the message.");
    }

    public static c0 f() {
        return new c0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
