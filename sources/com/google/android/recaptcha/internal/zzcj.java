package com.google.android.recaptcha.internal;

import be.c0;
import kd.c;
import ld.a;
import md.i;
import td.p;
import v7.i8;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
final class zzcj extends i implements p {
    public zzcj(c cVar) {
        super(2, cVar);
    }

    @Override // md.a
    public final c create(Object obj, c cVar) {
        return new zzcj(cVar);
    }

    @Override // td.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcj) create((c0) obj, (c) obj2)).invokeSuspend(id.i.a);
    }

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        i8.b(obj);
        Thread.currentThread().setPriority(8);
        return id.i.a;
    }
}
