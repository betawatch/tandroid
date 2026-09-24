package org.telegram.ui.Components;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rv b;

    public /* synthetic */ qv(rv rvVar, int i10) {
        this.a = i10;
        this.b = rvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f.dismiss();
                break;
            default:
                uv uvVar = this.b.f;
                uvVar.dismiss();
                org.telegram.ui.ActionBar.m2 m2Var = uvVar.c;
                if (m2Var != null && m2Var.getParentActivity() != null) {
                    org.telegram.messenger.ok.p(R.string.AddEmojiNotFound, yc.a0(m2Var), null);
                    break;
                }
                break;
        }
    }
}
