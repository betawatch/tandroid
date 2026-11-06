package org.telegram.ui;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n41 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n41(int i7, Object obj, Object obj2) {
        this.a = i7;
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
        mg.b h02;
        long[] jArr;
        switch (this.a) {
            case 0:
                o41 o41Var = (o41) this.b;
                org.telegram.messenger.u10 u10Var = (org.telegram.messenger.u10) this.c;
                int i7 = o41Var.i;
                String str4 = null;
                if (tL_error == null) {
                    if (tLObject instanceof TL_stats.TL_statsGraph) {
                        try {
                            h02 = c51.h0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), i7, o41Var.m);
                        } catch (JSONException e10) {
                            jSONException = e10;
                            str3 = null;
                        }
                        try {
                            str4 = ((TL_stats.TL_statsGraph) tLObject).zoom_token;
                            if (i7 == 4 && (jArr = h02.a) != null && jArr.length > 0) {
                                long j3 = jArr[jArr.length - 1];
                                o41Var.e = new mg.e(h02, j3);
                                o41Var.c = j3;
                            }
                            str3 = str4;
                            str4 = h02;
                        } catch (JSONException e11) {
                            jSONException = e11;
                            str3 = str4;
                            str4 = h02;
                            jSONException.printStackTrace();
                            if (tLObject instanceof TL_stats.TL_statsGraphError) {
                            }
                            str = str4;
                            str2 = str3;
                            org.telegram.messenger.g0.h3(new jo0(o41Var, str, str2, u10Var, 16));
                            return;
                        }
                    } else {
                        str3 = null;
                    }
                    if (tLObject instanceof TL_stats.TL_statsGraphError) {
                        o41Var.l = false;
                        o41Var.a = true;
                        o41Var.b = ((TL_stats.TL_statsGraphError) tLObject).error;
                    }
                    str = str4;
                    str2 = str3;
                } else {
                    str = null;
                    str2 = null;
                }
                org.telegram.messenger.g0.h3(new jo0(o41Var, str, str2, u10Var, 16));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new t21((x71) this.b, (String) this.c, tL_error));
                break;
            case 2:
                x71 x71Var = (x71) this.b;
                TL_account.updateTheme updatetheme = (TL_account.updateTheme) this.c;
                if (tLObject instanceof TLRPC.TL_theme) {
                    org.telegram.messenger.g0.h3(new by0(16, x71Var, (TLRPC.TL_theme) tLObject));
                    break;
                } else {
                    org.telegram.messenger.g0.h3(new t21(x71Var, tL_error, updatetheme, 4));
                    break;
                }
            case 3:
                org.telegram.messenger.g0.h3(new t21((r91) this.b, (String) this.c, tLObject, 8));
                break;
            case 4:
                org.telegram.messenger.g0.h3(new jo0((ya1) this.b, tLObject, (String) this.c, tL_error, 19));
                break;
            case 5:
                ya1 ya1Var = (ya1) this.b;
                byte[] bArr = (byte[]) this.c;
                if (tL_error == null) {
                    org.telegram.messenger.g0.h3(new sa1(ya1Var, bArr, 1));
                    break;
                } else {
                    org.telegram.messenger.g0.h3(new ua1(ya1Var, tL_error, 3));
                    break;
                }
            case 6:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.n(25, (mc1) this.b, (int[]) this.c));
                break;
            case 7:
                org.telegram.messenger.g0.h3(new jo0((tg.c2) this.b, tLObject, (tg.a2) this.c, tL_error, 28));
                break;
            case 8:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.r31(tLObject, (org.telegram.messenger.qp) this.b, (wg.u0) this.c));
                break;
            case 9:
                org.telegram.messenger.qp qpVar = (org.telegram.messenger.qp) this.b;
                org.telegram.ui.Components.ex exVar = (org.telegram.ui.Components.ex) this.c;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    qpVar.Y3(tL_contacts_found.users, false);
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < tL_contacts_found.users.size(); i10++) {
                        TLRPC.User user = tL_contacts_found.users.get(i10);
                        if (!user.self && !org.telegram.messenger.t10.x(user) && !org.telegram.messenger.t10.A(user.id)) {
                            arrayList.add(user);
                        }
                    }
                    org.telegram.messenger.g0.h3(new ti.p(23, exVar, arrayList));
                    break;
                }
                break;
            case 10:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.r31((org.telegram.ui.Components.up0) this.b, tL_error, (org.telegram.ui.ActionBar.f2) this.c, 29));
                break;
            default:
                org.telegram.messenger.g0.h3(new zh.p1((zh.d3) this.b, tLObject, (TL_stars.getResaleStarGifts) this.c, 2));
                break;
        }
    }
}
