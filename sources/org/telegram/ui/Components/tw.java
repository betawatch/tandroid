package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a00 b;

    public /* synthetic */ tw(a00 a00Var, int i10) {
        this.a = i10;
        this.b = a00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a00 a00Var = this.b;
                a00Var.X(false);
                a00Var.E();
                break;
            case 1:
                jy jyVar = this.b.R;
                if (jyVar != null) {
                    jyVar.F(true);
                    break;
                }
                break;
            case 2:
                a00 a00Var2 = this.b;
                az azVar = a00Var2.t1;
                if (azVar != null) {
                    azVar.t(a00Var2.R.h);
                    break;
                }
                break;
            case 3:
                az azVar2 = this.b.t1;
                if (azVar2 != null) {
                    azVar2.q();
                    break;
                }
                break;
            case 4:
                a00 a00Var3 = this.b;
                a00Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(a00Var3.c1).getClientUserId());
                a00Var3.Y1.presentFragment(new xx(bundle));
                break;
            default:
                a00 a00Var4 = this.b;
                ArrayList<ny> emojipacks = a00Var4.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).i) {
                        int i11 = a00Var4.R.s.get(EmojiData.dataColored.length + i10);
                        a00Var4.P.B0();
                        a00Var4.U(i11);
                        a00Var4.G(i11, AndroidUtilities.dp(-9.0f));
                        a00Var4.o(0, null);
                    }
                }
                break;
        }
    }
}
