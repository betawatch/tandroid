package org.telegram.ui.Components;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xv b;

    public /* synthetic */ wv(xv xvVar, int i10) {
        this.a = i10;
        this.b = xvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f.dismiss();
                break;
            default:
                aw awVar = this.b.f;
                awVar.dismiss();
                org.telegram.ui.ActionBar.n2 n2Var = awVar.c;
                if (n2Var != null && n2Var.getParentActivity() != null) {
                    org.telegram.messenger.lk.q(R.string.AddEmojiNotFound, xc.a0(n2Var), null);
                    break;
                }
                break;
        }
    }
}
