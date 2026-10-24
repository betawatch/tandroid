package com.google.android.recaptcha.internal;

import be.c0;
import kd.c;
import ld.a;
import md.i;
import td.p;
import v7.i8;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
final class zzck extends i implements p {
    public zzck(c cVar) {
        super(2, cVar);
    }

    @Override // md.a
    public final c create(Object obj, c cVar) {
        return new zzck(cVar);
    }

    @Override // td.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzck) create((c0) obj, (c) obj2)).invokeSuspend(id.i.a);
    }

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        i8.b(obj);
        Thread.currentThread().setPriority(8);
        return id.i.a;
    }
}
