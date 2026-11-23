package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class p20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r20 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ p20(r20 r20Var, String str, int i7, int i10) {
        this.a = i10;
        this.b = r20Var;
        this.c = str;
        this.d = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r20 r20Var = this.b;
                String str = this.c;
                int i7 = this.d;
                if (r20Var.e != null) {
                    r20Var.e = null;
                    org.telegram.messenger.g0.g3(new p20(r20Var, str, i7, 1));
                    break;
                }
                break;
            default:
                r20 r20Var2 = this.b;
                String str2 = this.c;
                int i10 = this.d;
                ArrayList arrayList = null;
                r20Var2.e = null;
                if (!org.telegram.messenger.v3.T(r20Var2.x.Q1) && r20Var2.x.R1 != null) {
                    arrayList = new ArrayList(r20Var2.x.R1.participants.participants);
                }
                if (arrayList != null) {
                    Utilities.g.c(new ai.x0(r20Var2, str2, i10, arrayList));
                } else {
                    r20Var2.h = false;
                }
                r20Var2.d.g(str2, org.telegram.messenger.v3.w(3, r20Var2.x.Q1), false, true, false, org.telegram.messenger.v3.T(r20Var2.x.Q1) ? r20Var2.x.Q1.id : 0L, false, 2, i10);
                break;
        }
    }
}
