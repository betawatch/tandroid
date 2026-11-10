package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ e1(int i7, ArrayList arrayList) {
        this.a = i7;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.f2 Q;
        switch (this.a) {
            case 0:
                if (this.b != null && (Q = LaunchActivity.Q()) != null) {
                    org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2();
                    d2Var.a = true;
                    Q.showAsSheet(new PrivacyControlActivity(11, false), d2Var);
                    break;
                }
                break;
            default:
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = this.b;
                    if (i7 >= arrayList.size()) {
                        break;
                    } else {
                        ((View) arrayList.get(i7)).setVisibility(8);
                        if (arrayList.get(i7) instanceof org.telegram.ui.Cells.q1) {
                            ((org.telegram.ui.Cells.q1) arrayList.get(i7)).j3(false, false);
                            ((org.telegram.ui.Cells.q1) arrayList.get(i7)).l3(false, false, false);
                        }
                        i7++;
                    }
                }
        }
    }
}
