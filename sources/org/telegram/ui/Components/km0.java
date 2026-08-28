package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class km0 implements mk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ km0(Object obj, int i9, org.telegram.ui.ActionBar.o2 o2Var, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = i9;
        this.c = o2Var;
    }

    @Override // org.telegram.ui.Components.mk0
    public final void a(int i9, View view) {
        switch (this.a) {
            case 0:
                sm0 sm0Var = (sm0) this.d;
                ArrayList arrayList = sm0Var.r;
                gh.f1 f1Var = sm0Var.d;
                if (i9 >= 0 && i9 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.b).isPremium()) {
                        new zf.x0(this.c, 24, true).show();
                        break;
                    } else {
                        long j10 = ((pm0) arrayList.get(i9)).a.h;
                        if (sm0Var.f(sm0Var.h == j10 ? null : ((pm0) arrayList.get(i9)).a)) {
                            int i10 = 0;
                            while (i10 < f1Var.getChildCount()) {
                                if (f1Var.getChildAt(i10) == view) {
                                    if (i10 <= 1) {
                                        f1Var.v0(-AndroidUtilities.dp(i10 == 0 ? 90.0f : 50.0f), 0, null);
                                    } else if (i10 >= f1Var.getChildCount() - 2) {
                                        f1Var.v0(AndroidUtilities.dp(i10 == f1Var.getChildCount() - 1 ? 80.0f : 50.0f), 0, null);
                                    }
                                }
                                i10++;
                            }
                            f1Var.M(new org.telegram.ui.yq(3));
                            if (sm0Var.h != j10) {
                                sm0Var.h = j10;
                                ((rm0) view).a(true, true);
                                break;
                            } else {
                                sm0Var.h = 0L;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                zf.k1 k1Var = (zf.k1) this.d;
                if (view instanceof org.telegram.ui.qv0) {
                    org.telegram.ui.qv0 qv0Var = (org.telegram.ui.qv0) view;
                    PremiumPreviewFragment.p0(this.b, qv0Var.f.a);
                    k1Var.showDialog(new zf.x0(this.c, qv0Var.f.a, false));
                    break;
                }
                break;
        }
    }
}
