package org.telegram.ui.Components;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ iv b;

    public /* synthetic */ hv(iv ivVar, int i10) {
        this.a = i10;
        this.b = ivVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f.dismiss();
                break;
            default:
                lv lvVar = this.b.f;
                lvVar.dismiss();
                org.telegram.ui.ActionBar.p2 p2Var = lvVar.c;
                if (p2Var != null && p2Var.getParentActivity() != null) {
                    org.telegram.messenger.y3.s(R.string.AddEmojiNotFound, qc.a0(p2Var), null);
                    break;
                }
                break;
        }
    }
}
