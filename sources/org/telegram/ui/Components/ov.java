package org.telegram.ui.Components;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ov implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pv b;

    public /* synthetic */ ov(pv pvVar, int i10) {
        this.a = i10;
        this.b = pvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f.dismiss();
                break;
            default:
                sv svVar = this.b.f;
                svVar.dismiss();
                org.telegram.ui.ActionBar.o2 o2Var = svVar.c;
                if (o2Var != null && o2Var.getParentActivity() != null) {
                    org.telegram.messenger.w1.p(R.string.AddEmojiNotFound, vc.a0(o2Var), null);
                    break;
                }
                break;
        }
    }
}
