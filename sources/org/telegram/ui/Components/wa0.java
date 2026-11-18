package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class wa0 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wa0(of ofVar, boolean z10, Runnable runnable) {
        this.d = ofVar;
        this.b = z10;
        this.c = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                org.telegram.ui.o6 o6Var = (org.telegram.ui.o6) this.d;
                Runnable runnable = (Runnable) this.c;
                org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(new PremiumPreviewFragment(0, this.b ? "lastseen" : "readtime"));
                    o6Var.dismiss();
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 1:
                of ofVar = (of) this.d;
                Runnable runnable2 = (Runnable) this.c;
                if (this.b) {
                    ((gt0) ofVar.b).J.p();
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
                        org.telegram.messenger.ri.d0(nsVar.r).d(2, nsVar.b0, nsVar.W, (int) (System.currentTimeMillis() / 1000), this.b);
                    }
                    nsVar.o();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ wa0(org.telegram.ui.js jsVar, ArrayList arrayList, boolean z10) {
        this.d = jsVar;
        this.c = arrayList;
        this.b = z10;
    }

    public /* synthetic */ wa0(boolean z10, org.telegram.ui.o6 o6Var, Runnable runnable) {
        this.b = z10;
        this.d = o6Var;
        this.c = runnable;
    }
}
