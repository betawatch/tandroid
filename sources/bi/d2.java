package bi;

import android.app.Activity;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.zy;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.du;
import org.telegram.ui.jp;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class d2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d2(h2 h2Var, boolean z10, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.a = 0;
        this.c = h2Var;
        this.b = z10;
        this.d = tL_messages_getInlineBotResults;
        this.e = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new e2((h2) this.c, tLObject, this.b, (TLRPC.TL_messages_getInlineBotResults) this.d, (String) this.e, 0));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new i2.a1((org.telegram.ui.le) this.c, tL_error, (TwoStepVerificationActivity) this.d, (Activity) this.e, this.b, tLObject, 6));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new e2(this.c, this.d, tLObject, this.e, this.b, 14));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new i2.a1((jp) this.c, (TLRPC.TL_channels_toggleUsername) this.d, tLObject, (TLRPC.TL_username) this.e, this.b, tL_error, 8));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new e2((zy) this.c, (String) this.e, this.b, (String) this.d, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new i2.a1((du) this.c, tLObject, (d) this.d, this.b, (HashSet) this.e, tL_error, 10));
                break;
        }
    }

    public /* synthetic */ d2(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
    }

    public /* synthetic */ d2(zy zyVar, String str, boolean z10, String str2) {
        this.a = 4;
        this.c = zyVar;
        this.e = str;
        this.b = z10;
        this.d = str2;
    }

    public /* synthetic */ d2(du duVar, d dVar, boolean z10, HashSet hashSet) {
        this.a = 5;
        this.c = duVar;
        this.d = dVar;
        this.b = z10;
        this.e = hashSet;
    }
}
