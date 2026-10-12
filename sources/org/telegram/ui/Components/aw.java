package org.telegram.ui.Components;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class aw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bw b;

    public /* synthetic */ aw(bw bwVar, int i10) {
        this.a = i10;
        this.b = bwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f.dismiss();
                break;
            default:
                ew ewVar = this.b.f;
                ewVar.dismiss();
                org.telegram.ui.ActionBar.m2 m2Var = ewVar.c;
                if (m2Var != null && m2Var.getParentActivity() != null) {
                    org.telegram.messenger.yh.p(R.string.AddEmojiNotFound, zc.a0(m2Var), null);
                    break;
                }
                break;
        }
    }
}
