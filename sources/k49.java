// default package

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class k49 extends n1a {
    public final /* synthetic */ m49 f2;
    public final /* synthetic */ d1a[] g2;
    public final /* synthetic */ n49 h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k49(n49 n49Var, n49 n49Var2, Activity activity, Integer num, m49 m49Var, d1a[] d1aVarArr) {
        super(n49Var2, activity, false, num, 2, null);
        this.h2 = n49Var;
        this.f2 = m49Var;
        this.g2 = d1aVarArr;
    }

    @Override // n1a
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i;
        if (l != null) {
            n49 n49Var = this.h2;
            i = ((e) n49Var).currentAccount;
            ls6.d0(i).c2("animated_" + l);
            this.f2.a(true);
            d1a d1aVar = this.g2[0];
            if (d1aVar != null) {
                n49Var.n = null;
                d1aVar.dismiss();
            }
        }
    }

    @Override // n1a
    public final void q(w0a w0aVar, w49 w49Var) {
        int i;
        n49 n49Var = this.h2;
        i = ((e) n49Var).currentAccount;
        ls6.d0(i).c2(w49Var.f);
        this.f2.a(true);
        d1a d1aVar = this.g2[0];
        if (d1aVar != null) {
            n49Var.n = null;
            d1aVar.dismiss();
        }
    }
}
