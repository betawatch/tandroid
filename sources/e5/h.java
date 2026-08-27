package e5;

import android.os.Handler;
import android.os.Message;
import d5.g0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class h implements Handler.Callback {
    public final Handler a;
    public final /* synthetic */ i b;

    public h(i iVar, y3.k kVar) {
        this.b = iVar;
        Handler k10 = g0.k(this);
        this.a = k10;
        kVar.h(this, k10);
    }

    public final void a(long j10) {
        i iVar = this.b;
        if (this != iVar.l1 || iVar.I == null) {
            return;
        }
        if (j10 == Long.MAX_VALUE) {
            iVar.x0 = true;
            return;
        }
        try {
            iVar.P(j10);
            iVar.X();
            iVar.z0.e++;
            iVar.W();
            iVar.z(j10);
        } catch (h3.n e9) {
            iVar.y0 = e9;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i10 = message.arg1;
        int i11 = message.arg2;
        int i12 = g0.a;
        a(((i10 & 4294967295L) << 32) | (4294967295L & i11));
        return true;
    }
}
