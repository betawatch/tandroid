package nh;

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
import org.telegram.ui.h21;
import org.telegram.ui.qh;
import org.telegram.ui.rn;
import org.telegram.ui.s50;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y0 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ y0(int i10, org.telegram.ui.ActionBar.b2 b2Var, Context context, long j10, c6 c6Var, org.telegram.ui.web.u uVar, cg.u0 u0Var) {
        this.c = i10;
        this.d = b2Var;
        this.e = context;
        this.b = j10;
        this.f = c6Var;
        this.g = uVar;
        this.h = u0Var;
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
                cg.u0 u0Var = (cg.u0) obj;
                AndroidUtilities.runOnUIThread(new a1(tLObject, this.c, (org.telegram.ui.ActionBar.b2) obj5, (Context) obj3, this.b, (c6) obj4, (org.telegram.ui.web.u) obj2, u0Var));
                break;
            case 1:
                s50.w((s50) obj5, this.b, (HashSet) obj3, (AtomicInteger) obj4, this.c, (ChatObject.Call) obj2, (String) obj, tLObject, tL_error);
                break;
            case 2:
                Pattern pattern = LaunchActivity.x1;
                AndroidUtilities.runOnUIThread(new a1((LaunchActivity) obj5, tLObject, this.c, (String) obj3, (String) obj4, (TLRPC.User) obj2, (String) obj, this.b));
                break;
            default:
                Activity activity = (Activity) obj5;
                c6 c6Var = (c6) obj4;
                byte[] bArr = (byte[]) obj3;
                rn rnVar = (rn) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (tLObject == null) {
                    if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                        AndroidUtilities.runOnUIThread(new h21(rnVar, activity, c6Var, messageObject, 1), 200L);
                        break;
                    }
                } else if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption)) {
                    if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported)) {
                        if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                            AndroidUtilities.runOnUIThread(new qh(rnVar, this.c, messageObject), 200L);
                            break;
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(new h21(rnVar, activity, c6Var, messageObject, 0), 200L);
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new gf.h0(tLObject, activity, c6Var, this.b, bArr, rnVar, messageObject));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ y0(Activity activity, c6 c6Var, long j10, byte[] bArr, rn rnVar, MessageObject messageObject, int i10) {
        this.d = activity;
        this.f = c6Var;
        this.b = j10;
        this.e = bArr;
        this.g = rnVar;
        this.h = messageObject;
        this.c = i10;
    }

    public /* synthetic */ y0(s50 s50Var, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i10, ChatObject.Call call, String str) {
        this.d = s50Var;
        this.b = j10;
        this.e = hashSet;
        this.f = atomicInteger;
        this.c = i10;
        this.g = call;
        this.h = str;
    }

    public /* synthetic */ y0(LaunchActivity launchActivity, int i10, String str, String str2, TLRPC.User user, String str3, long j10) {
        this.d = launchActivity;
        this.c = i10;
        this.e = str;
        this.f = str2;
        this.g = user;
        this.h = str3;
        this.b = j10;
    }
}
