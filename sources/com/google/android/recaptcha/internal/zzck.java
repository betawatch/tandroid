package com.google.android.recaptcha.internal;

import dd.p;
import k7.q7;
import ld.c0;
import uc.c;
import vc.a;
import wc.i;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
final class zzck extends i implements p {
    public zzck(c cVar) {
        super(2, cVar);
    }

    @Override // wc.a
    public final c create(Object obj, c cVar) {
        return new zzck(cVar);
    }

    @Override // dd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzck) create((c0) obj, (c) obj2)).invokeSuspend(sc.i.a);
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        q7.b(obj);
        Thread.currentThread().setPriority(8);
        return sc.i.a;
    }
}
