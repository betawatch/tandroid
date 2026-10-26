package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sz b;

    public /* synthetic */ lw(sz szVar, int i10) {
        this.a = i10;
        this.b = szVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sz szVar = this.b;
                szVar.X(false);
                szVar.D();
                break;
            case 1:
                zx zxVar = this.b.R;
                if (zxVar != null) {
                    zxVar.F(true);
                    break;
                }
                break;
            case 2:
                sz szVar2 = this.b;
                ty tyVar = szVar2.t1;
                if (tyVar != null) {
                    tyVar.t(szVar2.R.h);
                    break;
                }
                break;
            case 3:
                ty tyVar2 = this.b.t1;
                if (tyVar2 != null) {
                    tyVar2.q();
                    break;
                }
                break;
            case 4:
                sz szVar3 = this.b;
                szVar3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(szVar3.c1).getClientUserId());
                szVar3.Y1.presentFragment(new ox(bundle));
                break;
            default:
                sz szVar4 = this.b;
                ArrayList<ey> emojipacks = szVar4.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).i) {
                        int i11 = szVar4.R.s.get(EmojiData.dataColored.length + i10);
                        szVar4.P.C0();
                        szVar4.U(i11);
                        szVar4.G(i11, AndroidUtilities.dp(-9.0f));
                        szVar4.n(0, null);
                    }
                }
                break;
        }
    }
}
