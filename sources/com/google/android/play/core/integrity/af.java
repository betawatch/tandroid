package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class af extends u2d {
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

    @Override // u2d
    public final void a(Exception exc) {
        if (exc instanceof j1d) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // u2d
    public final void b() {
        s2d s2dVar;
        try {
            aj ajVar = this.f;
            o2d o2dVar = (o2d) ajVar.a.n;
            Bundle a = aj.a(ajVar, this.a, this.b, this.c);
            ai aiVar = new ai(this.f, this.d);
            k2d k2dVar = (k2d) o2dVar;
            k2dVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(k2dVar.c);
            int i = z1d.a;
            obtain.writeInt(1);
            a.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(aiVar);
            k2dVar.b(obtain, 2);
        } catch (RemoteException e) {
            aj ajVar2 = this.f;
            IntegrityTokenRequest integrityTokenRequest = this.e;
            s2dVar = ajVar2.b;
            s2dVar.a(e, "requestIntegrityToken(%s)", integrityTokenRequest);
            this.d.trySetException(new IntegrityServiceException(-100, e));
        }
    }
}
