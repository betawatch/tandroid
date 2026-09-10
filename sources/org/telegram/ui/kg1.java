package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class kg1 implements b21 {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ lg1 b;

    public kg1(lg1 lg1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = lg1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.b21
    public final void Z() {
        og1 og1Var = this.b.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        og1.U(og1Var, tL_forumTopic.id);
        AndroidUtilities.runOnUIThread(new r91(11, this, tL_forumTopic), 300L);
    }

    @Override // org.telegram.ui.b21
    public final void u(vk0 vk0Var) {
    }
}
