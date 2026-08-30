package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ro implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ kp b;

    public /* synthetic */ ro(kp kpVar, int i10) {
        this.a = i10;
        this.b = kpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                kp kpVar = this.b;
                li liVar = kpVar.V;
                if (liVar.v0 != liVar.g0) {
                    kpVar.X.setText(LocaleController.getString(R.string.SetColorAsBackground));
                    li liVar2 = kpVar.V;
                    liVar2.Q1(liVar2.g0);
                    break;
                } else {
                    kpVar.X.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    kpVar.V.C1();
                    zi ziVar = kpVar.V.o0;
                    boolean z4 = kpVar.K;
                    ra raVar = ziVar.v;
                    ((ArrayList) raVar.e).clear();
                    WallpapersListActivity.z0((ArrayList) raVar.e, z4);
                    raVar.l();
                    break;
                }
            case 1:
                kp kpVar2 = this.b;
                if (!kpVar2.v()) {
                    kpVar2.dismiss();
                    break;
                } else {
                    kpVar2.A(true);
                    kpVar2.E(true);
                    break;
                }
            case 2:
                kp kpVar3 = this.b;
                if (kpVar3.Q == null) {
                    kpVar3.C(!kpVar3.K);
                    break;
                }
                break;
            default:
                this.b.s(false);
                break;
        }
    }
}
