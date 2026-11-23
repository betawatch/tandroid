package di;

import android.app.Activity;
import java.util.HashSet;
import org.telegram.messenger.in;
import org.telegram.messenger.w10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xx;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bn;
import org.telegram.ui.fo;
import org.telegram.ui.ne;
import org.telegram.ui.vs;
import org.telegram.ui.xd;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class j3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j3(hi.z1 z1Var, boolean z10, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.a = 1;
        this.c = z1Var;
        this.b = z10;
        this.d = tL_messages_getInlineBotResults;
        this.e = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new o3(0, (f6) this.c, tL_error, (w10) this.d, (TwoStepVerificationActivity) this.e, tLObject, this.b));
                break;
            case 1:
                org.telegram.messenger.g0.g3(new ai.e(this.c, tLObject, this.b, (TLObject) this.d, (String) this.e, 1));
                break;
            case 2:
                org.telegram.messenger.g0.g3(new in((org.telegram.messenger.x6) this.c, tLObject, (TLRPC.TL_textWithEntities) this.d, (org.telegram.ui.ActionBar.t1) this.e, this.b, 2));
                break;
            case 3:
                org.telegram.messenger.g0.g3(new o3((xd) this.c, tL_error, (TwoStepVerificationActivity) this.e, (Activity) this.d, this.b, tLObject));
                break;
            case 4:
                org.telegram.messenger.g0.g3(new ai.e((bn) this.c, (vf.b) this.d, tLObject, (ne) this.e, this.b, 7));
                break;
            case 5:
                org.telegram.messenger.g0.g3(new o3((fo) this.c, (TLRPC.TL_channels_toggleUsername) this.d, tLObject, (TLRPC.TL_username) this.e, this.b, tL_error));
                break;
            case 6:
                org.telegram.messenger.g0.g3(new ai.e((xx) this.c, (String) this.d, this.b, (String) this.e, tLObject));
                break;
            default:
                org.telegram.messenger.g0.g3(new o3((vs) this.c, tLObject, (hi.e) this.d, this.b, (HashSet) this.e, tL_error));
                break;
        }
    }

    public /* synthetic */ j3(Object obj, Object obj2, Object obj3, boolean z10, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
    }

    public /* synthetic */ j3(Object obj, Object obj2, boolean z10, Object obj3, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
        this.e = obj3;
    }

    public /* synthetic */ j3(xd xdVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10) {
        this.a = 3;
        this.c = xdVar;
        this.e = twoStepVerificationActivity;
        this.d = activity;
        this.b = z10;
    }
}
