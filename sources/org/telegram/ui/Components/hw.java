package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class hw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nz b;

    public /* synthetic */ hw(nz nzVar, int i10) {
        this.a = i10;
        this.b = nzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nz nzVar = this.b;
                nzVar.W(false);
                nzVar.C();
                break;
            case 1:
                wx wxVar = this.b.R;
                if (wxVar != null) {
                    wxVar.F(true);
                    break;
                }
                break;
            case 2:
                nz nzVar2 = this.b;
                oy oyVar = nzVar2.t1;
                if (oyVar != null) {
                    oyVar.t(nzVar2.R.h);
                    break;
                }
                break;
            case 3:
                oy oyVar2 = this.b.t1;
                if (oyVar2 != null) {
                    oyVar2.q();
                    break;
                }
                break;
            case 4:
                nz nzVar3 = this.b;
                nzVar3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(nzVar3.c1).getClientUserId());
                nzVar3.Y1.presentFragment(new lx(bundle));
                break;
            default:
                nz nzVar4 = this.b;
                ArrayList<ay> emojipacks = nzVar4.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).i) {
                        int i11 = nzVar4.R.s.get(EmojiData.dataColored.length + i10);
                        nzVar4.P.C0();
                        nzVar4.S(i11);
                        nzVar4.E(i11, AndroidUtilities.dp(-9.0f));
                        nzVar4.n(0, null);
                    }
                }
                break;
        }
    }
}
