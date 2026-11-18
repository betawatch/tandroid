package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class l1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.u1 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ l1(int i7, Context context, org.telegram.ui.ActionBar.u1 u1Var) {
        this.a = i7;
        this.b = u1Var;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        Context context = this.c;
        org.telegram.ui.ActionBar.u1 u1Var = this.b;
        switch (i7) {
            case 0:
                if (u1Var != null) {
                    u1Var.dismiss();
                }
                vf.c.t(context, org.telegram.messenger.gd.M0(2131752884, null));
                break;
            default:
                if (u1Var != null) {
                    u1Var.dismiss();
                }
                vf.c.t(context, org.telegram.messenger.gd.M0(2131752884, null));
                break;
        }
    }
}
