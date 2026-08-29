package jh;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g6 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback2 b;
    public final /* synthetic */ boolean[] c;

    public /* synthetic */ g6(Utilities.Callback2 callback2, boolean[] zArr, int i10) {
        this.a = i10;
        this.b = callback2;
        this.c = zArr;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                Utilities.Callback2 callback2 = this.b;
                if (callback2 != null && !this.c[0]) {
                    callback2.run(0L, Boolean.FALSE);
                    break;
                }
                break;
            case 1:
                Utilities.Callback2 callback22 = this.b;
                if (callback22 != null && !this.c[0]) {
                    callback22.run(Boolean.FALSE, null);
                    break;
                }
                break;
            default:
                Utilities.Callback2 callback23 = this.b;
                if (callback23 != null && !this.c[0]) {
                    callback23.run(Boolean.FALSE, null);
                    break;
                }
                break;
        }
    }
}
