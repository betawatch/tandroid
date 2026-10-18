package ai;

import android.app.Activity;
import java.io.Serializable;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bz;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.st;
import org.telegram.ui.vo;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g4 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g4(ei.t1 t1Var, boolean z10, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.a = 1;
        this.c = t1Var;
        this.b = z10;
        this.d = tL_messages_getInlineBotResults;
        this.e = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m4((k7) this.c, tL_error, (Utilities.Callback) this.d, (TwoStepVerificationActivity) this.e, this.b, tLObject, 0));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new ei.s1((ei.t1) this.c, tLObject, this.b, (TLRPC.TL_messages_getInlineBotResults) this.d, (String) this.e, 0));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new m4((org.telegram.ui.ke) this.c, tL_error, (TwoStepVerificationActivity) this.e, (Activity) this.d, this.b, tLObject));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new ei.s1(this.c, this.d, tLObject, this.e, this.b, 14));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new m4((vo) this.c, (TLRPC.TL_channels_toggleUsername) this.d, tLObject, (TLRPC.TL_username) this.e, this.b, tL_error));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new ei.s1((bz) this.c, (String) this.d, this.b, (String) this.e, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new m4((st) this.c, tLObject, (ei.d) this.d, this.b, (HashSet) this.e, tL_error));
                break;
        }
    }

    public /* synthetic */ g4(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
    }

    public /* synthetic */ g4(Object obj, Object obj2, boolean z10, Serializable serializable, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
        this.e = serializable;
    }

    public /* synthetic */ g4(org.telegram.ui.ke keVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10) {
        this.a = 2;
        this.c = keVar;
        this.e = twoStepVerificationActivity;
        this.d = activity;
        this.b = z10;
    }
}
