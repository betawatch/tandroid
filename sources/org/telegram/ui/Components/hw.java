package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class hw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rz b;

    public /* synthetic */ hw(rz rzVar, int i10) {
        this.a = i10;
        this.b = rzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rz rzVar = this.b;
                rzVar.Z(false);
                rzVar.F();
                break;
            case 1:
                rz rzVar2 = this.b;
                rzVar2.P.postOnAnimation(new hw(rzVar2, 6));
                break;
            case 2:
                yx yxVar = this.b.R;
                if (yxVar != null) {
                    yxVar.F(true);
                    break;
                }
                break;
            case 3:
                rz rzVar3 = this.b;
                rzVar3.h0.postOnAnimation(new hw(rzVar3, 6));
                break;
            case 4:
                rz rzVar4 = this.b;
                rzVar4.D0.postOnAnimation(new hw(rzVar4, 6));
                break;
            case 5:
                rz rzVar5 = this.b;
                sy syVar = rzVar5.t1;
                if (syVar != null) {
                    syVar.t(rzVar5.R.h);
                    break;
                }
                break;
            case 6:
                this.b.C();
                break;
            case 7:
                sy syVar2 = this.b.t1;
                if (syVar2 != null) {
                    syVar2.q();
                    break;
                }
                break;
            case 8:
                rz rzVar6 = this.b;
                rzVar6.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(rzVar6.c1).getClientUserId());
                rzVar6.Y1.presentFragment(new nx(bundle));
                break;
            default:
                rz rzVar7 = this.b;
                ArrayList<dy> emojipacks = rzVar7.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).i) {
                        int i11 = rzVar7.R.s.get(EmojiData.dataColored.length + i10);
                        rzVar7.P.B0();
                        rzVar7.W(i11);
                        rzVar7.I(i11, AndroidUtilities.dp(-9.0f));
                        rzVar7.n(null, 0);
                    }
                }
                break;
        }
    }
}
