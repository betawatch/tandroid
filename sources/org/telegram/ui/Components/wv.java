package org.telegram.ui.Components;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
                    org.telegram.messenger.kk.q(R.string.AddEmojiNotFound, xc.a0(n2Var), null);
                    break;
                }
                break;
        }
    }
}
