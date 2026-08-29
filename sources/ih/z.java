package ih;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 c;
    public final /* synthetic */ TL_stars.StarGift d;

    public /* synthetic */ z(Context context, org.telegram.ui.ActionBar.c6 c6Var, TL_stars.StarGift starGift, int i10) {
        this.a = i10;
        this.b = context;
        this.c = c6Var;
        this.d = starGift;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.c6 c6Var = this.c;
                g0.U(this.b, this.d, c6Var);
                break;
            default:
                org.telegram.ui.ActionBar.c6 c6Var2 = this.c;
                g0.U(this.b, this.d, c6Var2);
                break;
        }
    }
}
