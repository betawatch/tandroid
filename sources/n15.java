// default package

import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class n15 implements RequestDelegate {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ jm7 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ n15(oc7 oc7Var, HashMap hashMap, String str, vh6 vh6Var, long j, int i) {
        this.d = oc7Var;
        this.e = hashMap;
        this.f = str;
        this.g = vh6Var;
        this.b = j;
        this.c = i;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.e;
        jm7 jm7Var = this.d;
        switch (b) {
            case 0:
                gm.c3(new at0(tL_error, tLObject, (TwoStepVerificationActivity) jm7Var, (d) obj3, this.b, (qt0) obj2, (wz) obj, this.c));
                break;
            default:
                gm.c3(new pf((oc7) jm7Var, (HashMap) obj3, (String) obj2, tLObject, (vh6) obj, this.b, this.c));
                break;
        }
    }

    public /* synthetic */ n15(TwoStepVerificationActivity twoStepVerificationActivity, d dVar, long j, qt0 qt0Var, wz wzVar, int i) {
        this.d = twoStepVerificationActivity;
        this.e = dVar;
        this.b = j;
        this.f = qt0Var;
        this.g = wzVar;
        this.c = i;
    }
}
