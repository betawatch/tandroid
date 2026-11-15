package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class a1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.t1 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ a1(int i7, Context context, org.telegram.ui.ActionBar.t1 t1Var) {
        this.a = i7;
        this.b = t1Var;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        Context context = this.c;
        org.telegram.ui.ActionBar.t1 t1Var = this.b;
        switch (i7) {
            case 0:
                if (t1Var != null) {
                    t1Var.dismiss();
                }
                vf.c.t(context, org.telegram.messenger.hd.M0(2131752895, null));
                break;
            default:
                if (t1Var != null) {
                    t1Var.dismiss();
                }
                vf.c.t(context, org.telegram.messenger.hd.M0(2131752895, null));
                break;
        }
    }
}
