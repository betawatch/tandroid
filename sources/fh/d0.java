package fh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 c;
    public final /* synthetic */ TL_stars.StarGift d;

    public /* synthetic */ d0(Context context, org.telegram.ui.ActionBar.b6 b6Var, TL_stars.StarGift starGift, int i9) {
        this.a = i9;
        this.b = context;
        this.c = b6Var;
        this.d = starGift;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.b6 b6Var = this.c;
                k0.T(this.b, this.d, b6Var);
                break;
            default:
                org.telegram.ui.ActionBar.b6 b6Var2 = this.c;
                k0.T(this.b, this.d, b6Var2);
                break;
        }
    }
}
