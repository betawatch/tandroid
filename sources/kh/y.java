package kh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 c;
    public final /* synthetic */ TL_stars.StarGift d;

    public /* synthetic */ y(Context context, org.telegram.ui.ActionBar.f6 f6Var, TL_stars.StarGift starGift, int i10) {
        this.a = i10;
        this.b = context;
        this.c = f6Var;
        this.d = starGift;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.f6 f6Var = this.c;
                f0.U(this.b, this.d, f6Var);
                break;
            default:
                org.telegram.ui.ActionBar.f6 f6Var2 = this.c;
                f0.U(this.b, this.d, f6Var2);
                break;
        }
    }
}
