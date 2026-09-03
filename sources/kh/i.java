package kh;

import android.app.Activity;
import android.content.DialogInterface;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import nh.j7;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                dh.b bVar = (dh.b) this.c;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.d;
                Activity activity = (Activity) this.b;
                AndroidUtilities.hideKeyboard(bVar);
                if (p2Var != null) {
                    AndroidUtilities.requestAdjustResize(activity, p2Var.getClassGuid());
                    break;
                }
                break;
            case 1:
                w3 w3Var = (w3) this.c;
                u2 u2Var = (u2) this.d;
                Activity activity2 = (Activity) this.b;
                AndroidUtilities.hideKeyboard(u2Var);
                AndroidUtilities.requestAdjustResize(activity2, w3Var.a.getClassGuid());
                break;
            case 2:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) this.d;
                Activity activity3 = (Activity) this.b;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                if (p2Var2 != null) {
                    AndroidUtilities.requestAdjustResize(activity3, p2Var2.getClassGuid());
                    break;
                }
                break;
            case 3:
                Utilities.Callback callback = (Utilities.Callback) this.c;
                org.telegram.ui.Components.m3 m3Var = (org.telegram.ui.Components.m3) this.d;
                org.telegram.ui.Components.o3 o3Var = (org.telegram.ui.Components.o3) this.b;
                callback.run(Integer.valueOf(o3Var.getValue() + (m3Var.getValue() * 60)));
                break;
            case 4:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.d;
                j7 j7Var = (j7) this.b;
                c1Var.getClass();
                if (!atomicBoolean.get()) {
                    c1Var.z(j7Var, "popup_closed", new JSONObject());
                }
                c1Var.W = null;
                c1Var.b0 = System.currentTimeMillis();
                break;
            case 5:
                rh.q0 q0Var = (rh.q0) this.c;
                boolean[] zArr = (boolean[]) this.d;
                org.telegram.ui.web.r rVar = (org.telegram.ui.web.r) this.b;
                q0Var.getClass();
                if (!zArr[0]) {
                    q0Var.d = true;
                    q0Var.e = false;
                    q0Var.l();
                    Iterator it = q0Var.f.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    zArr[0] = true;
                    rVar.run(Boolean.TRUE, Boolean.FALSE);
                    break;
                }
                break;
            default:
                boolean[] zArr2 = (boolean[]) this.c;
                boolean[] zArr3 = (boolean[]) this.d;
                Utilities.Callback callback2 = (Utilities.Callback) this.b;
                if (!zArr2[0] && !zArr3[0]) {
                    zArr3[0] = true;
                    callback2.run("USER_DECLINED");
                    break;
                }
                break;
        }
    }
}
