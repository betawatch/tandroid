package g5;

import android.os.Handler;
import android.os.Message;
import f5.d0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class i implements Handler.Callback {
    public final Handler a;
    public final /* synthetic */ j b;

    public i(j jVar, a4.n nVar) {
        this.b = jVar;
        Handler k9 = d0.k(this);
        this.a = k9;
        nVar.a(this, k9);
    }

    public final void a(long j10) {
        j jVar = this.b;
        if (this != jVar.l1 || jVar.I == null) {
            return;
        }
        if (j10 == Long.MAX_VALUE) {
            jVar.x0 = true;
            return;
        }
        try {
            jVar.P(j10);
            jVar.X();
            jVar.z0.e++;
            jVar.W();
            jVar.z(j10);
        } catch (j3.n e10) {
            jVar.y0 = e10;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i10 = message.arg1;
        int i11 = message.arg2;
        int i12 = d0.a;
        a(((i10 & 4294967295L) << 32) | (4294967295L & i11));
        return true;
    }
}
