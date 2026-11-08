package com.google.android.recaptcha.internal;

import af.b;
import gd.k;
import id.c;
import kd.j;
import rd.p;
import zd.z;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
final class zzcj extends j implements p {
    public zzcj(c cVar) {
        super(2, cVar);
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        return new zzcj(cVar);
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcj) create((z) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.a;
        b.c(obj);
        Thread.currentThread().setPriority(8);
        return k.a;
    }
}
