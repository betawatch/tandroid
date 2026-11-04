package ci;

import org.telegram.messenger.cs;
import org.telegram.messenger.n10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.cm0;
import org.telegram.ui.el0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i3 implements n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TL_stars.TL_starGiftUnique b;
    public final /* synthetic */ long c;
    public final /* synthetic */ cs d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ i3(cs csVar, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, Object obj2, int i3) {
        this.a = i3;
        this.d = csVar;
        this.e = obj;
        this.b = tL_starGiftUnique;
        this.c = j10;
        this.f = obj2;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                l6 l6Var = (l6) this.d;
                sf.b bVar = (sf.b) this.e;
                ai.i1 i1Var = (ai.i1) this.f;
                bVar.b();
                if (((Boolean) obj).booleanValue()) {
                    s4 s4Var = l6Var.K2;
                    if (s4Var != null) {
                        s4Var.a(this.b, this.c, i1Var != null);
                    }
                    if (i1Var != null) {
                        org.telegram.messenger.g0.h3(new ai.a1(i1Var, 3));
                        l6Var.O0 = true;
                    }
                    l6Var.dismiss();
                    break;
                }
                break;
            default:
                cm0.Z((cm0) this.d, (boolean[]) this.e, this.b, this.c, (el0) this.f, (l5) obj, (sf.b) obj2);
                break;
        }
    }
}
