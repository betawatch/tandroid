// default package

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class eob extends tca {
    public final /* synthetic */ gob U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eob(gob gobVar, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.U2 = gobVar;
    }

    @Override // tca
    public final void L0(vh6 vh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (z) {
            int m = vh6Var.m();
            rob robVar = this.U2.a;
            if (m != 1) {
                robVar.n0.k(0L, 61, Integer.valueOf(i), Integer.valueOf(vh6Var.m()), null, null);
                return;
            }
            robVar.n0.m(Integer.valueOf(i), 61, ((TLRPC.Dialog) vh6Var.n(0)).id);
        }
    }
}
