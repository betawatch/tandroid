package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class wo implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;

    public /* synthetic */ wo(np npVar, int i10) {
        this.a = i10;
        this.b = npVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                np npVar = this.b;
                wi wiVar = npVar.Y;
                if (wiVar.y0 != wiVar.j0) {
                    npVar.a0.setText(LocaleController.getString(R.string.SetColorAsBackground));
                    wi wiVar2 = npVar.Y;
                    wiVar2.Q1(wiVar2.j0);
                    break;
                } else {
                    npVar.a0.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    npVar.Y.C1();
                    kj kjVar = npVar.Y.r0;
                    boolean z10 = npVar.N;
                    za zaVar = kjVar.v;
                    ((ArrayList) zaVar.e).clear();
                    WallpapersListActivity.z0((ArrayList) zaVar.e, z10);
                    zaVar.l();
                    break;
                }
            case 1:
                np npVar2 = this.b;
                if (!npVar2.v()) {
                    npVar2.dismiss();
                    break;
                } else {
                    npVar2.z(true);
                    npVar2.F(true);
                    break;
                }
            case 2:
                np npVar3 = this.b;
                if (npVar3.T == null) {
                    npVar3.B(!npVar3.N);
                    break;
                }
                break;
            default:
                this.b.s(false);
                break;
        }
    }
}
