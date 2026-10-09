package a3;

import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class m implements Handler.Callback {
    public final Handler a;
    public final /* synthetic */ n b;

    public m(n nVar, r2.m mVar) {
        this.b = nVar;
        Handler o9 = e2.d0.o(this);
        this.a = o9;
        mVar.d(this, o9);
    }

    public final void a(long j3) {
        n nVar = this.b;
        if (this != nVar.G1 || nVar.b0 == null) {
            return;
        }
        if (j3 == Long.MAX_VALUE) {
            nVar.L0 = true;
            return;
        }
        try {
            nVar.H0(j3);
        } catch (i2.n e7) {
            nVar.M0 = e7;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i10 = message.arg1;
        int i11 = message.arg2;
        String str = e2.d0.a;
        a(((i10 & 4294967295L) << 32) | (4294967295L & i11));
        return true;
    }
}
