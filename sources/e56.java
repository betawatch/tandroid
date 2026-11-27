// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class e56 extends kea {
    public final /* synthetic */ i56 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e56(i56 i56Var, Context context, String str, String str2, vnb vnbVar) {
        super(context, null, str, false, str2, false, vnbVar);
        this.U2 = i56Var;
    }

    @Override // kea
    public final void M0(zh6 zh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        String a0;
        if (z) {
            if (zh6Var == null || zh6Var.m() != 1) {
                a0 = ob6.a0(null, null, 2131748941, ob6.G(i, "Chats", new Object[0]));
            } else {
                long j = ((TLRPC.Dialog) zh6Var.n(0)).id;
                a0 = (j == 0 || j == yac.h(this.a).e()) ? ob6.M0(2131748939, null) : ob6.a0(null, null, 2131748938, uc7.s1(this.a).A1(j, true));
            }
            this.U2.e(hl.S2(a0));
        }
    }
}
