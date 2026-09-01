package lh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
