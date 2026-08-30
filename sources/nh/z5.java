package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.wd;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z5 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ z5(t6 t6Var, boolean z4, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, boolean z10) {
        this.d = t6Var;
        this.b = z4;
        this.e = tL_stories_getAllStories;
        this.c = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new cg.x0((t6) this.d, this.b, (TL_stories.TL_stories_getAllStories) this.e, tLObject, this.c));
                break;
            default:
                AndroidUtilities.runOnUIThread(new wd((TwoStepVerificationActivity) this.d, tL_error, tLObject, this.b, this.c, (Runnable) this.e, 3));
                break;
        }
    }

    public /* synthetic */ z5(TwoStepVerificationActivity twoStepVerificationActivity, boolean z4, boolean z10, Runnable runnable) {
        this.d = twoStepVerificationActivity;
        this.b = z4;
        this.c = z10;
        this.e = runnable;
    }
}
