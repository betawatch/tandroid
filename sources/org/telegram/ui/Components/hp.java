package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hp implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yp b;

    public /* synthetic */ hp(yp ypVar, int i10) {
        this.a = i10;
        this.b = ypVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                yp ypVar = this.b;
                ti tiVar = ypVar.X;
                if (tiVar.B0 != tiVar.j0) {
                    ypVar.Z.setText(LocaleController.getString(R.string.SetColorAsBackground));
                    ti tiVar2 = ypVar.X;
                    tiVar2.X1(tiVar2.j0);
                    break;
                } else {
                    ypVar.Z.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    ypVar.X.H1();
                    ij ijVar = ypVar.X.r0;
                    boolean z10 = ypVar.M;
                    za zaVar = ijVar.v;
                    ((ArrayList) zaVar.e).clear();
                    WallpapersListActivity.A0((ArrayList) zaVar.e, z10);
                    zaVar.l();
                    break;
                }
            case 1:
                yp ypVar2 = this.b;
                if (!ypVar2.A()) {
                    ypVar2.dismiss();
                    break;
                } else {
                    ypVar2.F(true);
                    ypVar2.L(true);
                    break;
                }
            case 2:
                yp ypVar3 = this.b;
                if (ypVar3.S == null) {
                    ypVar3.H(!ypVar3.M);
                    break;
                }
                break;
            default:
                this.b.u(false);
                break;
        }
    }
}
