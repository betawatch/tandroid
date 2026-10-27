package com.google.android.gms.internal.cast;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class c extends g {
    public static final h6.b e = new h6.b("AppVisibilityProxy", null);
    public static final int f = 1;
    public final Set c;
    public int d;

    public c() {
        super("com.google.android.gms.cast.framework.IAppVisibilityListener", 1);
        this.c = DesugarCollections.synchronizedSet(new HashSet());
        this.d = f;
    }
}
