// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class n1b implements RequestDelegate {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n1b(g2b g2bVar, boolean z, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, boolean z2) {
        this.d = g2bVar;
        this.b = z;
        this.e = tL_stories_getAllStories;
        this.c = z2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                gl.c3(new hw6((g2b) obj2, this.b, (TL_stories.TL_stories_getAllStories) obj, tLObject, this.c));
                break;
            default:
                gl.c3(new d87((TwoStepVerificationActivity) obj2, tL_error, tLObject, this.b, this.c, (Runnable) obj, (byte) 3));
                break;
        }
    }

    public /* synthetic */ n1b(TwoStepVerificationActivity twoStepVerificationActivity, boolean z, boolean z2, Runnable runnable) {
        this.d = twoStepVerificationActivity;
        this.b = z;
        this.c = z2;
        this.e = runnable;
    }
}
