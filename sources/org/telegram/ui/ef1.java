package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ef1 implements i11 {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ ff1 b;

    public ef1(ff1 ff1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = ff1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.i11
    public final void Y() {
        if1 if1Var = this.b.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if1.V(if1Var, tL_forumTopic.id);
        AndroidUtilities.runOnUIThread(new yc1(5, this, tL_forumTopic), 300L);
    }

    @Override // org.telegram.ui.i11
    public final void t(qk0 qk0Var) {
    }
}
