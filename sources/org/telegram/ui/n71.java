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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n71 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n71(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018c  */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        String str;
        String str2;
        JSONException jSONException;
        long[] jArr;
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new cg0((o71) this.b, tLObject, tL_error, (p9) this.c, false, 21));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new cg0(this.b, (Object) tL_error, (Object) tLObject, this.c, 22));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new by0(21, (f81) this.b, (TLRPC.TL_attachMenuBot) this.c));
                break;
            case 3:
                k91 k91Var = (k91) this.b;
                Utilities.Callback0Return callback0Return = (Utilities.Callback0Return) this.c;
                int i10 = k91Var.i;
                String str3 = null;
                if (tL_error == null) {
                    if (tLObject instanceof TL_stats.TL_statsGraph) {
                        try {
                            lg.b d02 = y91.d0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), i10, k91Var.m);
                            try {
                                str3 = ((TL_stats.TL_statsGraph) tLObject).zoom_token;
                                if (i10 == 4 && (jArr = d02.a) != null && jArr.length > 0) {
                                    long j10 = jArr[jArr.length - 1];
                                    k91Var.e = new lg.e(d02, j10);
                                    k91Var.c = j10;
                                }
                                str2 = str3;
                                str3 = d02;
                            } catch (JSONException e) {
                                jSONException = e;
                                str2 = str3;
                                str3 = d02;
                                jSONException.printStackTrace();
                                if (tLObject instanceof TL_stats.TL_statsGraphError) {
                                }
                                str = str2;
                                AndroidUtilities.runOnUIThread(new cg0((Object) k91Var, (Object) str3, str, (Object) callback0Return, 24));
                                return;
                            }
                        } catch (JSONException e10) {
                            jSONException = e10;
                            str2 = null;
                        }
                    } else {
                        str2 = null;
                    }
                    if (tLObject instanceof TL_stats.TL_statsGraphError) {
                        k91Var.l = false;
                        k91Var.a = true;
                        k91Var.b = ((TL_stats.TL_statsGraphError) tLObject).error;
                    }
                    str = str2;
                } else {
                    str = null;
                }
                AndroidUtilities.runOnUIThread(new cg0((Object) k91Var, (Object) str3, str, (Object) callback0Return, 24));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new t31((ad1) this.b, (String) this.c, tL_error, 4));
                break;
            case 5:
                ad1 ad1Var = (ad1) this.b;
                TL_account.updateTheme updatetheme = (TL_account.updateTheme) this.c;
                if (tLObject instanceof TLRPC.TL_theme) {
                    AndroidUtilities.runOnUIThread(new yc1(0, ad1Var, (TLRPC.TL_theme) tLObject));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new t31(ad1Var, tL_error, updatetheme, 5));
                    break;
                }
            case 6:
                AndroidUtilities.runOnUIThread(new t31((ye1) this.b, (String) this.c, tLObject, 9));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new cg0(this.b, tLObject, this.c, (Object) tL_error, 27));
                break;
            case 8:
                fg1 fg1Var = (fg1) this.b;
                byte[] bArr = (byte[]) this.c;
                if (tL_error == null) {
                    AndroidUtilities.runOnUIThread(new zf1(fg1Var, bArr, 1));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new bg1(fg1Var, tL_error, 3));
                    break;
                }
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.a6(8, (ai1) this.b, (int[]) this.c));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new sg.g2((sg.o2) this.b, tLObject, (sg.m2) this.c, tL_error, 1));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.oy0(tLObject, (MessagesController) this.b, (vg.x0) this.c, 21));
                break;
            case 12:
                MessagesController messagesController = (MessagesController) this.b;
                org.telegram.ui.Components.oy oyVar = (org.telegram.ui.Components.oy) this.c;
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
                    AndroidUtilities.runOnUIThread(new s9.g(22, oyVar, arrayList));
                    break;
                }
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new zh.s1((org.telegram.ui.Components.ws0) this.b, tL_error, (org.telegram.ui.ActionBar.r2) this.c, 0));
                break;
            default:
                AndroidUtilities.runOnUIThread(new zh.s1((zh.u3) this.b, tLObject, (TL_stars.getResaleStarGifts) this.c, 3));
                break;
        }
    }
}
