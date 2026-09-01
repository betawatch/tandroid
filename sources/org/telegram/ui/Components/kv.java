package org.telegram.ui.Components;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lv b;

    public /* synthetic */ kv(lv lvVar, int i10) {
        this.a = i10;
        this.b = lvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f.dismiss();
                break;
            default:
                ov ovVar = this.b.f;
                ovVar.dismiss();
                org.telegram.ui.ActionBar.p2 p2Var = ovVar.c;
                if (p2Var != null && p2Var.getParentActivity() != null) {
                    org.telegram.messenger.y3.s(R.string.AddEmojiNotFound, qc.a0(p2Var), null);
                    break;
                }
                break;
        }
    }
}
