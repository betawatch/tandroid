package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class pw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wz b;

    public /* synthetic */ pw(wz wzVar, int i10) {
        this.a = i10;
        this.b = wzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wz wzVar = this.b;
                wzVar.X(false);
                wzVar.E();
                break;
            case 1:
                fy fyVar = this.b.R;
                if (fyVar != null) {
                    fyVar.F(true);
                    break;
                }
                break;
            case 2:
                wz wzVar2 = this.b;
                wy wyVar = wzVar2.t1;
                if (wyVar != null) {
                    wyVar.t(wzVar2.R.h);
                    break;
                }
                break;
            case 3:
                wy wyVar2 = this.b.t1;
                if (wyVar2 != null) {
                    wyVar2.q();
                    break;
                }
                break;
            case 4:
                wz wzVar3 = this.b;
                wzVar3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(wzVar3.c1).getClientUserId());
                wzVar3.Y1.presentFragment(new tx(bundle));
                break;
            default:
                wz wzVar4 = this.b;
                ArrayList<jy> emojipacks = wzVar4.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).i) {
                        int i11 = wzVar4.R.s.get(EmojiData.dataColored.length + i10);
                        wzVar4.P.B0();
                        wzVar4.U(i11);
                        wzVar4.G(i11, AndroidUtilities.dp(-9.0f));
                        wzVar4.n(0, null);
                    }
                }
                break;
        }
    }
}
