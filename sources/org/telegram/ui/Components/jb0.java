package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class jb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yb0 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ jb0(yb0 yb0Var, Context context, int i10) {
        this.a = i10;
        this.b = yb0Var;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yb0 yb0Var = this.b;
                yb0Var.c0.a(false);
                AndroidUtilities.runOnUIThread(new jb0(yb0Var, this.c, 1));
                break;
            default:
                Context context = this.c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new qg.a1(context, 43, this.b.c0.F).show();
                    break;
                }
                break;
        }
    }
}
