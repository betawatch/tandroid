package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class xt0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yt0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ xt0(yt0 yt0Var, String str, int i10) {
        this.a = i10;
        this.b = yt0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yt0 yt0Var = this.b;
                String str = this.c;
                yt0Var.getClass();
                AndroidUtilities.runOnUIThread(new xt0(yt0Var, str, 1));
                break;
            default:
                yt0 yt0Var2 = this.b;
                String str2 = this.c;
                ArrayList arrayList = null;
                yt0Var2.f = null;
                if (!ChatObject.isChannel(yt0Var2.n) && yt0Var2.s.d1 != null) {
                    arrayList = new ArrayList(yt0Var2.s.d1.participants.participants);
                }
                yt0Var2.r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new gf(yt0Var2, str2, arrayList, 25));
                } else {
                    yt0Var2.r = 1;
                }
                yt0Var2.e.g(str2, false, false, true, false, ChatObject.isChannel(yt0Var2.n) ? yt0Var2.n.id : 0L, false, 2, 1);
                break;
        }
    }
}
