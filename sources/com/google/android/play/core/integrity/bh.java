package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import b9.h0;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
final class bh extends bm {
    final /* synthetic */ Bundle a;
    final /* synthetic */ Activity b;
    final /* synthetic */ TaskCompletionSource c;
    final /* synthetic */ int d;
    final /* synthetic */ bn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(bn bnVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i10) {
        super(bnVar, taskCompletionSource);
        this.a = bundle;
        this.b = activity;
        this.c = taskCompletionSource2;
        this.d = i10;
        this.e = bnVar;
    }

    @Override // b9.i0
    public final void b() {
        h0 h0Var;
        at atVar;
        if (bn.l(this.e)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.e;
            b9.d dVar = bnVar.a;
            b9.x xVar = (b9.x) dVar.n;
            Bundle bundle = this.a;
            atVar = bnVar.e;
            as a2 = atVar.a(this.b, this.c, dVar);
            b9.v vVar = (b9.v) xVar;
            vVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(vVar.c);
            int i10 = b9.t.a;
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(a2);
            vVar.G0(obtain, 6);
        } catch (RemoteException e) {
            bn bnVar2 = this.e;
            int i11 = this.d;
            h0Var = bnVar2.b;
            h0Var.a(e, "requestAndShowDialog(%s)", Integer.valueOf(i11));
            this.c.trySetException(new StandardIntegrityException(-100, e));
        }
    }
}
