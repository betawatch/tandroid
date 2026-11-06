package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ka0 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ka0(qt qtVar, boolean z9, Runnable runnable) {
        this.d = qtVar;
        this.b = z9;
        this.c = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                org.telegram.ui.p6 p6Var = (org.telegram.ui.p6) this.d;
                Runnable runnable = (Runnable) this.c;
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
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
                qt qtVar = (qt) this.d;
                Runnable runnable2 = (Runnable) this.c;
                if (this.b) {
                    ((xs0) qtVar.b).I.o();
                }
                runnable2.run();
                break;
            default:
                org.telegram.ui.gs gsVar = (org.telegram.ui.gs) this.d;
                ArrayList arrayList = (ArrayList) this.c;
                org.telegram.ui.ks ksVar = gsVar.a;
                if (ksVar.w != null && ksVar.l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        ksVar.l.C(ksVar.W);
                    } else if (intValue == 1) {
                        ksVar.l.v(ksVar.W);
                    } else if (intValue == 2) {
                        ksVar.l.v(null);
                    } else if (intValue == 3) {
                        ksVar.l.H(ksVar.W);
                    } else if (intValue == 4) {
                        ksVar.l.q(ksVar.W);
                    } else if (intValue == 5) {
                        org.telegram.messenger.ui.b0(ksVar.r).d(2, ksVar.b0, ksVar.W, (int) (System.currentTimeMillis() / 1000), this.b);
                    }
                    ksVar.o();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ka0(org.telegram.ui.gs gsVar, ArrayList arrayList, boolean z9) {
        this.d = gsVar;
        this.c = arrayList;
        this.b = z9;
    }

    public /* synthetic */ ka0(boolean z9, org.telegram.ui.p6 p6Var, Runnable runnable) {
        this.b = z9;
        this.d = p6Var;
        this.c = runnable;
    }
}
