package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class cb0 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cb0(n2.u uVar, boolean z10, Runnable runnable) {
        this.d = uVar;
        this.b = z10;
        this.c = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                org.telegram.ui.p6 p6Var = (org.telegram.ui.p6) this.d;
                Runnable runnable = (Runnable) this.c;
                org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(new PremiumPreviewFragment(0, this.b ? "lastseen" : "readtime"));
                    p6Var.dismiss();
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 1:
                n2.u uVar = (n2.u) this.d;
                Runnable runnable2 = (Runnable) this.c;
                if (this.b) {
                    ((zt0) uVar.b).I.o();
                }
                runnable2.run();
                break;
            default:
                org.telegram.ui.gt gtVar = (org.telegram.ui.gt) this.d;
                ArrayList arrayList = (ArrayList) this.c;
                org.telegram.ui.lt ltVar = gtVar.a;
                if (ltVar.w != null && ltVar.l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        ltVar.l.A(ltVar.W);
                    } else if (intValue == 1) {
                        ltVar.l.t(ltVar.W);
                    } else if (intValue == 2) {
                        ltVar.l.t(null);
                    } else if (intValue == 3) {
                        ltVar.l.G(ltVar.W);
                    } else if (intValue == 4) {
                        ltVar.l.p(ltVar.W);
                    } else if (intValue == 5) {
                        org.telegram.messenger.ui.b0(ltVar.r).d(2, ltVar.b0, ltVar.W, (int) (System.currentTimeMillis() / 1000), this.b);
                    }
                    ltVar.o();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ cb0(org.telegram.ui.gt gtVar, ArrayList arrayList, boolean z10) {
        this.d = gtVar;
        this.c = arrayList;
        this.b = z10;
    }

    public /* synthetic */ cb0(boolean z10, org.telegram.ui.p6 p6Var, Runnable runnable) {
        this.b = z10;
        this.d = p6Var;
        this.c = runnable;
    }
}
