package lh;

import android.app.Activity;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fy;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.fe;
import org.telegram.ui.uo;
import org.telegram.ui.vt;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r1(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
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
                AndroidUtilities.runOnUIThread(new cg.j(this.c, tLObject, this.b, (TLObject) this.d, (String) this.e, 1));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new h3.p1((fe) this.c, tL_error, (TwoStepVerificationActivity) this.d, (Activity) this.e, this.b, tLObject, 7));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new cg.j(this.c, this.d, (Object) tLObject, this.e, this.b, 13));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new h3.p1((uo) this.c, (TLRPC.TL_channels_toggleUsername) this.d, tLObject, (TLRPC.TL_username) this.e, this.b, tL_error, 9));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new cg.j((fy) this.c, (String) this.e, this.b, (String) this.d, tLObject, 16));
                break;
            default:
                AndroidUtilities.runOnUIThread(new h3.p1((vt) this.c, tLObject, (d) this.d, this.b, (HashSet) this.e, tL_error, 11));
                break;
        }
    }

    public /* synthetic */ r1(s1 s1Var, boolean z10, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.a = 0;
        this.c = s1Var;
        this.b = z10;
        this.d = tL_messages_getInlineBotResults;
        this.e = str;
    }

    public /* synthetic */ r1(fy fyVar, String str, boolean z10, String str2) {
        this.a = 4;
        this.c = fyVar;
        this.e = str;
        this.b = z10;
        this.d = str2;
    }

    public /* synthetic */ r1(vt vtVar, d dVar, boolean z10, HashSet hashSet) {
        this.a = 5;
        this.c = vtVar;
        this.d = dVar;
        this.b = z10;
        this.e = hashSet;
    }
}
