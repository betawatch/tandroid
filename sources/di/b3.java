package di;

import org.telegram.messenger.is;
import org.telegram.messenger.s10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.im0;
import org.telegram.ui.kl0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class b3 implements s10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TL_stars.TL_starGiftUnique b;
    public final /* synthetic */ long c;
    public final /* synthetic */ is d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b3(is isVar, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, Object obj2, int i7) {
        this.a = i7;
        this.d = isVar;
        this.e = obj;
        this.b = tL_starGiftUnique;
        this.c = j3;
        this.f = obj2;
    }

    @Override // org.telegram.messenger.s10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                c6 c6Var = (c6) this.d;
                vf.b bVar = (vf.b) this.e;
                bi.f1 f1Var = (bi.f1) this.f;
                bVar.b();
                if (((Boolean) obj).booleanValue()) {
                    j4 j4Var = c6Var.N2;
                    if (j4Var != null) {
                        j4Var.c(this.b, this.c, f1Var != null);
                    }
                    if (f1Var != null) {
                        org.telegram.messenger.g0.h3(new bi.y0(f1Var, 3));
                        c6Var.O0 = true;
                    }
                    c6Var.dismiss();
                    break;
                }
                break;
            default:
                im0.Z((im0) this.d, (boolean[]) this.e, this.b, this.c, (kl0) this.f, (c5) obj, (vf.b) obj2);
                break;
        }
    }
}
