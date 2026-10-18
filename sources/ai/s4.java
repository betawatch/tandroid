package ai;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
                k7.G0(this.b, this.c, (ag.a) obj, (Runnable) obj2);
                break;
            case 1:
                k7.r1(this.b, this.c, (Utilities.Callback) obj, (Boolean) obj2);
                break;
            default:
                k7.W0(this.b, this.c, (ag.a) obj, (Runnable) obj2);
                break;
        }
    }
}
