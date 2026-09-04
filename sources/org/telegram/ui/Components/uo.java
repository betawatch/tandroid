package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class uo implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ lp b;

    public /* synthetic */ uo(lp lpVar, int i10) {
        this.a = i10;
        this.b = lpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                lp lpVar = this.b;
                vi viVar = lpVar.Y;
                if (viVar.y0 != viVar.j0) {
                    lpVar.a0.setText(LocaleController.getString(R.string.SetColorAsBackground));
                    vi viVar2 = lpVar.Y;
                    viVar2.Q1(viVar2.j0);
                    break;
                } else {
                    lpVar.a0.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    lpVar.Y.C1();
                    jj jjVar = lpVar.Y.r0;
                    boolean z10 = lpVar.N;
                    za zaVar = jjVar.v;
                    ((ArrayList) zaVar.e).clear();
                    WallpapersListActivity.z0((ArrayList) zaVar.e, z10);
                    zaVar.l();
                    break;
                }
            case 1:
                lp lpVar2 = this.b;
                if (!lpVar2.v()) {
                    lpVar2.dismiss();
                    break;
                } else {
                    lpVar2.A(true);
                    lpVar2.F(true);
                    break;
                }
            case 2:
                lp lpVar3 = this.b;
                if (lpVar3.T == null) {
                    lpVar3.C(!lpVar3.N);
                    break;
                }
                break;
            default:
                this.b.s(false);
                break;
        }
    }
}
