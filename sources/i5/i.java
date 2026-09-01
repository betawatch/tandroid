package i5;

import android.os.Handler;
import android.os.Message;
import h5.d0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class i implements Handler.Callback {
    public final Handler a;
    public final /* synthetic */ j b;

    public i(j jVar, d4.k kVar) {
        this.b = jVar;
        Handler l10 = d0.l(this);
        this.a = l10;
        kVar.e(this, l10);
    }

    public final void a(long j10) {
        j jVar = this.b;
        if (this != jVar.x1 || jVar.V == null) {
            return;
        }
        if (j10 == Long.MAX_VALUE) {
            jVar.K0 = true;
            return;
        }
        try {
            jVar.p0(j10);
            jVar.x0(jVar.t1);
            jVar.M0.e++;
            jVar.w0();
            jVar.X(j10);
        } catch (j3.n e6) {
            jVar.L0 = e6;
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
