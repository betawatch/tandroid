package org.telegram.ui.Components;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tv b;

    public /* synthetic */ sv(tv tvVar, int i10) {
        this.a = i10;
        this.b = tvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f.dismiss();
                break;
            default:
                wv wvVar = this.b.f;
                wvVar.dismiss();
                org.telegram.ui.ActionBar.n2 n2Var = wvVar.c;
                if (n2Var != null && n2Var.getParentActivity() != null) {
                    org.telegram.messenger.bi.o(R.string.AddEmojiNotFound, yc.a0(n2Var), null);
                    break;
                }
                break;
        }
    }
}
