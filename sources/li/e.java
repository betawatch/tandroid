package li;

import org.telegram.messenger.fs;
import org.telegram.messenger.mp;
import org.telegram.messenger.or;
import org.telegram.ui.ActionBar.u1;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements or {
    public final /* synthetic */ int a;
    public final /* synthetic */ u1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ fs e;

    public /* synthetic */ e(fs fsVar, u1 u1Var, long j3, boolean z10, int i7) {
        this.a = i7;
        this.e = fsVar;
        this.b = u1Var;
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
