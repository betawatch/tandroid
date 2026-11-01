package kg;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.e20;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.fr;
import org.telegram.ui.rt0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o1 implements hk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o1(Object obj, int i10, org.telegram.ui.ActionBar.k2 k2Var, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = k2Var;
    }

    @Override // org.telegram.ui.Components.hk0
    public final void f(int i10, View view) {
        switch (this.a) {
            case 0:
                v1 v1Var = (v1) this.d;
                if (view instanceof rt0) {
                    rt0 rt0Var = (rt0) view;
                    PremiumPreviewFragment.v0(this.b, rt0Var.f.a);
                    v1Var.t(new i1(this.c, rt0Var.f.a, false));
                    break;
                }
                break;
            default:
                sm0 sm0Var = (sm0) this.d;
                ArrayList arrayList = sm0Var.r;
                ag.b1 b1Var = sm0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!e20.i(this.b).q()) {
                        new i1(this.c, 24, true).show();
                        break;
                    } else {
                        long j10 = ((pm0) arrayList.get(i10)).a.h;
                        if (sm0Var.f(sm0Var.h == j10 ? null : ((pm0) arrayList.get(i10)).a)) {
                            int i11 = 0;
                            while (i11 < b1Var.getChildCount()) {
                                if (b1Var.getChildAt(i11) == view) {
                                    if (i11 <= 1) {
                                        b1Var.w0(-org.telegram.messenger.i0.L(i11 == 0 ? 90.0f : 50.0f), 0, null);
                                    } else if (i11 >= b1Var.getChildCount() - 2) {
                                        b1Var.w0(org.telegram.messenger.i0.L(i11 == b1Var.getChildCount() - 1 ? 80.0f : 50.0f), 0, null);
                                    }
                                }
                                i11++;
                            }
                            b1Var.M(new fr(3));
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
        }
    }
}
