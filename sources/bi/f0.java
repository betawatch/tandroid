package bi;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 c;
    public final /* synthetic */ TL_stars.StarGift d;

    public /* synthetic */ f0(int i7, Context context, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.h6 h6Var) {
        this.a = i7;
        this.b = context;
        this.c = h6Var;
        this.d = starGift;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.h6 h6Var = this.c;
                m0.h1(this.b, this.d, h6Var);
                break;
            default:
                org.telegram.ui.ActionBar.h6 h6Var2 = this.c;
                m0.h1(this.b, this.d, h6Var2);
                break;
        }
    }
}
