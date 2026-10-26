package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pc0 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pc0(jg.i iVar, boolean z10, Runnable runnable) {
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
                    ((aw0) iVar.a).I.o();
                }
                runnable2.run();
                break;
            default:
                org.telegram.ui.bt btVar = (org.telegram.ui.bt) this.d;
                ArrayList arrayList = (ArrayList) this.c;
                org.telegram.ui.ft ftVar = btVar.a;
                if (ftVar.w != null && ftVar.l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        ftVar.l.B(ftVar.W);
                    } else if (intValue == 1) {
                        ftVar.l.u(ftVar.W);
                    } else if (intValue == 2) {
                        ftVar.l.u(null);
                    } else if (intValue == 3) {
                        ftVar.l.G(ftVar.W);
                    } else if (intValue == 4) {
                        ftVar.l.q(ftVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(ftVar.r).addRecentSticker(2, ftVar.b0, ftVar.W, (int) (System.currentTimeMillis() / 1000), this.b);
                    }
                    ftVar.n();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ pc0(org.telegram.ui.bt btVar, ArrayList arrayList, boolean z10) {
        this.d = btVar;
        this.c = arrayList;
        this.b = z10;
    }

    public /* synthetic */ pc0(boolean z10, org.telegram.ui.s6 s6Var, Runnable runnable) {
        this.b = z10;
        this.d = s6Var;
        this.c = runnable;
    }
}
