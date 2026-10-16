package org.telegram.ui;

import android.os.Bundle;
import android.view.KeyEvent;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ec0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ec0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dd  */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        String str;
        String str2;
        JSONException jSONException;
        kg.b e02;
        long[] jArr;
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ey0(this.b, tLObject, this.c, tL_error, 14));
                break;
            case 1:
                ah0 ah0Var = (ah0) this.b;
                Bundle bundle = (Bundle) this.c;
                if (tLObject != null && !(((TLRPC.auth_SentCode) tLObject).type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
                    AndroidUtilities.runOnUIThread(new br(ah0Var, bundle, tLObject, 24));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new md0(ah0Var, 2));
                    break;
                }
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ey0(this.b, tLObject, this.c, tL_error, 17));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new br((dg0) this.b, tL_error, (TL_account.confirmPhone) this.c, 29));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new tf0((KeyEvent.Callback) this.b, tLObject, this.c, 4));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ey0((zg0) this.b, tL_error, tLObject, (String) this.c, 21));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new tf0((KeyEvent.Callback) this.b, tLObject, this.c, 7));
                break;
            case 7:
                um0 um0Var = (um0) this.b;
                TLRPC.TL_secureValue tL_secureValue = (TLRPC.TL_secureValue) this.c;
                um0Var.getClass();
                um0Var.a(tL_error, (TLRPC.TL_secureValue) tLObject, tL_secureValue);
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new tf0(this.b, (Object) tL_error, this.c, 13));
                break;
            case 9:
                ap0 ap0Var = (ap0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (!(tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo)) {
                    AndroidUtilities.runOnUIThread(new zn0(ap0Var, tL_error, tLObject2, 1));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new se0(28, ap0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject));
                    break;
                }
            case 10:
                ap0 ap0Var2 = (ap0) this.b;
                TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = (TLRPC.TL_payments_sendPaymentForm) this.c;
                if (tLObject == null) {
                    q20 q20Var = ap0Var2.e1;
                    if (q20Var == null || !((Boolean) q20Var.run(tL_error)).booleanValue()) {
                        AndroidUtilities.runOnUIThread(new tf0(ap0Var2, tL_error, tL_payments_sendPaymentForm, 15));
                        break;
                    }
                } else if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tLObject instanceof TLRPC.TL_payments_paymentVerificationNeeded) {
                        AndroidUtilities.runOnUIThread(new tn0(ap0Var2, tLObject, 1));
                        break;
                    }
                } else {
                    Utilities.Callback callback = ap0Var2.c1;
                    if (callback == null) {
                        TLRPC.Updates updates = ((TLRPC.TL_payments_paymentResult) tLObject).updates;
                        TLRPC.Message[] messageArr = new TLRPC.Message[1];
                        int size = updates.updates.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                TLRPC.Update update = updates.updates.get(i10);
                                if (update instanceof TL_update.TL_updateNewMessage) {
                                    messageArr[0] = ((TL_update.TL_updateNewMessage) update).message;
                                } else if (update instanceof TL_update.TL_updateNewChannelMessage) {
                                    messageArr[0] = ((TL_update.TL_updateNewChannelMessage) update).message;
                                } else {
                                    i10++;
                                }
                            }
                        }
                        ap0Var2.getMessagesController().lambda$processUpdates$377(updates, false);
                        AndroidUtilities.runOnUIThread(new se0(29, ap0Var2, messageArr));
                        break;
                    } else {
                        callback.run((TLRPC.TL_payments_paymentResult) tLObject);
                        break;
                    }
                }
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ey0(this.b, tLObject, (Object) tL_error, (TLObject) this.c, 25));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new yw0((zw0) this.b, tL_error, tLObject, (TL_stars.updatePaidMessagesPrice) this.c, 0));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new yw0((PrivacyControlActivity) this.b, tL_error, tLObject, (boolean[]) this.c, 1));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new rr0(17, (PrivacySettingsActivity) this.b, (org.telegram.ui.Cells.w8) this.c));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new yw0((ProfileActivity) this.b, tLObject, tL_error, (int[]) this.c, false, 4));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new yw0(this.b, tLObject, this.c, tL_error, 5));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new yw0((ProfileActivity) this.b, tL_error, tLObject, (String) this.c, 7));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new yw0(this.b, tLObject, this.c, tL_error, 9));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new tf0(this.b, (Object) tL_error, this.c, 27));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new tf0((x81) this.b, tL_error, (TLRPC.TL_authorization) this.c, 28));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new yw0((z81) this.b, tLObject, tL_error, (o9) this.c, false, 12));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new yw0((o91) this.b, tL_error, tLObject, (String) this.c, 13));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new i11(15, (o91) this.b, (TLRPC.TL_attachMenuBot) this.c));
                break;
            case 24:
                ta1 ta1Var = (ta1) this.b;
                Utilities.Callback0Return callback0Return = (Utilities.Callback0Return) this.c;
                int i11 = ta1Var.i;
                String str3 = null;
                if (tL_error == null) {
                    if (tLObject instanceof TL_stats.TL_statsGraph) {
                        try {
                            e02 = hb1.e0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), i11, ta1Var.m);
                        } catch (JSONException e) {
                            jSONException = e;
                            str2 = null;
                        }
                        try {
                            str3 = ((TL_stats.TL_statsGraph) tLObject).zoom_token;
                            if (i11 == 4 && (jArr = e02.a) != null && jArr.length > 0) {
                                long j10 = jArr[jArr.length - 1];
                                ta1Var.e = new kg.e(e02, j10);
                                ta1Var.c = j10;
                            }
                            str2 = str3;
                            str3 = e02;
                        } catch (JSONException e7) {
                            jSONException = e7;
                            str2 = str3;
                            str3 = e02;
                            jSONException.printStackTrace();
                            if (tLObject instanceof TL_stats.TL_statsGraphError) {
                            }
                            str = str2;
                            AndroidUtilities.runOnUIThread(new yw0(ta1Var, str3, str, callback0Return, 15));
                            return;
                        }
                    } else {
                        str2 = null;
                    }
                    if (tLObject instanceof TL_stats.TL_statsGraphError) {
                        ta1Var.l = false;
                        ta1Var.a = true;
                        ta1Var.b = ((TL_stats.TL_statsGraphError) tLObject).error;
                    }
                    str = str2;
                } else {
                    str = null;
                }
                AndroidUtilities.runOnUIThread(new yw0(ta1Var, str3, str, callback0Return, 15));
                break;
            case 25:
                AndroidUtilities.runOnUIThread(new ee1((he1) this.b, (String) this.c, tL_error, 0));
                break;
            case 26:
                he1 he1Var = (he1) this.b;
                TL_account.updateTheme updatetheme = (TL_account.updateTheme) this.c;
                if (!(tLObject instanceof TLRPC.TL_theme)) {
                    AndroidUtilities.runOnUIThread(new ee1(he1Var, tL_error, updatetheme));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new i11(23, he1Var, (TLRPC.TL_theme) tLObject));
                    break;
                }
            case 27:
                AndroidUtilities.runOnUIThread(new ee1((gg1) this.b, (String) this.c, tLObject, 5));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new yw0(this.b, tLObject, this.c, tL_error, 18));
                break;
            default:
                oh1 oh1Var = (oh1) this.b;
                byte[] bArr = (byte[]) this.c;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new kh1(oh1Var, tL_error, 3));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new ih1(oh1Var, bArr, 1));
                    break;
                }
        }
    }
}
