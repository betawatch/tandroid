package com.google.android.play.core.integrity;

import a9.b0;
import a9.d0;
import a9.i0;
import a9.j0;
import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
final class ag extends j0 {
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

    @Override // a9.j0
    public final void b() {
        i0 i0Var;
        at atVar;
        try {
            aj ajVar = this.e;
            d0 d0Var = (d0) ajVar.a.n;
            Bundle bundle = this.a;
            atVar = ajVar.e;
            as a2 = atVar.a(this.b, this.c, ajVar.a);
            b0 b0Var = (b0) d0Var;
            b0Var.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(b0Var.c);
            int i10 = a9.u.a;
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(a2);
            b0Var.H0(obtain, 3);
        } catch (RemoteException e7) {
            aj ajVar2 = this.e;
            int i11 = this.d;
            i0Var = ajVar2.b;
            i0Var.a(e7, "requestAndShowDialog(%s)", Integer.valueOf(i11));
            this.c.trySetException(new IntegrityServiceException(-100, e7));
        }
    }
}
