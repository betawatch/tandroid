package lh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d3 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g5 b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;

    public /* synthetic */ d3(g5 g5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.a = i10;
        this.b = g5Var;
        this.c = tL_starGiftUnique;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                g5.i0(this.b, this.c, (mf.a) obj, (Runnable) obj2);
                break;
            case 1:
                g5.g0(this.b, this.c, (Utilities.Callback) obj, (Boolean) obj2);
                break;
            default:
                g5.O0(this.b, this.c, (mf.a) obj, (Runnable) obj2);
                break;
        }
    }
}
