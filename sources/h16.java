// default package

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class h16 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ h16(Object obj, Object obj2, Object obj3, int i, String str, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.b = i;
        this.c = str;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                oc7 oc7Var = (oc7) obj3;
                k11 k11Var = (k11) obj2;
                Long l = (Long) obj;
                String str = LaunchActivity.C1;
                TLRPC.User W1 = (l == null || l.longValue() <= 0 || l.longValue() == Long.MAX_VALUE) ? null : oc7Var.W1(l);
                int i = this.b;
                if (W1 != null && !m9c.D(W1)) {
                    launchActivity.X(i, W1, this.c, k11Var);
                    break;
                } else {
                    if (k11Var != null) {
                        k11Var.b();
                    }
                    if (W1 == null) {
                        d Q = LaunchActivity.Q();
                        if (Q != null) {
                            mlb.y(null, 2131747868, c41.b0(Q), null);
                            break;
                        }
                    } else {
                        launchActivity.m0(i, W1.id, null);
                        break;
                    }
                }
                break;
            default:
                Context context = (Context) obj3;
                ylb ylbVar = (ylb) obj2;
                ArrayList arrayList = (ArrayList) obj;
                ((boolean[]) obj4)[0] = false;
                if (arrayList != null) {
                    new kpa(context, ylbVar, this.b, this.c, arrayList, false).show();
                    break;
                }
                break;
        }
    }
}
