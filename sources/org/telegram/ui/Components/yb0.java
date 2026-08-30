package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yb0 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yb0(org.telegram.ui.lt ltVar, ArrayList arrayList, boolean z4) {
        this.c = ltVar;
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
                org.telegram.ui.lt ltVar = (org.telegram.ui.lt) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                org.telegram.ui.pt ptVar = ltVar.a;
                if (ptVar.w != null && ptVar.l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        ptVar.l.C(ptVar.W);
                    } else if (intValue == 1) {
                        ptVar.l.u(ptVar.W);
                    } else if (intValue == 2) {
                        ptVar.l.u(null);
                    } else if (intValue == 3) {
                        ptVar.l.H(ptVar.W);
                    } else if (intValue == 4) {
                        ptVar.l.q(ptVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(ptVar.r).addRecentSticker(2, ptVar.b0, ptVar.W, (int) (System.currentTimeMillis() / 1000), this.b);
                    }
                    ptVar.p();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ yb0(boolean z4, org.telegram.ui.ActionBar.g3 g3Var, Runnable runnable) {
        this.b = z4;
        this.c = g3Var;
        this.d = runnable;
    }
}
