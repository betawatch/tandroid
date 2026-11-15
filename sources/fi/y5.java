package fi;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class y5 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ y5(s6 s6Var, boolean z10, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, boolean z11) {
        this.d = s6Var;
        this.b = z10;
        this.e = tL_stories_getAllStories;
        this.c = z11;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new r5((s6) this.d, this.b, (TL_stories.TL_stories_getAllStories) this.e, tLObject, this.c));
                break;
            default:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.p((TwoStepVerificationActivity) this.d, tL_error, tLObject, this.b, this.c, (Runnable) this.e));
                break;
        }
    }

    public /* synthetic */ y5(TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, boolean z11, Runnable runnable) {
        this.d = twoStepVerificationActivity;
        this.b = z10;
        this.c = z11;
        this.e = runnable;
    }
}
