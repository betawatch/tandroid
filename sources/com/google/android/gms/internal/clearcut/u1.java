package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class u1 extends com.google.android.gms.common.api.internal.d {
    public final k6.c q;

    public u1(k6.c cVar, com.google.android.gms.common.api.internal.n0 n0Var) {
        super(k6.a.j, n0Var);
        this.q = cVar;
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final void n(com.google.android.gms.common.api.c cVar) {
        k6.c cVar2 = this.q;
        y1 y1Var = (y1) cVar;
        x1 x1Var = new x1(this);
        try {
            cVar2.getClass();
            v1 v1Var = cVar2.r;
            int c2 = v1Var.c();
            byte[] bArr = new byte[c2];
            m1.b(v1Var, bArr, c2);
            cVar2.b = bArr;
            z1 z1Var = (z1) y1Var.m();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
            int i3 = t.a;
            obtain.writeStrongBinder(x1Var);
            obtain.writeInt(1);
            cVar2.writeToParcel(obtain, 0);
            try {
                z1Var.a.transact(1, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        } catch (RuntimeException e10) {
            Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.MessageProducer ", e10);
            o(new Status(10, "MessageProducer", null, null));
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.q d(Status status) {
        return status;
    }
}
