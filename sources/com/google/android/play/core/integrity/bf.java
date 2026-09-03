package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import o8.f0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
final class bf extends bm {
    final /* synthetic */ long a;
    final /* synthetic */ TaskCompletionSource b;
    final /* synthetic */ bn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(bn bnVar, TaskCompletionSource taskCompletionSource, int i10, long j10, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.a = j10;
        this.b = taskCompletionSource2;
        this.c = bnVar;
    }

    @Override // o8.g0
    public final void b() {
        f0 f0Var;
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
            o8.v vVar = (o8.v) bnVar.a.n;
            Bundle b10 = bn.b(bnVar, this.a, 0);
            bl blVar = new bl(this.c, this.b);
            o8.t tVar = (o8.t) vVar;
            tVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(tVar.c);
            int i10 = o8.r.a;
            obtain.writeInt(1);
            b10.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(blVar);
            tVar.F0(obtain, 2);
        } catch (RemoteException e6) {
            bn bnVar2 = this.c;
            long j10 = this.a;
            f0Var = bnVar2.b;
            f0Var.a(e6, "warmUpIntegrityToken(%s)", Long.valueOf(j10));
            this.b.trySetException(new StandardIntegrityException(-100, e6));
        }
    }
}
