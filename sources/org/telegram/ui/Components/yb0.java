package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class yb0 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yb0(org.telegram.ui.ot otVar, ArrayList arrayList, boolean z10) {
        this.c = otVar;
        this.d = arrayList;
        this.b = z10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(new PremiumPreviewFragment(0, this.b ? "lastseen" : "readtime"));
                    f3Var.dismiss();
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.ot otVar = (org.telegram.ui.ot) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                org.telegram.ui.st stVar = otVar.a;
                if (stVar.w != null && stVar.l != null) {
                    int intValue = ((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue();
                    if (intValue == 0) {
                        stVar.l.B(stVar.W);
                    } else if (intValue == 1) {
                        stVar.l.u(stVar.W);
                    } else if (intValue == 2) {
                        stVar.l.u(null);
                    } else if (intValue == 3) {
                        stVar.l.H(stVar.W);
                    } else if (intValue == 4) {
                        stVar.l.p(stVar.W);
                    } else if (intValue == 5) {
                        MediaDataController.getInstance(stVar.r).addRecentSticker(2, stVar.b0, stVar.W, (int) (System.currentTimeMillis() / 1000), this.b);
                    }
                    stVar.p();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ yb0(boolean z10, org.telegram.ui.ActionBar.f3 f3Var, Runnable runnable) {
        this.b = z10;
        this.c = f3Var;
        this.d = runnable;
    }
}
