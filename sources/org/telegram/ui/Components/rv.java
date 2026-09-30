package org.telegram.ui.Components;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sv b;

    public /* synthetic */ rv(sv svVar, int i10) {
        this.a = i10;
        this.b = svVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f.dismiss();
                break;
            default:
                vv vvVar = this.b.f;
                vvVar.dismiss();
                org.telegram.ui.ActionBar.m2 m2Var = vvVar.c;
                if (m2Var != null && m2Var.getParentActivity() != null) {
                    org.telegram.messenger.ok.p(R.string.AddEmojiNotFound, yc.a0(m2Var), null);
                    break;
                }
                break;
        }
    }
}
