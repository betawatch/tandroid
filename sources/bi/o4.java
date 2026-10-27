package bi;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o4 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h7 b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;

    public /* synthetic */ o4(h7 h7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.a = i10;
        this.b = h7Var;
        this.c = tL_starGiftUnique;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                h7.H0(this.b, this.c, (bg.a) obj, (Runnable) obj2);
                break;
            case 1:
                h7.s1(this.b, this.c, (Utilities.Callback) obj, (Boolean) obj2);
                break;
            default:
                h7.V0(this.b, this.c, (bg.a) obj, (Runnable) obj2);
                break;
        }
    }
}
