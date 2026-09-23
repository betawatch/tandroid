package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ew implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lz b;

    public /* synthetic */ ew(lz lzVar, int i10) {
        this.a = i10;
        this.b = lzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lz lzVar = this.b;
                lzVar.X(false);
                lzVar.E();
                break;
            case 1:
                tx txVar = this.b.R;
                if (txVar != null) {
                    txVar.F(true);
                    break;
                }
                break;
            case 2:
                lz lzVar2 = this.b;
                ly lyVar = lzVar2.t1;
                if (lyVar != null) {
                    lyVar.t(lzVar2.R.h);
                    break;
                }
                break;
            case 3:
                ly lyVar2 = this.b.t1;
                if (lyVar2 != null) {
                    lyVar2.q();
                    break;
                }
                break;
            case 4:
                lz lzVar3 = this.b;
                lzVar3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(lzVar3.c1).getClientUserId());
                lzVar3.Y1.presentFragment(new ix(bundle));
                break;
            default:
                lz lzVar4 = this.b;
                ArrayList<xx> emojipacks = lzVar4.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).i) {
                        int i11 = lzVar4.R.s.get(EmojiData.dataColored.length + i10);
                        lzVar4.P.B0();
                        lzVar4.U(i11);
                        lzVar4.G(i11, AndroidUtilities.dp(-9.0f));
                        lzVar4.n(0, null);
                    }
                }
                break;
        }
    }
}
