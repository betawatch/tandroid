package com.google.android.recaptcha.internal;

import dd.p;
import k7.q7;
import uc.c;
import vc.a;
import wc.i;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
final class zzaq extends i implements p {
    public zzaq(c cVar) {
        super(2, cVar);
    }

    @Override // wc.a
    public final c create(Object obj, c cVar) {
        return new zzaq(cVar);
    }

    @Override // dd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaq) create((zzhk) obj, (c) obj2)).invokeSuspend(sc.i.a);
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        q7.b(obj);
        return sc.i.a;
    }
}
