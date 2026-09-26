package ei;

import android.app.Activity;
import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.d60;
import org.telegram.ui.f31;
import org.telegram.ui.wn;
import org.telegram.ui.xh;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b1 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ b1(int i10, org.telegram.ui.ActionBar.a2 a2Var, Context context, long j3, d6 d6Var, org.telegram.ui.web.s sVar, org.telegram.tgnet.e eVar) {
        this.c = i10;
        this.d = a2Var;
        this.e = context;
        this.b = j3;
        this.f = d6Var;
        this.g = sVar;
        this.h = eVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        Object obj = this.h;
        Object obj2 = this.g;
        Object obj3 = this.e;
        Object obj4 = this.f;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                org.telegram.tgnet.e eVar = (org.telegram.tgnet.e) obj;
                AndroidUtilities.runOnUIThread(new e1(tLObject, this.c, (org.telegram.ui.ActionBar.a2) obj5, (Context) obj3, this.b, (d6) obj4, (org.telegram.ui.web.s) obj2, eVar));
                break;
            case 1:
                d60.v((d60) obj5, this.b, (HashSet) obj3, (AtomicInteger) obj4, this.c, (ChatObject.Call) obj2, (String) obj, tLObject, tL_error);
                break;
            case 2:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new e1((LaunchActivity) obj5, tLObject, this.c, (String) obj3, (String) obj4, (TLRPC.User) obj2, (String) obj, this.b));
                break;
            default:
                Activity activity = (Activity) obj5;
                d6 d6Var = (d6) obj4;
                byte[] bArr = (byte[]) obj3;
                wn wnVar = (wn) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (tLObject == null) {
                    if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                        AndroidUtilities.runOnUIThread(new f31(wnVar, activity, d6Var, messageObject, 1), 200L);
                        break;
                    }
                } else if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption)) {
                    if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported)) {
                        if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                            AndroidUtilities.runOnUIThread(new xh(wnVar, this.c, messageObject), 200L);
                            break;
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(new f31(wnVar, activity, d6Var, messageObject, 0), 200L);
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.e(tLObject, activity, d6Var, this.b, bArr, wnVar, messageObject));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ b1(Activity activity, d6 d6Var, long j3, byte[] bArr, wn wnVar, MessageObject messageObject, int i10) {
        this.d = activity;
        this.f = d6Var;
        this.b = j3;
        this.e = bArr;
        this.g = wnVar;
        this.h = messageObject;
        this.c = i10;
    }

    public /* synthetic */ b1(d60 d60Var, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i10, ChatObject.Call call, String str) {
        this.d = d60Var;
        this.b = j3;
        this.e = hashSet;
        this.f = atomicInteger;
        this.c = i10;
        this.g = call;
        this.h = str;
    }

    public /* synthetic */ b1(LaunchActivity launchActivity, int i10, String str, String str2, TLRPC.User user, String str3, long j3) {
        this.d = launchActivity;
        this.c = i10;
        this.e = str;
        this.f = str2;
        this.g = user;
        this.h = str3;
        this.b = j3;
    }
}
