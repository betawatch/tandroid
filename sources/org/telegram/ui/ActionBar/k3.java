package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k3 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ boolean[] c;

    public /* synthetic */ k3(Utilities.Callback callback, boolean[] zArr) {
        this.b = callback;
        this.c = zArr;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                boolean[] zArr = this.c;
                if (!zArr[0]) {
                    this.b.run(Boolean.FALSE);
                    zArr[0] = true;
                    break;
                }
                break;
            default:
                Utilities.Callback callback = this.b;
                if (callback != null && !this.c[0]) {
                    callback.run(Boolean.FALSE);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ k3(boolean[] zArr, Utilities.Callback callback) {
        this.c = zArr;
        this.b = callback;
    }
}
