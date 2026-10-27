package hi;

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
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.j21;
import org.telegram.ui.th;
import org.telegram.ui.wn;
import org.telegram.ui.x50;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g1 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ g1(int i10, org.telegram.ui.ActionBar.e2 e2Var, Context context, long j10, u6 u6Var, org.telegram.ui.web.t tVar, bi.t0 t0Var) {
        this.c = i10;
        this.d = e2Var;
        this.e = context;
        this.b = j10;
        this.f = u6Var;
        this.g = tVar;
        this.h = t0Var;
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
                bi.t0 t0Var = (bi.t0) obj;
                AndroidUtilities.runOnUIThread(new i1(tLObject, this.c, (org.telegram.ui.ActionBar.e2) obj5, (Context) obj3, this.b, (u6) obj4, (org.telegram.ui.web.t) obj2, t0Var));
                break;
            case 1:
                x50.v((x50) obj5, this.b, (HashSet) obj3, (AtomicInteger) obj4, this.c, (ChatObject.Call) obj2, (String) obj, tLObject, tL_error);
                break;
            case 2:
                Pattern pattern = LaunchActivity.D1;
                AndroidUtilities.runOnUIThread(new i1((LaunchActivity) obj5, tLObject, this.c, (String) obj3, (String) obj4, (TLRPC.User) obj2, (String) obj, this.b));
                break;
            default:
                Activity activity = (Activity) obj5;
                u6 u6Var = (u6) obj4;
                byte[] bArr = (byte[]) obj3;
                wn wnVar = (wn) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (tLObject == null) {
                    if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                        AndroidUtilities.runOnUIThread(new j21(wnVar, activity, u6Var, messageObject, 1), 200L);
                        break;
                    }
                } else if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption)) {
                    if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported)) {
                        if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                            AndroidUtilities.runOnUIThread(new th(wnVar, this.c, messageObject), 200L);
                            break;
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(new j21(wnVar, activity, u6Var, messageObject, 0), 200L);
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new ag.m0(tLObject, activity, u6Var, this.b, bArr, wnVar, messageObject));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ g1(Activity activity, u6 u6Var, long j10, byte[] bArr, wn wnVar, MessageObject messageObject, int i10) {
        this.d = activity;
        this.f = u6Var;
        this.b = j10;
        this.e = bArr;
        this.g = wnVar;
        this.h = messageObject;
        this.c = i10;
    }

    public /* synthetic */ g1(x50 x50Var, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i10, ChatObject.Call call, String str) {
        this.d = x50Var;
        this.b = j10;
        this.e = hashSet;
        this.f = atomicInteger;
        this.c = i10;
        this.g = call;
        this.h = str;
    }

    public /* synthetic */ g1(LaunchActivity launchActivity, int i10, String str, String str2, TLRPC.User user, String str3, long j10) {
        this.d = launchActivity;
        this.c = i10;
        this.e = str;
        this.f = str2;
        this.g = user;
        this.h = str3;
        this.b = j10;
    }
}
