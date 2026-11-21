package bi;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
