package com.google.android.recaptcha.internal;

import g7.y5;
import hd.c0;
import qc.c;
import rc.a;
import sc.i;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zzcl extends i implements p {
    public zzcl(c cVar) {
        super(2, cVar);
    }

    @Override // sc.a
    public final c create(Object obj, c cVar) {
        return new zzcl(cVar);
    }

    @Override // zc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcl) create((c0) obj, (c) obj2)).invokeSuspend(oc.i.a);
    }

    @Override // sc.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        y5.b(obj);
        Thread.currentThread().setPriority(8);
        return oc.i.a;
    }
}
