package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fa0 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fa0(i9 i9Var, boolean z10, Runnable runnable) {
        this.d = i9Var;
        this.b = z10;
        this.c = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                org.telegram.ui.q6 q6Var = (org.telegram.ui.q6) this.d;
                Runnable runnable = (Runnable) this.c;
                org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(new PremiumPreviewFragment(0, this.b ? "lastseen" : "readtime"));
                    q6Var.dismiss();
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 1:
                i9 i9Var = (i9) this.d;
                Runnable runnable2 = (Runnable) this.c;
                if (this.b) {
                    ((ws0) i9Var.b).J.o();
                }
                runnable2.run();
                break;
            default:
                org.telegram.ui.es esVar = (org.telegram.ui.es) this.d;
                ArrayList arrayList = (ArrayList) this.c;
                org.telegram.ui.is isVar = esVar.a;
                if (isVar.w != null && isVar.l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        isVar.l.B(isVar.W);
                    } else if (intValue == 1) {
                        isVar.l.u(isVar.W);
                    } else if (intValue == 2) {
                        isVar.l.u(null);
                    } else if (intValue == 3) {
                        isVar.l.G(isVar.W);
                    } else if (intValue == 4) {
                        isVar.l.q(isVar.W);
                    } else if (intValue == 5) {
                        org.telegram.messenger.li.b0(isVar.r).d(2, isVar.b0, isVar.W, (int) (System.currentTimeMillis() / 1000), this.b);
                    }
                    isVar.o();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ fa0(org.telegram.ui.es esVar, ArrayList arrayList, boolean z10) {
        this.d = esVar;
        this.c = arrayList;
        this.b = z10;
    }

    public /* synthetic */ fa0(boolean z10, org.telegram.ui.q6 q6Var, Runnable runnable) {
        this.b = z10;
        this.d = q6Var;
        this.c = runnable;
    }
}
