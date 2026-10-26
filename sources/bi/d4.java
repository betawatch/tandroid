package bi;

import android.app.Activity;
import java.io.Serializable;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.az;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ke;
import org.telegram.ui.rt;
import org.telegram.ui.xo;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d4 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d4(fi.s1 s1Var, boolean z10, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.a = 1;
        this.c = s1Var;
        this.b = z10;
        this.d = tL_messages_getInlineBotResults;
        this.e = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k4((h7) this.c, tL_error, (Utilities.Callback) this.d, (TwoStepVerificationActivity) this.e, this.b, tLObject, 0));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new fi.r1((fi.s1) this.c, tLObject, this.b, (TLRPC.TL_messages_getInlineBotResults) this.d, (String) this.e, 0));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new k4((ke) this.c, tL_error, (TwoStepVerificationActivity) this.e, (Activity) this.d, this.b, tLObject));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new fi.r1(this.c, this.d, tLObject, this.e, this.b, 14));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new k4((xo) this.c, (TLRPC.TL_channels_toggleUsername) this.d, tLObject, (TLRPC.TL_username) this.e, this.b, tL_error));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new fi.r1((az) this.c, (String) this.d, this.b, (String) this.e, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new k4((rt) this.c, tLObject, (fi.d) this.d, this.b, (HashSet) this.e, tL_error));
                break;
        }
    }

    public /* synthetic */ d4(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
    }

    public /* synthetic */ d4(Object obj, Object obj2, boolean z10, Serializable serializable, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
        this.e = serializable;
    }

    public /* synthetic */ d4(ke keVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10) {
        this.a = 2;
        this.c = keVar;
        this.e = twoStepVerificationActivity;
        this.d = activity;
        this.b = z10;
    }
}
