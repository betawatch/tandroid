package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qo implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ jp b;

    public /* synthetic */ qo(jp jpVar, int i10) {
        this.a = i10;
        this.b = jpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                jp jpVar = this.b;
                li liVar = jpVar.V;
                if (liVar.v0 != liVar.g0) {
                    jpVar.X.setText(LocaleController.getString(R.string.SetColorAsBackground));
                    li liVar2 = jpVar.V;
                    liVar2.Q1(liVar2.g0);
                    break;
                } else {
                    jpVar.X.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    jpVar.V.C1();
                    zi ziVar = jpVar.V.o0;
                    boolean z4 = jpVar.K;
                    ra raVar = ziVar.v;
                    ((ArrayList) raVar.e).clear();
                    WallpapersListActivity.z0((ArrayList) raVar.e, z4);
                    raVar.l();
                    break;
                }
            case 1:
                jp jpVar2 = this.b;
                if (!jpVar2.v()) {
                    jpVar2.dismiss();
                    break;
                } else {
                    jpVar2.A(true);
                    jpVar2.E(true);
                    break;
                }
            case 2:
                jp jpVar3 = this.b;
                if (jpVar3.Q == null) {
                    jpVar3.C(!jpVar3.K);
                    break;
                }
                break;
            default:
                this.b.s(false);
                break;
        }
    }
}
