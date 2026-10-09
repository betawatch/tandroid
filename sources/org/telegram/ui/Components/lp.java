package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lp implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ cq b;

    public /* synthetic */ lp(cq cqVar, int i10) {
        this.a = i10;
        this.b = cqVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                cq cqVar = this.b;
                yi yiVar = cqVar.Y;
                if (yiVar.B0 != yiVar.j0) {
                    cqVar.a0.setText(LocaleController.getString(R.string.SetColorAsBackground));
                    yi yiVar2 = cqVar.Y;
                    yiVar2.U1(yiVar2.j0);
                    break;
                } else {
                    cqVar.a0.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    cqVar.Y.F1();
                    nj njVar = cqVar.Y.r0;
                    boolean z10 = cqVar.N;
                    cb cbVar = njVar.v;
                    ((ArrayList) cbVar.e).clear();
                    WallpapersListActivity.z0((ArrayList) cbVar.e, z10);
                    cbVar.l();
                    break;
                }
            case 1:
                cq cqVar2 = this.b;
                if (!cqVar2.x()) {
                    cqVar2.dismiss();
                    break;
                } else {
                    cqVar2.C(true);
                    cqVar2.G(true);
                    break;
                }
            case 2:
                cq cqVar3 = this.b;
                if (cqVar3.T == null) {
                    cqVar3.E(!cqVar3.N);
                    break;
                }
                break;
            default:
                this.b.u(false);
                break;
        }
    }
}
