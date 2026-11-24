// default package

import android.app.Activity;
import android.content.DialogInterface;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class bg implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bg(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                d dVar = (d) obj2;
                Activity activity = (Activity) obj;
                gl.t1((hj) obj3);
                if (dVar != null) {
                    gl.W2(activity, dVar.getClassGuid());
                    break;
                }
                break;
            case 1:
                ((p8c) obj3).a(Integer.valueOf(((ai) obj).getValue() + (((yh) obj2).getValue() * 60)));
                break;
            case 2:
                d dVar2 = (d) obj2;
                Activity activity2 = (Activity) obj;
                gl.t1((py) obj3);
                if (dVar2 != null) {
                    gl.W2(activity2, dVar2.getClassGuid());
                    break;
                }
                break;
            case 3:
                tq0 tq0Var = (tq0) obj3;
                boolean[] zArr = (boolean[]) obj2;
                pt0 pt0Var = (pt0) obj;
                tq0Var.getClass();
                if (!zArr[0]) {
                    tq0Var.d = true;
                    tq0Var.e = false;
                    tq0Var.j();
                    Iterator it = tq0Var.f.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    zArr[0] = true;
                    pt0Var.a(Boolean.TRUE, Boolean.FALSE);
                    break;
                }
                break;
            case 4:
                hv0 hv0Var = (hv0) obj3;
                ev0 ev0Var = (ev0) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    hv0Var.u(ev0Var, "popup_closed", new JSONObject());
                }
                hv0Var.d0 = null;
                hv0Var.f0 = System.currentTimeMillis();
                break;
            case 5:
                lf6 lf6Var = (lf6) obj3;
                boolean[] zArr2 = (boolean[]) obj;
                if (lf6Var.d0 == ((hd) obj2)) {
                    lf6Var.d0 = null;
                }
                if (!zArr2[0] && lf6Var.o()) {
                    lf6Var.t(false);
                    break;
                }
                break;
            case 6:
                gl.t1((dq8) obj2);
                gl.W2((Activity) obj, ((tq8) obj3).a.getClassGuid());
                break;
            default:
                boolean[] zArr3 = (boolean[]) obj2;
                p8c p8cVar = (p8c) obj;
                if (!((boolean[]) obj3)[0] && !zArr3[0]) {
                    zArr3[0] = true;
                    p8cVar.a("USER_DECLINED");
                    break;
                }
                break;
        }
    }
}
