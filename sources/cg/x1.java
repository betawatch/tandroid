package cg;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.bn0;
import org.telegram.ui.Components.dn0;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.qv0;
import org.telegram.ui.zq;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x1 implements zk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x1(Object obj, int i10, org.telegram.ui.ActionBar.o2 o2Var, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = o2Var;
    }

    @Override // org.telegram.ui.Components.zk0
    public final void c(int i10, View view) {
        switch (this.a) {
            case 0:
                f2 f2Var = (f2) this.d;
                if (view instanceof qv0) {
                    qv0 qv0Var = (qv0) view;
                    PremiumPreviewFragment.q0(this.b, qv0Var.f.a);
                    f2Var.showDialog(new p1(this.c, qv0Var.f.a, false));
                    break;
                }
                break;
            default:
                en0 en0Var = (en0) this.d;
                ArrayList arrayList = en0Var.r;
                jh.e1 e1Var = en0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.b).isPremium()) {
                        new p1(this.c, 24, true).show();
                        break;
                    } else {
                        long j10 = ((bn0) arrayList.get(i10)).a.h;
                        if (en0Var.f(en0Var.h == j10 ? null : ((bn0) arrayList.get(i10)).a)) {
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
                            e1Var.M(new zq(3));
                            if (en0Var.h != j10) {
                                en0Var.h = j10;
                                ((dn0) view).a(true, true);
                                break;
                            } else {
                                en0Var.h = 0L;
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
