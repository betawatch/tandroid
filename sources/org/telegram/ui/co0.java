package org.telegram.ui;

import android.graphics.RectF;
import android.widget.Toast;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class co0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ co0(Object obj, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new ih0((ho0) this.b, tLObject, (org.telegram.messenger.h10) this.c, (TLRPC.Photo) this.d, 6));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new lq((at0) this.b, tLObject, (TLRPC.UserFull) this.c, (TL_account.TL_birthday) this.d, tL_error, 26));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new ih0((PrivacySettingsActivity) this.b, (org.telegram.ui.ActionBar.s1) this.c, tLObject, (TL_account.setAccountTTL) this.d, 9));
                break;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.c;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) this.d;
                RectF rectF = ProfileActivity.T6;
                org.telegram.messenger.g0.h3(new xt0(profileActivity, tLObject, userFull, tL_birthday, tL_error, 0));
                break;
            case 4:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.c;
                bv0 bv0Var = (bv0) this.d;
                RectF rectF2 = ProfileActivity.T6;
                org.telegram.messenger.g0.h3(new lq(profileActivity2, tLObject, tL_username, bv0Var, tL_error, 28));
                break;
            case 5:
                ProfileActivity profileActivity3 = (ProfileActivity) this.b;
                String str = (String) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                RectF rectF3 = ProfileActivity.T6;
                org.telegram.messenger.g0.h3(new lq(profileActivity3, tLObject, str, user, tL_error, 29));
                break;
            case 6:
                org.telegram.messenger.g0.h3(new ih0((iv0) this.b, tLObject, (org.telegram.messenger.h10) this.c, (TLRPC.Photo) this.d, 15));
                break;
            case 7:
                org.telegram.messenger.g0.h3(new xt0((q11) this.b, tL_error, tLObject, (TwoStepVerificationActivity) this.c, (TLRPC.User) this.d));
                break;
            case 8:
                org.telegram.messenger.g0.h3(new ih0((SessionsActivity) this.b, (org.telegram.ui.ActionBar.s1) this.c, tL_error, (TLRPC.TL_authorization) this.d, 18));
                break;
            case 9:
                org.telegram.messenger.g0.h3(new ih0((SessionsActivity) this.b, (org.telegram.ui.ActionBar.s1) this.c, tL_error, (TLRPC.TL_webAuthorization) this.d, 17));
                break;
            case 10:
                c41 c41Var = (c41) this.b;
                String str2 = (String) this.c;
                q41 q41Var = (q41) this.d;
                boolean z10 = true;
                ng.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        d41 d41Var = c41Var.r;
                        int i3 = d41Var.i;
                        if (d41Var != c41Var.x.x) {
                            z10 = false;
                        }
                        bVar = r41.h0(jSONObject, i3, z10);
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(c41Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                org.telegram.messenger.g0.h3(new ih0(c41Var, bVar, str2, q41Var, 21));
                break;
            case 11:
                org.telegram.messenger.g0.h3(new ih0((g81) this.b, tLObject, (String) this.c, (org.telegram.ui.ActionBar.s1) this.d, 23));
                break;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                byte[] bArr = (byte[]) this.c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error != null) {
                    org.telegram.messenger.g0.h3(new qv0(29, twoStepVerificationActivity, tL_error));
                    break;
                } else {
                    Utilities.e.c(new ih0(twoStepVerificationActivity, bArr, tLObject, bArr2, 24));
                    break;
                }
        }
    }
}
