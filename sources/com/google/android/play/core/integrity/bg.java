package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import k8.g0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class bg extends bm {
    final /* synthetic */ StandardIntegrityManager.StandardIntegrityTokenRequest a;
    final /* synthetic */ long b;
    final /* synthetic */ long c;
    final /* synthetic */ TaskCompletionSource d;
    final /* synthetic */ bn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(bn bnVar, TaskCompletionSource taskCompletionSource, int i9, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest, long j10, long j11, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.a = standardIntegrityTokenRequest;
        this.b = j10;
        this.c = j11;
        this.d = taskCompletionSource2;
        this.e = bnVar;
    }

    @Override // k8.h0
    public final void b() {
        g0 g0Var;
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
            k8.w wVar = (k8.w) bnVar.a.n;
            Bundle a2 = bn.a(bnVar, this.a, this.b, this.c, 0);
            bk bkVar = new bk(this.e, this.d, this.b);
            k8.u uVar = (k8.u) wVar;
            uVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(uVar.c);
            int i9 = k8.s.a;
            obtain.writeInt(1);
            a2.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(bkVar);
            uVar.F0(obtain, 3);
        } catch (RemoteException e10) {
            bn bnVar2 = this.e;
            StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest = this.a;
            g0Var = bnVar2.b;
            g0Var.a(e10, "requestExpressIntegrityToken(%s, %s, %s)", standardIntegrityTokenRequest.requestHash(), this.a.verdictOptOut(), Long.valueOf(this.b));
            this.d.trySetException(new StandardIntegrityException(-100, e10));
        }
    }
}
