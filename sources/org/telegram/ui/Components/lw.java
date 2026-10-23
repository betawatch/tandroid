package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tz b;

    public /* synthetic */ lw(tz tzVar, int i10) {
        this.a = i10;
        this.b = tzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                tz tzVar = this.b;
                tzVar.X(false);
                tzVar.D();
                break;
            case 1:
                ay ayVar = this.b.R;
                if (ayVar != null) {
                    ayVar.F(true);
                    break;
                }
                break;
            case 2:
                tz tzVar2 = this.b;
                uy uyVar = tzVar2.t1;
                if (uyVar != null) {
                    uyVar.t(tzVar2.R.h);
                    break;
                }
                break;
            case 3:
                uy uyVar2 = this.b.t1;
                if (uyVar2 != null) {
                    uyVar2.q();
                    break;
                }
                break;
            case 4:
                tz tzVar3 = this.b;
                tzVar3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(tzVar3.c1).getClientUserId());
                tzVar3.Y1.presentFragment(new px(bundle));
                break;
            default:
                tz tzVar4 = this.b;
                ArrayList<fy> emojipacks = tzVar4.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).i) {
                        int i11 = tzVar4.R.s.get(EmojiData.dataColored.length + i10);
                        tzVar4.P.B0();
                        tzVar4.U(i11);
                        tzVar4.F(i11, AndroidUtilities.dp(-9.0f));
                        tzVar4.n(0, null);
                    }
                }
                break;
        }
    }
}
