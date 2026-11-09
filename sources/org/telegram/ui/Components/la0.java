package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class la0 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ la0(rt rtVar, boolean z9, Runnable runnable) {
        this.d = rtVar;
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
                rt rtVar = (rt) this.d;
                Runnable runnable2 = (Runnable) this.c;
                if (this.b) {
                    ((zs0) rtVar.b).I.o();
                }
                runnable2.run();
                break;
            default:
                org.telegram.ui.is isVar = (org.telegram.ui.is) this.d;
                ArrayList arrayList = (ArrayList) this.c;
                org.telegram.ui.ms msVar = isVar.a;
                if (msVar.w != null && msVar.l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        msVar.l.C(msVar.W);
                    } else if (intValue == 1) {
                        msVar.l.v(msVar.W);
                    } else if (intValue == 2) {
                        msVar.l.v(null);
                    } else if (intValue == 3) {
                        msVar.l.H(msVar.W);
                    } else if (intValue == 4) {
                        msVar.l.q(msVar.W);
                    } else if (intValue == 5) {
                        org.telegram.messenger.ui.b0(msVar.r).d(2, msVar.b0, msVar.W, (int) (System.currentTimeMillis() / 1000), this.b);
                    }
                    msVar.o();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ la0(org.telegram.ui.is isVar, ArrayList arrayList, boolean z9) {
        this.d = isVar;
        this.c = arrayList;
        this.b = z9;
    }

    public /* synthetic */ la0(boolean z9, org.telegram.ui.p6 p6Var, Runnable runnable) {
        this.b = z9;
        this.d = p6Var;
        this.c = runnable;
    }
}
