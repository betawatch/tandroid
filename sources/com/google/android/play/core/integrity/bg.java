package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class bg extends bm {
    final /* synthetic */ StandardIntegrityManager.StandardIntegrityTokenRequest a;
    final /* synthetic */ long b;
    final /* synthetic */ long c;
    final /* synthetic */ TaskCompletionSource d;
    final /* synthetic */ bn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(bn bnVar, TaskCompletionSource taskCompletionSource, int i, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest, long j, long j2, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.a = standardIntegrityTokenRequest;
        this.b = j;
        this.c = j2;
        this.d = taskCompletionSource2;
        this.e = bnVar;
    }

    @Override // s0d
    public final void b() {
        q0d q0dVar;
        if (bn.l(this.e)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        if (bn.k(this.e, 0)) {
            a(new StandardIntegrityException(-14, null));
            return;
        }
        try {
            bn bnVar = this.e;
            e0d e0dVar = (e0d) bnVar.a.n;
            Bundle a = bn.a(bnVar, this.a, this.b, this.c, 0);
            bk bkVar = new bk(this.e, this.d, this.b);
            c0d c0dVar = (c0d) e0dVar;
            c0dVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(c0dVar.c);
            int i = yzc.a;
            obtain.writeInt(1);
            a.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(bkVar);
            c0dVar.b(obtain, 3);
        } catch (RemoteException e) {
            bn bnVar2 = this.e;
            StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest = this.a;
            q0dVar = bnVar2.b;
            q0dVar.a(e, "requestExpressIntegrityToken(%s, %s, %s)", standardIntegrityTokenRequest.requestHash(), this.a.verdictOptOut(), Long.valueOf(this.b));
            this.d.trySetException(new StandardIntegrityException(-100, e));
        }
    }
}
