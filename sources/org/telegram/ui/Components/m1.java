package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ m1(ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.m2 R;
        switch (this.a) {
            case 0:
                if (this.b != null && (R = LaunchActivity.R()) != null) {
                    org.telegram.ui.ActionBar.k2 k2Var = new org.telegram.ui.ActionBar.k2();
                    k2Var.a = true;
                    R.showAsSheet(new PrivacyControlActivity(11, false), k2Var);
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
                        if (arrayList.get(i10) instanceof org.telegram.ui.Cells.u1) {
                            ((org.telegram.ui.Cells.u1) arrayList.get(i10)).J3(false, false);
                            ((org.telegram.ui.Cells.u1) arrayList.get(i10)).L3(false, false, false);
                        }
                        i10++;
                    }
                }
        }
    }
}
