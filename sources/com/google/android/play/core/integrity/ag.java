package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
final class ag extends j5d {
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

    @Override // j5d
    public final void b() {
        h5d h5dVar;
        at atVar;
        try {
            aj ajVar = this.e;
            d5d d5dVar = (d5d) ajVar.a.n;
            Bundle bundle = this.a;
            atVar = ajVar.e;
            as a = atVar.a(this.b, this.c, ajVar.a);
            z4d z4dVar = (z4d) d5dVar;
            z4dVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(z4dVar.c);
            int i = p4d.a;
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(a);
            z4dVar.b(obtain, 3);
        } catch (RemoteException e) {
            aj ajVar2 = this.e;
            int i2 = this.d;
            h5dVar = ajVar2.b;
            h5dVar.a(e, "requestAndShowDialog(%s)", Integer.valueOf(i2));
            this.c.trySetException(new IntegrityServiceException(-100, e));
        }
    }
}
