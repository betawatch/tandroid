package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class vo implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp b;

    public /* synthetic */ vo(mp mpVar, int i10) {
        this.a = i10;
        this.b = mpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                mp mpVar = this.b;
                vi viVar = mpVar.Y;
                if (viVar.y0 != viVar.j0) {
                    mpVar.a0.setText(LocaleController.getString(R.string.SetColorAsBackground));
                    vi viVar2 = mpVar.Y;
                    viVar2.Q1(viVar2.j0);
                    break;
                } else {
                    mpVar.a0.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    mpVar.Y.C1();
                    jj jjVar = mpVar.Y.r0;
                    boolean z10 = mpVar.N;
                    za zaVar = jjVar.v;
                    ((ArrayList) zaVar.e).clear();
                    WallpapersListActivity.z0((ArrayList) zaVar.e, z10);
                    zaVar.l();
                    break;
                }
            case 1:
                mp mpVar2 = this.b;
                if (!mpVar2.v()) {
                    mpVar2.dismiss();
                    break;
                } else {
                    mpVar2.z(true);
                    mpVar2.F(true);
                    break;
                }
            case 2:
                mp mpVar3 = this.b;
                if (mpVar3.T == null) {
                    mpVar3.B(!mpVar3.N);
                    break;
                }
                break;
            default:
                this.b.s(false);
                break;
        }
    }
}
