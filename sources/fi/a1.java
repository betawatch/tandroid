package fi;

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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.di;
import org.telegram.ui.fo;
import org.telegram.ui.n60;
import org.telegram.ui.u31;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a1 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ a1(int i10, org.telegram.ui.ActionBar.a2 a2Var, Context context, long j10, c6 c6Var, org.telegram.ui.web.s sVar, org.telegram.tgnet.e eVar) {
        this.c = i10;
        this.d = a2Var;
        this.e = context;
        this.b = j10;
        this.f = c6Var;
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
                AndroidUtilities.runOnUIThread(new d1(tLObject, this.c, (org.telegram.ui.ActionBar.a2) obj5, (Context) obj3, this.b, (c6) obj4, (org.telegram.ui.web.s) obj2, eVar));
                break;
            case 1:
                n60.x((n60) obj5, this.b, (HashSet) obj3, (AtomicInteger) obj4, this.c, (ChatObject.Call) obj2, (String) obj, tLObject, tL_error);
                break;
            case 2:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new d1((LaunchActivity) obj5, tLObject, this.c, (String) obj3, (String) obj4, (TLRPC.User) obj2, (String) obj, this.b));
                break;
            default:
                Activity activity = (Activity) obj5;
                c6 c6Var = (c6) obj4;
                byte[] bArr = (byte[]) obj3;
                fo foVar = (fo) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (tLObject == null) {
                    if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                        AndroidUtilities.runOnUIThread(new u31(foVar, activity, c6Var, messageObject, 1), 200L);
                        break;
                    }
                } else if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption)) {
                    if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported)) {
                        if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                            AndroidUtilities.runOnUIThread(new di(foVar, this.c, messageObject), 200L);
                            break;
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(new u31(foVar, activity, c6Var, messageObject, 0), 200L);
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.e(tLObject, activity, c6Var, this.b, bArr, foVar, messageObject));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ a1(Activity activity, c6 c6Var, long j10, byte[] bArr, fo foVar, MessageObject messageObject, int i10) {
        this.d = activity;
        this.f = c6Var;
        this.b = j10;
        this.e = bArr;
        this.g = foVar;
        this.h = messageObject;
        this.c = i10;
    }

    public /* synthetic */ a1(n60 n60Var, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i10, ChatObject.Call call, String str) {
        this.d = n60Var;
        this.b = j10;
        this.e = hashSet;
        this.f = atomicInteger;
        this.c = i10;
        this.g = call;
        this.h = str;
    }

    public /* synthetic */ a1(LaunchActivity launchActivity, int i10, String str, String str2, TLRPC.User user, String str3, long j10) {
        this.d = launchActivity;
        this.c = i10;
        this.e = str;
        this.f = str2;
        this.g = user;
        this.h = str3;
        this.b = j10;
    }
}
