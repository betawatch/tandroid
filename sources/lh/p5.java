package lh;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p5 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p5(t7 t7Var, Utilities.Callback callback, boolean[] zArr, boolean[] zArr2, Object obj, int i10) {
        this.a = i10;
        this.b = callback;
        this.c = zArr;
        this.d = zArr2;
        this.e = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.e;
                Utilities.Callback callback = this.b;
                if (callback != null && !this.c[0]) {
                    callback.run(Boolean.FALSE);
                    boolean[] zArr = this.d;
                    if (!zArr[0]) {
                        callback2.run("cancelled", 0L);
                        zArr[0] = true;
                        break;
                    }
                }
                break;
            default:
                Utilities.Callback callback3 = (Utilities.Callback) this.e;
                Utilities.Callback callback4 = this.b;
                if (callback4 != null && !this.c[0]) {
                    callback4.run(Boolean.FALSE);
                    boolean[] zArr2 = this.d;
                    if (!zArr2[0] && callback3 != null) {
                        callback3.run("cancelled");
                        zArr2[0] = true;
                        break;
                    }
                }
                break;
        }
    }
}
