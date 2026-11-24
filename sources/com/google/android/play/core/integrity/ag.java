package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class ag extends u2d {
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

    @Override // u2d
    public final void b() {
        s2d s2dVar;
        at atVar;
        try {
            aj ajVar = this.e;
            o2d o2dVar = (o2d) ajVar.a.n;
            Bundle bundle = this.a;
            atVar = ajVar.e;
            as a = atVar.a(this.b, this.c, ajVar.a);
            k2d k2dVar = (k2d) o2dVar;
            k2dVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(k2dVar.c);
            int i = z1d.a;
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(a);
            k2dVar.b(obtain, 3);
        } catch (RemoteException e) {
            aj ajVar2 = this.e;
            int i2 = this.d;
            s2dVar = ajVar2.b;
            s2dVar.a(e, "requestAndShowDialog(%s)", Integer.valueOf(i2));
            this.c.trySetException(new IntegrityServiceException(-100, e));
        }
    }
}
