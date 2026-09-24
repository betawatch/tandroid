package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hc0 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hc0(org.telegram.ui.jt jtVar, ArrayList arrayList, boolean z10) {
        this.c = jtVar;
        this.d = arrayList;
        this.b = z10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(new PremiumPreviewFragment(0, this.b ? "lastseen" : "readtime"));
                    e3Var.dismiss();
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.jt jtVar = (org.telegram.ui.jt) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                org.telegram.ui.nt ntVar = jtVar.a;
                if (ntVar.w != null && ntVar.l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        ntVar.l.C(ntVar.W);
                    } else if (intValue == 1) {
                        ntVar.l.v(ntVar.W);
                    } else if (intValue == 2) {
                        ntVar.l.v(null);
                    } else if (intValue == 3) {
                        ntVar.l.H(ntVar.W);
                    } else if (intValue == 4) {
                        ntVar.l.r(ntVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(ntVar.r).addRecentSticker(2, ntVar.b0, ntVar.W, (int) (System.currentTimeMillis() / 1000), this.b);
                    }
                    ntVar.p();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ hc0(boolean z10, org.telegram.ui.ActionBar.e3 e3Var, Runnable runnable) {
        this.b = z10;
        this.c = e3Var;
        this.d = runnable;
    }
}
