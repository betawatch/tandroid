package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class f1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ f1(int i10, ArrayList arrayList) {
        this.a = i10;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.k2 Q;
        switch (this.a) {
            case 0:
                if (this.b != null && (Q = LaunchActivity.Q()) != null) {
                    org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2();
                    i2Var.a = true;
                    Q.showAsSheet(new PrivacyControlActivity(11, false), i2Var);
                    break;
                }
                break;
            default:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.b;
                    if (i10 >= arrayList.size()) {
                        break;
                    } else {
                        ((View) arrayList.get(i10)).setVisibility(8);
                        if (arrayList.get(i10) instanceof org.telegram.ui.Cells.q1) {
                            ((org.telegram.ui.Cells.q1) arrayList.get(i10)).f3(false, false);
                            ((org.telegram.ui.Cells.q1) arrayList.get(i10)).h3(false, false, false);
                        }
                        i10++;
                    }
                }
        }
    }
}
