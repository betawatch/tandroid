package ai;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 c;
    public final /* synthetic */ TL_stars.StarGift d;

    public /* synthetic */ l0(Context context, org.telegram.ui.ActionBar.e6 e6Var, TL_stars.StarGift starGift, int i3) {
        this.a = i3;
        this.b = context;
        this.c = e6Var;
        this.d = starGift;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.e6 e6Var = this.c;
                s0.g1(this.b, this.d, e6Var);
                break;
            default:
                org.telegram.ui.ActionBar.e6 e6Var2 = this.c;
                s0.g1(this.b, this.d, e6Var2);
                break;
        }
    }
}
