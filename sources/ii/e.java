package ii;

import java.util.HashMap;
import org.telegram.messenger.g0;
import org.telegram.messenger.gs;
import org.telegram.messenger.np;
import org.telegram.messenger.ob;
import org.telegram.messenger.r10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements RequestDelegate {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ gs d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ e(np npVar, HashMap hashMap, String str, a0.h hVar, long j3, int i7) {
        this.d = npVar;
        this.e = hashMap;
        this.f = str;
        this.g = hVar;
        this.b = j3;
        this.c = i7;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                g0.g3(new i(tL_error, tLObject, (TwoStepVerificationActivity) this.d, (g2) this.e, this.b, (r10) this.f, (Runnable) this.g, this.c));
                break;
            default:
                g0.g3(new ob((np) this.d, (HashMap) this.e, (String) this.f, tLObject, (a0.h) this.g, this.b, this.c));
                break;
        }
    }

    public /* synthetic */ e(TwoStepVerificationActivity twoStepVerificationActivity, g2 g2Var, long j3, r10 r10Var, Runnable runnable, int i7) {
        this.d = twoStepVerificationActivity;
        this.e = g2Var;
        this.b = j3;
        this.f = r10Var;
        this.g = runnable;
        this.c = i7;
    }
}
