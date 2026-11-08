package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
        return new IllegalArgumentException(org.telegram.ui.Cells.f1.n(String.valueOf(obj), "=", String.valueOf(this.c), com.google.android.recaptcha.internal.a.n("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.b), " and ")));
    }
}
