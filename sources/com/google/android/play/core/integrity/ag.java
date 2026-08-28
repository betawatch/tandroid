package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import k8.b0;
import k8.g0;
import k8.h0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class ag extends h0 {
    final /* synthetic */ Bundle a;
    final /* synthetic */ Activity b;
    final /* synthetic */ TaskCompletionSource c;
    final /* synthetic */ int d;
    final /* synthetic */ aj e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(aj ajVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i9) {
        super(taskCompletionSource);
        this.a = bundle;
        this.b = activity;
        this.c = taskCompletionSource2;
        this.d = i9;
        this.e = ajVar;
    }

    @Override // k8.h0
    public final void b() {
        g0 g0Var;
        at atVar;
        try {
            aj ajVar = this.e;
            b0 b0Var = (b0) ajVar.a.n;
            Bundle bundle = this.a;
            atVar = ajVar.e;
            as a2 = atVar.a(this.b, this.c, ajVar.a);
            k8.z zVar = (k8.z) b0Var;
            zVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(zVar.c);
            int i9 = k8.s.a;
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(a2);
            zVar.F0(obtain, 3);
        } catch (RemoteException e10) {
            aj ajVar2 = this.e;
            int i10 = this.d;
            g0Var = ajVar2.b;
            g0Var.a(e10, "requestAndShowDialog(%s)", Integer.valueOf(i10));
            this.c.trySetException(new IntegrityServiceException(-100, e10));
        }
    }
}
