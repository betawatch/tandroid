package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qc0 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qc0(org.telegram.ui.ct ctVar, ArrayList arrayList, boolean z10) {
        this.c = ctVar;
        this.d = arrayList;
        this.b = z10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(new PremiumPreviewFragment(0, this.b ? "lastseen" : "readtime"));
                    f3Var.dismiss();
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.ct ctVar = (org.telegram.ui.ct) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                org.telegram.ui.gt gtVar = ctVar.a;
                if (gtVar.w != null && gtVar.l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        gtVar.l.C(gtVar.W);
                    } else if (intValue == 1) {
                        gtVar.l.v(gtVar.W);
                    } else if (intValue == 2) {
                        gtVar.l.v(null);
                    } else if (intValue == 3) {
                        gtVar.l.H(gtVar.W);
                    } else if (intValue == 4) {
                        gtVar.l.p(gtVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(gtVar.r).addRecentSticker(2, gtVar.b0, gtVar.W, (int) (System.currentTimeMillis() / 1000), this.b);
                    }
                    gtVar.p();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ qc0(boolean z10, org.telegram.ui.ActionBar.f3 f3Var, Runnable runnable) {
        this.b = z10;
        this.c = f3Var;
        this.d = runnable;
    }
}
