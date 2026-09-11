package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class cw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kz b;

    public /* synthetic */ cw(kz kzVar, int i10) {
        this.a = i10;
        this.b = kzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kz kzVar = this.b;
                kzVar.Z(false);
                kzVar.G();
                break;
            case 1:
                kz kzVar2 = this.b;
                kzVar2.P.postOnAnimation(new cw(kzVar2, 6));
                break;
            case 2:
                tx txVar = this.b.R;
                if (txVar != null) {
                    txVar.F(true);
                    break;
                }
                break;
            case 3:
                kz kzVar3 = this.b;
                kzVar3.h0.postOnAnimation(new cw(kzVar3, 6));
                break;
            case 4:
                kz kzVar4 = this.b;
                kzVar4.D0.postOnAnimation(new cw(kzVar4, 6));
                break;
            case 5:
                kz kzVar5 = this.b;
                ly lyVar = kzVar5.t1;
                if (lyVar != null) {
                    lyVar.t(kzVar5.R.h);
                    break;
                }
                break;
            case 6:
                this.b.C();
                break;
            case 7:
                ly lyVar2 = this.b.t1;
                if (lyVar2 != null) {
                    lyVar2.q();
                    break;
                }
                break;
            case 8:
                kz kzVar6 = this.b;
                kzVar6.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(kzVar6.c1).getClientUserId());
                kzVar6.Y1.presentFragment(new ix(bundle));
                break;
            default:
                kz kzVar7 = this.b;
                ArrayList<xx> emojipacks = kzVar7.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).i) {
                        int i11 = kzVar7.R.s.get(EmojiData.dataColored.length + i10);
                        kzVar7.P.B0();
                        kzVar7.W(i11);
                        kzVar7.I(i11, AndroidUtilities.dp(-9.0f));
                        kzVar7.n(null, 0);
                    }
                }
                break;
        }
    }
}
