package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class h2 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ h2(Runnable runnable, boolean[] zArr) {
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

    public /* synthetic */ h2(boolean[] zArr, Runnable runnable) {
        this.b = zArr;
        this.c = runnable;
    }
}
