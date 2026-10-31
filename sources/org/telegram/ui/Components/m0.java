package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class m0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ m0(int i10, Runnable runnable) {
        this.a = i10;
        this.b = runnable;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                Runnable runnable = this.b;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                Runnable runnable2 = this.b;
                if (runnable2 != null) {
                    runnable2.run();
                    break;
                }
                break;
            case 2:
                Runnable runnable3 = this.b;
                if (runnable3 != null) {
                    runnable3.run();
                    break;
                }
                break;
            default:
                this.b.run();
                break;
        }
    }
}
