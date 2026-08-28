package e5;

import android.os.Handler;
import android.os.Message;
import d5.f0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i implements Handler.Callback {
    public final Handler a;
    public final /* synthetic */ j b;

    public i(j jVar, y3.k kVar) {
        this.b = jVar;
        Handler k10 = f0.k(this);
        this.a = k10;
        kVar.h(this, k10);
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
        } catch (h3.n e10) {
            jVar.y0 = e10;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i9 = message.arg1;
        int i10 = message.arg2;
        int i11 = f0.a;
        a(((i9 & 4294967295L) << 32) | (4294967295L & i10));
        return true;
    }
}
