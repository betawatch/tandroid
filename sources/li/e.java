package li;

import org.telegram.messenger.fs;
import org.telegram.messenger.mp;
import org.telegram.messenger.or;
import org.telegram.ui.ActionBar.t1;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements or {
    public final /* synthetic */ int a;
    public final /* synthetic */ t1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ fs e;

    public /* synthetic */ e(fs fsVar, t1 t1Var, long j3, boolean z10, int i7) {
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
                g gVar = (g) this.e;
                gVar.getClass();
                this.b.dismiss();
                if (j3 != 0) {
                    gVar.b = -j3;
                    gVar.c = gVar.getMessagesController().O0(Long.valueOf(j3));
                    gVar.b0(this.c, this.d);
                    break;
                }
                break;
            default:
                d0 d0Var = (d0) this.e;
                d0Var.getClass();
                this.b.dismiss();
                if (j3 != 0) {
                    d0Var.L0(mp.u1(d0Var.a).O0(Long.valueOf(j3)), this.c, this.d);
                    break;
                }
                break;
        }
    }
}
