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
import org.telegram.ui.Components.ii0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c60;
import org.telegram.ui.fy;
import org.telegram.ui.gw0;
import org.telegram.ui.l21;
import org.telegram.ui.ll0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class gi implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ gi(int i10, boolean[] zArr, File file, TL_phone.setCallRating setcallrating, ArrayList arrayList, Context context) {
        this.a = 3;
        this.b = i10;
        this.d = zArr;
        this.e = file;
        this.f = setcallrating;
        this.g = arrayList;
        this.c = context;
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
                AndroidUtilities.runOnUIThread(new ih.m2((org.telegram.ui.m4) obj5, this.b, (ye.c) obj4, tLObject, (String) obj, (org.telegram.ui.i0) obj3, (TLRPC.TL_messages_getWebPage) obj2));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ih.m2(tLObject, (org.telegram.ui.ActionBar.c2) obj5, (Context) obj4, this.b, (TL_phone.exportGroupCallInvite) obj3, (org.telegram.ui.ActionBar.c6) obj2, (c60) obj));
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
                Pattern pattern = LaunchActivity.x1;
                AndroidUtilities.runOnUIThread(new ih.m2((LaunchActivity) obj5, tLObject, this.b, (fy) obj4, (org.telegram.ui.ActionBar.o2) obj3, (TLRPC.User) obj2, str));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new z5(tLObject, (org.telegram.ui.ActionBar.o2) obj5, (TLRPC.TL_inputStorePaymentPremiumSubscription) obj4, (gw0) obj3, (p2.e) obj2, this.b, tL_error, (TLRPC.TL_payments_canPurchaseStore) obj));
                break;
            default:
                Context context2 = (Context) obj5;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj4;
                byte[] bArr = (byte[]) obj3;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj2;
                ii0 ii0Var = (ii0) obj;
                if (tLObject == null) {
                    if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                        AndroidUtilities.runOnUIThread(new l21(o2Var, context2, c6Var, ii0Var, 1), 200L);
                        break;
                    }
                } else if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption)) {
                    if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported)) {
                        if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                            AndroidUtilities.runOnUIThread(new ll0(o2Var, i11, ii0Var, 7), 200L);
                            break;
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(new l21(o2Var, context2, c6Var, ii0Var, 0), 200L);
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new ih.f1(tLObject, (Object) context2, (Object) c6Var, (Object) bArr, (Object) o2Var, (Object) ii0Var, 17));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ gi(Context context, org.telegram.ui.ActionBar.c6 c6Var, byte[] bArr, org.telegram.ui.ActionBar.o2 o2Var, ii0 ii0Var, int i10) {
        this.a = 6;
        this.d = context;
        this.e = c6Var;
        this.f = bArr;
        this.g = o2Var;
        this.c = ii0Var;
        this.b = i10;
    }

    public /* synthetic */ gi(Object obj, TLObject tLObject, Object obj2, Object obj3, int i10, Object obj4, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = tLObject;
        this.f = obj2;
        this.g = obj3;
        this.b = i10;
        this.c = obj4;
    }

    public /* synthetic */ gi(org.telegram.ui.ActionBar.c2 c2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.c6 c6Var, c60 c60Var) {
        this.a = 2;
        this.d = c2Var;
        this.e = context;
        this.b = i10;
        this.f = exportgroupcallinvite;
        this.g = c6Var;
        this.c = c60Var;
    }

    public /* synthetic */ gi(org.telegram.ui.m4 m4Var, int i10, ye.c cVar, String str, org.telegram.ui.i0 i0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.a = 1;
        this.d = m4Var;
        this.b = i10;
        this.e = cVar;
        this.c = str;
        this.f = i0Var;
        this.g = tL_messages_getWebPage;
    }

    public /* synthetic */ gi(LaunchActivity launchActivity, int i10, fy fyVar, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.User user, String str) {
        this.a = 4;
        this.d = launchActivity;
        this.b = i10;
        this.e = fyVar;
        this.f = o2Var;
        this.g = user;
        this.c = str;
    }
}
