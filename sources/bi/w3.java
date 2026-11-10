package bi;

import org.telegram.messenger.ls;
import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.km0;
import org.telegram.ui.ll0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                zh.h0 h0Var = (zh.h0) this.f;
                bVar.b();
                if (((Boolean) obj).booleanValue()) {
                    l5 l5Var = k7Var.M2;
                    if (l5Var != null) {
                        l5Var.a(this.b, this.c, h0Var != null);
                    }
                    if (h0Var != null) {
                        org.telegram.messenger.g0.h3(new z3(h0Var, 0));
                        k7Var.N0 = true;
                    }
                    k7Var.dismiss();
                    break;
                }
                break;
            default:
                km0.Z((km0) this.d, (boolean[]) this.e, this.b, this.c, (ll0) this.f, (h6) obj, (vf.b) obj2);
                break;
        }
    }
}
