package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import o8.a0;
import o8.f0;
import o8.g0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
final class af extends g0 {
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

    @Override // o8.g0
    public final void a(Exception exc) {
        if (exc instanceof o8.d) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // o8.g0
    public final void b() {
        f0 f0Var;
        try {
            aj ajVar = this.f;
            a0 a0Var = (a0) ajVar.a.n;
            Bundle a2 = aj.a(ajVar, this.a, this.b, this.c);
            ai aiVar = new ai(this.f, this.d);
            o8.y yVar = (o8.y) a0Var;
            yVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(yVar.c);
            int i10 = o8.r.a;
            obtain.writeInt(1);
            a2.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(aiVar);
            yVar.F0(obtain, 2);
        } catch (RemoteException e6) {
            aj ajVar2 = this.f;
            IntegrityTokenRequest integrityTokenRequest = this.e;
            f0Var = ajVar2.b;
            f0Var.a(e6, "requestIntegrityToken(%s)", integrityTokenRequest);
            this.d.trySetException(new IntegrityServiceException(-100, e6));
        }
    }
}
