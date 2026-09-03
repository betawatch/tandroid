package com.google.android.recaptcha.internal;

import dd.p;
import k7.p7;
import uc.c;
import vc.a;
import wc.i;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        p7.b(obj);
        return sc.i.a;
    }
}
