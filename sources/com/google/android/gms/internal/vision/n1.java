package com.google.android.gms.internal.vision;

import java.io.IOException;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
