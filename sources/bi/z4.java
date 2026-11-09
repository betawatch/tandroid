package bi;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class z4 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ z4(Object obj, Object obj2, Object obj3, int i7, String str, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.b = i7;
        this.c = str;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        int i7 = this.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i7) {
            case 0:
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj2;
                ArrayList arrayList = (ArrayList) obj;
                ((boolean[]) obj4)[0] = false;
                if (arrayList != null) {
                    new w1(context, g6Var, this.b, this.c, arrayList, false).show();
                    break;
                }
                break;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                qp qpVar = (qp) obj3;
                vf.b bVar = (vf.b) obj2;
                Long l10 = (Long) obj;
                String str = LaunchActivity.B1;
                TLRPC.User a22 = (l10 == null || l10.longValue() <= 0 || l10.longValue() == Long.MAX_VALUE) ? null : qpVar.a2(l10);
                int i10 = this.b;
                if (a22 != null && !t10.B(a22)) {
                    launchActivity.Y(i10, a22, this.c, bVar);
                    break;
                } else {
                    if (bVar != null) {
                        bVar.b();
                    }
                    if (a22 == null) {
                        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                        if (Q != null) {
                            org.telegram.messenger.k5.p(null, 2131748134, org.telegram.ui.Components.hc.a0(Q), null);
                            break;
                        }
                    } else {
                        launchActivity.m0(i10, a22.id, null);
                        break;
                    }
                }
                break;
        }
    }
}
