package fh;

import android.app.Activity;
import android.content.DialogInterface;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i9) {
        this.a = i9;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                s sVar = (s) this.c;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.d;
                Activity activity = (Activity) this.b;
                AndroidUtilities.hideKeyboard(sVar);
                if (o2Var != null) {
                    AndroidUtilities.requestAdjustResize(activity, o2Var.getClassGuid());
                    break;
                }
                break;
            case 1:
                j4 j4Var = (j4) this.c;
                g3 g3Var = (g3) this.d;
                Activity activity2 = (Activity) this.b;
                AndroidUtilities.hideKeyboard(g3Var);
                AndroidUtilities.requestAdjustResize(activity2, j4Var.a.getClassGuid());
                break;
            case 2:
                mh.u0 u0Var = (mh.u0) this.c;
                boolean[] zArr = (boolean[]) this.d;
                org.telegram.ui.web.r rVar = (org.telegram.ui.web.r) this.b;
                u0Var.getClass();
                if (!zArr[0]) {
                    u0Var.d = true;
                    u0Var.e = false;
                    u0Var.l();
                    Iterator it = u0Var.f.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    zArr[0] = true;
                    rVar.run(Boolean.TRUE, Boolean.FALSE);
                    break;
                }
                break;
            case 3:
                boolean[] zArr2 = (boolean[]) this.c;
                boolean[] zArr3 = (boolean[]) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.b;
                if (!zArr2[0] && !zArr3[0]) {
                    zArr3[0] = true;
                    callback.run("USER_DECLINED");
                    break;
                }
                break;
            case 4:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.d;
                Activity activity3 = (Activity) this.b;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                if (o2Var2 != null) {
                    AndroidUtilities.requestAdjustResize(activity3, o2Var2.getClassGuid());
                    break;
                }
                break;
            case 5:
                Utilities.Callback callback2 = (Utilities.Callback) this.c;
                org.telegram.ui.Components.l3 l3Var = (org.telegram.ui.Components.l3) this.d;
                org.telegram.ui.Components.n3 n3Var = (org.telegram.ui.Components.n3) this.b;
                callback2.run(Integer.valueOf(n3Var.getValue() + (l3Var.getValue() * 60)));
                break;
            default:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) this.c;
                boolean[] zArr4 = (boolean[]) this.d;
                String str = (String) this.b;
                y0Var.getClass();
                if (!zArr4[0]) {
                    zArr4[0] = true;
                    y0Var.v("requested_chat_failed", org.telegram.ui.web.y0.x(str, "req_id"));
                    break;
                }
                break;
        }
    }
}
