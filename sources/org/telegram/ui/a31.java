package org.telegram.ui;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class a31 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a31(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0168  */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        String str;
        String str2;
        String str3;
        JSONException jSONException;
        long[] jArr;
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new fy0(6, (k31) this.b, (TLRPC.TL_attachMenuBot) this.c));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new hn0((k31) this.b, tL_error, tLObject, (String) this.c, 17));
                break;
            case 2:
                l41 l41Var = (l41) this.b;
                org.telegram.messenger.r10 r10Var = (org.telegram.messenger.r10) this.c;
                int i7 = l41Var.i;
                String str4 = null;
                if (tL_error == null) {
                    if (tLObject instanceof TL_stats.TL_statsGraph) {
                        try {
                            mg.b h02 = z41.h0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), i7, l41Var.m);
                            try {
                                str4 = ((TL_stats.TL_statsGraph) tLObject).zoom_token;
                                if (i7 == 4 && (jArr = h02.a) != null && jArr.length > 0) {
                                    long j3 = jArr[jArr.length - 1];
                                    l41Var.e = new mg.e(h02, j3);
                                    l41Var.c = j3;
                                }
                                str3 = str4;
                                str4 = h02;
                            } catch (JSONException e10) {
                                jSONException = e10;
                                str3 = str4;
                                str4 = h02;
                                jSONException.printStackTrace();
                                if (tLObject instanceof TL_stats.TL_statsGraphError) {
                                }
                                str2 = str3;
                                str = str4;
                                org.telegram.messenger.g0.h3(new hn0(19, l41Var, str, r10Var, str2));
                                return;
                            }
                        } catch (JSONException e11) {
                            jSONException = e11;
                            str3 = null;
                        }
                    } else {
                        str3 = null;
                    }
                    if (tLObject instanceof TL_stats.TL_statsGraphError) {
                        l41Var.l = false;
                        l41Var.a = true;
                        l41Var.b = ((TL_stats.TL_statsGraphError) tLObject).error;
                    }
                    str2 = str3;
                    str = str4;
                } else {
                    str = null;
                    str2 = null;
                }
                org.telegram.messenger.g0.h3(new hn0(19, l41Var, str, r10Var, str2));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new q21((w71) this.b, (String) this.c, tL_error));
                break;
            case 4:
                w71 w71Var = (w71) this.b;
                TL_account.updateTheme updatetheme = (TL_account.updateTheme) this.c;
                if (tLObject instanceof TLRPC.TL_theme) {
                    org.telegram.messenger.g0.h3(new fy0(13, w71Var, (TLRPC.TL_theme) tLObject));
                    break;
                } else {
                    org.telegram.messenger.g0.h3(new q21(w71Var, tL_error, updatetheme, 4));
                    break;
                }
            case 5:
                org.telegram.messenger.g0.h3(new q21((q91) this.b, (String) this.c, tLObject, 8));
                break;
            case 6:
                org.telegram.messenger.g0.h3(new hn0(22, (xa1) this.b, tLObject, tL_error, (String) this.c));
                break;
            case 7:
                xa1 xa1Var = (xa1) this.b;
                byte[] bArr = (byte[]) this.c;
                if (tL_error == null) {
                    org.telegram.messenger.g0.h3(new ra1(xa1Var, bArr, 1));
                    break;
                } else {
                    org.telegram.messenger.g0.h3(new ta1(xa1Var, tL_error, 3));
                    break;
                }
            case 8:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.r(21, (mc1) this.b, (int[]) this.c));
                break;
            case 9:
                org.telegram.messenger.g0.h3(new tg.v1((tg.f2) this.b, tLObject, (tg.d2) this.c, tL_error, 1));
                break;
            case 10:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.lv0(tLObject, (org.telegram.messenger.np) this.b, (wg.s0) this.c, 24));
                break;
            default:
                org.telegram.messenger.np npVar = (org.telegram.messenger.np) this.b;
                org.telegram.ui.Components.gh ghVar = (org.telegram.ui.Components.gh) this.c;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    npVar.Y3(tL_contacts_found.users, false);
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < tL_contacts_found.users.size(); i10++) {
                        TLRPC.User user = tL_contacts_found.users.get(i10);
                        if (!user.self && !org.telegram.messenger.q10.x(user) && !org.telegram.messenger.q10.A(user.id)) {
                            arrayList.add(user);
                        }
                    }
                    org.telegram.messenger.g0.h3(new ug.t1(8, ghVar, arrayList));
                    break;
                }
                break;
        }
    }
}
