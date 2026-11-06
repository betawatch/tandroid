package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import d9.b0;
import d9.g0;
import d9.h0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
final class ag extends h0 {
    final /* synthetic */ Bundle a;
    final /* synthetic */ Activity b;
    final /* synthetic */ TaskCompletionSource c;
    final /* synthetic */ int d;
    final /* synthetic */ aj e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(aj ajVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i7) {
        super(taskCompletionSource);
        this.a = bundle;
        this.b = activity;
        this.c = taskCompletionSource2;
        this.d = i7;
        this.e = ajVar;
    }

    @Override // d9.h0
    public final void b() {
        g0 g0Var;
        at atVar;
        try {
            aj ajVar = this.e;
            b0 b0Var = (b0) ajVar.a.n;
            Bundle bundle = this.a;
            atVar = ajVar.e;
            as a10 = atVar.a(this.b, this.c, ajVar.a);
            d9.z zVar = (d9.z) b0Var;
            zVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(zVar.c);
            int i7 = d9.s.a;
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(a10);
            zVar.I0(obtain, 3);
        } catch (RemoteException e10) {
            aj ajVar2 = this.e;
            int i10 = this.d;
            g0Var = ajVar2.b;
            g0Var.a(e10, "requestAndShowDialog(%s)", Integer.valueOf(i10));
            this.c.trySetException(new IntegrityServiceException(-100, e10));
        }
    }
}
