package li;

import org.telegram.messenger.fs;
import org.telegram.messenger.mp;
import org.telegram.messenger.or;
import org.telegram.ui.ActionBar.t1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements or {
    public final /* synthetic */ int a;
    public final /* synthetic */ t1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ fs e;

    public /* synthetic */ d(fs fsVar, t1 t1Var, long j3, boolean z10, int i7) {
        this.a = i7;
        this.e = fsVar;
        this.b = t1Var;
        this.c = j3;
        this.d = z10;
    }

    @Override // org.telegram.messenger.or
    public final void run(long j3) {
        switch (this.a) {
            case 0:
                f fVar = (f) this.e;
                fVar.getClass();
                this.b.dismiss();
                if (j3 != 0) {
                    fVar.b = -j3;
                    fVar.c = fVar.getMessagesController().O0(Long.valueOf(j3));
                    fVar.b0(this.c, this.d);
                    break;
                }
                break;
            default:
                c0 c0Var = (c0) this.e;
                c0Var.getClass();
                this.b.dismiss();
                if (j3 != 0) {
                    c0Var.L0(mp.u1(c0Var.a).O0(Long.valueOf(j3)), this.c, this.d);
                    break;
                }
                break;
        }
    }
}
