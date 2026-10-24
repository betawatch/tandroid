package ai;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t4 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l7 b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;

    public /* synthetic */ t4(l7 l7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.a = i10;
        this.b = l7Var;
        this.c = tL_starGiftUnique;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                l7.H0(this.b, this.c, (ag.a) obj, (Runnable) obj2);
                break;
            case 1:
                l7.s1(this.b, this.c, (Utilities.Callback) obj, (Boolean) obj2);
                break;
            default:
                l7.V0(this.b, this.c, (ag.a) obj, (Runnable) obj2);
                break;
        }
    }
}
