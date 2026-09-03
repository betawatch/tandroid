package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class to implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp b;

    public /* synthetic */ to(mp mpVar, int i10) {
        this.a = i10;
        this.b = mpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                mp mpVar = this.b;
                mi miVar = mpVar.V;
                if (miVar.v0 != miVar.g0) {
                    mpVar.X.setText(LocaleController.getString(R.string.SetColorAsBackground));
                    mi miVar2 = mpVar.V;
                    miVar2.Q1(miVar2.g0);
                    break;
                } else {
                    mpVar.X.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    mpVar.V.C1();
                    bj bjVar = mpVar.V.o0;
                    boolean z4 = mpVar.K;
                    ra raVar = bjVar.v;
                    ((ArrayList) raVar.e).clear();
                    WallpapersListActivity.z0((ArrayList) raVar.e, z4);
                    raVar.l();
                    break;
                }
            case 1:
                mp mpVar2 = this.b;
                if (!mpVar2.v()) {
                    mpVar2.dismiss();
                    break;
                } else {
                    mpVar2.A(true);
                    mpVar2.E(true);
                    break;
                }
            case 2:
                mp mpVar3 = this.b;
                if (mpVar3.Q == null) {
                    mpVar3.C(!mpVar3.K);
                    break;
                }
                break;
            default:
                this.b.s(false);
                break;
        }
    }
}
