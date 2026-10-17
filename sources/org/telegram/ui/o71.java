package org.telegram.ui;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o71 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o71(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018e  */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        String str;
        String str2;
        String str3;
        JSONException jSONException;
        kg.b e02;
        long[] jArr;
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m71(1, (z71) this.b, (TLRPC.TL_attachMenuBot) this.c));
                break;
            case 1:
                d91 d91Var = (d91) this.b;
                Utilities.Callback0Return callback0Return = (Utilities.Callback0Return) this.c;
                int i10 = d91Var.i;
                String str4 = null;
                if (tL_error == null) {
                    if (tLObject instanceof TL_stats.TL_statsGraph) {
                        try {
                            e02 = r91.e0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), i10, d91Var.m);
                        } catch (JSONException e) {
                            jSONException = e;
                            str3 = null;
                        }
                        try {
                            str4 = ((TL_stats.TL_statsGraph) tLObject).zoom_token;
                            if (i10 == 4 && (jArr = e02.a) != null && jArr.length > 0) {
                                long j10 = jArr[jArr.length - 1];
                                d91Var.e = new kg.e(e02, j10);
                                d91Var.c = j10;
                            }
                            str3 = str4;
                            str4 = e02;
                        } catch (JSONException e7) {
                            jSONException = e7;
                            str3 = str4;
                            str4 = e02;
                            jSONException.printStackTrace();
                            if (tLObject instanceof TL_stats.TL_statsGraphError) {
                            }
                            str = str4;
                            str2 = str3;
                            AndroidUtilities.runOnUIThread(new gn0(d91Var, str, str2, callback0Return, 21));
                            return;
                        }
                    } else {
                        str3 = null;
                    }
                    if (tLObject instanceof TL_stats.TL_statsGraphError) {
                        d91Var.l = false;
                        d91Var.a = true;
                        d91Var.b = ((TL_stats.TL_statsGraphError) tLObject).error;
                    }
                    str = str4;
                    str2 = str3;
                } else {
                    str = null;
                    str2 = null;
                }
                AndroidUtilities.runOnUIThread(new gn0(d91Var, str, str2, callback0Return, 21));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new h71((qc1) this.b, (String) this.c, tL_error, 1));
                break;
            case 3:
                qc1 qc1Var = (qc1) this.b;
                TL_account.updateTheme updatetheme = (TL_account.updateTheme) this.c;
                if (tLObject instanceof TLRPC.TL_theme) {
                    AndroidUtilities.runOnUIThread(new m71(9, qc1Var, (TLRPC.TL_theme) tLObject));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new h71(qc1Var, tL_error, updatetheme, 2));
                    break;
                }
            case 4:
                AndroidUtilities.runOnUIThread(new h71((pe1) this.b, (String) this.c, tLObject, 6));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new gn0((xf1) this.b, tLObject, (String) this.c, tL_error, 24));
                break;
            case 6:
                xf1 xf1Var = (xf1) this.b;
                byte[] bArr = (byte[]) this.c;
                if (tL_error == null) {
                    AndroidUtilities.runOnUIThread(new qf1(xf1Var, bArr, 1));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new sf1(xf1Var, tL_error, 3));
                    break;
                }
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.t3(17, (rh1) this.b, (int[]) this.c));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new gn0((rg.m2) this.b, tLObject, (rg.k2) this.c, tL_error, 29));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ay0(tLObject, (MessagesController) this.b, (ug.v0) this.c, 24));
                break;
            case 10:
                MessagesController messagesController = (MessagesController) this.b;
                org.telegram.ui.Components.qy qyVar = (org.telegram.ui.Components.qy) this.c;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    messagesController.putUsers(tL_contacts_found.users, false);
                    ArrayList arrayList = new ArrayList();
                    for (int i11 = 0; i11 < tL_contacts_found.users.size(); i11++) {
                        TLRPC.User user = tL_contacts_found.users.get(i11);
                        if (!user.self && !UserObject.isDeleted(user) && !UserObject.isService(user.id)) {
                            arrayList.add(user);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new uf.c(3, qyVar, arrayList));
                    break;
                }
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new yh.t1((org.telegram.ui.Components.is0) this.b, tL_error, (org.telegram.ui.ActionBar.n2) this.c, 0));
                break;
            default:
                AndroidUtilities.runOnUIThread(new yh.t1((yh.t3) this.b, tLObject, (TL_stars.getResaleStarGifts) this.c, 3));
                break;
        }
    }
}
