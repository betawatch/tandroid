package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import d9.g0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
final class bh extends bm {
    final /* synthetic */ Bundle a;
    final /* synthetic */ Activity b;
    final /* synthetic */ TaskCompletionSource c;
    final /* synthetic */ int d;
    final /* synthetic */ bn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(bn bnVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i7) {
        super(bnVar, taskCompletionSource);
        this.a = bundle;
        this.b = activity;
        this.c = taskCompletionSource2;
        this.d = i7;
        this.e = bnVar;
    }

    @Override // d9.h0
    public final void b() {
        g0 g0Var;
        at atVar;
        if (bn.l(this.e)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.e;
            d9.c cVar = bnVar.a;
            d9.w wVar = (d9.w) cVar.n;
            Bundle bundle = this.a;
            atVar = bnVar.e;
            as a10 = atVar.a(this.b, this.c, cVar);
            d9.u uVar = (d9.u) wVar;
            uVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(uVar.c);
            int i7 = d9.s.a;
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(a10);
            uVar.i1(obtain, 6);
        } catch (RemoteException e10) {
            bn bnVar2 = this.e;
            int i10 = this.d;
            g0Var = bnVar2.b;
            g0Var.a(e10, "requestAndShowDialog(%s)", Integer.valueOf(i10));
            this.c.trySetException(new StandardIntegrityException(-100, e10));
        }
    }
}
