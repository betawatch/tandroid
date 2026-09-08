package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class n2 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ n2(Runnable runnable, boolean[] zArr) {
        this.c = runnable;
        this.b = zArr;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                Runnable runnable = this.c;
                if (runnable != null && this.b[0]) {
                    runnable.run();
                    break;
                }
                break;
            default:
                boolean[] zArr = this.b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    Runnable runnable2 = this.c;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ n2(boolean[] zArr, Runnable runnable) {
        this.b = zArr;
        this.c = runnable;
    }
}
