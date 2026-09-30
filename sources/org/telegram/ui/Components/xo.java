package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xo implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ op b;

    public /* synthetic */ xo(op opVar, int i10) {
        this.a = i10;
        this.b = opVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                op opVar = this.b;
                wi wiVar = opVar.Y;
                if (wiVar.y0 != wiVar.j0) {
                    opVar.a0.setText(LocaleController.getString(R.string.SetColorAsBackground));
                    wi wiVar2 = opVar.Y;
                    wiVar2.Q1(wiVar2.j0);
                    break;
                } else {
                    opVar.a0.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    opVar.Y.C1();
                    lj ljVar = opVar.Y.r0;
                    boolean z10 = opVar.N;
                    za zaVar = ljVar.v;
                    ((ArrayList) zaVar.e).clear();
                    WallpapersListActivity.z0((ArrayList) zaVar.e, z10);
                    zaVar.l();
                    break;
                }
            case 1:
                op opVar2 = this.b;
                if (!opVar2.v()) {
                    opVar2.dismiss();
                    break;
                } else {
                    opVar2.z(true);
                    opVar2.F(true);
                    break;
                }
            case 2:
                op opVar3 = this.b;
                if (opVar3.T == null) {
                    opVar3.B(!opVar3.N);
                    break;
                }
                break;
            default:
                this.b.s(false);
                break;
        }
    }
}
