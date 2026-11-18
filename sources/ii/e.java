package ii;

import java.util.HashMap;
import org.telegram.messenger.fs;
import org.telegram.messenger.g0;
import org.telegram.messenger.mp;
import org.telegram.messenger.nb;
import org.telegram.messenger.q10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements RequestDelegate {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ fs d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ e(mp mpVar, HashMap hashMap, String str, a0.h hVar, long j3, int i7) {
        this.d = mpVar;
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
                g0.g3(new i(tL_error, tLObject, (TwoStepVerificationActivity) this.d, (h2) this.e, this.b, (q10) this.f, (Runnable) this.g, this.c));
                break;
            default:
                g0.g3(new nb((mp) this.d, (HashMap) this.e, (String) this.f, tLObject, (a0.h) this.g, this.b, this.c));
                break;
        }
    }

    public /* synthetic */ e(TwoStepVerificationActivity twoStepVerificationActivity, h2 h2Var, long j3, q10 q10Var, Runnable runnable, int i7) {
        this.d = twoStepVerificationActivity;
        this.e = h2Var;
        this.b = j3;
        this.f = q10Var;
        this.g = runnable;
        this.c = i7;
    }
}
