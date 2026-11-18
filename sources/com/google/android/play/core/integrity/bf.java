package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import d9.g0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
final class bf extends bm {
    final /* synthetic */ long a;
    final /* synthetic */ TaskCompletionSource b;
    final /* synthetic */ bn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(bn bnVar, TaskCompletionSource taskCompletionSource, int i7, long j3, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.a = j3;
        this.b = taskCompletionSource2;
        this.c = bnVar;
    }

    @Override // d9.h0
    public final void b() {
        g0 g0Var;
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
            d9.w wVar = (d9.w) bnVar.a.n;
            Bundle b10 = bn.b(bnVar, this.a, 0);
            bl blVar = new bl(this.c, this.b);
            d9.u uVar = (d9.u) wVar;
            uVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(uVar.c);
            int i7 = d9.s.a;
            obtain.writeInt(1);
            b10.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(blVar);
            uVar.i1(obtain, 2);
        } catch (RemoteException e10) {
            bn bnVar2 = this.c;
            long j3 = this.a;
            g0Var = bnVar2.b;
            g0Var.a(e10, "warmUpIntegrityToken(%s)", Long.valueOf(j3));
            this.b.trySetException(new StandardIntegrityException(-100, e10));
        }
    }
}
