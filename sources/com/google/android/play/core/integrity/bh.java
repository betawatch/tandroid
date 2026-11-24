package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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

    @Override // u2d
    public final void b() {
        s2d s2dVar;
        at atVar;
        if (bn.l(this.e)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.e;
            i1d i1dVar = bnVar.a;
            f2d f2dVar = (f2d) i1dVar.n;
            Bundle bundle = this.a;
            atVar = bnVar.e;
            as a = atVar.a(this.b, this.c, i1dVar);
            d2d d2dVar = (d2d) f2dVar;
            d2dVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(d2dVar.c);
            int i = z1d.a;
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(a);
            d2dVar.b(obtain, 6);
        } catch (RemoteException e) {
            bn bnVar2 = this.e;
            int i2 = this.d;
            s2dVar = bnVar2.b;
            s2dVar.a(e, "requestAndShowDialog(%s)", Integer.valueOf(i2));
            this.c.trySetException(new StandardIntegrityException(-100, e));
        }
    }
}
