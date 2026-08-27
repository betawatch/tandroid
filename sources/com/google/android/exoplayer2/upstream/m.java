package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.util.Map;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public interface m extends j {
    void addTransferListener(y0 y0Var);

    void close();

    Map getResponseHeaders();

    Uri getUri();

    long open(q qVar);
}
