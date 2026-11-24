package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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

    @Override // s0d
    public final void b() {
        q0d q0dVar;
        at atVar;
        if (bn.l(this.e)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.e;
            hzc hzcVar = bnVar.a;
            e0d e0dVar = (e0d) hzcVar.n;
            Bundle bundle = this.a;
            atVar = bnVar.e;
            as a = atVar.a(this.b, this.c, hzcVar);
            c0d c0dVar = (c0d) e0dVar;
            c0dVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(c0dVar.c);
            int i = yzc.a;
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(a);
            c0dVar.b(obtain, 6);
        } catch (RemoteException e) {
            bn bnVar2 = this.e;
            int i2 = this.d;
            q0dVar = bnVar2.b;
            q0dVar.a(e, "requestAndShowDialog(%s)", Integer.valueOf(i2));
            this.c.trySetException(new StandardIntegrityException(-100, e));
        }
    }
}
