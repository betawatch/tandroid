package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class aw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mz b;

    public /* synthetic */ aw(mz mzVar, int i10) {
        this.a = i10;
        this.b = mzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mz mzVar = this.b;
                mzVar.Z(false);
                mzVar.F();
                break;
            case 1:
                mz mzVar2 = this.b;
                mzVar2.M.postOnAnimation(new aw(mzVar2, 6));
                break;
            case 2:
                tx txVar = this.b.O;
                if (txVar != null) {
                    txVar.F(true);
                    break;
                }
                break;
            case 3:
                mz mzVar3 = this.b;
                mzVar3.e0.postOnAnimation(new aw(mzVar3, 6));
                break;
            case 4:
                mz mzVar4 = this.b;
                mzVar4.A0.postOnAnimation(new aw(mzVar4, 6));
                break;
            case 5:
                mz mzVar5 = this.b;
                my myVar = mzVar5.q1;
                if (myVar != null) {
                    myVar.t(mzVar5.O.h);
                    break;
                }
                break;
            case 6:
                this.b.C();
                break;
            case 7:
                my myVar2 = this.b.q1;
                if (myVar2 != null) {
                    myVar2.q();
                    break;
                }
                break;
            case 8:
                mz mzVar6 = this.b;
                mzVar6.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(mzVar6.Z0).getClientUserId());
                mzVar6.V1.presentFragment(new ix(bundle));
                break;
            default:
                mz mzVar7 = this.b;
                ArrayList<xx> emojipacks = mzVar7.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).i) {
                        int i11 = mzVar7.O.s.get(EmojiData.dataColored.length + i10);
                        mzVar7.M.B0();
                        mzVar7.W(i11);
                        mzVar7.H(i11, AndroidUtilities.dp(-9.0f));
                        mzVar7.n(null, 0);
                    }
                }
                break;
        }
    }
}
