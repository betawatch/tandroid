package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class bp implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sp b;

    public /* synthetic */ bp(sp spVar, int i10) {
        this.a = i10;
        this.b = spVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                sp spVar = this.b;
                yi yiVar = spVar.Y;
                if (yiVar.y0 != yiVar.j0) {
                    spVar.a0.setText(LocaleController.getString(R.string.SetColorAsBackground));
                    yi yiVar2 = spVar.Y;
                    yiVar2.Q1(yiVar2.j0);
                    break;
                } else {
                    spVar.a0.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    spVar.Y.C1();
                    mj mjVar = spVar.Y.r0;
                    boolean z10 = spVar.N;
                    ya yaVar = mjVar.v;
                    ((ArrayList) yaVar.e).clear();
                    WallpapersListActivity.z0((ArrayList) yaVar.e, z10);
                    yaVar.l();
                    break;
                }
            case 1:
                sp spVar2 = this.b;
                if (!spVar2.v()) {
                    spVar2.dismiss();
                    break;
                } else {
                    spVar2.z(true);
                    spVar2.E(true);
                    break;
                }
            case 2:
                sp spVar3 = this.b;
                if (spVar3.T == null) {
                    spVar3.C(!spVar3.N);
                    break;
                }
                break;
            default:
                this.b.s(false);
                break;
        }
    }
}
