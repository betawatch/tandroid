package com.google.android.gms.internal.vision;

import java.io.IOException;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
