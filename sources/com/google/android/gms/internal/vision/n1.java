package com.google.android.gms.internal.vision;

import java.io.IOException;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public class n1 extends IOException {
    public static final /* synthetic */ int a = 0;

    public static n1 a() {
        return new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static n1 b() {
        return new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static n1 c() {
        return new n1("Protocol message had invalid UTF-8.");
    }
}
