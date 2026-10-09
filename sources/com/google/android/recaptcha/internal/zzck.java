package com.google.android.recaptcha.internal;

import ae.d0;
import hd.i;
import jd.c;
import kd.a;
import ld.j;
import sd.p;
import v7.a8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
final class zzck extends j implements p {
    public zzck(c cVar) {
        super(2, cVar);
    }

    @Override // ld.a
    public final c create(Object obj, c cVar) {
        return new zzck(cVar);
    }

    @Override // sd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzck) create((d0) obj, (c) obj2)).invokeSuspend(i.a);
    }

    @Override // ld.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        a8.b(obj);
        Thread.currentThread().setPriority(8);
        return i.a;
    }
}
