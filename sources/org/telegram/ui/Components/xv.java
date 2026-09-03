package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kz b;

    public /* synthetic */ xv(kz kzVar, int i10) {
        this.a = i10;
        this.b = kzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kz kzVar = this.b;
                kzVar.Z(false);
                kzVar.F();
                break;
            case 1:
                kz kzVar2 = this.b;
                kzVar2.M.postOnAnimation(new xv(kzVar2, 6));
                break;
            case 2:
                rx rxVar = this.b.O;
                if (rxVar != null) {
                    rxVar.F(true);
                    break;
                }
                break;
            case 3:
                kz kzVar3 = this.b;
                kzVar3.e0.postOnAnimation(new xv(kzVar3, 6));
                break;
            case 4:
                kz kzVar4 = this.b;
                kzVar4.A0.postOnAnimation(new xv(kzVar4, 6));
                break;
            case 5:
                kz kzVar5 = this.b;
                ky kyVar = kzVar5.q1;
                if (kyVar != null) {
                    kyVar.t(kzVar5.O.h);
                    break;
                }
                break;
            case 6:
                this.b.C();
                break;
            case 7:
                ky kyVar2 = this.b.q1;
                if (kyVar2 != null) {
                    kyVar2.q();
                    break;
                }
                break;
            case 8:
                kz kzVar6 = this.b;
                kzVar6.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(kzVar6.Z0).getClientUserId());
                kzVar6.V1.presentFragment(new gx(bundle));
                break;
            default:
                kz kzVar7 = this.b;
                ArrayList<vx> emojipacks = kzVar7.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).i) {
                        int i11 = kzVar7.O.s.get(EmojiData.dataColored.length + i10);
                        kzVar7.M.B0();
                        kzVar7.W(i11);
                        kzVar7.H(i11, AndroidUtilities.dp(-9.0f));
                        kzVar7.n(null, 0);
                    }
                }
                break;
        }
    }
}
