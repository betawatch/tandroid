package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yy b;

    public /* synthetic */ nv(yy yyVar, int i10) {
        this.a = i10;
        this.b = yyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yy yyVar = this.b;
                yyVar.Z(false);
                yyVar.G();
                break;
            case 1:
                yy yyVar2 = this.b;
                yyVar2.L.postOnAnimation(new nv(yyVar2, 6));
                break;
            case 2:
                gx gxVar = this.b.N;
                if (gxVar != null) {
                    gxVar.F(true);
                    break;
                }
                break;
            case 3:
                yy yyVar3 = this.b;
                yyVar3.d0.postOnAnimation(new nv(yyVar3, 6));
                break;
            case 4:
                yy yyVar4 = this.b;
                yyVar4.z0.postOnAnimation(new nv(yyVar4, 6));
                break;
            case 5:
                yy yyVar5 = this.b;
                xx xxVar = yyVar5.p1;
                if (xxVar != null) {
                    xxVar.t(yyVar5.N.h);
                    break;
                }
                break;
            case 6:
                this.b.D();
                break;
            case 7:
                xx xxVar2 = this.b.p1;
                if (xxVar2 != null) {
                    xxVar2.q();
                    break;
                }
                break;
            case 8:
                yy yyVar6 = this.b;
                yyVar6.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(yyVar6.Y0).getClientUserId());
                yyVar6.U1.presentFragment(new uw(bundle));
                break;
            default:
                yy yyVar7 = this.b;
                ArrayList<kx> emojipacks = yyVar7.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).i) {
                        int i11 = yyVar7.N.s.get(EmojiData.dataColored.length + i10);
                        yyVar7.L.B0();
                        yyVar7.W(i11);
                        yyVar7.I(i11, AndroidUtilities.dp(-9.0f));
                        yyVar7.n(null, 0);
                    }
                }
                break;
        }
    }
}
