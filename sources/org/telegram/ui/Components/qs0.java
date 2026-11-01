package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qs0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rs0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ qs0(rs0 rs0Var, String str, int i10) {
        this.a = i10;
        this.b = rs0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rs0 rs0Var = this.b;
                String str = this.c;
                rs0Var.getClass();
                org.telegram.messenger.i0.g3(new qs0(rs0Var, str, 1));
                break;
            default:
                rs0 rs0Var2 = this.b;
                String str2 = this.c;
                ArrayList arrayList = null;
                rs0Var2.f = null;
                if (!org.telegram.messenger.w3.T(rs0Var2.n) && rs0Var2.s.f1 != null) {
                    arrayList = new ArrayList(rs0Var2.s.f1.participants.participants);
                }
                rs0Var2.r = 2;
                if (arrayList != null) {
                    Utilities.g.c(new jg(rs0Var2, str2, arrayList, 22));
                } else {
                    rs0Var2.r = 1;
                }
                rs0Var2.e.g(str2, false, false, true, false, org.telegram.messenger.w3.T(rs0Var2.n) ? rs0Var2.n.id : 0L, false, 2, 1);
                break;
        }
    }
}
