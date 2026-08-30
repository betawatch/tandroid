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
import org.telegram.ui.Components.i80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.o60;
import org.telegram.ui.oy;
import org.telegram.ui.qw0;
import org.telegram.ui.x21;
import org.telegram.ui.zt0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class ki implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ki(int i10, boolean[] zArr, File file, TL_phone.setCallRating setcallrating, ArrayList arrayList, Context context) {
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
                AndroidUtilities.runOnUIThread(new kh.m2((org.telegram.ui.l4) obj5, this.b, (af.f) obj4, tLObject, (String) obj, (org.telegram.ui.h0) obj3, (TLRPC.TL_messages_getWebPage) obj2));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new kh.m2(tLObject, (org.telegram.ui.ActionBar.d2) obj5, (Context) obj4, this.b, (TL_phone.exportGroupCallInvite) obj3, (org.telegram.ui.ActionBar.f6) obj2, (o60) obj));
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
                Pattern pattern = LaunchActivity.y1;
                AndroidUtilities.runOnUIThread(new kh.m2((LaunchActivity) obj5, tLObject, this.b, (oy) obj4, (org.telegram.ui.ActionBar.p2) obj3, (TLRPC.User) obj2, str));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new a6(tLObject, (org.telegram.ui.ActionBar.p2) obj5, (TLRPC.TL_inputStorePaymentPremiumSubscription) obj4, (qw0) obj3, (p2.e) obj2, this.b, tL_error, (TLRPC.TL_payments_canPurchaseStore) obj));
                break;
            default:
                Context context2 = (Context) obj5;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj4;
                byte[] bArr = (byte[]) obj3;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj2;
                i80 i80Var = (i80) obj;
                if (tLObject == null) {
                    if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                        AndroidUtilities.runOnUIThread(new x21(p2Var, context2, f6Var, i80Var, 1), 200L);
                        break;
                    }
                } else if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption)) {
                    if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported)) {
                        if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                            AndroidUtilities.runOnUIThread(new zt0(p2Var, i11, i80Var, 5), 200L);
                            break;
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(new x21(p2Var, context2, f6Var, i80Var, 0), 200L);
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new kh.e1(tLObject, (Object) context2, (Object) f6Var, (Object) bArr, (Object) p2Var, (Object) i80Var, 16));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ki(Context context, org.telegram.ui.ActionBar.f6 f6Var, byte[] bArr, org.telegram.ui.ActionBar.p2 p2Var, i80 i80Var, int i10) {
        this.a = 6;
        this.d = context;
        this.e = f6Var;
        this.f = bArr;
        this.g = p2Var;
        this.c = i80Var;
        this.b = i10;
    }

    public /* synthetic */ ki(Object obj, TLObject tLObject, Object obj2, Object obj3, int i10, Object obj4, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = tLObject;
        this.f = obj2;
        this.g = obj3;
        this.b = i10;
        this.c = obj4;
    }

    public /* synthetic */ ki(org.telegram.ui.ActionBar.d2 d2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.f6 f6Var, o60 o60Var) {
        this.a = 2;
        this.d = d2Var;
        this.e = context;
        this.b = i10;
        this.f = exportgroupcallinvite;
        this.g = f6Var;
        this.c = o60Var;
    }

    public /* synthetic */ ki(org.telegram.ui.l4 l4Var, int i10, af.f fVar, String str, org.telegram.ui.h0 h0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.a = 1;
        this.d = l4Var;
        this.b = i10;
        this.e = fVar;
        this.c = str;
        this.f = h0Var;
        this.g = tL_messages_getWebPage;
    }

    public /* synthetic */ ki(LaunchActivity launchActivity, int i10, oy oyVar, org.telegram.ui.ActionBar.p2 p2Var, TLRPC.User user, String str) {
        this.a = 4;
        this.d = launchActivity;
        this.b = i10;
        this.e = oyVar;
        this.f = p2Var;
        this.g = user;
        this.c = str;
    }
}
