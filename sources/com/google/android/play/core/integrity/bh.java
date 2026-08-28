package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import k8.g0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class bh extends bm {
    final /* synthetic */ Bundle a;
    final /* synthetic */ Activity b;
    final /* synthetic */ TaskCompletionSource c;
    final /* synthetic */ int d;
    final /* synthetic */ bn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(bn bnVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i9) {
        super(bnVar, taskCompletionSource);
        this.a = bundle;
        this.b = activity;
        this.c = taskCompletionSource2;
        this.d = i9;
        this.e = bnVar;
    }

    @Override // k8.h0
    public final void b() {
        g0 g0Var;
        at atVar;
        if (bn.l(this.e)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.e;
            k8.c cVar = bnVar.a;
            k8.w wVar = (k8.w) cVar.n;
            Bundle bundle = this.a;
            atVar = bnVar.e;
            as a2 = atVar.a(this.b, this.c, cVar);
            k8.u uVar = (k8.u) wVar;
            uVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(uVar.c);
            int i9 = k8.s.a;
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(a2);
            uVar.F0(obtain, 6);
        } catch (RemoteException e10) {
            bn bnVar2 = this.e;
            int i10 = this.d;
            g0Var = bnVar2.b;
            g0Var.a(e10, "requestAndShowDialog(%s)", Integer.valueOf(i10));
            this.c.trySetException(new StandardIntegrityException(-100, e10));
        }
    }
}
