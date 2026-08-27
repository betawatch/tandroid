package gh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 c;
    public final /* synthetic */ TL_stars.StarGift d;

    public /* synthetic */ b0(Context context, org.telegram.ui.ActionBar.c6 c6Var, TL_stars.StarGift starGift, int i10) {
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
                i0.U(this.b, this.d, c6Var);
                break;
            default:
                org.telegram.ui.ActionBar.c6 c6Var2 = this.c;
                i0.U(this.b, this.d, c6Var2);
                break;
        }
    }
}
