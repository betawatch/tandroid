package com.google.android.gms.internal.clearcut;

import java.io.IOException;

/* loaded from: classes.dex */
public class d0 extends IOException {
    public static d0 a() {
        return new d0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static d0 b() {
        return new d0("Failed to parse the message.");
    }
}
