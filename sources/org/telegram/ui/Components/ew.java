package org.telegram.ui.Components;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ew implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fw b;

    public /* synthetic */ ew(fw fwVar, int i10) {
        this.a = i10;
        this.b = fwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f.dismiss();
                break;
            default:
                iw iwVar = this.b.f;
                iwVar.dismiss();
                org.telegram.ui.ActionBar.n2 n2Var = iwVar.c;
                if (n2Var != null && n2Var.getParentActivity() != null) {
                    org.telegram.messenger.bi.q(R.string.AddEmojiNotFound, ad.a0(n2Var), null);
                    break;
                }
                break;
        }
    }
}
