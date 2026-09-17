package com.google.android.gms.internal.cast;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public final class d extends h {
    public static final g6.b e = new g6.b("AppVisibilityProxy", null);
    public static final int f = 1;
    public final Set c;
    public int d;

    public d() {
        super("com.google.android.gms.cast.framework.IAppVisibilityListener", 1);
        this.c = DesugarCollections.synchronizedSet(new HashSet());
        this.d = f;
    }
}
