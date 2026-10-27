package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ip implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zp b;

    public /* synthetic */ ip(zp zpVar, int i10) {
        this.a = i10;
        this.b = zpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                zp zpVar = this.b;
                ti tiVar = zpVar.X;
                if (tiVar.B0 != tiVar.j0) {
                    zpVar.Z.setText(LocaleController.getString(R.string.SetColorAsBackground));
                    ti tiVar2 = zpVar.X;
                    tiVar2.Y1(tiVar2.j0);
                    break;
                } else {
                    zpVar.Z.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    zpVar.X.I1();
                    ij ijVar = zpVar.X.r0;
                    boolean z10 = zpVar.M;
                    za zaVar = ijVar.v;
                    ((ArrayList) zaVar.e).clear();
                    WallpapersListActivity.A0((ArrayList) zaVar.e, z10);
                    zaVar.l();
                    break;
                }
            case 1:
                zp zpVar2 = this.b;
                if (!zpVar2.A()) {
                    zpVar2.dismiss();
                    break;
                } else {
                    zpVar2.F(true);
                    zpVar2.L(true);
                    break;
                }
            case 2:
                zp zpVar3 = this.b;
                if (zpVar3.S == null) {
                    zpVar3.H(!zpVar3.M);
                    break;
                }
                break;
            default:
                this.b.u(false);
                break;
        }
    }
}
