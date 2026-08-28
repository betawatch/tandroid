package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.util.Map;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public interface m extends j {
    void addTransferListener(y0 y0Var);

    void close();

    Map getResponseHeaders();

    Uri getUri();

    long open(q qVar);
}
