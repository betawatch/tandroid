package org.telegram.ui.Components;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
                org.telegram.ui.ActionBar.o2 o2Var = awVar.c;
                if (o2Var != null && o2Var.getParentActivity() != null) {
                    org.telegram.messenger.sl.q(R.string.AddEmojiNotFound, xc.a0(o2Var), null);
                    break;
                }
                break;
        }
    }
}
