package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class as0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bs0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ as0(bs0 bs0Var, String str, int i7) {
        this.a = i7;
        this.b = bs0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bs0 bs0Var = this.b;
                String str = this.c;
                bs0Var.getClass();
                org.telegram.messenger.g0.g3(new as0(bs0Var, str, 1));
                break;
            default:
                bs0 bs0Var2 = this.b;
                String str2 = this.c;
                ArrayList arrayList = null;
                bs0Var2.f = null;
                if (!org.telegram.messenger.v3.T(bs0Var2.n) && bs0Var2.s.g1 != null) {
                    arrayList = new ArrayList(bs0Var2.s.g1.participants.participants);
                }
                bs0Var2.r = 2;
                if (arrayList != null) {
                    Utilities.g.c(new g(bs0Var2, str2, arrayList, 28));
                } else {
                    bs0Var2.r = 1;
                }
                bs0Var2.e.g(str2, false, false, true, false, org.telegram.messenger.v3.T(bs0Var2.n) ? bs0Var2.n.id : 0L, false, 2, 1);
                break;
        }
    }
}
