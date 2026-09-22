package org.telegram.ui.Components;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class pv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qv b;

    public /* synthetic */ pv(qv qvVar, int i10) {
        this.a = i10;
        this.b = qvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f.dismiss();
                break;
            default:
                tv tvVar = this.b.f;
                tvVar.dismiss();
                org.telegram.ui.ActionBar.n2 n2Var = tvVar.c;
                if (n2Var != null && n2Var.getParentActivity() != null) {
                    org.telegram.messenger.rk.p(R.string.AddEmojiNotFound, xc.a0(n2Var), null);
                    break;
                }
                break;
        }
    }
}
