package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class ew implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kz b;

    public /* synthetic */ ew(kz kzVar, int i10) {
        this.a = i10;
        this.b = kzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kz kzVar = this.b;
                kzVar.X(false);
                kzVar.E();
                break;
            case 1:
                tx txVar = this.b.R;
                if (txVar != null) {
                    txVar.F(true);
                    break;
                }
                break;
            case 2:
                kz kzVar2 = this.b;
                ly lyVar = kzVar2.t1;
                if (lyVar != null) {
                    lyVar.t(kzVar2.R.h);
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
                kz kzVar3 = this.b;
                kzVar3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(kzVar3.c1).getClientUserId());
                kzVar3.Y1.presentFragment(new ix(bundle));
                break;
            default:
                kz kzVar4 = this.b;
                ArrayList<xx> emojipacks = kzVar4.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).i) {
                        int i11 = kzVar4.R.s.get(EmojiData.dataColored.length + i10);
                        kzVar4.P.C0();
                        kzVar4.U(i11);
                        kzVar4.G(i11, AndroidUtilities.dp(-9.0f));
                        kzVar4.n(0, null);
                    }
                }
                break;
        }
    }
}
