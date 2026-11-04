package org.telegram.ui;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m21 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m21(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0169  */
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
                org.telegram.messenger.g0.h3(new ih0((n21) this.b, tLObject, tL_error, (i9) this.c, 19));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new qv0(14, (c31) this.b, (TLRPC.TL_attachMenuBot) this.c));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new ih0((c31) this.b, tL_error, tLObject, (String) this.c, 20));
                break;
            case 3:
                d41 d41Var = (d41) this.b;
                org.telegram.messenger.m10 m10Var = (org.telegram.messenger.m10) this.c;
                int i3 = d41Var.i;
                String str3 = null;
                if (tL_error == null) {
                    if (tLObject instanceof TL_stats.TL_statsGraph) {
                        try {
                            ng.b h02 = r41.h0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), i3, d41Var.m);
                            try {
                                str3 = ((TL_stats.TL_statsGraph) tLObject).zoom_token;
                                if (i3 == 4 && (jArr = h02.a) != null && jArr.length > 0) {
                                    long j10 = jArr[jArr.length - 1];
                                    d41Var.e = new ng.e(h02, j10);
                                    d41Var.c = j10;
                                }
                                str2 = str3;
                                str3 = h02;
                            } catch (JSONException e10) {
                                jSONException = e10;
                                str2 = str3;
                                str3 = h02;
                                jSONException.printStackTrace();
                                if (tLObject instanceof TL_stats.TL_statsGraphError) {
                                }
                                str = str2;
                                org.telegram.messenger.g0.h3(new ih0(d41Var, str3, str, m10Var, 22));
                                return;
                            }
                        } catch (JSONException e11) {
                            jSONException = e11;
                            str2 = null;
                        }
                    } else {
                        str2 = null;
                    }
                    if (tLObject instanceof TL_stats.TL_statsGraphError) {
                        d41Var.l = false;
                        d41Var.a = true;
                        d41Var.b = ((TL_stats.TL_statsGraphError) tLObject).error;
                    }
                    str = str2;
                } else {
                    str = null;
                }
                org.telegram.messenger.g0.h3(new ih0(d41Var, str3, str, m10Var, 22));
                break;
            case 4:
                org.telegram.messenger.g0.h3(new wy0((o71) this.b, (String) this.c, tL_error, 4));
                break;
            case 5:
                o71 o71Var = (o71) this.b;
                TL_account.updateTheme updatetheme = (TL_account.updateTheme) this.c;
                if (tLObject instanceof TLRPC.TL_theme) {
                    org.telegram.messenger.g0.h3(new qv0(21, o71Var, (TLRPC.TL_theme) tLObject));
                    break;
                } else {
                    org.telegram.messenger.g0.h3(new wy0(o71Var, tL_error, updatetheme, 5));
                    break;
                }
            case 6:
                org.telegram.messenger.g0.h3(new wy0((i91) this.b, (String) this.c, tLObject, 9));
                break;
            case 7:
                org.telegram.messenger.g0.h3(new ih0((ra1) this.b, tLObject, (String) this.c, tL_error, 25));
                break;
            case 8:
                ra1 ra1Var = (ra1) this.b;
                byte[] bArr = (byte[]) this.c;
                if (tL_error == null) {
                    org.telegram.messenger.g0.h3(new ja1(ra1Var, bArr, 1));
                    break;
                } else {
                    org.telegram.messenger.g0.h3(new la1(ra1Var, tL_error, 3));
                    break;
                }
            case 9:
                org.telegram.messenger.g0.h3(new hc1(0, (ic1) this.b, (int[]) this.c));
                break;
            case 10:
                org.telegram.messenger.g0.h3(new ih0((ug.c2) this.b, tLObject, (ug.a2) this.c, tL_error, 29));
                break;
            case 11:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.iv0(tLObject, (org.telegram.messenger.hp) this.b, (xg.u0) this.c, 26));
                break;
            default:
                org.telegram.messenger.hp hpVar = (org.telegram.messenger.hp) this.b;
                org.telegram.ui.Components.ei eiVar = (org.telegram.ui.Components.ei) this.c;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    hpVar.Y3(tL_contacts_found.users, false);
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < tL_contacts_found.users.size(); i10++) {
                        TLRPC.User user = tL_contacts_found.users.get(i10);
                        if (!user.self && !org.telegram.messenger.l10.x(user) && !org.telegram.messenger.l10.A(user.id)) {
                            arrayList.add(user);
                        }
                    }
                    org.telegram.messenger.g0.h3(new u9.a(26, eiVar, arrayList));
                    break;
                }
                break;
        }
    }
}
