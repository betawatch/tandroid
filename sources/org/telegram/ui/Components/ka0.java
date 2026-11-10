package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                    ((ys0) qtVar.b).I.o();
                }
                runnable2.run();
                break;
            default:
                org.telegram.ui.js jsVar = (org.telegram.ui.js) this.d;
                ArrayList arrayList = (ArrayList) this.c;
                org.telegram.ui.ns nsVar = jsVar.a;
                if (nsVar.w != null && nsVar.l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        nsVar.l.C(nsVar.W);
                    } else if (intValue == 1) {
                        nsVar.l.v(nsVar.W);
                    } else if (intValue == 2) {
                        nsVar.l.v(null);
                    } else if (intValue == 3) {
                        nsVar.l.H(nsVar.W);
                    } else if (intValue == 4) {
                        nsVar.l.q(nsVar.W);
                    } else if (intValue == 5) {
                        org.telegram.messenger.ui.b0(nsVar.r).d(2, nsVar.b0, nsVar.W, (int) (System.currentTimeMillis() / 1000), this.b);
                    }
                    nsVar.o();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ka0(org.telegram.ui.js jsVar, ArrayList arrayList, boolean z9) {
        this.d = jsVar;
        this.c = arrayList;
        this.b = z9;
    }

    public /* synthetic */ ka0(boolean z9, org.telegram.ui.p6 p6Var, Runnable runnable) {
        this.b = z9;
        this.d = p6Var;
        this.c = runnable;
    }
}
