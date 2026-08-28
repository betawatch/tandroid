package mh;

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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.i21;
import org.telegram.ui.o50;
import org.telegram.ui.oh;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z0 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ z0(int i9, org.telegram.ui.ActionBar.c2 c2Var, Context context, long j10, b6 b6Var, org.telegram.ui.web.t tVar, bg.y0 y0Var) {
        this.c = i9;
        this.d = c2Var;
        this.e = context;
        this.b = j10;
        this.f = b6Var;
        this.g = tVar;
        this.h = y0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i9 = this.a;
        Object obj = this.h;
        Object obj2 = this.g;
        Object obj3 = this.e;
        Object obj4 = this.f;
        Object obj5 = this.d;
        switch (i9) {
            case 0:
                bg.y0 y0Var = (bg.y0) obj;
                AndroidUtilities.runOnUIThread(new b1(tLObject, this.c, (org.telegram.ui.ActionBar.c2) obj5, (Context) obj3, this.b, (b6) obj4, (org.telegram.ui.web.t) obj2, y0Var));
                break;
            case 1:
                o50.v((o50) obj5, this.b, (HashSet) obj3, (AtomicInteger) obj4, this.c, (ChatObject.Call) obj2, (String) obj, tLObject, tL_error);
                break;
            case 2:
                Pattern pattern = LaunchActivity.x1;
                AndroidUtilities.runOnUIThread(new b1((LaunchActivity) obj5, tLObject, this.c, (String) obj3, (String) obj4, (TLRPC.User) obj2, (String) obj, this.b));
                break;
            default:
                Activity activity = (Activity) obj5;
                b6 b6Var = (b6) obj4;
                byte[] bArr = (byte[]) obj3;
                qn qnVar = (qn) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (tLObject == null) {
                    if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                        AndroidUtilities.runOnUIThread(new i21(qnVar, activity, b6Var, messageObject, 1), 200L);
                        break;
                    }
                } else if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption)) {
                    if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported)) {
                        if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                            AndroidUtilities.runOnUIThread(new oh(qnVar, this.c, messageObject), 200L);
                            break;
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(new i21(qnVar, activity, b6Var, messageObject, 0), 200L);
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new ff.h0(tLObject, activity, b6Var, this.b, bArr, qnVar, messageObject));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ z0(Activity activity, b6 b6Var, long j10, byte[] bArr, qn qnVar, MessageObject messageObject, int i9) {
        this.d = activity;
        this.f = b6Var;
        this.b = j10;
        this.e = bArr;
        this.g = qnVar;
        this.h = messageObject;
        this.c = i9;
    }

    public /* synthetic */ z0(o50 o50Var, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i9, ChatObject.Call call, String str) {
        this.d = o50Var;
        this.b = j10;
        this.e = hashSet;
        this.f = atomicInteger;
        this.c = i9;
        this.g = call;
        this.h = str;
    }

    public /* synthetic */ z0(LaunchActivity launchActivity, int i9, String str, String str2, TLRPC.User user, String str3, long j10) {
        this.d = launchActivity;
        this.c = i9;
        this.e = str;
        this.f = str2;
        this.g = user;
        this.h = str3;
        this.b = j10;
    }
}
