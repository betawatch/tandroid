package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class cf1 implements g11 {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ df1 b;

    public cf1(df1 df1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = df1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.g11
    public final void Y() {
        gf1 gf1Var = this.b.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        gf1.V(gf1Var, tL_forumTopic.id);
        AndroidUtilities.runOnUIThread(new zc1(4, this, tL_forumTopic), 300L);
    }

    @Override // org.telegram.ui.g11
    public final void t(ok0 ok0Var) {
    }
}
