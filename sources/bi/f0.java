package bi;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 c;
    public final /* synthetic */ TL_stars.StarGift d;

    public /* synthetic */ f0(Context context, org.telegram.ui.ActionBar.e6 e6Var, TL_stars.StarGift starGift, int i7) {
        this.a = i7;
        this.b = context;
        this.c = e6Var;
        this.d = starGift;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.e6 e6Var = this.c;
                m0.g1(this.b, this.d, e6Var);
                break;
            default:
                org.telegram.ui.ActionBar.e6 e6Var2 = this.c;
                m0.g1(this.b, this.d, e6Var2);
                break;
        }
    }
}
