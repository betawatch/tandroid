package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ov implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wy b;

    public /* synthetic */ ov(wy wyVar, int i9) {
        this.a = i9;
        this.b = wyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wy wyVar = this.b;
                wyVar.Y(false);
                wyVar.F();
                break;
            case 1:
                wy wyVar2 = this.b;
                wyVar2.L.postOnAnimation(new ov(wyVar2, 6));
                break;
            case 2:
                fx fxVar = this.b.N;
                if (fxVar != null) {
                    fxVar.F(true);
                    break;
                }
                break;
            case 3:
                wy wyVar3 = this.b;
                wyVar3.d0.postOnAnimation(new ov(wyVar3, 6));
                break;
            case 4:
                wy wyVar4 = this.b;
                wyVar4.z0.postOnAnimation(new ov(wyVar4, 6));
                break;
            case 5:
                wy wyVar5 = this.b;
                wx wxVar = wyVar5.p1;
                if (wxVar != null) {
                    wxVar.t(wyVar5.N.h);
                    break;
                }
                break;
            case 6:
                this.b.C();
                break;
            case 7:
                wx wxVar2 = this.b.p1;
                if (wxVar2 != null) {
                    wxVar2.q();
                    break;
                }
                break;
            case 8:
                wy wyVar6 = this.b;
                wyVar6.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(wyVar6.Y0).getClientUserId());
                wyVar6.U1.presentFragment(new uw(bundle));
                break;
            default:
                wy wyVar7 = this.b;
                ArrayList<jx> emojipacks = wyVar7.getEmojipacks();
                for (int i9 = 0; i9 < emojipacks.size(); i9++) {
                    if (emojipacks.get(i9).i) {
                        int i10 = wyVar7.N.s.get(EmojiData.dataColored.length + i9);
                        wyVar7.L.B0();
                        wyVar7.V(i10);
                        wyVar7.H(i10, AndroidUtilities.dp(-9.0f));
                        wyVar7.n(null, 0);
                    }
                }
                break;
        }
    }
}
