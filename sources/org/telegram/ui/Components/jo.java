package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jo implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ap b;

    public /* synthetic */ jo(ap apVar, int i10) {
        this.a = i10;
        this.b = apVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ap apVar = this.b;
                gi giVar = apVar.U;
                if (giVar.u0 != giVar.f0) {
                    apVar.W.setText(LocaleController.getString(R.string.SetColorAsBackground));
                    gi giVar2 = apVar.U;
                    giVar2.Q1(giVar2.f0);
                    break;
                } else {
                    apVar.W.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    apVar.U.C1();
                    ui uiVar = apVar.U.n0;
                    boolean z10 = apVar.J;
                    pa paVar = uiVar.v;
                    ((ArrayList) paVar.e).clear();
                    WallpapersListActivity.z0((ArrayList) paVar.e, z10);
                    paVar.l();
                    break;
                }
            case 1:
                ap apVar2 = this.b;
                if (!apVar2.w()) {
                    apVar2.dismiss();
                    break;
                } else {
                    apVar2.B(true);
                    apVar2.F(true);
                    break;
                }
            case 2:
                ap apVar3 = this.b;
                if (apVar3.P == null) {
                    apVar3.D(!apVar3.J);
                    break;
                }
                break;
            default:
                this.b.t(false);
                break;
        }
    }
}
