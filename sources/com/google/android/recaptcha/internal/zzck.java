package com.google.android.recaptcha.internal;

import a8.jd;
import ce.c0;
import ld.c;
import md.a;
import nd.i;
import ud.p;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
final class zzck extends i implements p {
    public zzck(c cVar) {
        super(2, cVar);
    }

    @Override // nd.a
    public final c create(Object obj, c cVar) {
        return new zzck(cVar);
    }

    @Override // ud.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzck) create((c0) obj, (c) obj2)).invokeSuspend(jd.i.a);
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        jd.b(obj);
        Thread.currentThread().setPriority(8);
        return jd.i.a;
    }
}
