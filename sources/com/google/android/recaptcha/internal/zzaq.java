package com.google.android.recaptcha.internal;

import af.b;
import gd.k;
import id.c;
import jd.a;
import kd.j;
import rd.p;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
final class zzaq extends j implements p {
    public zzaq(c cVar) {
        super(2, cVar);
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        return new zzaq(cVar);
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaq) create((zzhk) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        b.c(obj);
        return k.a;
    }
}
