package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class w1 extends com.google.android.gms.common.api.internal.e {
    public final i6.c q;

    public w1(i6.c cVar, com.google.android.gms.common.api.internal.t0 t0Var) {
        super(i6.a.j, t0Var);
        this.q = cVar;
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final void n(com.google.android.gms.common.api.c cVar) {
        i6.c cVar2 = this.q;
        a2 a2Var = (a2) cVar;
        z1 z1Var = new z1(this);
        try {
            cVar2.getClass();
            x1 x1Var = cVar2.r;
            int c10 = x1Var.c();
            byte[] bArr = new byte[c10];
            o1.b(x1Var, bArr, c10);
            cVar2.b = bArr;
            b2 b2Var = (b2) a2Var.u();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
            int i10 = t.a;
            obtain.writeStrongBinder(z1Var);
            obtain.writeInt(1);
            cVar2.writeToParcel(obtain, 0);
            try {
                b2Var.a.transact(1, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        } catch (RuntimeException e) {
            Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.MessageProducer ", e);
            o(new Status(10, "MessageProducer", null, null));
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.q d(Status status) {
        return status;
    }
}
