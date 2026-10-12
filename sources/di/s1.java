package di;

import android.app.Activity;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dz;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.hu;
import org.telegram.ui.kp;
import org.telegram.ui.qe;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class s1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ s1(v1 v1Var, boolean z10, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.a = 0;
        this.c = v1Var;
        this.b = z10;
        this.d = tL_messages_getInlineBotResults;
        this.e = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t1((v1) this.c, tLObject, this.b, (TLRPC.TL_messages_getInlineBotResults) this.d, (String) this.e, 0));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new i2.f1((qe) this.c, tL_error, (TwoStepVerificationActivity) this.d, (Activity) this.e, this.b, tLObject, 6));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new t1(this.c, this.d, tLObject, this.e, this.b, 15));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new i2.f1((kp) this.c, (TLRPC.TL_channels_toggleUsername) this.d, tLObject, (TLRPC.TL_username) this.e, this.b, tL_error, 9));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new t1((dz) this.c, (String) this.e, this.b, (String) this.d, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new i2.f1((hu) this.c, tLObject, (d) this.d, this.b, (HashSet) this.e, tL_error, 11));
                break;
        }
    }

    public /* synthetic */ s1(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
    }

    public /* synthetic */ s1(dz dzVar, String str, boolean z10, String str2) {
        this.a = 4;
        this.c = dzVar;
        this.e = str;
        this.b = z10;
        this.d = str2;
    }

    public /* synthetic */ s1(hu huVar, d dVar, boolean z10, HashSet hashSet) {
        this.a = 5;
        this.c = huVar;
        this.d = dVar;
        this.b = z10;
        this.e = hashSet;
    }
}
