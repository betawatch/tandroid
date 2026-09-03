package lh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ g6 c;
    public final /* synthetic */ TL_stars.StarGift d;

    public /* synthetic */ y(Context context, g6 g6Var, TL_stars.StarGift starGift, int i10) {
        this.a = i10;
        this.b = context;
        this.c = g6Var;
        this.d = starGift;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g6 g6Var = this.c;
                f0.U(this.b, this.d, g6Var);
                break;
            default:
                g6 g6Var2 = this.c;
                f0.U(this.b, this.d, g6Var2);
                break;
        }
    }
}
