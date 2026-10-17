package ai;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s4 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7 b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;

    public /* synthetic */ s4(k7 k7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.a = i10;
        this.b = k7Var;
        this.c = tL_starGiftUnique;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                k7.F0(this.b, this.c, (ag.a) obj, (Runnable) obj2);
                break;
            case 1:
                k7.q1(this.b, this.c, (Utilities.Callback) obj, (Boolean) obj2);
                break;
            default:
                k7.T0(this.b, this.c, (ag.a) obj, (Runnable) obj2);
                break;
        }
    }
}
