package org.telegram.ui.Components;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                    org.telegram.messenger.vh.n(R.string.AddEmojiNotFound, wc.b0(r2Var), null);
                    break;
                }
                break;
        }
    }
}
