package gi;

import android.app.Activity;
import android.content.DialogInterface;
import ci.z7;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.b6;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.b;
                Activity activity = (Activity) this.d;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                if (n2Var != null) {
                    AndroidUtilities.requestAdjustResize(activity, n2Var.getClassGuid());
                    break;
                }
                break;
            case 3:
                Utilities.Callback callback2 = (Utilities.Callback) this.c;
                org.telegram.ui.Components.r3 r3Var = (org.telegram.ui.Components.r3) this.b;
                org.telegram.ui.Components.t3 t3Var = (org.telegram.ui.Components.t3) this.d;
                callback2.run(Integer.valueOf(t3Var.getValue() + (r3Var.getValue() * 60)));
                break;
            case 4:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                z7 z7Var = (z7) this.d;
                a1Var.getClass();
                if (!atomicBoolean.get()) {
                    a1Var.x(z7Var, "popup_closed", new JSONObject());
                }
                a1Var.c0 = null;
                a1Var.e0 = System.currentTimeMillis();
                break;
            case 5:
                b6 b6Var = (b6) this.c;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.b;
                Activity activity2 = (Activity) this.d;
                AndroidUtilities.hideKeyboard(b6Var);
                if (n2Var2 != null) {
                    AndroidUtilities.requestAdjustResize(activity2, n2Var2.getClassGuid());
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
