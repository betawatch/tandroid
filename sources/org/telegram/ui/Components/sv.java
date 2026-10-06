package org.telegram.ui.Components;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
