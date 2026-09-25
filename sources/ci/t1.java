package ci;

import android.app.Activity;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ty;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.cp;
import org.telegram.ui.je;
import org.telegram.ui.yt;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t1(w1 w1Var, boolean z10, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.a = 0;
        this.c = w1Var;
        this.b = z10;
        this.d = tL_messages_getInlineBotResults;
        this.e = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new u1((w1) this.c, tLObject, this.b, (TLRPC.TL_messages_getInlineBotResults) this.d, (String) this.e, 0));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new i2.c1((je) this.c, tL_error, (TwoStepVerificationActivity) this.d, (Activity) this.e, this.b, tLObject, 6));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new u1(this.c, this.d, tLObject, this.e, this.b, 15));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new i2.c1((cp) this.c, (TLRPC.TL_channels_toggleUsername) this.d, tLObject, (TLRPC.TL_username) this.e, this.b, tL_error, 8));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new u1((ty) this.c, (String) this.e, this.b, (String) this.d, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new i2.c1((yt) this.c, tLObject, (d) this.d, this.b, (HashSet) this.e, tL_error, 10));
                break;
        }
    }

    public /* synthetic */ t1(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
    }

    public /* synthetic */ t1(ty tyVar, String str, boolean z10, String str2) {
        this.a = 4;
        this.c = tyVar;
        this.e = str;
        this.b = z10;
        this.d = str2;
    }

    public /* synthetic */ t1(yt ytVar, d dVar, boolean z10, HashSet hashSet) {
        this.a = 5;
        this.c = ytVar;
        this.d = dVar;
        this.b = z10;
        this.e = hashSet;
    }
}
