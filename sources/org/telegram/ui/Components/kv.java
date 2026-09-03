package org.telegram.ui.Components;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
