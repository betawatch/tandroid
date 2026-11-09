package bi;

import android.app.Activity;
import java.util.HashSet;
import org.telegram.messenger.c20;
import org.telegram.messenger.ln;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.px;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.fo;
import org.telegram.ui.us;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class d4 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d4(fi.r1 r1Var, boolean z9, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.a = 1;
        this.c = r1Var;
        this.b = z9;
        this.d = tL_messages_getInlineBotResults;
        this.e = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new l4(0, (k7) this.c, tL_error, (c20) this.d, (TwoStepVerificationActivity) this.e, tLObject, this.b));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new fi.q1((fi.r1) this.c, tLObject, this.b, (TLRPC.TL_messages_getInlineBotResults) this.d, (String) this.e, 0));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new ln((org.telegram.messenger.x6) this.c, tLObject, (TLRPC.TL_textWithEntities) this.d, (org.telegram.ui.ActionBar.u1) this.e, this.b, 2));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new l4((org.telegram.ui.zd) this.c, tL_error, (TwoStepVerificationActivity) this.e, (Activity) this.d, this.b, tLObject));
                break;
            case 4:
                org.telegram.messenger.g0.h3(new fi.q1(this.c, this.d, tLObject, this.e, this.b, 6));
                break;
            case 5:
                org.telegram.messenger.g0.h3(new l4((fo) this.c, (TLRPC.TL_channels_toggleUsername) this.d, tLObject, (TLRPC.TL_username) this.e, this.b, tL_error));
                break;
            case 6:
                org.telegram.messenger.g0.h3(new fi.q1((px) this.c, (String) this.d, this.b, (String) this.e, tLObject));
                break;
            default:
                org.telegram.messenger.g0.h3(new l4((us) this.c, tLObject, (fi.d) this.d, this.b, (HashSet) this.e, tL_error));
                break;
        }
    }

    public /* synthetic */ d4(Object obj, Object obj2, Object obj3, boolean z9, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z9;
    }

    public /* synthetic */ d4(Object obj, Object obj2, boolean z9, Object obj3, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = z9;
        this.e = obj3;
    }

    public /* synthetic */ d4(org.telegram.ui.zd zdVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z9) {
        this.a = 3;
        this.c = zdVar;
        this.e = twoStepVerificationActivity;
        this.d = activity;
        this.b = z9;
    }
}
