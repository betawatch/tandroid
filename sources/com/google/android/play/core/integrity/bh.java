package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import o8.f0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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

    @Override // o8.g0
    public final void b() {
        f0 f0Var;
        at atVar;
        if (bn.l(this.e)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.e;
            o8.c cVar = bnVar.a;
            o8.v vVar = (o8.v) cVar.n;
            Bundle bundle = this.a;
            atVar = bnVar.e;
            as a2 = atVar.a(this.b, this.c, cVar);
            o8.t tVar = (o8.t) vVar;
            tVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(tVar.c);
            int i10 = o8.r.a;
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(a2);
            tVar.F0(obtain, 6);
        } catch (RemoteException e) {
            bn bnVar2 = this.e;
            int i11 = this.d;
            f0Var = bnVar2.b;
            f0Var.a(e, "requestAndShowDialog(%s)", Integer.valueOf(i11));
            this.c.trySetException(new StandardIntegrityException(-100, e));
        }
    }
}
