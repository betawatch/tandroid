package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class g8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i8 b;
    public final /* synthetic */ String c;

    public /* synthetic */ g8(i8 i8Var, String str, int i10) {
        this.a = i10;
        this.b = i8Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i8 i8Var = this.b;
                String str = this.c;
                i8Var.f = null;
                AndroidUtilities.runOnUIThread(new g8(i8Var, str, 1));
                break;
            default:
                i8 i8Var2 = this.b;
                String str2 = this.c;
                i8Var2.getClass();
                Utilities.searchQueue.postRunnable(new h8(i8Var2, str2, new ArrayList(i8Var2.n.x0)));
                break;
        }
    }
}
