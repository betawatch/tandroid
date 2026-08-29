package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fz b;

    public /* synthetic */ uv(fz fzVar, int i10) {
        this.a = i10;
        this.b = fzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fz fzVar = this.b;
                fzVar.Z(false);
                fzVar.F();
                break;
            case 1:
                fz fzVar2 = this.b;
                fzVar2.L.postOnAnimation(new uv(fzVar2, 6));
                break;
            case 2:
                nx nxVar = this.b.N;
                if (nxVar != null) {
                    nxVar.F(true);
                    break;
                }
                break;
            case 3:
                fz fzVar3 = this.b;
                fzVar3.d0.postOnAnimation(new uv(fzVar3, 6));
                break;
            case 4:
                fz fzVar4 = this.b;
                fzVar4.z0.postOnAnimation(new uv(fzVar4, 6));
                break;
            case 5:
                fz fzVar5 = this.b;
                fy fyVar = fzVar5.p1;
                if (fyVar != null) {
                    fyVar.t(fzVar5.N.h);
                    break;
                }
                break;
            case 6:
                this.b.C();
                break;
            case 7:
                fy fyVar2 = this.b.p1;
                if (fyVar2 != null) {
                    fyVar2.q();
                    break;
                }
                break;
            case 8:
                fz fzVar6 = this.b;
                fzVar6.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(fzVar6.Y0).getClientUserId());
                fzVar6.U1.presentFragment(new bx(bundle));
                break;
            default:
                fz fzVar7 = this.b;
                ArrayList<rx> emojipacks = fzVar7.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).i) {
                        int i11 = fzVar7.N.s.get(EmojiData.dataColored.length + i10);
                        fzVar7.L.B0();
                        fzVar7.W(i11);
                        fzVar7.H(i11, AndroidUtilities.dp(-9.0f));
                        fzVar7.n(null, 0);
                    }
                }
                break;
        }
    }
}
