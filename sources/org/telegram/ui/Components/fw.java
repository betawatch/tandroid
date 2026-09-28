package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class fw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mz b;

    public /* synthetic */ fw(mz mzVar, int i10) {
        this.a = i10;
        this.b = mzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mz mzVar = this.b;
                mzVar.X(false);
                mzVar.E();
                break;
            case 1:
                vx vxVar = this.b.R;
                if (vxVar != null) {
                    vxVar.F(true);
                    break;
                }
                break;
            case 2:
                mz mzVar2 = this.b;
                ny nyVar = mzVar2.t1;
                if (nyVar != null) {
                    nyVar.t(mzVar2.R.h);
                    break;
                }
                break;
            case 3:
                ny nyVar2 = this.b.t1;
                if (nyVar2 != null) {
                    nyVar2.q();
                    break;
                }
                break;
            case 4:
                mz mzVar3 = this.b;
                mzVar3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(mzVar3.c1).getClientUserId());
                mzVar3.Y1.presentFragment(new kx(bundle));
                break;
            default:
                mz mzVar4 = this.b;
                ArrayList<zx> emojipacks = mzVar4.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).i) {
                        int i11 = mzVar4.R.s.get(EmojiData.dataColored.length + i10);
                        mzVar4.P.B0();
                        mzVar4.U(i11);
                        mzVar4.G(i11, AndroidUtilities.dp(-9.0f));
                        mzVar4.n(0, null);
                    }
                }
                break;
        }
    }
}
