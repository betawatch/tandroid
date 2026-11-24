package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class bf extends bm {
    final /* synthetic */ long a;
    final /* synthetic */ TaskCompletionSource b;
    final /* synthetic */ bn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(bn bnVar, TaskCompletionSource taskCompletionSource, int i, long j, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.a = j;
        this.b = taskCompletionSource2;
        this.c = bnVar;
    }

    @Override // u2d
    public final void b() {
        s2d s2dVar;
        if (bn.l(this.c)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        if (bn.k(this.c, 0)) {
            a(new StandardIntegrityException(-14, null));
            return;
        }
        try {
            bn bnVar = this.c;
            f2d f2dVar = (f2d) bnVar.a.n;
            Bundle b = bn.b(bnVar, this.a, 0);
            bl blVar = new bl(this.c, this.b);
            d2d d2dVar = (d2d) f2dVar;
            d2dVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(d2dVar.c);
            int i = z1d.a;
            obtain.writeInt(1);
            b.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(blVar);
            d2dVar.b(obtain, 2);
        } catch (RemoteException e) {
            bn bnVar2 = this.c;
            long j = this.a;
            s2dVar = bnVar2.b;
            s2dVar.a(e, "warmUpIntegrityToken(%s)", Long.valueOf(j));
            this.b.trySetException(new StandardIntegrityException(-100, e));
        }
    }
}
