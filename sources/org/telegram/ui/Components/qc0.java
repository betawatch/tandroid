package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qc0 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qc0(org.telegram.ui.at atVar, ArrayList arrayList, boolean z10) {
        this.c = atVar;
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
                org.telegram.ui.at atVar = (org.telegram.ui.at) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                org.telegram.ui.et etVar = atVar.a;
                if (etVar.w != null && etVar.l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        etVar.l.C(etVar.W);
                    } else if (intValue == 1) {
                        etVar.l.v(etVar.W);
                    } else if (intValue == 2) {
                        etVar.l.v(null);
                    } else if (intValue == 3) {
                        etVar.l.H(etVar.W);
                    } else if (intValue == 4) {
                        etVar.l.p(etVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(etVar.r).addRecentSticker(2, etVar.b0, etVar.W, (int) (System.currentTimeMillis() / 1000), this.b);
                    }
                    etVar.p();
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
