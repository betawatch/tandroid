package fg;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.ln0;
import org.telegram.ui.Components.nn0;
import org.telegram.ui.Components.on0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.gr;
import org.telegram.ui.gw0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v1 implements il0 {
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

    @Override // org.telegram.ui.Components.il0
    public final void f(int i10, View view) {
        switch (this.a) {
            case 0:
                d2 d2Var = (d2) this.d;
                if (view instanceof gw0) {
                    gw0 gw0Var = (gw0) view;
                    PremiumPreviewFragment.q0(this.b, gw0Var.f.a);
                    d2Var.showDialog(new n1(this.c, gw0Var.f.a, false));
                    break;
                }
                break;
            default:
                on0 on0Var = (on0) this.d;
                ArrayList arrayList = on0Var.r;
                mh.d1 d1Var = on0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.b).isPremium()) {
                        new n1(this.c, 24, true).show();
                        break;
                    } else {
                        long j10 = ((ln0) arrayList.get(i10)).a.h;
                        if (on0Var.f(on0Var.h == j10 ? null : ((ln0) arrayList.get(i10)).a)) {
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
                            if (on0Var.h != j10) {
                                on0Var.h = j10;
                                ((nn0) view).a(true, true);
                                break;
                            } else {
                                on0Var.h = 0L;
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
