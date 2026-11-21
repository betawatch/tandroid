package di;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b4 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b4(Object obj, Object obj2, Object obj3, int i7, String str, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.b = i7;
        this.c = str;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        int i7 = this.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i7) {
            case 0:
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj2;
                ArrayList arrayList = (ArrayList) obj;
                ((boolean[]) obj4)[0] = false;
                if (arrayList != null) {
                    new h1(context, h6Var, this.b, this.c, arrayList, false).show();
                    break;
                }
                break;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                mp mpVar = (mp) obj3;
                vf.b bVar = (vf.b) obj2;
                Long l10 = (Long) obj;
                String str = LaunchActivity.C1;
                TLRPC.User c22 = (l10 == null || l10.longValue() <= 0 || l10.longValue() == Long.MAX_VALUE) ? null : mpVar.c2(l10);
                int i10 = this.b;
                if (c22 != null && !o10.C(c22)) {
                    launchActivity.Y(i10, c22, this.c, bVar);
                    break;
                } else {
                    if (bVar != null) {
                        bVar.b();
                    }
                    if (c22 == null) {
                        org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                        if (Q != null) {
                            org.telegram.messenger.f3.o(null, 2131747941, org.telegram.ui.Components.lc.b0(Q), null);
                            break;
                        }
                    } else {
                        launchActivity.m0(i10, c22.id, null);
                        break;
                    }
                }
                break;
        }
    }
}
