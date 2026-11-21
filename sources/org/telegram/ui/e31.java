package org.telegram.ui;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e31 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e31(int i7, Object obj, Object obj2) {
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
        JSONException jSONException;
        long[] jArr;
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new mz0(3, (o31) this.b, (TLRPC.TL_attachMenuBot) this.c));
                break;
            case 1:
                org.telegram.messenger.g0.g3(new kg0((org.telegram.messenger.fs) this.b, (Object) tL_error, (Object) tLObject, (String) this.c, 21));
                break;
            case 2:
                o41 o41Var = (o41) this.b;
                org.telegram.messenger.p10 p10Var = (org.telegram.messenger.p10) this.c;
                int i7 = o41Var.i;
                String str3 = null;
                if (tL_error == null) {
                    if (tLObject instanceof TL_stats.TL_statsGraph) {
                        try {
                            mg.b h02 = c51.h0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), i7, o41Var.m);
                            try {
                                str3 = ((TL_stats.TL_statsGraph) tLObject).zoom_token;
                                if (i7 == 4 && (jArr = h02.a) != null && jArr.length > 0) {
                                    long j3 = jArr[jArr.length - 1];
                                    o41Var.e = new mg.e(h02, j3);
                                    o41Var.c = j3;
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
                                org.telegram.messenger.g0.g3(new kg0(o41Var, str3, str, p10Var, 23));
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
                        o41Var.l = false;
                        o41Var.a = true;
                        o41Var.b = ((TL_stats.TL_statsGraphError) tLObject).error;
                    }
                    str = str2;
                } else {
                    str = null;
                }
                org.telegram.messenger.g0.g3(new kg0(o41Var, str3, str, p10Var, 23));
                break;
            case 3:
                org.telegram.messenger.g0.g3(new v21((a81) this.b, (String) this.c, tL_error));
                break;
            case 4:
                a81 a81Var = (a81) this.b;
                TL_account.updateTheme updatetheme = (TL_account.updateTheme) this.c;
                if (tLObject instanceof TLRPC.TL_theme) {
                    org.telegram.messenger.g0.g3(new mz0(10, a81Var, (TLRPC.TL_theme) tLObject));
                    break;
                } else {
                    org.telegram.messenger.g0.g3(new v21(a81Var, tL_error, updatetheme, 4));
                    break;
                }
            case 5:
                org.telegram.messenger.g0.g3(new v21((u91) this.b, (String) this.c, tLObject, 8));
                break;
            case 6:
                org.telegram.messenger.g0.g3(new kg0((bb1) this.b, tLObject, (String) this.c, tL_error, 26));
                break;
            case 7:
                bb1 bb1Var = (bb1) this.b;
                byte[] bArr = (byte[]) this.c;
                if (tL_error == null) {
                    org.telegram.messenger.g0.g3(new va1(bb1Var, bArr, 1));
                    break;
                } else {
                    org.telegram.messenger.g0.g3(new xa1(bb1Var, tL_error, 3));
                    break;
                }
            case 8:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Wallet.u4(15, (pc1) this.b, (int[]) this.c));
                break;
            case 9:
                org.telegram.messenger.g0.g3(new p4.s0((tg.f2) this.b, tLObject, (tg.d2) this.c, tL_error, 5));
                break;
            case 10:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.es0(tLObject, (org.telegram.messenger.mp) this.b, (wg.u0) this.c, 29));
                break;
            default:
                org.telegram.messenger.mp mpVar = (org.telegram.messenger.mp) this.b;
                org.telegram.ui.Components.rh rhVar = (org.telegram.ui.Components.rh) this.c;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    mpVar.f4(tL_contacts_found.users, false);
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < tL_contacts_found.users.size(); i10++) {
                        TLRPC.User user = tL_contacts_found.users.get(i10);
                        if (!user.self && !org.telegram.messenger.o10.y(user) && !org.telegram.messenger.o10.B(user.id)) {
                            arrayList.add(user);
                        }
                    }
                    org.telegram.messenger.g0.g3(new wg.q(1, rhVar, arrayList));
                    break;
                }
                break;
        }
    }
}
