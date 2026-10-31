package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class g90 implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ g90(Object obj, Object obj2, Object obj3, int i10, String str, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.b = i10;
        this.c = str;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        int i10 = this.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                org.telegram.messenger.vp vpVar = (org.telegram.messenger.vp) obj3;
                gf.e eVar = (gf.e) obj2;
                Long l4 = (Long) obj;
                Pattern pattern = LaunchActivity.D1;
                TLRPC.User Z1 = (l4 == null || l4.longValue() <= 0 || l4.longValue() == Long.MAX_VALUE) ? null : vpVar.Z1(l4);
                int i11 = this.b;
                if (Z1 != null && !org.telegram.messenger.h20.B(Z1)) {
                    launchActivity.Y(i11, Z1, this.c, eVar);
                    break;
                } else {
                    if (eVar != null) {
                        eVar.b();
                    }
                    if (Z1 == null) {
                        org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                        if (Q != null) {
                            org.telegram.messenger.m5.o(null, 2131748150, org.telegram.ui.Components.cc.a0(Q), null);
                            break;
                        }
                    } else {
                        launchActivity.m0(i11, Z1.id, null);
                        break;
                    }
                }
                break;
            default:
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj2;
                ArrayList arrayList = (ArrayList) obj;
                ((boolean[]) obj4)[0] = false;
                if (arrayList != null) {
                    new rh.t0(context, p6Var, this.b, this.c, arrayList, false).show();
                    break;
                }
                break;
        }
    }
}
