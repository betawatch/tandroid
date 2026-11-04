package com.google.android.gms.internal.cast;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c extends g {
    public static final i6.b e = new i6.b("AppVisibilityProxy", null);
    public static final int f = 1;
    public final Set c;
    public int d;

    public c() {
        super("com.google.android.gms.cast.framework.IAppVisibilityListener", 1);
        this.c = DesugarCollections.synchronizedSet(new HashSet());
        this.d = f;
    }
}
