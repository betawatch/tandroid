package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import m8.g0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
final class bh extends bm {
    final /* synthetic */ Bundle a;
    final /* synthetic */ Activity b;
    final /* synthetic */ TaskCompletionSource c;
    final /* synthetic */ int d;
    final /* synthetic */ bn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(bn bnVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i10) {
        super(bnVar, taskCompletionSource);
        this.a = bundle;
        this.b = activity;
        this.c = taskCompletionSource2;
        this.d = i10;
        this.e = bnVar;
    }

    @Override // m8.h0
    public final void b() {
        g0 g0Var;
        at atVar;
        if (bn.l(this.e)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.e;
            m8.c cVar = bnVar.a;
            m8.w wVar = (m8.w) cVar.n;
            Bundle bundle = this.a;
            atVar = bnVar.e;
            as a2 = atVar.a(this.b, this.c, cVar);
            m8.u uVar = (m8.u) wVar;
            uVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(uVar.c);
            int i10 = m8.s.a;
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(a2);
            uVar.F0(obtain, 6);
        } catch (RemoteException e10) {
            bn bnVar2 = this.e;
            int i11 = this.d;
            g0Var = bnVar2.b;
            g0Var.a(e10, "requestAndShowDialog(%s)", Integer.valueOf(i11));
            this.c.trySetException(new StandardIntegrityException(-100, e10));
        }
    }
}
