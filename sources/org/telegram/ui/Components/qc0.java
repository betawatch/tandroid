package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qc0 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qc0(jg.i iVar, boolean z10, Runnable runnable) {
        this.d = iVar;
        this.b = z10;
        this.c = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                org.telegram.ui.s6 s6Var = (org.telegram.ui.s6) this.d;
                Runnable runnable = (Runnable) this.c;
                org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(new PremiumPreviewFragment(0, this.b ? "lastseen" : "readtime"));
                    s6Var.dismiss();
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 1:
                jg.i iVar = (jg.i) this.d;
                Runnable runnable2 = (Runnable) this.c;
                if (this.b) {
                    ((bw0) iVar.a).I.o();
                }
                runnable2.run();
                break;
            default:
                org.telegram.ui.dt dtVar = (org.telegram.ui.dt) this.d;
                ArrayList arrayList = (ArrayList) this.c;
                org.telegram.ui.ht htVar = dtVar.a;
                if (htVar.w != null && htVar.l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        htVar.l.B(htVar.W);
                    } else if (intValue == 1) {
                        htVar.l.u(htVar.W);
                    } else if (intValue == 2) {
                        htVar.l.u(null);
                    } else if (intValue == 3) {
                        htVar.l.G(htVar.W);
                    } else if (intValue == 4) {
                        htVar.l.q(htVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(htVar.r).addRecentSticker(2, htVar.b0, htVar.W, (int) (System.currentTimeMillis() / 1000), this.b);
                    }
                    htVar.n();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ qc0(org.telegram.ui.dt dtVar, ArrayList arrayList, boolean z10) {
        this.d = dtVar;
        this.c = arrayList;
        this.b = z10;
    }

    public /* synthetic */ qc0(boolean z10, org.telegram.ui.s6 s6Var, Runnable runnable) {
        this.b = z10;
        this.d = s6Var;
        this.c = runnable;
    }
}
