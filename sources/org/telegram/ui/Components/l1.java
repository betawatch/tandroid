package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ l1(ArrayList arrayList, int i9) {
        this.a = i9;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.o2 R;
        switch (this.a) {
            case 0:
                if (this.b != null && (R = LaunchActivity.R()) != null) {
                    org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
                    m2Var.a = true;
                    R.showAsSheet(new PrivacyControlActivity(11, false), m2Var);
                    break;
                }
                break;
            default:
                int i9 = 0;
                while (true) {
                    ArrayList arrayList = this.b;
                    if (i9 >= arrayList.size()) {
                        break;
                    } else {
                        ((View) arrayList.get(i9)).setVisibility(8);
                        if (arrayList.get(i9) instanceof org.telegram.ui.Cells.t1) {
                            ((org.telegram.ui.Cells.t1) arrayList.get(i9)).J3(false, false);
                            ((org.telegram.ui.Cells.t1) arrayList.get(i9)).L3(false, false, false);
                        }
                        i9++;
                    }
                }
        }
    }
}
