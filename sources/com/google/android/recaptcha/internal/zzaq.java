package com.google.android.recaptcha.internal;

import kd.c;
import ld.a;
import md.i;
import td.p;
import v7.i8;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
final class zzaq extends i implements p {
    public zzaq(c cVar) {
        super(2, cVar);
    }

    @Override // md.a
    public final c create(Object obj, c cVar) {
        return new zzaq(cVar);
    }

    @Override // td.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaq) create((zzhk) obj, (c) obj2)).invokeSuspend(id.i.a);
    }

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        i8.b(obj);
        return id.i.a;
    }
}
