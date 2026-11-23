package org.telegram.ui;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class d31 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d31(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0167  */
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
                org.telegram.messenger.g0.g3(new iy0(7, (n31) this.b, (TLRPC.TL_attachMenuBot) this.c));
                break;
            case 1:
                org.telegram.messenger.g0.g3(new yd0(this.b, (Object) tL_error, (Object) tLObject, this.c, 22));
                break;
            case 2:
                n41 n41Var = (n41) this.b;
                org.telegram.messenger.o10 o10Var = (org.telegram.messenger.o10) this.c;
                int i7 = n41Var.i;
                String str3 = null;
                if (tL_error == null) {
                    if (tLObject instanceof TL_stats.TL_statsGraph) {
                        try {
                            mg.b h02 = b51.h0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), i7, n41Var.m);
                            try {
                                str3 = ((TL_stats.TL_statsGraph) tLObject).zoom_token;
                                if (i7 == 4 && (jArr = h02.a) != null && jArr.length > 0) {
                                    long j3 = jArr[jArr.length - 1];
                                    n41Var.e = new mg.e(h02, j3);
                                    n41Var.c = j3;
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
                                org.telegram.messenger.g0.g3(new yd0((Object) n41Var, (Object) str3, str, (Object) o10Var, 24));
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
                        n41Var.l = false;
                        n41Var.a = true;
                        n41Var.b = ((TL_stats.TL_statsGraphError) tLObject).error;
                    }
                    str = str2;
                } else {
                    str = null;
                }
                org.telegram.messenger.g0.g3(new yd0((Object) n41Var, (Object) str3, str, (Object) o10Var, 24));
                break;
            case 3:
                org.telegram.messenger.g0.g3(new t21((y71) this.b, (String) this.c, tL_error));
                break;
            case 4:
                y71 y71Var = (y71) this.b;
                TL_account.updateTheme updatetheme = (TL_account.updateTheme) this.c;
                if (tLObject instanceof TLRPC.TL_theme) {
                    org.telegram.messenger.g0.g3(new iy0(14, y71Var, (TLRPC.TL_theme) tLObject));
                    break;
                } else {
                    org.telegram.messenger.g0.g3(new t21(y71Var, tL_error, updatetheme, 4));
                    break;
                }
            case 5:
                org.telegram.messenger.g0.g3(new t21((s91) this.b, (String) this.c, tLObject, 8));
                break;
            case 6:
                org.telegram.messenger.g0.g3(new yd0(this.b, tLObject, this.c, (Object) tL_error, 27));
                break;
            case 7:
                za1 za1Var = (za1) this.b;
                byte[] bArr = (byte[]) this.c;
                if (tL_error == null) {
                    org.telegram.messenger.g0.g3(new ta1(za1Var, bArr, 1));
                    break;
                } else {
                    org.telegram.messenger.g0.g3(new va1(za1Var, tL_error, 3));
                    break;
                }
            case 8:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Wallet.r(19, (nc1) this.b, (int[]) this.c));
                break;
            case 9:
                org.telegram.messenger.g0.g3(new p4.l0((tg.i2) this.b, tLObject, (tg.g2) this.c, tL_error, 6));
                break;
            case 10:
                org.telegram.messenger.g0.g3(new wg.p(tLObject, (org.telegram.messenger.mp) this.b, (wg.t0) this.c, 0));
                break;
            default:
                org.telegram.messenger.mp mpVar = (org.telegram.messenger.mp) this.b;
                org.telegram.ui.Components.ph phVar = (org.telegram.ui.Components.ph) this.c;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    mpVar.f4(tL_contacts_found.users, false);
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < tL_contacts_found.users.size(); i10++) {
                        TLRPC.User user = tL_contacts_found.users.get(i10);
                        if (!user.self && !org.telegram.messenger.n10.y(user) && !org.telegram.messenger.n10.B(user.id)) {
                            arrayList.add(user);
                        }
                    }
                    org.telegram.messenger.g0.g3(new v9.b(5, phVar, arrayList));
                    break;
                }
                break;
        }
    }
}
