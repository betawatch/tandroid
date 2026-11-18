package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public class e0 extends IOException {
    public boolean a;

    public static e0 a() {
        return new e0("Protocol message had invalid UTF-8.");
    }

    public static d0 b() {
        return new d0("Protocol message tag had invalid wire type.");
    }

    public static e0 c() {
        return new e0("CodedInputStream encountered a malformed varint.");
    }

    public static e0 d() {
        return new e0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static e0 e() {
        return new e0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
