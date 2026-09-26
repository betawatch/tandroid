package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i3 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ boolean[] c;

    public /* synthetic */ i3(Utilities.Callback callback, boolean[] zArr) {
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

    public /* synthetic */ i3(boolean[] zArr, Utilities.Callback callback) {
        this.c = zArr;
        this.b = callback;
    }
}
