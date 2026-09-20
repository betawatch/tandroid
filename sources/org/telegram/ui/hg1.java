package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class hg1 implements v11 {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ ig1 b;

    public hg1(ig1 ig1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = ig1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.v11
    public final void c0() {
        lg1 lg1Var = this.b.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        lg1.U(lg1Var, tL_forumTopic.id);
        AndroidUtilities.runOnUIThread(new w81(14, this, tL_forumTopic), 300L);
    }

    @Override // org.telegram.ui.v11
    public final void v(wk0 wk0Var) {
    }
}
