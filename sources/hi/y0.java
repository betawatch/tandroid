package hi;

import android.app.Activity;
import android.content.DialogInterface;
import di.x7;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.g6;
import org.telegram.ui.Components.f5;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                b1 b1Var = (b1) this.c;
                boolean[] zArr = (boolean[]) this.b;
                org.telegram.ui.web.r rVar = (org.telegram.ui.web.r) this.d;
                b1Var.getClass();
                if (!zArr[0]) {
                    b1Var.d = true;
                    b1Var.e = false;
                    b1Var.k();
                    Iterator it = b1Var.f.iterator();
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
                f5 f5Var = (f5) this.c;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.b;
                Activity activity = (Activity) this.d;
                AndroidUtilities.hideKeyboard(f5Var);
                if (r2Var != null) {
                    AndroidUtilities.requestAdjustResize(activity, r2Var.getClassGuid());
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
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                x7 x7Var = (x7) this.d;
                a1Var.getClass();
                if (!atomicBoolean.get()) {
                    a1Var.x(x7Var, "popup_closed", new JSONObject());
                }
                a1Var.c0 = null;
                a1Var.e0 = System.currentTimeMillis();
                break;
            case 5:
                g6 g6Var = (g6) this.c;
                org.telegram.ui.ActionBar.r2 r2Var2 = (org.telegram.ui.ActionBar.r2) this.b;
                Activity activity2 = (Activity) this.d;
                AndroidUtilities.hideKeyboard(g6Var);
                if (r2Var2 != null) {
                    AndroidUtilities.requestAdjustResize(activity2, r2Var2.getClassGuid());
                    break;
                }
                break;
            default:
                zh.r2 r2Var3 = (zh.r2) this.c;
                zh.y1 y1Var = (zh.y1) this.b;
                Activity activity3 = (Activity) this.d;
                AndroidUtilities.hideKeyboard(y1Var);
                AndroidUtilities.requestAdjustResize(activity3, r2Var3.a.getClassGuid());
                break;
        }
    }

    public /* synthetic */ y0(boolean[] zArr, boolean[] zArr2, Utilities.Callback callback) {
        this.a = 1;
        this.b = zArr;
        this.c = zArr2;
        this.d = callback;
    }
}
