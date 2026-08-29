package com.google.android.recaptcha.internal;

import bd.p;
import i7.c7;
import jd.c0;
import sc.c;
import uc.i;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
final class zzcj extends i implements p {
    public zzcj(c cVar) {
        super(2, cVar);
    }

    @Override // uc.a
    public final c create(Object obj, c cVar) {
        return new zzcj(cVar);
    }

    @Override // bd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcj) create((c0) obj, (c) obj2)).invokeSuspend(qc.i.a);
    }

    @Override // uc.a
    public final Object invokeSuspend(Object obj) {
        tc.a aVar = tc.a.a;
        c7.b(obj);
        Thread.currentThread().setPriority(8);
        return qc.i.a;
    }
}
