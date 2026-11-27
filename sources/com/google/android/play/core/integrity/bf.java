package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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

    @Override // j5d
    public final void b() {
        h5d h5dVar;
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
            v4d v4dVar = (v4d) bnVar.a.n;
            Bundle b = bn.b(bnVar, this.a, 0);
            bl blVar = new bl(this.c, this.b);
            t4d t4dVar = (t4d) v4dVar;
            t4dVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(t4dVar.c);
            int i = p4d.a;
            obtain.writeInt(1);
            b.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(blVar);
            t4dVar.b(obtain, 2);
        } catch (RemoteException e) {
            bn bnVar2 = this.c;
            long j = this.a;
            h5dVar = bnVar2.b;
            h5dVar.a(e, "warmUpIntegrityToken(%s)", Long.valueOf(j));
            this.b.trySetException(new StandardIntegrityException(-100, e));
        }
    }
}
