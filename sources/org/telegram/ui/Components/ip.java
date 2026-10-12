package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                vi viVar = zpVar.Y;
                if (viVar.B0 != viVar.j0) {
                    zpVar.a0.setText(LocaleController.getString(R.string.SetColorAsBackground));
                    vi viVar2 = zpVar.Y;
                    viVar2.U1(viVar2.j0);
                    break;
                } else {
                    zpVar.a0.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    zpVar.Y.F1();
                    kj kjVar = zpVar.Y.r0;
                    boolean z10 = zpVar.N;
                    bb bbVar = kjVar.v;
                    ((ArrayList) bbVar.e).clear();
                    WallpapersListActivity.z0((ArrayList) bbVar.e, z10);
                    bbVar.l();
                    break;
                }
            case 1:
                zp zpVar2 = this.b;
                if (!zpVar2.x()) {
                    zpVar2.dismiss();
                    break;
                } else {
                    zpVar2.B(true);
                    zpVar2.G(true);
                    break;
                }
            case 2:
                zp zpVar3 = this.b;
                if (zpVar3.T == null) {
                    zpVar3.E(!zpVar3.N);
                    break;
                }
                break;
            default:
                this.b.u(false);
                break;
        }
    }
}
