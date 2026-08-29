package jh;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f7 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ Utilities.Callback c;

    public /* synthetic */ f7(Utilities.Callback callback, boolean[] zArr) {
        this.c = callback;
        this.b = zArr;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                Utilities.Callback callback = this.c;
                if (callback != null && !this.b[0]) {
                    callback.run(Boolean.FALSE);
                    break;
                }
                break;
            default:
                boolean[] zArr = this.b;
                if (!zArr[0]) {
                    this.c.run(Boolean.FALSE);
                    zArr[0] = true;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ f7(boolean[] zArr, Utilities.Callback callback) {
        this.b = zArr;
        this.c = callback;
    }
}
