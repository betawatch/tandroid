package org.telegram.ui.Components;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class pv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qv b;

    public /* synthetic */ pv(qv qvVar, int i10) {
        this.a = i10;
        this.b = qvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f.dismiss();
                break;
            default:
                tv tvVar = this.b.f;
                tvVar.dismiss();
                org.telegram.ui.ActionBar.n2 n2Var = tvVar.c;
                if (n2Var != null && n2Var.getParentActivity() != null) {
                    org.telegram.messenger.rk.p(R.string.AddEmojiNotFound, xc.a0(n2Var), null);
                    break;
                }
                break;
        }
    }
}
