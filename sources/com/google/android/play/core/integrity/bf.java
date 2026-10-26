package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import b9.h0;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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

    @Override // b9.i0
    public final void b() {
        h0 h0Var;
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
            b9.x xVar = (b9.x) bnVar.a.n;
            Bundle b10 = bn.b(bnVar, this.a, 0);
            bl blVar = new bl(this.c, this.b);
            b9.v vVar = (b9.v) xVar;
            vVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(vVar.c);
            int i10 = b9.t.a;
            obtain.writeInt(1);
            b10.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(blVar);
            vVar.G0(obtain, 2);
        } catch (RemoteException e) {
            bn bnVar2 = this.c;
            long j10 = this.a;
            h0Var = bnVar2.b;
            h0Var.a(e, "warmUpIntegrityToken(%s)", Long.valueOf(j10));
            this.b.trySetException(new StandardIntegrityException(-100, e));
        }
    }
}
