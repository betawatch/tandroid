// default package

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class k16 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ k16(Object obj, Object obj2, Object obj3, int i, String str, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.b = i;
        this.c = str;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                uc7 uc7Var = (uc7) obj3;
                l01 l01Var = (l01) obj2;
                Long l = (Long) obj;
                String str = LaunchActivity.C1;
                TLRPC.User X1 = (l == null || l.longValue() <= 0 || l.longValue() == Long.MAX_VALUE) ? null : uc7Var.X1(l);
                int i = this.b;
                if (X1 != null && !lbc.D(X1)) {
                    launchActivity.X(i, X1, this.c, l01Var);
                    break;
                } else {
                    if (l01Var != null) {
                        l01Var.b();
                    }
                    if (X1 == null) {
                        e Q = LaunchActivity.Q();
                        if (Q != null) {
                            xnb.x(null, 2131747865, d31.b0(Q), null);
                            break;
                        }
                    } else {
                        launchActivity.m0(i, X1.id, null);
                        break;
                    }
                }
                break;
            default:
                Context context = (Context) obj3;
                vnb vnbVar = (vnb) obj2;
                ArrayList arrayList = (ArrayList) obj;
                ((boolean[]) obj4)[0] = false;
                if (arrayList != null) {
                    new gra(context, vnbVar, this.b, this.c, arrayList, false).show();
                    break;
                }
                break;
        }
    }
}
