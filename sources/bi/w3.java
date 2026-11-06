package bi;

import org.telegram.messenger.ls;
import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.hm0;
import org.telegram.ui.il0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w3 implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TL_stars.TL_starGiftUnique b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ls d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ w3(ls lsVar, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, Object obj2, int i7) {
        this.a = i7;
        this.d = lsVar;
        this.e = obj;
        this.b = tL_starGiftUnique;
        this.c = j3;
        this.f = obj2;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                k7 k7Var = (k7) this.d;
                vf.b bVar = (vf.b) this.e;
                zh.i0 i0Var = (zh.i0) this.f;
                bVar.b();
                if (((Boolean) obj).booleanValue()) {
                    l5 l5Var = k7Var.J2;
                    if (l5Var != null) {
                        l5Var.a(this.b, this.c, i0Var != null);
                    }
                    if (i0Var != null) {
                        org.telegram.messenger.g0.h3(new z3(i0Var, 0));
                        k7Var.N0 = true;
                    }
                    k7Var.dismiss();
                    break;
                }
                break;
            default:
                hm0.Z((hm0) this.d, (boolean[]) this.e, this.b, this.c, (il0) this.f, (h6) obj, (vf.b) obj2);
                break;
        }
    }
}
