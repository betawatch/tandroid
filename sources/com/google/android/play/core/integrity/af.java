package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class af extends j5d {
    final /* synthetic */ byte[] a;
    final /* synthetic */ Long b;
    final /* synthetic */ Parcelable c;
    final /* synthetic */ TaskCompletionSource d;
    final /* synthetic */ IntegrityTokenRequest e;
    final /* synthetic */ aj f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(aj ajVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.a = bArr;
        this.b = l;
        this.c = parcelable;
        this.d = taskCompletionSource2;
        this.e = integrityTokenRequest;
        this.f = ajVar;
    }

    @Override // j5d
    public final void a(Exception exc) {
        if (exc instanceof z3d) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // j5d
    public final void b() {
        h5d h5dVar;
        try {
            aj ajVar = this.f;
            d5d d5dVar = (d5d) ajVar.a.n;
            Bundle a = aj.a(ajVar, this.a, this.b, this.c);
            ai aiVar = new ai(this.f, this.d);
            z4d z4dVar = (z4d) d5dVar;
            z4dVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(z4dVar.c);
            int i = p4d.a;
            obtain.writeInt(1);
            a.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(aiVar);
            z4dVar.b(obtain, 2);
        } catch (RemoteException e) {
            aj ajVar2 = this.f;
            IntegrityTokenRequest integrityTokenRequest = this.e;
            h5dVar = ajVar2.b;
            h5dVar.a(e, "requestIntegrityToken(%s)", integrityTokenRequest);
            this.d.trySetException(new IntegrityServiceException(-100, e));
        }
    }
}
