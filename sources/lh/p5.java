package lh;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p5 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ Object d;
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
                Utilities.Callback callback = (Utilities.Callback) this.b;
                boolean[] zArr = (boolean[]) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.e;
                if (callback != null && !this.c[0]) {
                    callback.run(Boolean.FALSE);
                    if (!zArr[0]) {
                        callback2.run("cancelled", 0L);
                        zArr[0] = true;
                        break;
                    }
                }
                break;
            case 1:
                Utilities.Callback callback3 = (Utilities.Callback) this.b;
                boolean[] zArr2 = (boolean[]) this.d;
                Utilities.Callback callback4 = (Utilities.Callback) this.e;
                if (callback3 != null && !this.c[0]) {
                    callback3.run(Boolean.FALSE);
                    if (!zArr2[0] && callback4 != null) {
                        callback4.run("cancelled");
                        zArr2[0] = true;
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.b;
                nh.j7 j7Var = (nh.j7) this.d;
                String str = (String) this.e;
                c1Var.getClass();
                boolean[] zArr3 = this.c;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    c1Var.z(j7Var, "requested_chat_failed", org.telegram.ui.web.c1.B(str, "req_id"));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ p5(org.telegram.ui.web.c1 c1Var, boolean[] zArr, nh.j7 j7Var, String str) {
        this.a = 2;
        this.b = c1Var;
        this.c = zArr;
        this.d = j7Var;
        this.e = str;
    }
}
