package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lo implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ cp b;

    public /* synthetic */ lo(cp cpVar, int i9) {
        this.a = i9;
        this.b = cpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                cp cpVar = this.b;
                ki kiVar = cpVar.U;
                if (kiVar.u0 != kiVar.f0) {
                    cpVar.W.setText(LocaleController.getString(R.string.SetColorAsBackground));
                    ki kiVar2 = cpVar.U;
                    kiVar2.Q1(kiVar2.f0);
                    break;
                } else {
                    cpVar.W.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    cpVar.U.C1();
                    yi yiVar = cpVar.U.n0;
                    boolean z10 = cpVar.J;
                    ra raVar = yiVar.v;
                    ((ArrayList) raVar.e).clear();
                    WallpapersListActivity.y0((ArrayList) raVar.e, z10);
                    raVar.l();
                    break;
                }
            case 1:
                cp cpVar2 = this.b;
                if (!cpVar2.v()) {
                    cpVar2.dismiss();
                    break;
                } else {
                    cpVar2.z(true);
                    cpVar2.E(true);
                    break;
                }
            case 2:
                cp cpVar3 = this.b;
                if (cpVar3.P == null) {
                    cpVar3.C(!cpVar3.J);
                    break;
                }
                break;
            default:
                this.b.s(false);
                break;
        }
    }
}
