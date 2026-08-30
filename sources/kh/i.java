package kh;

import android.app.Activity;
import android.content.DialogInterface;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                x3 x3Var = (x3) this.c;
                v2 v2Var = (v2) this.d;
                Activity activity2 = (Activity) this.b;
                AndroidUtilities.hideKeyboard(v2Var);
                AndroidUtilities.requestAdjustResize(activity2, x3Var.a.getClassGuid());
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
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.c;
                boolean[] zArr = (boolean[]) this.d;
                String str = (String) this.b;
                a1Var.getClass();
                if (!zArr[0]) {
                    zArr[0] = true;
                    a1Var.v("requested_chat_failed", org.telegram.ui.web.a1.x(str, "req_id"));
                    break;
                }
                break;
            case 5:
                rh.r0 r0Var = (rh.r0) this.c;
                boolean[] zArr2 = (boolean[]) this.d;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) this.b;
                r0Var.getClass();
                if (!zArr2[0]) {
                    r0Var.d = true;
                    r0Var.e = false;
                    r0Var.l();
                    Iterator it = r0Var.f.iterator();
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
