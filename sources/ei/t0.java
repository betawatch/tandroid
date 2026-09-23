package ei;

import ai.da;
import android.app.Activity;
import android.content.DialogInterface;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class t0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                w0 w0Var = (w0) this.c;
                boolean[] zArr = (boolean[]) this.b;
                org.telegram.ui.web.q qVar = (org.telegram.ui.web.q) this.d;
                w0Var.getClass();
                if (!zArr[0]) {
                    w0Var.d = true;
                    w0Var.e = false;
                    w0Var.l();
                    Iterator it = w0Var.f.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    zArr[0] = true;
                    qVar.run(Boolean.TRUE, Boolean.FALSE);
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
                org.telegram.ui.Components.q3 q3Var = (org.telegram.ui.Components.q3) this.b;
                org.telegram.ui.Components.s3 s3Var = (org.telegram.ui.Components.s3) this.d;
                callback2.run(Integer.valueOf(s3Var.getValue() + (q3Var.getValue() * 60)));
                break;
            case 4:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                da daVar = (da) this.d;
                b1Var.getClass();
                if (!atomicBoolean.get()) {
                    b1Var.y(daVar, "popup_closed", new JSONObject());
                }
                b1Var.c0 = null;
                b1Var.e0 = System.currentTimeMillis();
                break;
            case 5:
                c6 c6Var = (c6) this.c;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.b;
                Activity activity2 = (Activity) this.d;
                AndroidUtilities.hideKeyboard(c6Var);
                if (n2Var2 != null) {
                    AndroidUtilities.requestAdjustResize(activity2, n2Var2.getClassGuid());
                    break;
                }
                break;
            default:
                xh.s2 s2Var = (xh.s2) this.c;
                xh.a2 a2Var = (xh.a2) this.b;
                Activity activity3 = (Activity) this.d;
                AndroidUtilities.hideKeyboard(a2Var);
                AndroidUtilities.requestAdjustResize(activity3, s2Var.a.getClassGuid());
                break;
        }
    }

    public /* synthetic */ t0(boolean[] zArr, boolean[] zArr2, Utilities.Callback callback) {
        this.a = 1;
        this.b = zArr;
        this.c = zArr2;
        this.d = callback;
    }
}
