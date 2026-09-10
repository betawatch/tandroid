package di;

import android.app.Activity;
import android.content.DialogInterface;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.d6;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class w0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                z0 z0Var = (z0) this.c;
                boolean[] zArr = (boolean[]) this.b;
                org.telegram.ui.web.r rVar = (org.telegram.ui.web.r) this.d;
                z0Var.getClass();
                if (!zArr[0]) {
                    z0Var.d = true;
                    z0Var.e = false;
                    z0Var.l();
                    Iterator it = z0Var.f.iterator();
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
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.b;
                Activity activity = (Activity) this.d;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                if (p2Var != null) {
                    AndroidUtilities.requestAdjustResize(activity, p2Var.getClassGuid());
                    break;
                }
                break;
            case 3:
                Utilities.Callback callback2 = (Utilities.Callback) this.c;
                org.telegram.ui.Components.p3 p3Var = (org.telegram.ui.Components.p3) this.b;
                org.telegram.ui.Components.r3 r3Var = (org.telegram.ui.Components.r3) this.d;
                callback2.run(Integer.valueOf(r3Var.getValue() + (p3Var.getValue() * 60)));
                break;
            case 4:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.d;
                c1Var.getClass();
                if (!atomicBoolean.get()) {
                    c1Var.z(a1Var, "popup_closed", new JSONObject());
                }
                c1Var.c0 = null;
                c1Var.e0 = System.currentTimeMillis();
                break;
            case 5:
                d6 d6Var = (d6) this.c;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) this.b;
                Activity activity2 = (Activity) this.d;
                AndroidUtilities.hideKeyboard(d6Var);
                if (p2Var2 != null) {
                    AndroidUtilities.requestAdjustResize(activity2, p2Var2.getClassGuid());
                    break;
                }
                break;
            default:
                wh.q2 q2Var = (wh.q2) this.c;
                wh.y1 y1Var = (wh.y1) this.b;
                Activity activity3 = (Activity) this.d;
                AndroidUtilities.hideKeyboard(y1Var);
                AndroidUtilities.requestAdjustResize(activity3, q2Var.a.getClassGuid());
                break;
        }
    }

    public /* synthetic */ w0(boolean[] zArr, boolean[] zArr2, Utilities.Callback callback) {
        this.a = 1;
        this.b = zArr;
        this.c = zArr2;
        this.d = callback;
    }
}
