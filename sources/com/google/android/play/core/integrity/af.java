package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import d9.b0;
import d9.g0;
import d9.h0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
final class af extends h0 {
    final /* synthetic */ byte[] a;
    final /* synthetic */ Long b;
    final /* synthetic */ Parcelable c;
    final /* synthetic */ TaskCompletionSource d;
    final /* synthetic */ IntegrityTokenRequest e;
    final /* synthetic */ aj f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(aj ajVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l10, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.a = bArr;
        this.b = l10;
        this.c = parcelable;
        this.d = taskCompletionSource2;
        this.e = integrityTokenRequest;
        this.f = ajVar;
    }

    @Override // d9.h0
    public final void a(Exception exc) {
        if (exc instanceof d9.d) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // d9.h0
    public final void b() {
        g0 g0Var;
        try {
            aj ajVar = this.f;
            b0 b0Var = (b0) ajVar.a.n;
            Bundle a10 = aj.a(ajVar, this.a, this.b, this.c);
            ai aiVar = new ai(this.f, this.d);
            d9.z zVar = (d9.z) b0Var;
            zVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(zVar.c);
            int i7 = d9.s.a;
            obtain.writeInt(1);
            a10.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(aiVar);
            zVar.I0(obtain, 2);
        } catch (RemoteException e10) {
            aj ajVar2 = this.f;
            IntegrityTokenRequest integrityTokenRequest = this.e;
            g0Var = ajVar2.b;
            g0Var.a(e10, "requestIntegrityToken(%s)", integrityTokenRequest);
            this.d.trySetException(new IntegrityServiceException(-100, e10));
        }
    }
}
