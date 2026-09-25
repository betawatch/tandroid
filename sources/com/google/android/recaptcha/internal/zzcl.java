package com.google.android.recaptcha.internal;

import gd.i;
import id.c;
import jd.a;
import kd.j;
import rd.p;
import v7.u7;
import zd.c0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
final class zzcl extends j implements p {
    public zzcl(c cVar) {
        super(2, cVar);
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        return new zzcl(cVar);
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcl) create((c0) obj, (c) obj2)).invokeSuspend(i.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        u7.b(obj);
        Thread.currentThread().setPriority(8);
        return i.a;
    }
}
