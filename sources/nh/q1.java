package nh;

import android.app.Activity;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.my;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.de;
import org.telegram.ui.tt;
import org.telegram.ui.vo;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q1(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new eg.j(this.c, tLObject, this.b, (TLObject) this.d, (String) this.e, 1));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new j3.p1((de) this.c, tL_error, (TwoStepVerificationActivity) this.d, (Activity) this.e, this.b, tLObject, 7));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new eg.j(this.c, this.d, (Object) tLObject, this.e, this.b, 13));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new j3.p1((vo) this.c, (TLRPC.TL_channels_toggleUsername) this.d, tLObject, (TLRPC.TL_username) this.e, this.b, tL_error, 9));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new eg.j((my) this.c, (String) this.e, this.b, (String) this.d, tLObject, 16));
                break;
            default:
                AndroidUtilities.runOnUIThread(new j3.p1((tt) this.c, tLObject, (d) this.d, this.b, (HashSet) this.e, tL_error, 11));
                break;
        }
    }

    public /* synthetic */ q1(r1 r1Var, boolean z10, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.a = 0;
        this.c = r1Var;
        this.b = z10;
        this.d = tL_messages_getInlineBotResults;
        this.e = str;
    }

    public /* synthetic */ q1(my myVar, String str, boolean z10, String str2) {
        this.a = 4;
        this.c = myVar;
        this.e = str;
        this.b = z10;
        this.d = str2;
    }

    public /* synthetic */ q1(tt ttVar, d dVar, boolean z10, HashSet hashSet) {
        this.a = 5;
        this.c = ttVar;
        this.d = dVar;
        this.b = z10;
        this.e = hashSet;
    }
}
