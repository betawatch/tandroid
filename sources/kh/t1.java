package kh;

import android.app.Activity;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ey;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.fe;
import org.telegram.ui.so;
import org.telegram.ui.st;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t1(Object obj, Object obj2, Object obj3, boolean z10, int i9) {
        this.a = i9;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new bg.m(this.c, tLObject, this.b, (TLObject) this.d, (String) this.e, 1));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new h3.p1((fe) this.c, tL_error, (TwoStepVerificationActivity) this.d, (Activity) this.e, this.b, tLObject, 7));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new bg.m(this.c, this.d, (Object) tLObject, this.e, this.b, 13));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new h3.p1((so) this.c, (TLRPC.TL_channels_toggleUsername) this.d, tLObject, (TLRPC.TL_username) this.e, this.b, tL_error, 9));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new bg.m((ey) this.c, (String) this.e, this.b, (String) this.d, tLObject, 16));
                break;
            default:
                AndroidUtilities.runOnUIThread(new h3.p1((st) this.c, tLObject, (d) this.d, this.b, (HashSet) this.e, tL_error, 11));
                break;
        }
    }

    public /* synthetic */ t1(u1 u1Var, boolean z10, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.a = 0;
        this.c = u1Var;
        this.b = z10;
        this.d = tL_messages_getInlineBotResults;
        this.e = str;
    }

    public /* synthetic */ t1(ey eyVar, String str, boolean z10, String str2) {
        this.a = 4;
        this.c = eyVar;
        this.e = str;
        this.b = z10;
        this.d = str2;
    }

    public /* synthetic */ t1(st stVar, d dVar, boolean z10, HashSet hashSet) {
        this.a = 5;
        this.c = stVar;
        this.d = dVar;
        this.b = z10;
        this.e = hashSet;
    }
}
