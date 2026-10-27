package org.telegram.ui.Components;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                org.telegram.ui.ActionBar.r2 r2Var = awVar.c;
                if (r2Var != null && r2Var.getParentActivity() != null) {
                    org.telegram.messenger.wh.n(R.string.AddEmojiNotFound, wc.b0(r2Var), null);
                    break;
                }
                break;
        }
    }
}
