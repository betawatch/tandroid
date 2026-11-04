package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ e1(int i3, ArrayList arrayList) {
        this.a = i3;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.d2 Q;
        switch (this.a) {
            case 0:
                if (this.b != null && (Q = LaunchActivity.Q()) != null) {
                    org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2();
                    b2Var.a = true;
                    Q.showAsSheet(new PrivacyControlActivity(11, false), b2Var);
                    break;
                }
                break;
            default:
                int i3 = 0;
                while (true) {
                    ArrayList arrayList = this.b;
                    if (i3 >= arrayList.size()) {
                        break;
                    } else {
                        ((View) arrayList.get(i3)).setVisibility(8);
                        if (arrayList.get(i3) instanceof org.telegram.ui.Cells.q1) {
                            ((org.telegram.ui.Cells.q1) arrayList.get(i3)).h3(false, false);
                            ((org.telegram.ui.Cells.q1) arrayList.get(i3)).j3(false, false, false);
                        }
                        i3++;
                    }
                }
        }
    }
}
