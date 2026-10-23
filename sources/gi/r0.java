package gi;

import android.app.Activity;
import android.content.DialogInterface;
import ci.y7;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.e5;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                u0 u0Var = (u0) this.c;
                boolean[] zArr = (boolean[]) this.b;
                org.telegram.ui.web.r rVar = (org.telegram.ui.web.r) this.d;
                u0Var.getClass();
                if (!zArr[0]) {
                    u0Var.d = true;
                    u0Var.e = false;
                    u0Var.k();
                    Iterator it = u0Var.f.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    zArr[0] = true;
                    rVar.run(Boolean.TRUE, Boolean.FALSE);
                    break;
                }
                break;
            case 1:
                boolean[] zArr2 = (boolean[]) this.b;
                boolean[] zArr3 = (boolean[]) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                if (!zArr2[0] && !zArr3[0]) {
                    zArr3[0] = true;
                    callback.run("USER_DECLINED");
                    break;
                }
                break;
            case 2:
                e5 e5Var = (e5) this.c;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.b;
                Activity activity = (Activity) this.d;
                AndroidUtilities.hideKeyboard(e5Var);
                if (o2Var != null) {
                    AndroidUtilities.requestAdjustResize(activity, o2Var.getClassGuid());
                    break;
                }
                break;
            case 3:
                Utilities.Callback callback2 = (Utilities.Callback) this.c;
                org.telegram.ui.Components.q3 q3Var = (org.telegram.ui.Components.q3) this.b;
                org.telegram.ui.Components.s3 s3Var = (org.telegram.ui.Components.s3) this.d;
                callback2.run(Integer.valueOf(s3Var.getValue() + (q3Var.getValue() * 60)));
                break;
            case 4:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                y7 y7Var = (y7) this.d;
                b1Var.getClass();
                if (!atomicBoolean.get()) {
                    b1Var.x(y7Var, "popup_closed", new JSONObject());
                }
                b1Var.c0 = null;
                b1Var.e0 = System.currentTimeMillis();
                break;
            case 5:
                c6 c6Var = (c6) this.c;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.b;
                Activity activity2 = (Activity) this.d;
                AndroidUtilities.hideKeyboard(c6Var);
                if (o2Var2 != null) {
                    AndroidUtilities.requestAdjustResize(activity2, o2Var2.getClassGuid());
                    break;
                }
                break;
            default:
                yh.p2 p2Var = (yh.p2) this.c;
                yh.x1 x1Var = (yh.x1) this.b;
                Activity activity3 = (Activity) this.d;
                AndroidUtilities.hideKeyboard(x1Var);
                AndroidUtilities.requestAdjustResize(activity3, p2Var.a.getClassGuid());
                break;
        }
    }

    public /* synthetic */ r0(boolean[] zArr, boolean[] zArr2, Utilities.Callback callback) {
        this.a = 1;
        this.b = zArr;
        this.c = zArr2;
        this.d = callback;
    }
}
