package ci;

import android.app.Activity;
import java.util.HashSet;
import org.telegram.messenger.bn;
import org.telegram.messenger.u10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mx;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.qs;
import org.telegram.ui.xd;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o3(gi.r1 r1Var, boolean z10, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.a = 1;
        this.c = r1Var;
        this.b = z10;
        this.d = tL_messages_getInlineBotResults;
        this.e = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new v3(0, (l6) this.c, tL_error, (u10) this.d, (TwoStepVerificationActivity) this.e, tLObject, this.b));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new gi.q1((gi.r1) this.c, tLObject, this.b, (TLRPC.TL_messages_getInlineBotResults) this.d, (String) this.e, 0));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new bn((org.telegram.messenger.x6) this.c, tLObject, (TLRPC.TL_textWithEntities) this.d, (org.telegram.ui.ActionBar.s1) this.e, this.b, 2));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new v3((xd) this.c, tL_error, (TwoStepVerificationActivity) this.e, (Activity) this.d, this.b, tLObject));
                break;
            case 4:
                org.telegram.messenger.g0.h3(new gi.q1(this.c, this.d, tLObject, this.e, this.b, 6));
                break;
            case 5:
                org.telegram.messenger.g0.h3(new v3((yn) this.c, (TLRPC.TL_channels_toggleUsername) this.d, tLObject, (TLRPC.TL_username) this.e, this.b, tL_error));
                break;
            case 6:
                org.telegram.messenger.g0.h3(new gi.q1((mx) this.c, (String) this.d, this.b, (String) this.e, tLObject));
                break;
            default:
                org.telegram.messenger.g0.h3(new v3((qs) this.c, tLObject, (gi.d) this.d, this.b, (HashSet) this.e, tL_error));
                break;
        }
    }

    public /* synthetic */ o3(Object obj, Object obj2, Object obj3, boolean z10, int i3) {
        this.a = i3;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
    }

    public /* synthetic */ o3(Object obj, Object obj2, boolean z10, Object obj3, int i3) {
        this.a = i3;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
        this.e = obj3;
    }

    public /* synthetic */ o3(xd xdVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10) {
        this.a = 3;
        this.c = xdVar;
        this.e = twoStepVerificationActivity;
        this.d = activity;
        this.b = z10;
    }
}
