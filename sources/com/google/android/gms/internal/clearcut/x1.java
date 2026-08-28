package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class x1 extends com.google.android.gms.common.api.internal.e {
    public final s5.c q;

    public x1(s5.c cVar, com.google.android.gms.common.api.internal.t0 t0Var) {
        super(s5.a.j, t0Var);
        this.q = cVar;
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final void n(com.google.android.gms.common.api.c cVar) {
        s5.c cVar2 = this.q;
        b2 b2Var = (b2) cVar;
        a2 a2Var = new a2(this);
        try {
            cVar2.getClass();
            y1 y1Var = cVar2.r;
            int c10 = y1Var.c();
            byte[] bArr = new byte[c10];
            p1.a(y1Var, bArr, c10);
            cVar2.b = bArr;
            c2 c2Var = (c2) b2Var.u();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
            int i9 = t.a;
            obtain.writeStrongBinder(a2Var);
            obtain.writeInt(1);
            cVar2.writeToParcel(obtain, 0);
            try {
                c2Var.a.transact(1, obtain, null, 1);
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
