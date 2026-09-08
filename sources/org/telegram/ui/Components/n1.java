package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class n1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ n1(ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.n2 R;
        switch (this.a) {
            case 0:
                if (this.b != null && (R = LaunchActivity.R()) != null) {
                    org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                    l2Var.a = true;
                    R.showAsSheet(new PrivacyControlActivity(11, false), l2Var);
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
                        if (arrayList.get(i10) instanceof org.telegram.ui.Cells.t1) {
                            ((org.telegram.ui.Cells.t1) arrayList.get(i10)).J3(false, false);
                            ((org.telegram.ui.Cells.t1) arrayList.get(i10)).L3(false, false, false);
                        }
                        i10++;
                    }
                }
        }
    }
}
