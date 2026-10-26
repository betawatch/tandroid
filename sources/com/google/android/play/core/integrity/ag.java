package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import b9.a0;
import b9.c0;
import b9.h0;
import b9.i0;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
final class ag extends i0 {
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

    @Override // b9.i0
    public final void b() {
        h0 h0Var;
        at atVar;
        try {
            aj ajVar = this.e;
            c0 c0Var = (c0) ajVar.a.n;
            Bundle bundle = this.a;
            atVar = ajVar.e;
            as a2 = atVar.a(this.b, this.c, ajVar.a);
            a0 a0Var = (a0) c0Var;
            a0Var.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(a0Var.c);
            int i10 = b9.t.a;
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(a2);
            a0Var.G0(obtain, 3);
        } catch (RemoteException e) {
            aj ajVar2 = this.e;
            int i11 = this.d;
            h0Var = ajVar2.b;
            h0Var.a(e, "requestAndShowDialog(%s)", Integer.valueOf(i11));
            this.c.trySetException(new IntegrityServiceException(-100, e));
        }
    }
}
