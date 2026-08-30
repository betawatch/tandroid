package org.telegram.ui.Components;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class iv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jv b;

    public /* synthetic */ iv(jv jvVar, int i10) {
        this.a = i10;
        this.b = jvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f.dismiss();
                break;
            default:
                mv mvVar = this.b.f;
                mvVar.dismiss();
                org.telegram.ui.ActionBar.p2 p2Var = mvVar.c;
                if (p2Var != null && p2Var.getParentActivity() != null) {
                    org.telegram.messenger.y3.s(R.string.AddEmojiNotFound, qc.a0(p2Var), null);
                    break;
                }
                break;
        }
    }
}
