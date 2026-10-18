package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fp implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wp b;

    public /* synthetic */ fp(wp wpVar, int i10) {
        this.a = i10;
        this.b = wpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                wp wpVar = this.b;
                ti tiVar = wpVar.Y;
                if (tiVar.B0 != tiVar.j0) {
                    wpVar.a0.setText(LocaleController.getString(R.string.SetColorAsBackground));
                    ti tiVar2 = wpVar.Y;
                    tiVar2.U1(tiVar2.j0);
                    break;
                } else {
                    wpVar.a0.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    wpVar.Y.F1();
                    ij ijVar = wpVar.Y.r0;
                    boolean z10 = wpVar.N;
                    za zaVar = ijVar.v;
                    ((ArrayList) zaVar.e).clear();
                    WallpapersListActivity.z0((ArrayList) zaVar.e, z10);
                    zaVar.l();
                    break;
                }
            case 1:
                wp wpVar2 = this.b;
                if (!wpVar2.x()) {
                    wpVar2.dismiss();
                    break;
                } else {
                    wpVar2.B(true);
                    wpVar2.G(true);
                    break;
                }
            case 2:
                wp wpVar3 = this.b;
                if (wpVar3.T == null) {
                    wpVar3.D(!wpVar3.N);
                    break;
                }
                break;
            default:
                this.b.t(false);
                break;
        }
    }
}
