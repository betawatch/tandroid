package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import m8.b0;
import m8.g0;
import m8.h0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
final class ag extends h0 {
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

    @Override // m8.h0
    public final void b() {
        g0 g0Var;
        at atVar;
        try {
            aj ajVar = this.e;
            b0 b0Var = (b0) ajVar.a.n;
            Bundle bundle = this.a;
            atVar = ajVar.e;
            as a2 = atVar.a(this.b, this.c, ajVar.a);
            m8.z zVar = (m8.z) b0Var;
            zVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(zVar.c);
            int i10 = m8.s.a;
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(a2);
            zVar.F0(obtain, 3);
        } catch (RemoteException e10) {
            aj ajVar2 = this.e;
            int i11 = this.d;
            g0Var = ajVar2.b;
            g0Var.a(e10, "requestAndShowDialog(%s)", Integer.valueOf(i11));
            this.c.trySetException(new IntegrityServiceException(-100, e10));
        }
    }
}
