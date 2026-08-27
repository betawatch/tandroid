package com.google.android.recaptcha.internal;

import ad.p;
import h7.k6;
import id.c0;
import rc.c;
import tc.i;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
final class zzcj extends i implements p {
    public zzcj(c cVar) {
        super(2, cVar);
    }

    @Override // tc.a
    public final c create(Object obj, c cVar) {
        return new zzcj(cVar);
    }

    @Override // ad.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcj) create((c0) obj, (c) obj2)).invokeSuspend(pc.i.a);
    }

    @Override // tc.a
    public final Object invokeSuspend(Object obj) {
        sc.a aVar = sc.a.a;
        k6.b(obj);
        Thread.currentThread().setPriority(8);
        return pc.i.a;
    }
}
