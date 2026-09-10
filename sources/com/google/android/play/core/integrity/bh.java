package com.google.android.play.core.integrity;

import a9.j0;
import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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

    @Override // a9.k0
    public final void b() {
        j0 j0Var;
        at atVar;
        if (bn.l(this.e)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.e;
            a9.e eVar = bnVar.a;
            a9.z zVar = (a9.z) eVar.n;
            Bundle bundle = this.a;
            atVar = bnVar.e;
            as a2 = atVar.a(this.b, this.c, eVar);
            a9.x xVar = (a9.x) zVar;
            xVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(xVar.c);
            int i10 = a9.v.a;
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(a2);
            xVar.H0(obtain, 6);
        } catch (RemoteException e) {
            bn bnVar2 = this.e;
            int i11 = this.d;
            j0Var = bnVar2.b;
            j0Var.a(e, "requestAndShowDialog(%s)", Integer.valueOf(i11));
            this.c.trySetException(new StandardIntegrityException(-100, e));
        }
    }
}
