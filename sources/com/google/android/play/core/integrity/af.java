package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import b9.a0;
import b9.c0;
import b9.h0;
import b9.i0;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
final class af extends i0 {
    final /* synthetic */ byte[] a;
    final /* synthetic */ Long b;
    final /* synthetic */ Parcelable c;
    final /* synthetic */ TaskCompletionSource d;
    final /* synthetic */ IntegrityTokenRequest e;
    final /* synthetic */ aj f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(aj ajVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l4, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.a = bArr;
        this.b = l4;
        this.c = parcelable;
        this.d = taskCompletionSource2;
        this.e = integrityTokenRequest;
        this.f = ajVar;
    }

    @Override // b9.i0
    public final void a(Exception exc) {
        if (exc instanceof b9.e) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // b9.i0
    public final void b() {
        h0 h0Var;
        try {
            aj ajVar = this.f;
            c0 c0Var = (c0) ajVar.a.n;
            Bundle a2 = aj.a(ajVar, this.a, this.b, this.c);
            ai aiVar = new ai(this.f, this.d);
            a0 a0Var = (a0) c0Var;
            a0Var.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(a0Var.c);
            int i10 = b9.t.a;
            obtain.writeInt(1);
            a2.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(aiVar);
            a0Var.G0(obtain, 2);
        } catch (RemoteException e) {
            aj ajVar2 = this.f;
            IntegrityTokenRequest integrityTokenRequest = this.e;
            h0Var = ajVar2.b;
            h0Var.a(e, "requestIntegrityToken(%s)", integrityTokenRequest);
            this.d.trySetException(new IntegrityServiceException(-100, e));
        }
    }
}
