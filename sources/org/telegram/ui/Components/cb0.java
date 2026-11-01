package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
                    ((au0) uVar.b).I.o();
                }
                runnable2.run();
                break;
            default:
                org.telegram.ui.ft ftVar = (org.telegram.ui.ft) this.d;
                ArrayList arrayList = (ArrayList) this.c;
                org.telegram.ui.kt ktVar = ftVar.a;
                if (ktVar.w != null && ktVar.l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        ktVar.l.A(ktVar.W);
                    } else if (intValue == 1) {
                        ktVar.l.t(ktVar.W);
                    } else if (intValue == 2) {
                        ktVar.l.t(null);
                    } else if (intValue == 3) {
                        ktVar.l.G(ktVar.W);
                    } else if (intValue == 4) {
                        ktVar.l.p(ktVar.W);
                    } else if (intValue == 5) {
                        org.telegram.messenger.vi.b0(ktVar.r).d(2, ktVar.b0, ktVar.W, (int) (System.currentTimeMillis() / 1000), this.b);
                    }
                    ktVar.o();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ cb0(org.telegram.ui.ft ftVar, ArrayList arrayList, boolean z10) {
        this.d = ftVar;
        this.c = arrayList;
        this.b = z10;
    }

    public /* synthetic */ cb0(boolean z10, org.telegram.ui.p6 p6Var, Runnable runnable) {
        this.b = z10;
        this.d = p6Var;
        this.c = runnable;
    }
}
