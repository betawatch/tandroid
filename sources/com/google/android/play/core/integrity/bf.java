package com.google.android.play.core.integrity;

import a9.i0;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
final class bf extends bm {
    final /* synthetic */ long a;
    final /* synthetic */ TaskCompletionSource b;
    final /* synthetic */ bn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(bn bnVar, TaskCompletionSource taskCompletionSource, int i10, long j3, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.a = j3;
        this.b = taskCompletionSource2;
        this.c = bnVar;
    }

    @Override // a9.j0
    public final void b() {
        i0 i0Var;
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
            a9.y yVar = (a9.y) bnVar.a.n;
            Bundle b10 = bn.b(bnVar, this.a, 0);
            bl blVar = new bl(this.c, this.b);
            a9.w wVar = (a9.w) yVar;
            wVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(wVar.c);
            int i10 = a9.u.a;
            obtain.writeInt(1);
            b10.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(blVar);
            wVar.H0(obtain, 2);
        } catch (RemoteException e7) {
            bn bnVar2 = this.c;
            long j3 = this.a;
            i0Var = bnVar2.b;
            i0Var.a(e7, "warmUpIntegrityToken(%s)", Long.valueOf(j3));
            this.b.trySetException(new StandardIntegrityException(-100, e7));
        }
    }
}
