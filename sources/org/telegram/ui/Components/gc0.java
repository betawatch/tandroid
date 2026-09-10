package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class gc0 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gc0(org.telegram.ui.pt ptVar, ArrayList arrayList, boolean z10) {
        this.c = ptVar;
        this.d = arrayList;
        this.b = z10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(new PremiumPreviewFragment(0, this.b ? "lastseen" : "readtime"));
                    h3Var.dismiss();
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.pt ptVar = (org.telegram.ui.pt) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                org.telegram.ui.tt ttVar = ptVar.a;
                if (ttVar.w != null && ttVar.l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        ttVar.l.A(ttVar.W);
                    } else if (intValue == 1) {
                        ttVar.l.t(ttVar.W);
                    } else if (intValue == 2) {
                        ttVar.l.t(null);
                    } else if (intValue == 3) {
                        ttVar.l.G(ttVar.W);
                    } else if (intValue == 4) {
                        ttVar.l.p(ttVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(ttVar.r).addRecentSticker(2, ttVar.b0, ttVar.W, (int) (System.currentTimeMillis() / 1000), this.b);
                    }
                    ttVar.p();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ gc0(boolean z10, org.telegram.ui.ActionBar.h3 h3Var, Runnable runnable) {
        this.b = z10;
        this.c = h3Var;
        this.d = runnable;
    }
}
