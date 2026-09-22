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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ai;
import org.telegram.ui.bo;
import org.telegram.ui.i60;
import org.telegram.ui.o31;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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

    public /* synthetic */ b1(int i10, org.telegram.ui.ActionBar.b2 b2Var, Context context, long j3, e6 e6Var, org.telegram.ui.web.t tVar, org.telegram.tgnet.e eVar) {
        this.c = i10;
        this.d = b2Var;
        this.e = context;
        this.b = j3;
        this.f = e6Var;
        this.g = tVar;
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
                AndroidUtilities.runOnUIThread(new e1(tLObject, this.c, (org.telegram.ui.ActionBar.b2) obj5, (Context) obj3, this.b, (e6) obj4, (org.telegram.ui.web.t) obj2, eVar));
                break;
            case 1:
                i60.v((i60) obj5, this.b, (HashSet) obj3, (AtomicInteger) obj4, this.c, (ChatObject.Call) obj2, (String) obj, tLObject, tL_error);
                break;
            case 2:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new e1((LaunchActivity) obj5, tLObject, this.c, (String) obj3, (String) obj4, (TLRPC.User) obj2, (String) obj, this.b));
                break;
            default:
                Activity activity = (Activity) obj5;
                e6 e6Var = (e6) obj4;
                byte[] bArr = (byte[]) obj3;
                bo boVar = (bo) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (tLObject == null) {
                    if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                        AndroidUtilities.runOnUIThread(new o31(boVar, activity, e6Var, messageObject, 1), 200L);
                        break;
                    }
                } else if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption)) {
                    if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported)) {
                        if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                            AndroidUtilities.runOnUIThread(new ai(boVar, this.c, messageObject), 200L);
                            break;
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(new o31(boVar, activity, e6Var, messageObject, 0), 200L);
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.e(tLObject, activity, e6Var, this.b, bArr, boVar, messageObject));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ b1(Activity activity, e6 e6Var, long j3, byte[] bArr, bo boVar, MessageObject messageObject, int i10) {
        this.d = activity;
        this.f = e6Var;
        this.b = j3;
        this.e = bArr;
        this.g = boVar;
        this.h = messageObject;
        this.c = i10;
    }

    public /* synthetic */ b1(i60 i60Var, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i10, ChatObject.Call call, String str) {
        this.d = i60Var;
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
