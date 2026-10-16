package fi;

import android.app.Activity;
import android.content.DialogInterface;
import bi.n9;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                v0 v0Var = (v0) this.c;
                boolean[] zArr = (boolean[]) this.b;
                org.telegram.ui.web.q qVar = (org.telegram.ui.web.q) this.d;
                v0Var.getClass();
                if (!zArr[0]) {
                    v0Var.d = true;
                    v0Var.e = false;
                    v0Var.k();
                    Iterator it = v0Var.f.iterator();
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
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.b;
                Activity activity = (Activity) this.d;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                if (m2Var != null) {
                    AndroidUtilities.requestAdjustResize(activity, m2Var.getClassGuid());
                    break;
                }
                break;
            case 3:
                Utilities.Callback callback2 = (Utilities.Callback) this.c;
                org.telegram.ui.Components.s3 s3Var = (org.telegram.ui.Components.s3) this.b;
                org.telegram.ui.Components.u3 u3Var = (org.telegram.ui.Components.u3) this.d;
                callback2.run(Integer.valueOf(u3Var.getValue() + (s3Var.getValue() * 60)));
                break;
            case 4:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                n9 n9Var = (n9) this.d;
                c1Var.getClass();
                if (!atomicBoolean.get()) {
                    c1Var.x(n9Var, "popup_closed", new JSONObject());
                }
                c1Var.c0 = null;
                c1Var.e0 = System.currentTimeMillis();
                break;
            case 5:
                c6 c6Var = (c6) this.c;
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) this.b;
                Activity activity2 = (Activity) this.d;
                AndroidUtilities.hideKeyboard(c6Var);
                if (m2Var2 != null) {
                    AndroidUtilities.requestAdjustResize(activity2, m2Var2.getClassGuid());
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

    public /* synthetic */ s0(boolean[] zArr, boolean[] zArr2, Utilities.Callback callback) {
        this.a = 1;
        this.b = zArr;
        this.c = zArr2;
        this.d = callback;
    }
}
