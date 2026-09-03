package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zb0 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zb0(org.telegram.ui.nt ntVar, ArrayList arrayList, boolean z4) {
        this.c = ntVar;
        this.d = arrayList;
        this.b = z4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(new PremiumPreviewFragment(0, this.b ? "lastseen" : "readtime"));
                    g3Var.dismiss();
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.nt ntVar = (org.telegram.ui.nt) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                org.telegram.ui.rt rtVar = ntVar.a;
                if (rtVar.w != null && rtVar.l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        rtVar.l.C(rtVar.W);
                    } else if (intValue == 1) {
                        rtVar.l.u(rtVar.W);
                    } else if (intValue == 2) {
                        rtVar.l.u(null);
                    } else if (intValue == 3) {
                        rtVar.l.H(rtVar.W);
                    } else if (intValue == 4) {
                        rtVar.l.q(rtVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(rtVar.r).addRecentSticker(2, rtVar.b0, rtVar.W, (int) (System.currentTimeMillis() / 1000), this.b);
                    }
                    rtVar.p();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ zb0(boolean z4, org.telegram.ui.ActionBar.g3 g3Var, Runnable runnable) {
        this.b = z4;
        this.c = g3Var;
        this.d = runnable;
    }
}
