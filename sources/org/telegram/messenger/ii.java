package org.telegram.messenger;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.ny;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gm0;
import org.telegram.ui.nx0;
import org.telegram.ui.r31;
import org.telegram.ui.w60;
import org.telegram.ui.wy;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class ii implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ii(int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.a = i11;
        this.d = obj;
        this.e = tLObject;
        this.f = obj2;
        this.g = obj3;
        this.b = i10;
        this.c = obj4;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        int i11 = this.b;
        Object obj = this.c;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                ((SendMessagesHelper) obj5).lambda$performSendDelayedMessage$54((TLRPC.InputFile) obj4, (TLRPC.InputMedia) obj3, (SendMessagesHelper.DelayedMessage) obj2, this.b, (String) obj, tLObject, tL_error);
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new gg.e1((org.telegram.ui.h4) obj5, this.b, (nf.e) obj4, tLObject, (String) obj, (org.telegram.ui.f0) obj3, (TLRPC.TL_messages_getWebPage) obj2));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new gg.e1(tLObject, (org.telegram.ui.ActionBar.c2) obj5, (Context) obj4, this.b, (TL_phone.exportGroupCallInvite) obj3, (org.telegram.ui.ActionBar.f6) obj2, (w60) obj));
                break;
            case 3:
                boolean[] zArr = (boolean[]) obj5;
                File file = (File) obj4;
                TL_phone.setCallRating setcallrating = (TL_phone.setCallRating) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                Context context = (Context) obj;
                if (tLObject instanceof TLRPC.TL_updates) {
                    MessagesController.getInstance(i11).processUpdates((TLRPC.TL_updates) tLObject, false);
                }
                if (zArr[0] && file.exists() && setcallrating.rating < 4) {
                    SendMessagesHelper.prepareSendingDocument(AccountInstance.getInstance(UserConfig.selectedAccount), file.getAbsolutePath(), file.getAbsolutePath(), null, TextUtils.join(" ", arrayList), "text/plain", 4244000L, null, null, null, null, null, true, 0, null, null, false);
                    Toast.makeText(context, LocaleController.getString(R.string.CallReportSent), 1).show();
                    break;
                }
                break;
            case 4:
                String str = (String) obj;
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new gg.e1((LaunchActivity) obj5, tLObject, this.b, (wy) obj4, (org.telegram.ui.ActionBar.o2) obj3, (TLRPC.User) obj2, str));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new y5(tLObject, (org.telegram.ui.ActionBar.o2) obj5, (TLRPC.TL_inputStorePaymentPremiumSubscription) obj4, (nx0) obj3, (c5.f) obj2, this.b, tL_error, (TLRPC.TL_payments_canPurchaseStore) obj));
                break;
            default:
                Context context2 = (Context) obj5;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj4;
                byte[] bArr = (byte[]) obj3;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj2;
                ny nyVar = (ny) obj;
                if (tLObject == null) {
                    if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                        AndroidUtilities.runOnUIThread(new r31(o2Var, context2, f6Var, nyVar, 1), 200L);
                        break;
                    }
                } else if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption)) {
                    if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported)) {
                        if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                            AndroidUtilities.runOnUIThread(new gm0(o2Var, i11, nyVar, 7), 200L);
                            break;
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(new r31(o2Var, context2, f6Var, nyVar, 0), 200L);
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new ai.z8(tLObject, context2, f6Var, bArr, o2Var, nyVar, 11));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ii(int i10, boolean[] zArr, File file, TL_phone.setCallRating setcallrating, ArrayList arrayList, Context context) {
        this.a = 3;
        this.b = i10;
        this.d = zArr;
        this.e = file;
        this.f = setcallrating;
        this.g = arrayList;
        this.c = context;
    }

    public /* synthetic */ ii(Context context, org.telegram.ui.ActionBar.f6 f6Var, byte[] bArr, org.telegram.ui.ActionBar.o2 o2Var, ny nyVar, int i10) {
        this.a = 6;
        this.d = context;
        this.e = f6Var;
        this.f = bArr;
        this.g = o2Var;
        this.c = nyVar;
        this.b = i10;
    }

    public /* synthetic */ ii(org.telegram.ui.ActionBar.c2 c2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.f6 f6Var, w60 w60Var) {
        this.a = 2;
        this.d = c2Var;
        this.e = context;
        this.b = i10;
        this.f = exportgroupcallinvite;
        this.g = f6Var;
        this.c = w60Var;
    }

    public /* synthetic */ ii(org.telegram.ui.h4 h4Var, int i10, nf.e eVar, String str, org.telegram.ui.f0 f0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.a = 1;
        this.d = h4Var;
        this.b = i10;
        this.e = eVar;
        this.c = str;
        this.f = f0Var;
        this.g = tL_messages_getWebPage;
    }

    public /* synthetic */ ii(LaunchActivity launchActivity, int i10, wy wyVar, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.User user, String str) {
        this.a = 4;
        this.d = launchActivity;
        this.b = i10;
        this.e = wyVar;
        this.f = o2Var;
        this.g = user;
        this.c = str;
    }
}
