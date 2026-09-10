package com.google.android.gms.internal.vision;

import java.io.IOException;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
