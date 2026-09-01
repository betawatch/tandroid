package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ac0 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ac0(org.telegram.ui.mt mtVar, ArrayList arrayList, boolean z4) {
        this.c = mtVar;
        this.d = arrayList;
        this.b = z4;
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
                org.telegram.ui.mt mtVar = (org.telegram.ui.mt) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                org.telegram.ui.qt qtVar = mtVar.a;
                if (qtVar.w != null && qtVar.l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        qtVar.l.B(qtVar.W);
                    } else if (intValue == 1) {
                        qtVar.l.t(qtVar.W);
                    } else if (intValue == 2) {
                        qtVar.l.t(null);
                    } else if (intValue == 3) {
                        qtVar.l.G(qtVar.W);
                    } else if (intValue == 4) {
                        qtVar.l.p(qtVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(qtVar.r).addRecentSticker(2, qtVar.b0, qtVar.W, (int) (System.currentTimeMillis() / 1000), this.b);
                    }
                    qtVar.p();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ac0(boolean z4, org.telegram.ui.ActionBar.h3 h3Var, Runnable runnable) {
        this.b = z4;
        this.c = h3Var;
        this.d = runnable;
    }
}
