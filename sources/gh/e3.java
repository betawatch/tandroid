package gh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class e3 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k5 b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;

    public /* synthetic */ e3(k5 k5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i9) {
        this.a = i9;
        this.b = k5Var;
        this.c = tL_starGiftUnique;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                k5.h0(this.b, this.c, (gf.a) obj, (Runnable) obj2);
                break;
            case 1:
                k5.f0(this.b, this.c, (Utilities.Callback) obj, (Boolean) obj2);
                break;
            default:
                k5.O0(this.b, this.c, (gf.a) obj, (Runnable) obj2);
                break;
        }
    }
}
