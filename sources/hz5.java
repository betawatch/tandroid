// default package

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class hz5 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ hz5(Object obj, Object obj2, Object obj3, int i, String str, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.b = i;
        this.c = str;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                na7 na7Var = (na7) obj3;
                c01 c01Var = (c01) obj2;
                Long l = (Long) obj;
                String str = LaunchActivity.C1;
                TLRPC.User V1 = (l == null || l.longValue() <= 0 || l.longValue() == Long.MAX_VALUE) ? null : na7Var.V1(l);
                int i = this.b;
                if (V1 != null && !l7c.D(V1)) {
                    launchActivity.X(i, V1, this.c, c01Var);
                    break;
                } else {
                    if (c01Var != null) {
                        c01Var.b();
                    }
                    if (V1 == null) {
                        d Q = LaunchActivity.Q();
                        if (Q != null) {
                            yjb.x(null, 2131747942, u21.b0(Q), null);
                            break;
                        }
                    } else {
                        launchActivity.m0(i, V1.id, null);
                        break;
                    }
                }
                break;
            default:
                Context context = (Context) obj3;
                wjb wjbVar = (wjb) obj2;
                ArrayList arrayList = (ArrayList) obj;
                ((boolean[]) obj4)[0] = false;
                if (arrayList != null) {
                    new kna(context, wjbVar, this.b, this.c, arrayList, false).show();
                    break;
                }
                break;
        }
    }
}
