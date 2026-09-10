package com.google.android.play.core.integrity;

import a9.c0;
import a9.e0;
import a9.j0;
import a9.k0;
import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
final class ag extends k0 {
    final /* synthetic */ Bundle a;
    final /* synthetic */ Activity b;
    final /* synthetic */ TaskCompletionSource c;
    final /* synthetic */ int d;
    final /* synthetic */ aj e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(aj ajVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i10) {
        super(taskCompletionSource);
        this.a = bundle;
        this.b = activity;
        this.c = taskCompletionSource2;
        this.d = i10;
        this.e = ajVar;
    }

    @Override // a9.k0
    public final void b() {
        j0 j0Var;
        at atVar;
        try {
            aj ajVar = this.e;
            e0 e0Var = (e0) ajVar.a.n;
            Bundle bundle = this.a;
            atVar = ajVar.e;
            as a2 = atVar.a(this.b, this.c, ajVar.a);
            c0 c0Var = (c0) e0Var;
            c0Var.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(c0Var.c);
            int i10 = a9.v.a;
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(a2);
            c0Var.H0(obtain, 3);
        } catch (RemoteException e) {
            aj ajVar2 = this.e;
            int i11 = this.d;
            j0Var = ajVar2.b;
            j0Var.a(e, "requestAndShowDialog(%s)", Integer.valueOf(i11));
            this.c.trySetException(new IntegrityServiceException(-100, e));
        }
    }
}
