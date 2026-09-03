package eg;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.kn0;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.nn0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.gw0;
import org.telegram.ui.hr;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w1 implements hl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w1(Object obj, int i10, org.telegram.ui.ActionBar.p2 p2Var, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = p2Var;
    }

    @Override // org.telegram.ui.Components.hl0
    public final void d(int i10, View view) {
        switch (this.a) {
            case 0:
                e2 e2Var = (e2) this.d;
                if (view instanceof gw0) {
                    gw0 gw0Var = (gw0) view;
                    PremiumPreviewFragment.q0(this.b, gw0Var.f.a);
                    e2Var.showDialog(new o1(this.c, gw0Var.f.a, false));
                    break;
                }
                break;
            default:
                nn0 nn0Var = (nn0) this.d;
                ArrayList arrayList = nn0Var.r;
                lh.e1 e1Var = nn0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.b).isPremium()) {
                        new o1(this.c, 24, true).show();
                        break;
                    } else {
                        long j10 = ((kn0) arrayList.get(i10)).a.h;
                        if (nn0Var.f(nn0Var.h == j10 ? null : ((kn0) arrayList.get(i10)).a)) {
                            int i11 = 0;
                            while (i11 < e1Var.getChildCount()) {
                                if (e1Var.getChildAt(i11) == view) {
                                    if (i11 <= 1) {
                                        e1Var.v0(-AndroidUtilities.dp(i11 == 0 ? 90.0f : 50.0f), 0, null);
                                    } else if (i11 >= e1Var.getChildCount() - 2) {
                                        e1Var.v0(AndroidUtilities.dp(i11 == e1Var.getChildCount() - 1 ? 80.0f : 50.0f), 0, null);
                                    }
                                }
                                i11++;
                            }
                            e1Var.M(new hr(3));
                            if (nn0Var.h != j10) {
                                nn0Var.h = j10;
                                ((mn0) view).a(true, true);
                                break;
                            } else {
                                nn0Var.h = 0L;
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
