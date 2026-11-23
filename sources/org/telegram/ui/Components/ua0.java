package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ua0 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ua0(org.telegram.ui.Cells.aa aaVar, boolean z10, Runnable runnable) {
        this.d = aaVar;
        this.b = z10;
        this.c = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                org.telegram.ui.p6 p6Var = (org.telegram.ui.p6) this.d;
                Runnable runnable = (Runnable) this.c;
                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
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
                org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) this.d;
                Runnable runnable2 = (Runnable) this.c;
                if (this.b) {
                    ((it0) aaVar.b).J.p();
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
                        nsVar.l.A(nsVar.W);
                    } else if (intValue == 1) {
                        nsVar.l.t(nsVar.W);
                    } else if (intValue == 2) {
                        nsVar.l.t(null);
                    } else if (intValue == 3) {
                        nsVar.l.G(nsVar.W);
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

    public /* synthetic */ ua0(org.telegram.ui.js jsVar, ArrayList arrayList, boolean z10) {
        this.d = jsVar;
        this.c = arrayList;
        this.b = z10;
    }

    public /* synthetic */ ua0(boolean z10, org.telegram.ui.p6 p6Var, Runnable runnable) {
        this.b = z10;
        this.d = p6Var;
        this.c = runnable;
    }
}
