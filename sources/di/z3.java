package di;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class z3 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ z3(Object obj, Object obj2, Object obj3, int i7, String str, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.b = i7;
        this.c = str;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        int i7 = this.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i7) {
            case 0:
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                ArrayList arrayList = (ArrayList) obj;
                ((boolean[]) obj4)[0] = false;
                if (arrayList != null) {
                    new i1(context, e6Var, this.b, this.c, arrayList, false).show();
                    break;
                }
                break;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                np npVar = (np) obj3;
                vf.b bVar = (vf.b) obj2;
                Long l10 = (Long) obj;
                String str = LaunchActivity.C1;
                TLRPC.User a22 = (l10 == null || l10.longValue() <= 0 || l10.longValue() == Long.MAX_VALUE) ? null : npVar.a2(l10);
                int i10 = this.b;
                if (a22 != null && !q10.B(a22)) {
                    launchActivity.Y(i10, a22, this.c, bVar);
                    break;
                } else {
                    if (bVar != null) {
                        bVar.b();
                    }
                    if (a22 == null) {
                        org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                        if (Q != null) {
                            org.telegram.messenger.k5.o(null, 2131748134, org.telegram.ui.Components.cc.a0(Q), null);
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
