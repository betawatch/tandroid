package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
                ti tiVar = wpVar.X;
                if (tiVar.B0 != tiVar.j0) {
                    wpVar.Z.setText(LocaleController.getString(R.string.SetColorAsBackground));
                    ti tiVar2 = wpVar.X;
                    tiVar2.Y1(tiVar2.j0);
                    break;
                } else {
                    wpVar.Z.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    wpVar.X.I1();
                    ij ijVar = wpVar.X.r0;
                    boolean z10 = wpVar.M;
                    za zaVar = ijVar.v;
                    ((ArrayList) zaVar.e).clear();
                    WallpapersListActivity.z0((ArrayList) zaVar.e, z10);
                    zaVar.l();
                    break;
                }
            case 1:
                wp wpVar2 = this.b;
                if (!wpVar2.A()) {
                    wpVar2.dismiss();
                    break;
                } else {
                    wpVar2.E(true);
                    wpVar2.L(true);
                    break;
                }
            case 2:
                wp wpVar3 = this.b;
                if (wpVar3.S == null) {
                    wpVar3.G(!wpVar3.M);
                    break;
                }
                break;
            default:
                this.b.v(false);
                break;
        }
    }
}
