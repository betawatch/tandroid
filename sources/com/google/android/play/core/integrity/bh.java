package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
final class bh extends bm {
    final /* synthetic */ Bundle a;
    final /* synthetic */ Activity b;
    final /* synthetic */ TaskCompletionSource c;
    final /* synthetic */ int d;
    final /* synthetic */ bn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(bn bnVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i) {
        super(bnVar, taskCompletionSource);
        this.a = bundle;
        this.b = activity;
        this.c = taskCompletionSource2;
        this.d = i;
        this.e = bnVar;
    }

    @Override // j5d
    public final void b() {
        h5d h5dVar;
        at atVar;
        if (bn.l(this.e)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.e;
            y3d y3dVar = bnVar.a;
            v4d v4dVar = (v4d) y3dVar.n;
            Bundle bundle = this.a;
            atVar = bnVar.e;
            as a = atVar.a(this.b, this.c, y3dVar);
            t4d t4dVar = (t4d) v4dVar;
            t4dVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(t4dVar.c);
            int i = p4d.a;
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(a);
            t4dVar.b(obtain, 6);
        } catch (RemoteException e) {
            bn bnVar2 = this.e;
            int i2 = this.d;
            h5dVar = bnVar2.b;
            h5dVar.a(e, "requestAndShowDialog(%s)", Integer.valueOf(i2));
            this.c.trySetException(new StandardIntegrityException(-100, e));
        }
    }
}
