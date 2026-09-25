package org.telegram.ui.Components;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
                org.telegram.ui.ActionBar.m2 m2Var = tvVar.c;
                if (m2Var != null && m2Var.getParentActivity() != null) {
                    org.telegram.messenger.ok.p(R.string.AddEmojiNotFound, xc.a0(m2Var), null);
                    break;
                }
                break;
        }
    }
}
