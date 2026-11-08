package di;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f6 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f6(y6 y6Var, boolean z9, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, boolean z10) {
        this.d = y6Var;
        this.b = z9;
        this.e = tL_stories_getAllStories;
        this.c = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new z5((y6) this.d, this.b, (TL_stories.TL_stories_getAllStories) this.e, tLObject, this.c));
                break;
            default:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.q((TwoStepVerificationActivity) this.d, tL_error, tLObject, this.b, this.c, (Runnable) this.e));
                break;
        }
    }

    public /* synthetic */ f6(TwoStepVerificationActivity twoStepVerificationActivity, boolean z9, boolean z10, Runnable runnable) {
        this.d = twoStepVerificationActivity;
        this.b = z9;
        this.c = z10;
        this.e = runnable;
    }
}
