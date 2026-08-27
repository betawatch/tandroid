package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ib0 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ib0(org.telegram.ui.ft ftVar, ArrayList arrayList, boolean z10) {
        this.c = ftVar;
        this.d = arrayList;
        this.b = z10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
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
                org.telegram.ui.ft ftVar = (org.telegram.ui.ft) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                org.telegram.ui.kt ktVar = ftVar.a;
                if (ktVar.w != null && ktVar.l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        ktVar.l.A(ktVar.W);
                    } else if (intValue == 1) {
                        ktVar.l.t(ktVar.W);
                    } else if (intValue == 2) {
                        ktVar.l.t(null);
                    } else if (intValue == 3) {
                        ktVar.l.G(ktVar.W);
                    } else if (intValue == 4) {
                        ktVar.l.p(ktVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(ktVar.r).addRecentSticker(2, ktVar.b0, ktVar.W, (int) (System.currentTimeMillis() / 1000), this.b);
                    }
                    ktVar.p();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ib0(boolean z10, org.telegram.ui.ActionBar.e3 e3Var, Runnable runnable) {
        this.b = z10;
        this.c = e3Var;
        this.d = runnable;
    }
}
