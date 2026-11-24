package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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

    @Override // s0d
    public final void b() {
        q0d q0dVar;
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
            e0d e0dVar = (e0d) bnVar.a.n;
            Bundle b = bn.b(bnVar, this.a, 0);
            bl blVar = new bl(this.c, this.b);
            c0d c0dVar = (c0d) e0dVar;
            c0dVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(c0dVar.c);
            int i = yzc.a;
            obtain.writeInt(1);
            b.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(blVar);
            c0dVar.b(obtain, 2);
        } catch (RemoteException e) {
            bn bnVar2 = this.c;
            long j = this.a;
            q0dVar = bnVar2.b;
            q0dVar.a(e, "warmUpIntegrityToken(%s)", Long.valueOf(j));
            this.b.trySetException(new StandardIntegrityException(-100, e));
        }
    }
}
