package ci;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i4 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ i4(Object obj, Object obj2, Object obj3, int i3, String str, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.b = i3;
        this.c = str;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        int i3 = this.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i3) {
            case 0:
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                ArrayList arrayList = (ArrayList) obj;
                ((boolean[]) obj4)[0] = false;
                if (arrayList != null) {
                    new p1(context, e6Var, this.b, this.c, arrayList, false).show();
                    break;
                }
                break;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                hp hpVar = (hp) obj3;
                sf.b bVar = (sf.b) obj2;
                Long l10 = (Long) obj;
                String str = LaunchActivity.E1;
                TLRPC.User a22 = (l10 == null || l10.longValue() <= 0 || l10.longValue() == Long.MAX_VALUE) ? null : hpVar.a2(l10);
                int i10 = this.b;
                if (a22 != null && !l10.B(a22)) {
                    launchActivity.Y(i10, a22, this.c, bVar);
                    break;
                } else {
                    if (bVar != null) {
                        bVar.b();
                    }
                    if (a22 == null) {
                        org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                        if (Q != null) {
                            org.telegram.messenger.k5.p(null, 2131748142, org.telegram.ui.Components.fc.a0(Q), null);
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
