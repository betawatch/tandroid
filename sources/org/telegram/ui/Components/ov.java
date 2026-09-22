package org.telegram.ui.Components;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ov implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pv b;

    public /* synthetic */ ov(pv pvVar, int i10) {
        this.a = i10;
        this.b = pvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f.dismiss();
                break;
            default:
                sv svVar = this.b.f;
                svVar.dismiss();
                org.telegram.ui.ActionBar.n2 n2Var = svVar.c;
                if (n2Var != null && n2Var.getParentActivity() != null) {
                    org.telegram.messenger.y0.p(R.string.AddEmojiNotFound, vc.a0(n2Var), null);
                    break;
                }
                break;
        }
    }
}
