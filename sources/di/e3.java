package di;

import org.telegram.messenger.fs;
import org.telegram.messenger.q10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.lm0;
import org.telegram.ui.nl0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class e3 implements q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TL_stars.TL_starGiftUnique b;
    public final /* synthetic */ long c;
    public final /* synthetic */ fs d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ e3(fs fsVar, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, Object obj2, int i7) {
        this.a = i7;
        this.d = fsVar;
        this.e = obj;
        this.b = tL_starGiftUnique;
        this.c = j3;
        this.f = obj2;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                f6 f6Var = (f6) this.d;
                vf.b bVar = (vf.b) this.e;
                bi.g1 g1Var = (bi.g1) this.f;
                bVar.b();
                if (((Boolean) obj).booleanValue()) {
                    m4 m4Var = f6Var.N2;
                    if (m4Var != null) {
                        m4Var.a(this.b, this.c, g1Var != null);
                    }
                    if (g1Var != null) {
                        org.telegram.messenger.g0.g3(new bi.y0(g1Var, 3));
                        f6Var.O0 = true;
                    }
                    f6Var.dismiss();
                    break;
                }
                break;
            default:
                lm0.Z((lm0) this.d, (boolean[]) this.e, this.b, this.c, (nl0) this.f, (f5) obj, (vf.b) obj2);
                break;
        }
    }
}
