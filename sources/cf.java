// default package

import android.app.Activity;
import android.content.DialogInterface;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class cf implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cf(Object obj, Object obj2, Object obj3, byte b) {
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
                e eVar = (e) obj2;
                Activity activity = (Activity) obj;
                hl.t1((ij) obj3);
                if (eVar != null) {
                    hl.V2(activity, eVar.getClassGuid());
                    break;
                }
                break;
            case 1:
                ((pcc) obj3).a(Integer.valueOf(((bi) obj).getValue() + (((zh) obj2).getValue() * 60)));
                break;
            case 2:
                e eVar2 = (e) obj2;
                Activity activity2 = (Activity) obj;
                hl.t1((qy) obj3);
                if (eVar2 != null) {
                    hl.V2(activity2, eVar2.getClassGuid());
                    break;
                }
                break;
            case 3:
                tq0 tq0Var = (tq0) obj3;
                boolean[] zArr = (boolean[]) obj2;
                yt0 yt0Var = (yt0) obj;
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
                    yt0Var.a(Boolean.TRUE, Boolean.FALSE);
                    break;
                }
                break;
            case 4:
                rv0 rv0Var = (rv0) obj3;
                pv0 pv0Var = (pv0) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    rv0Var.u(pv0Var, "popup_closed", new JSONObject());
                }
                rv0Var.d0 = null;
                rv0Var.f0 = System.currentTimeMillis();
                break;
            case 5:
                int i = ChatActivityEnterView.X7;
                ((dc) obj2).Q.remove((bz1) obj);
                ((ChatActivityEnterView) obj3).M0 = null;
                break;
            case 6:
                ph6 ph6Var = (ph6) obj3;
                boolean[] zArr2 = (boolean[]) obj;
                if (ph6Var.d0 == ((id) obj2)) {
                    ph6Var.d0 = null;
                }
                if (!zArr2[0] && ph6Var.o()) {
                    ph6Var.t(false);
                    break;
                }
                break;
            case 7:
                hl.t1((pt8) obj2);
                hl.V2((Activity) obj, ((eu8) obj3).a.getClassGuid());
                break;
            default:
                boolean[] zArr3 = (boolean[]) obj2;
                pcc pccVar = (pcc) obj;
                if (!((boolean[]) obj3)[0] && !zArr3[0]) {
                    zArr3[0] = true;
                    pccVar.a("USER_DECLINED");
                    break;
                }
                break;
        }
    }
}
