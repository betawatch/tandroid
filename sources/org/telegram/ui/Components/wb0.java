package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class wb0 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wb0(org.telegram.ui.lt ltVar, ArrayList arrayList, boolean z10) {
        this.c = ltVar;
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
                org.telegram.ui.lt ltVar = (org.telegram.ui.lt) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                org.telegram.ui.pt ptVar = ltVar.a;
                if (ptVar.w != null && ptVar.l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        ptVar.l.C(ptVar.W);
                    } else if (intValue == 1) {
                        ptVar.l.v(ptVar.W);
                    } else if (intValue == 2) {
                        ptVar.l.v(null);
                    } else if (intValue == 3) {
                        ptVar.l.H(ptVar.W);
                    } else if (intValue == 4) {
                        ptVar.l.r(ptVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(ptVar.r).addRecentSticker(2, ptVar.b0, ptVar.W, (int) (System.currentTimeMillis() / 1000), this.b);
                    }
                    ptVar.p();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ wb0(boolean z10, org.telegram.ui.ActionBar.f3 f3Var, Runnable runnable) {
        this.b = z10;
        this.c = f3Var;
        this.d = runnable;
    }
}
