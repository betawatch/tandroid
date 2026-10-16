package org.telegram.ui.Components;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                    org.telegram.messenger.sk.q(R.string.AddEmojiNotFound, zc.a0(m2Var), null);
                    break;
                }
                break;
        }
    }
}
