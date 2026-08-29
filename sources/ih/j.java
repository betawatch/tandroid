package ih;

import android.app.Activity;
import android.content.DialogInterface;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                bh.b bVar = (bh.b) this.c;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.d;
                Activity activity = (Activity) this.b;
                AndroidUtilities.hideKeyboard(bVar);
                if (o2Var != null) {
                    AndroidUtilities.requestAdjustResize(activity, o2Var.getClassGuid());
                    break;
                }
                break;
            case 1:
                x3 x3Var = (x3) this.c;
                v2 v2Var = (v2) this.d;
                Activity activity2 = (Activity) this.b;
                AndroidUtilities.hideKeyboard(v2Var);
                AndroidUtilities.requestAdjustResize(activity2, x3Var.a.getClassGuid());
                break;
            case 2:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.d;
                Activity activity3 = (Activity) this.b;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                if (o2Var2 != null) {
                    AndroidUtilities.requestAdjustResize(activity3, o2Var2.getClassGuid());
                    break;
                }
                break;
            case 3:
                Utilities.Callback callback = (Utilities.Callback) this.c;
                org.telegram.ui.Components.p3 p3Var = (org.telegram.ui.Components.p3) this.d;
                org.telegram.ui.Components.r3 r3Var = (org.telegram.ui.Components.r3) this.b;
                callback.run(Integer.valueOf(r3Var.getValue() + (p3Var.getValue() * 60)));
                break;
            case 4:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.c;
                boolean[] zArr = (boolean[]) this.d;
                String str = (String) this.b;
                z0Var.getClass();
                if (!zArr[0]) {
                    zArr[0] = true;
                    z0Var.v("requested_chat_failed", org.telegram.ui.web.z0.x(str, "req_id"));
                    break;
                }
                break;
            case 5:
                ph.q0 q0Var = (ph.q0) this.c;
                boolean[] zArr2 = (boolean[]) this.d;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) this.b;
                q0Var.getClass();
                if (!zArr2[0]) {
                    q0Var.d = true;
                    q0Var.e = false;
                    q0Var.l();
                    Iterator it = q0Var.f.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    zArr2[0] = true;
                    sVar.run(Boolean.TRUE, Boolean.FALSE);
                    break;
                }
                break;
            default:
                boolean[] zArr3 = (boolean[]) this.c;
                boolean[] zArr4 = (boolean[]) this.d;
                Utilities.Callback callback2 = (Utilities.Callback) this.b;
                if (!zArr3[0] && !zArr4[0]) {
                    zArr4[0] = true;
                    callback2.run("USER_DECLINED");
                    break;
                }
                break;
        }
    }
}
