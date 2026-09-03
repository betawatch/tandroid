package com.google.android.gms.internal.play_billing;

import org.telegram.ui.yh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class s {
    public final Object a;
    public final Object b;
    public final Object c;

    public s(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.a;
        return new IllegalArgumentException(android.support.v4.media.a.p(String.valueOf(obj), "=", String.valueOf(this.c), yh.m("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.b), " and ")));
    }
}
