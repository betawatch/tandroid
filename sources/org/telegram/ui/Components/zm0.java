package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class zm0 implements zk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zm0(Object obj, int i10, org.telegram.ui.ActionBar.n2 n2Var, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = n2Var;
    }

    @Override // org.telegram.ui.Components.zk0
    public final void a(int i10, View view) {
        switch (this.a) {
            case 0:
                hn0 hn0Var = (hn0) this.d;
                ArrayList arrayList = hn0Var.r;
                bi.o0 o0Var = hn0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.b).isPremium()) {
                        new sg.a1(this.c, 24, true).show();
                        break;
                    } else {
                        long j3 = ((en0) arrayList.get(i10)).a.h;
                        if (hn0Var.f(hn0Var.h == j3 ? null : ((en0) arrayList.get(i10)).a)) {
                            int i11 = 0;
                            while (i11 < o0Var.getChildCount()) {
                                if (o0Var.getChildAt(i11) == view) {
                                    if (i11 <= 1) {
                                        o0Var.v0(-AndroidUtilities.dp(i11 == 0 ? 90.0f : 50.0f), 0, null);
                                    } else if (i11 >= o0Var.getChildCount() - 2) {
                                        o0Var.v0(AndroidUtilities.dp(i11 == o0Var.getChildCount() - 1 ? 80.0f : 50.0f), 0, null);
                                    }
                                }
                                i11++;
                            }
                            o0Var.M(new org.telegram.ui.lr(3));
                            if (hn0Var.h != j3) {
                                hn0Var.h = j3;
                                ((gn0) view).a(true, true);
                                break;
                            } else {
                                hn0Var.h = 0L;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                sg.o1 o1Var = (sg.o1) this.d;
                if (view instanceof org.telegram.ui.uw0) {
                    org.telegram.ui.uw0 uw0Var = (org.telegram.ui.uw0) view;
                    PremiumPreviewFragment.q0(this.b, uw0Var.f.a);
                    o1Var.showDialog(new sg.a1(this.c, uw0Var.f.a, false));
                    break;
                }
                break;
        }
    }
}
