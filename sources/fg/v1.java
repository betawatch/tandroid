package fg;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.on0;
import org.telegram.ui.Components.pn0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.bw0;
import org.telegram.ui.gr;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v1 implements jl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v1(Object obj, int i10, org.telegram.ui.ActionBar.p2 p2Var, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = p2Var;
    }

    @Override // org.telegram.ui.Components.jl0
    public final void f(int i10, View view) {
        switch (this.a) {
            case 0:
                d2 d2Var = (d2) this.d;
                if (view instanceof bw0) {
                    bw0 bw0Var = (bw0) view;
                    PremiumPreviewFragment.q0(this.b, bw0Var.f.a);
                    d2Var.showDialog(new n1(this.c, bw0Var.f.a, false));
                    break;
                }
                break;
            default:
                pn0 pn0Var = (pn0) this.d;
                ArrayList arrayList = pn0Var.r;
                mh.d1 d1Var = pn0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.b).isPremium()) {
                        new n1(this.c, 24, true).show();
                        break;
                    } else {
                        long j10 = ((mn0) arrayList.get(i10)).a.h;
                        if (pn0Var.f(pn0Var.h == j10 ? null : ((mn0) arrayList.get(i10)).a)) {
                            int i11 = 0;
                            while (i11 < d1Var.getChildCount()) {
                                if (d1Var.getChildAt(i11) == view) {
                                    if (i11 <= 1) {
                                        d1Var.v0(-AndroidUtilities.dp(i11 == 0 ? 90.0f : 50.0f), 0, null);
                                    } else if (i11 >= d1Var.getChildCount() - 2) {
                                        d1Var.v0(AndroidUtilities.dp(i11 == d1Var.getChildCount() - 1 ? 80.0f : 50.0f), 0, null);
                                    }
                                }
                                i11++;
                            }
                            d1Var.M(new gr(3));
                            if (pn0Var.h != j10) {
                                pn0Var.h = j10;
                                ((on0) view).a(true, true);
                                break;
                            } else {
                                pn0Var.h = 0L;
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
