package org.telegram.ui;

import android.os.Bundle;
import android.view.KeyEvent;
import java.util.HashSet;
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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class bc0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bc0(int i10, Object obj, Object obj2) {
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
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.in0((cc0) this.b, tLObject, (HashSet) this.c, tL_error, 16));
                break;
            case 1:
                wg0 wg0Var = (wg0) this.b;
                Bundle bundle = (Bundle) this.c;
                if (tLObject != null && !(((TLRPC.auth_SentCode) tLObject).type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
                    AndroidUtilities.runOnUIThread(new yq(wg0Var, bundle, tLObject, 24));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new kd0(wg0Var, 2));
                    break;
                }
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.in0((af0) this.b, tLObject, (String) this.c, tL_error, 19));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new yq((zf0) this.b, tL_error, (TL_account.confirmPhone) this.c, 29));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new pf0((KeyEvent.Callback) this.b, tLObject, this.c, 4));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.in0((vg0) this.b, tL_error, tLObject, (String) this.c, 23));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new pf0((KeyEvent.Callback) this.b, tLObject, this.c, 7));
                break;
            case 7:
                rm0 rm0Var = (rm0) this.b;
                TLRPC.TL_secureValue tL_secureValue = (TLRPC.TL_secureValue) this.c;
                rm0Var.getClass();
                rm0Var.a(tL_error, (TLRPC.TL_secureValue) tLObject, tL_secureValue);
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new pf0(this.b, (Object) tL_error, this.c, 13));
                break;
            case 9:
                xo0 xo0Var = (xo0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (!(tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo)) {
                    AndroidUtilities.runOnUIThread(new wn0(xo0Var, tL_error, tLObject2, 1));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new ej0(14, xo0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject));
                    break;
                }
            case 10:
                xo0 xo0Var2 = (xo0) this.b;
                TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = (TLRPC.TL_payments_sendPaymentForm) this.c;
                if (tLObject == null) {
                    m20 m20Var = xo0Var2.e1;
                    if (m20Var == null || !((Boolean) m20Var.run(tL_error)).booleanValue()) {
                        AndroidUtilities.runOnUIThread(new pf0(xo0Var2, tL_error, tL_payments_sendPaymentForm, 15));
                        break;
                    }
                } else if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tLObject instanceof TLRPC.TL_payments_paymentVerificationNeeded) {
                        AndroidUtilities.runOnUIThread(new qn0(xo0Var2, tLObject, 1));
                        break;
                    }
                } else {
                    Utilities.Callback callback = xo0Var2.c1;
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
                        xo0Var2.getMessagesController().processUpdates(updates, false);
                        AndroidUtilities.runOnUIThread(new ej0(15, xo0Var2, messageArr));
                        break;
                    } else {
                        callback.run((TLRPC.TL_payments_paymentResult) tLObject);
                        break;
                    }
                }
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.in0((xo0) this.b, tLObject, tL_error, (TL_account.getTmpPassword) this.c, 27));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new es0((tw0) this.b, tL_error, tLObject, (TL_stars.updatePaidMessagesPrice) this.c, 2));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new es0((PrivacyControlActivity) this.b, tL_error, tLObject, (boolean[]) this.c));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new rx0(3, (PrivacySettingsActivity) this.b, (org.telegram.ui.Cells.w8) this.c));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new es0((ProfileActivity) this.b, tLObject, tL_error, (int[]) this.c, 6));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new es0((ProfileActivity) this.b, tLObject, (TLRPC.TL_username) this.c, tL_error, 7));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new es0((ProfileActivity) this.b, tL_error, tLObject, (String) this.c, 9));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new es0((t01) this.b, tLObject, (TLRPC.TL_username) this.c, tL_error, 11));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new pf0(this.b, (Object) tL_error, this.c, 27));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new pf0((q81) this.b, tL_error, (TLRPC.TL_authorization) this.c, 28));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new es0((s81) this.b, tLObject, tL_error, (l9) this.c, 14));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new es0((i91) this.b, tL_error, tLObject, (String) this.c, 15));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new w81(1, (i91) this.b, (TLRPC.TL_attachMenuBot) this.c));
                break;
            case 24:
                na1 na1Var = (na1) this.b;
                Utilities.Callback0Return callback0Return = (Utilities.Callback0Return) this.c;
                int i11 = na1Var.i;
                String str3 = null;
                if (tL_error == null) {
                    if (tLObject instanceof TL_stats.TL_statsGraph) {
                        try {
                            e02 = bb1.e0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), i11, na1Var.m);
                        } catch (JSONException e7) {
                            jSONException = e7;
                            str2 = null;
                        }
                        try {
                            str3 = ((TL_stats.TL_statsGraph) tLObject).zoom_token;
                            if (i11 == 4 && (jArr = e02.a) != null && jArr.length > 0) {
                                long j3 = jArr[jArr.length - 1];
                                na1Var.e = new kg.e(e02, j3);
                                na1Var.c = j3;
                            }
                            str2 = str3;
                            str3 = e02;
                        } catch (JSONException e10) {
                            jSONException = e10;
                            str2 = str3;
                            str3 = e02;
                            jSONException.printStackTrace();
                            if (tLObject instanceof TL_stats.TL_statsGraphError) {
                            }
                            str = str2;
                            AndroidUtilities.runOnUIThread(new es0(na1Var, str3, str, callback0Return, 17));
                            return;
                        }
                    } else {
                        str2 = null;
                    }
                    if (tLObject instanceof TL_stats.TL_statsGraphError) {
                        na1Var.l = false;
                        na1Var.a = true;
                        na1Var.b = ((TL_stats.TL_statsGraphError) tLObject).error;
                    }
                    str = str2;
                } else {
                    str = null;
                }
                AndroidUtilities.runOnUIThread(new es0(na1Var, str3, str, callback0Return, 17));
                break;
            case 25:
                AndroidUtilities.runOnUIThread(new yd1((be1) this.b, (String) this.c, tL_error, 0));
                break;
            case 26:
                be1 be1Var = (be1) this.b;
                TL_account.updateTheme updatetheme = (TL_account.updateTheme) this.c;
                if (!(tLObject instanceof TLRPC.TL_theme)) {
                    AndroidUtilities.runOnUIThread(new yd1(be1Var, tL_error, updatetheme));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new w81(9, be1Var, (TLRPC.TL_theme) tLObject));
                    break;
                }
            case 27:
                AndroidUtilities.runOnUIThread(new yd1((ag1) this.b, (String) this.c, tLObject, 5));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new es0((hh1) this.b, tLObject, (String) this.c, tL_error, 20));
                break;
            default:
                hh1 hh1Var = (hh1) this.b;
                byte[] bArr = (byte[]) this.c;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new dh1(hh1Var, tL_error, 3));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new bh1(hh1Var, bArr, 1));
                    break;
                }
        }
    }
}
