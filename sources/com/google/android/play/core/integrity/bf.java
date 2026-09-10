package com.google.android.play.core.integrity;

import a9.j0;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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

    @Override // a9.k0
    public final void b() {
        j0 j0Var;
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
            a9.z zVar = (a9.z) bnVar.a.n;
            Bundle b10 = bn.b(bnVar, this.a, 0);
            bl blVar = new bl(this.c, this.b);
            a9.x xVar = (a9.x) zVar;
            xVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(xVar.c);
            int i10 = a9.v.a;
            obtain.writeInt(1);
            b10.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(blVar);
            xVar.H0(obtain, 2);
        } catch (RemoteException e) {
            bn bnVar2 = this.c;
            long j3 = this.a;
            j0Var = bnVar2.b;
            j0Var.a(e, "warmUpIntegrityToken(%s)", Long.valueOf(j3));
            this.b.trySetException(new StandardIntegrityException(-100, e));
        }
    }
}
