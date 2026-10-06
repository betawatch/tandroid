package com.google.android.gms.internal.cast;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
