package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class ag extends s0d {
    final /* synthetic */ Bundle a;
    final /* synthetic */ Activity b;
    final /* synthetic */ TaskCompletionSource c;
    final /* synthetic */ int d;
    final /* synthetic */ aj e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(aj ajVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i) {
        super(taskCompletionSource);
        this.a = bundle;
        this.b = activity;
        this.c = taskCompletionSource2;
        this.d = i;
        this.e = ajVar;
    }

    @Override // s0d
    public final void b() {
        q0d q0dVar;
        at atVar;
        try {
            aj ajVar = this.e;
            m0d m0dVar = (m0d) ajVar.a.n;
            Bundle bundle = this.a;
            atVar = ajVar.e;
            as a = atVar.a(this.b, this.c, ajVar.a);
            i0d i0dVar = (i0d) m0dVar;
            i0dVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(i0dVar.c);
            int i = yzc.a;
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(a);
            i0dVar.b(obtain, 3);
        } catch (RemoteException e) {
            aj ajVar2 = this.e;
            int i2 = this.d;
            q0dVar = ajVar2.b;
            q0dVar.a(e, "requestAndShowDialog(%s)", Integer.valueOf(i2));
            this.c.trySetException(new IntegrityServiceException(-100, e));
        }
    }
}
