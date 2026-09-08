package fi;

import android.app.Activity;
import android.content.DialogInterface;
import bi.k9;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.b6;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) this.d;
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
                    sVar.run(Boolean.TRUE, Boolean.FALSE);
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
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) this.c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                k9 k9Var = (k9) this.d;
                d1Var.getClass();
                if (!atomicBoolean.get()) {
                    d1Var.y(k9Var, "popup_closed", new JSONObject());
                }
                d1Var.c0 = null;
                d1Var.e0 = System.currentTimeMillis();
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
                yh.q2 q2Var = (yh.q2) this.c;
                yh.y1 y1Var = (yh.y1) this.b;
                Activity activity3 = (Activity) this.d;
                AndroidUtilities.hideKeyboard(y1Var);
                AndroidUtilities.requestAdjustResize(activity3, q2Var.a.getClassGuid());
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
