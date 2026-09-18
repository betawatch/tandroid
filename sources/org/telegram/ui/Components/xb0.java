package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xb0 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xb0(org.telegram.ui.qt qtVar, ArrayList arrayList, boolean z10) {
        this.c = qtVar;
        this.d = arrayList;
        this.b = z10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
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
                org.telegram.ui.qt qtVar = (org.telegram.ui.qt) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                org.telegram.ui.ut utVar = qtVar.a;
                if (utVar.w != null && utVar.l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        utVar.l.B(utVar.W);
                    } else if (intValue == 1) {
                        utVar.l.u(utVar.W);
                    } else if (intValue == 2) {
                        utVar.l.u(null);
                    } else if (intValue == 3) {
                        utVar.l.H(utVar.W);
                    } else if (intValue == 4) {
                        utVar.l.q(utVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(utVar.r).addRecentSticker(2, utVar.b0, utVar.W, (int) (System.currentTimeMillis() / 1000), this.b);
                    }
                    utVar.p();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ xb0(boolean z10, org.telegram.ui.ActionBar.g3 g3Var, Runnable runnable) {
        this.b = z10;
        this.c = g3Var;
        this.d = runnable;
    }
}
