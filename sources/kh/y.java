package kh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ f6 c;
    public final /* synthetic */ TL_stars.StarGift d;

    public /* synthetic */ y(Context context, f6 f6Var, TL_stars.StarGift starGift, int i10) {
        this.a = i10;
        this.b = context;
        this.c = f6Var;
        this.d = starGift;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f6 f6Var = this.c;
                f0.U(this.b, this.d, f6Var);
                break;
            default:
                f6 f6Var2 = this.c;
                f0.U(this.b, this.d, f6Var2);
                break;
        }
    }
}
