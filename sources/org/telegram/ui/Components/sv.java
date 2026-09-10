package org.telegram.ui.Components;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                org.telegram.ui.ActionBar.p2 p2Var = wvVar.c;
                if (p2Var != null && p2Var.getParentActivity() != null) {
                    org.telegram.messenger.a2.p(R.string.AddEmojiNotFound, wc.a0(p2Var), null);
                    break;
                }
                break;
        }
    }
}
