package ag;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.tm0;
import org.telegram.ui.Components.um0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ar;
import org.telegram.ui.rv0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p2 implements pk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p2(Object obj, int i10, org.telegram.ui.ActionBar.n2 n2Var, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = n2Var;
    }

    @Override // org.telegram.ui.Components.pk0
    public final void a(int i10, View view) {
        switch (this.a) {
            case 0:
                y2 y2Var = (y2) this.d;
                if (view instanceof rv0) {
                    rv0 rv0Var = (rv0) view;
                    PremiumPreviewFragment.q0(this.b, rv0Var.f.a);
                    y2Var.showDialog(new g2(this.c, rv0Var.f.a, false));
                    break;
                }
                break;
            default:
                um0 um0Var = (um0) this.d;
                ArrayList arrayList = um0Var.r;
                hh.f1 f1Var = um0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.b).isPremium()) {
                        new g2(this.c, 24, true).show();
                        break;
                    } else {
                        long j10 = ((rm0) arrayList.get(i10)).a.h;
                        if (um0Var.f(um0Var.h == j10 ? null : ((rm0) arrayList.get(i10)).a)) {
                            int i11 = 0;
                            while (i11 < f1Var.getChildCount()) {
                                if (f1Var.getChildAt(i11) == view) {
                                    if (i11 <= 1) {
                                        f1Var.v0(-AndroidUtilities.dp(i11 == 0 ? 90.0f : 50.0f), 0, null);
                                    } else if (i11 >= f1Var.getChildCount() - 2) {
                                        f1Var.v0(AndroidUtilities.dp(i11 == f1Var.getChildCount() - 1 ? 80.0f : 50.0f), 0, null);
                                    }
                                }
                                i11++;
                            }
                            f1Var.M(new ar(3));
                            if (um0Var.h != j10) {
                                um0Var.h = j10;
                                ((tm0) view).a(true, true);
                                break;
                            } else {
                                um0Var.h = 0L;
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
