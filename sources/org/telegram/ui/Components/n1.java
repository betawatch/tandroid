package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class n1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ n1(int i7, ArrayList arrayList) {
        this.a = i7;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.h2 Q;
        switch (this.a) {
            case 0:
                if (this.b != null && (Q = LaunchActivity.Q()) != null) {
                    org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2();
                    f2Var.a = true;
                    Q.showAsSheet(new PrivacyControlActivity(11, false), f2Var);
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
                        if (arrayList.get(i7) instanceof org.telegram.ui.Cells.r1) {
                            ((org.telegram.ui.Cells.r1) arrayList.get(i7)).l3(false, false);
                            ((org.telegram.ui.Cells.r1) arrayList.get(i7)).n3(false, false, false);
                        }
                        i7++;
                    }
                }
        }
    }
}
