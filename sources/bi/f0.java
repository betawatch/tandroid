package bi;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 c;
    public final /* synthetic */ TL_stars.StarGift d;

    public /* synthetic */ f0(int i7, Context context, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.i6 i6Var) {
        this.a = i7;
        this.b = context;
        this.c = i6Var;
        this.d = starGift;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.i6 i6Var = this.c;
                m0.h1(this.b, this.d, i6Var);
                break;
            default:
                org.telegram.ui.ActionBar.i6 i6Var2 = this.c;
                m0.h1(this.b, this.d, i6Var2);
                break;
        }
    }
}
