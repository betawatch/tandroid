package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class v1 extends com.google.android.gms.common.api.internal.e {
    public final i6.c q;

    public v1(i6.c cVar, com.google.android.gms.common.api.internal.t0 t0Var) {
        super(i6.a.j, t0Var);
        this.q = cVar;
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final void n(com.google.android.gms.common.api.c cVar) {
        i6.c cVar2 = this.q;
        z1 z1Var = (z1) cVar;
        y1 y1Var = new y1(this);
        try {
            cVar2.getClass();
            w1 w1Var = cVar2.r;
            int c10 = w1Var.c();
            byte[] bArr = new byte[c10];
            n1.b(w1Var, bArr, c10);
            cVar2.b = bArr;
            a2 a2Var = (a2) z1Var.u();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
            int i10 = s.a;
            obtain.writeStrongBinder(y1Var);
            obtain.writeInt(1);
            cVar2.writeToParcel(obtain, 0);
            try {
                a2Var.a.transact(1, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        } catch (RuntimeException e7) {
            Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.MessageProducer ", e7);
            o(new Status(10, "MessageProducer", null, null));
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.q d(Status status) {
        return status;
    }
}
