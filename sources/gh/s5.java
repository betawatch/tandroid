package gh;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class s5 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ Object e;

    public /* synthetic */ s5(v7 v7Var, Utilities.Callback callback, boolean[] zArr, boolean[] zArr2, Object obj, int i9) {
        this.a = i9;
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
