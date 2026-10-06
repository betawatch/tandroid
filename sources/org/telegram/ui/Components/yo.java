package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class yo implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ pp b;

    public /* synthetic */ yo(pp ppVar, int i10) {
        this.a = i10;
        this.b = ppVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                pp ppVar = this.b;
                xi xiVar = ppVar.Y;
                if (xiVar.y0 != xiVar.j0) {
                    ppVar.a0.setText(LocaleController.getString(R.string.SetColorAsBackground));
                    xi xiVar2 = ppVar.Y;
                    xiVar2.P1(xiVar2.j0);
                    break;
                } else {
                    ppVar.a0.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    ppVar.Y.B1();
                    mj mjVar = ppVar.Y.r0;
                    boolean z10 = ppVar.N;
                    ab abVar = mjVar.v;
                    ((ArrayList) abVar.e).clear();
                    WallpapersListActivity.z0((ArrayList) abVar.e, z10);
                    abVar.l();
                    break;
                }
            case 1:
                pp ppVar2 = this.b;
                if (!ppVar2.v()) {
                    ppVar2.dismiss();
                    break;
                } else {
                    ppVar2.z(true);
                    ppVar2.D(true);
                    break;
                }
            case 2:
                pp ppVar3 = this.b;
                if (ppVar3.T == null) {
                    ppVar3.B(!ppVar3.N);
                    break;
                }
                break;
            default:
                this.b.s(false);
                break;
        }
    }
}
