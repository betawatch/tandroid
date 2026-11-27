// default package

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class bc3 implements f36 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public bc3(Object obj) {
        this.a = (byte) 2;
        this.b = obj;
        ni2 ni2Var = ni2.c;
        Class<?> cls = obj.getClass();
        li2 li2Var = (li2) ni2Var.a.get(cls);
        this.c = li2Var == null ? ni2Var.a(cls, null) : li2Var;
    }

    @Override // f36
    public final void b(i36 i36Var, y26 y26Var) {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                hx3 hx3Var = (hx3) obj;
                int i = ac3.a[y26Var.ordinal()];
                if (i == 3) {
                    (Build.VERSION.SDK_INT >= 28 ? mr2.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new tv((byte) 7), 500L);
                    hx3Var.a.b(hx3Var);
                } else if (i == 7) {
                    lq5.j("ON_ANY must not been send by anybody");
                    break;
                }
                f36 f36Var = (f36) obj2;
                if (f36Var != null) {
                    f36Var.b(i36Var, y26Var);
                    break;
                }
                break;
            case 1:
                if (y26Var == y26.ON_START) {
                    ((a36) obj).b(this);
                    ((po) obj2).g();
                    break;
                }
                break;
            default:
                HashMap hashMap = ((li2) obj2).a;
                li2.a((List) hashMap.get(y26Var), i36Var, y26Var, obj);
                li2.a((List) hashMap.get(y26.ON_ANY), i36Var, y26Var, obj);
                break;
        }
    }

    public /* synthetic */ bc3(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
