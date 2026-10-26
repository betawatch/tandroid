package dc;

import a8.h0;
import a8.jg;
import a8.ng;
import a8.ob;
import a8.oe;
import a8.qb;
import android.os.SystemClock;
import m.r3;
import ui.i;
import ui.o;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements jg {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(f fVar, qb qbVar, long j10) {
        this.b = fVar;
        this.c = qbVar;
        this.a = j10;
    }

    @Override // a8.jg
    public ng zza() {
        f fVar = (f) this.b;
        qb qbVar = (qb) this.c;
        r3 r3Var = new r3();
        r3Var.c = ob.b;
        h0 h0Var = new h0(4, false);
        h0Var.d = fVar.e.a();
        h0Var.b = qbVar;
        h0Var.c = Long.valueOf((SystemClock.elapsedRealtime() - this.a) & Long.MAX_VALUE);
        r3Var.e = new oe(h0Var);
        return new ng(r3Var, 0);
    }

    public e(long j10, i iVar, o oVar) {
        this.c = oVar;
        this.a = j10;
        this.b = iVar;
    }
}
