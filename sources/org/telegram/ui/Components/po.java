package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class po implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ gp b;

    public /* synthetic */ po(gp gpVar, int i10) {
        this.a = i10;
        this.b = gpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                gp gpVar = this.b;
                ni niVar = gpVar.U;
                if (niVar.u0 != niVar.f0) {
                    gpVar.W.setText(LocaleController.getString(R.string.SetColorAsBackground));
                    ni niVar2 = gpVar.U;
                    niVar2.Q1(niVar2.f0);
                    break;
                } else {
                    gpVar.W.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    gpVar.U.C1();
                    bj bjVar = gpVar.U.n0;
                    boolean z10 = gpVar.J;
                    wa waVar = bjVar.v;
                    ((ArrayList) waVar.e).clear();
                    WallpapersListActivity.z0((ArrayList) waVar.e, z10);
                    waVar.l();
                    break;
                }
            case 1:
                gp gpVar2 = this.b;
                if (!gpVar2.v()) {
                    gpVar2.dismiss();
                    break;
                } else {
                    gpVar2.A(true);
                    gpVar2.E(true);
                    break;
                }
            case 2:
                gp gpVar3 = this.b;
                if (gpVar3.P == null) {
                    gpVar3.C(!gpVar3.J);
                    break;
                }
                break;
            default:
                this.b.s(false);
                break;
        }
    }
}
