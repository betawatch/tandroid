package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class la0 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ la0(ff ffVar, boolean z10, Runnable runnable) {
        this.d = ffVar;
        this.b = z10;
        this.c = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                org.telegram.ui.p6 p6Var = (org.telegram.ui.p6) this.d;
                Runnable runnable = (Runnable) this.c;
                org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
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
                ff ffVar = (ff) this.d;
                Runnable runnable2 = (Runnable) this.c;
                if (this.b) {
                    ((ys0) ffVar.b).J.p();
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
                        nsVar.l.B(nsVar.W);
                    } else if (intValue == 1) {
                        nsVar.l.t(nsVar.W);
                    } else if (intValue == 2) {
                        nsVar.l.t(null);
                    } else if (intValue == 3) {
                        nsVar.l.H(nsVar.W);
                    } else if (intValue == 4) {
                        nsVar.l.p(nsVar.W);
                    } else if (intValue == 5) {
                        org.telegram.messenger.si.b0(nsVar.r).d(2, nsVar.b0, nsVar.W, (int) (System.currentTimeMillis() / 1000), this.b);
                    }
                    nsVar.o();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ la0(org.telegram.ui.js jsVar, ArrayList arrayList, boolean z10) {
        this.d = jsVar;
        this.c = arrayList;
        this.b = z10;
    }

    public /* synthetic */ la0(boolean z10, org.telegram.ui.p6 p6Var, Runnable runnable) {
        this.b = z10;
        this.d = p6Var;
        this.c = runnable;
    }
}
