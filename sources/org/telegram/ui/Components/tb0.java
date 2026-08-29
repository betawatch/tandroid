package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tb0 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tb0(org.telegram.ui.dt dtVar, ArrayList arrayList, boolean z10) {
        this.c = dtVar;
        this.d = arrayList;
        this.b = z10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
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
                org.telegram.ui.dt dtVar = (org.telegram.ui.dt) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                org.telegram.ui.ht htVar = dtVar.a;
                if (htVar.w != null && htVar.l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        htVar.l.A(htVar.W);
                    } else if (intValue == 1) {
                        htVar.l.t(htVar.W);
                    } else if (intValue == 2) {
                        htVar.l.t(null);
                    } else if (intValue == 3) {
                        htVar.l.H(htVar.W);
                    } else if (intValue == 4) {
                        htVar.l.p(htVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(htVar.r).addRecentSticker(2, htVar.b0, htVar.W, (int) (System.currentTimeMillis() / 1000), this.b);
                    }
                    htVar.p();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ tb0(boolean z10, org.telegram.ui.ActionBar.f3 f3Var, Runnable runnable) {
        this.b = z10;
        this.c = f3Var;
        this.d = runnable;
    }
}
