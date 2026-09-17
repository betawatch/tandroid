package org.telegram.ui.Components;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ov b;

    public /* synthetic */ nv(ov ovVar, int i10) {
        this.a = i10;
        this.b = ovVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f.dismiss();
                break;
            default:
                rv rvVar = this.b.f;
                rvVar.dismiss();
                org.telegram.ui.ActionBar.n2 n2Var = rvVar.c;
                if (n2Var != null && n2Var.getParentActivity() != null) {
                    org.telegram.messenger.w1.p(R.string.AddEmojiNotFound, yc.a0(n2Var), null);
                    break;
                }
                break;
        }
    }
}
